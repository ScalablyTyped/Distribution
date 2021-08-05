package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoscalerStatusDetails extends StObject {
  
  /**
    * The status message.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * The type of error returned.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaAutoscalerStatusDetails {
  
  inline def apply(): SchemaAutoscalerStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalerStatusDetails]
  }
  
  extension [Self <: SchemaAutoscalerStatusDetails](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
