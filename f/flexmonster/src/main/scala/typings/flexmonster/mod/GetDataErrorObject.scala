package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataErrorObject extends js.Object {
  
  var dataHeight: Double = js.native
  
  var dataWidth: Double = js.native
  
  var errorMessage: String = js.native
}
object GetDataErrorObject {
  
  @scala.inline
  def apply(dataHeight: Double, dataWidth: Double, errorMessage: String): GetDataErrorObject = {
    val __obj = js.Dynamic.literal(dataHeight = dataHeight.asInstanceOf[js.Any], dataWidth = dataWidth.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataErrorObject]
  }
  
  @scala.inline
  implicit class GetDataErrorObjectOps[Self <: GetDataErrorObject] (val x: Self) extends AnyVal {
    
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
    def setDataHeight(value: Double): Self = this.set("dataHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataWidth(value: Double): Self = this.set("dataWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
  }
}
