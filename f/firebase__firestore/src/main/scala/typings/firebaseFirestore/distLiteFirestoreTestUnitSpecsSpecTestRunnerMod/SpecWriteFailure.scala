package typings.firebaseFirestore.distLiteFirestoreTestUnitSpecsSpecTestRunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecWriteFailure extends StObject {
  
  /** The error the backend uses to fail the write. */
  var error: SpecError
  
  /**
    * Whether we should keep the write in our internal queue. This should be set
    * to 'true' for transient errors or if the client ignores the failure
    * (e.g. a secondary client which ignores write rejections).
    *
    * Defaults to false.
    */
  var keepInQueue: js.UndefOr[Boolean] = js.undefined
}
object SpecWriteFailure {
  
  inline def apply(error: SpecError): SpecWriteFailure = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWriteFailure]
  }
  
  extension [Self <: SpecWriteFailure](x: Self) {
    
    inline def setError(value: SpecError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setKeepInQueue(value: Boolean): Self = StObject.set(x, "keepInQueue", value.asInstanceOf[js.Any])
    
    inline def setKeepInQueueUndefined: Self = StObject.set(x, "keepInQueue", js.undefined)
  }
}
