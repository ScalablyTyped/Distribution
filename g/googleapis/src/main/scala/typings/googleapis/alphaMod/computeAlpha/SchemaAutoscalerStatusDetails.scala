package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAutoscalerStatusDetails extends js.Object {
  
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
  implicit class SchemaAutoscalerStatusDetailsOps[Self <: SchemaAutoscalerStatusDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
