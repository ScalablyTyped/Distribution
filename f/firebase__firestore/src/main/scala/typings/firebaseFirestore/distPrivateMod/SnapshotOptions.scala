package typings.firebaseFirestore.distPrivateMod

import typings.firebaseFirestore.firebaseFirestoreStrings.estimate
import typings.firebaseFirestore.firebaseFirestoreStrings.none
import typings.firebaseFirestore.firebaseFirestoreStrings.previous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotOptions extends StObject {
  
  /**
    * If set, controls the return value for server timestamps that have not yet
    * been set to their final value.
    *
    * By specifying 'estimate', pending server timestamps return an estimate
    * based on the local clock. This estimate will differ from the final value
    * and cause these values to change once the server result becomes available.
    *
    * By specifying 'previous', pending timestamps will be ignored and return
    * their previous value instead.
    *
    * If omitted or set to 'none', `null` will be returned by default until the
    * server value becomes available.
    */
  val serverTimestamps: js.UndefOr[estimate | previous | none] = js.undefined
}
object SnapshotOptions {
  
  inline def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  
  extension [Self <: SnapshotOptions](x: Self) {
    
    inline def setServerTimestamps(value: estimate | previous | none): Self = StObject.set(x, "serverTimestamps", value.asInstanceOf[js.Any])
    
    inline def setServerTimestampsUndefined: Self = StObject.set(x, "serverTimestamps", js.undefined)
  }
}
