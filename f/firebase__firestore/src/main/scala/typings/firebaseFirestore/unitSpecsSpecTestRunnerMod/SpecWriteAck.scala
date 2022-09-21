package typings.firebaseFirestore.unitSpecsSpecTestRunnerMod

import typings.firebaseFirestore.firestoreTestUtilHelpersMod.TestSnapshotVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecWriteAck extends StObject {
  
  /**
    * Whether we should keep the write in our internal queue. This should only
    * be set to 'true' if the client ignores the write (e.g. a secondary client
    * which ignores write acknowledgments).
    *
    * Defaults to false.
    */
  var keepInQueue: js.UndefOr[Boolean] = js.undefined
  
  /** The version the backend uses to ack the write. */
  var version: TestSnapshotVersion
}
object SpecWriteAck {
  
  inline def apply(version: TestSnapshotVersion): SpecWriteAck = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWriteAck]
  }
  
  extension [Self <: SpecWriteAck](x: Self) {
    
    inline def setKeepInQueue(value: Boolean): Self = StObject.set(x, "keepInQueue", value.asInstanceOf[js.Any])
    
    inline def setKeepInQueueUndefined: Self = StObject.set(x, "keepInQueue", js.undefined)
    
    inline def setVersion(value: TestSnapshotVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
