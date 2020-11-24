package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterUppercaseDetails extends js.Object {
  
  var field: js.UndefOr[String] = js.native
  
  var fieldIndex: js.UndefOr[Double] = js.native
}
object FilterUppercaseDetails {
  
  @scala.inline
  def apply(): FilterUppercaseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterUppercaseDetails]
  }
  
  @scala.inline
  implicit class FilterUppercaseDetailsOps[Self <: FilterUppercaseDetails] (val x: Self) extends AnyVal {
    
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFieldIndex(value: Double): Self = this.set("fieldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldIndex: Self = this.set("fieldIndex", js.undefined)
  }
}
