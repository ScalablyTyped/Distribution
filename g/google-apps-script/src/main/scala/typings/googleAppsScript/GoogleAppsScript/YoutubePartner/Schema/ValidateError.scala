package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateError extends js.Object {
  
  var columnName: js.UndefOr[String] = js.native
  
  var columnNumber: js.UndefOr[Double] = js.native
  
  var lineNumber: js.UndefOr[Double] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var messageCode: js.UndefOr[Double] = js.native
  
  var severity: js.UndefOr[String] = js.native
}
object ValidateError {
  
  @scala.inline
  def apply(): ValidateError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateError]
  }
  
  @scala.inline
  implicit class ValidateErrorOps[Self <: ValidateError] (val x: Self) extends AnyVal {
    
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
    def setColumnName(value: String): Self = this.set("columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnName: Self = this.set("columnName", js.undefined)
    
    @scala.inline
    def setColumnNumber(value: Double): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnNumber: Self = this.set("columnNumber", js.undefined)
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMessageCode(value: Double): Self = this.set("messageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageCode: Self = this.set("messageCode", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
  }
}
