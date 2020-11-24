package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionValue extends js.Object {
  
  var relativeDate: js.UndefOr[String] = js.native
  
  var userEnteredValue: js.UndefOr[String] = js.native
}
object ConditionValue {
  
  @scala.inline
  def apply(): ConditionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionValue]
  }
  
  @scala.inline
  implicit class ConditionValueOps[Self <: ConditionValue] (val x: Self) extends AnyVal {
    
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
    def setRelativeDate(value: String): Self = this.set("relativeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeDate: Self = this.set("relativeDate", js.undefined)
    
    @scala.inline
    def setUserEnteredValue(value: String): Self = this.set("userEnteredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEnteredValue: Self = this.set("userEnteredValue", js.undefined)
  }
}
