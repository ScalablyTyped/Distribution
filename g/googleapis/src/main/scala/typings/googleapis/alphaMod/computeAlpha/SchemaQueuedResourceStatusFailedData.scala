package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueuedResourceStatusFailedData extends StObject {
  
  /**
    * The error(s) that caused the QueuedResource to enter the FAILED state.
    */
  var error: js.UndefOr[`3` | Null] = js.undefined
}
object SchemaQueuedResourceStatusFailedData {
  
  inline def apply(): SchemaQueuedResourceStatusFailedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueuedResourceStatusFailedData]
  }
  
  extension [Self <: SchemaQueuedResourceStatusFailedData](x: Self) {
    
    inline def setError(value: `3`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
