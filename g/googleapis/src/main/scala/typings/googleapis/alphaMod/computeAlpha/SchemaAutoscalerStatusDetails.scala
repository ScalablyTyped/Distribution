package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAutoscalerStatusDetails extends StObject {
  
  /**
    * The status message.
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * The type of error returned.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaAutoscalerStatusDetails {
  
  @scala.inline
  def apply(): SchemaAutoscalerStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalerStatusDetails]
  }
  
  @scala.inline
  implicit class SchemaAutoscalerStatusDetailsMutableBuilder[Self <: SchemaAutoscalerStatusDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
