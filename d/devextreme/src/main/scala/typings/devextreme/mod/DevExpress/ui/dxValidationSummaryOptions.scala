package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxValidationSummaryOptions extends CollectionWidgetOptions[dxValidationSummary] {
  
  /**
    * [descr:dxValidationSummary.Options.validationGroup]
    */
  var validationGroup: js.UndefOr[String] = js.native
}
object dxValidationSummaryOptions {
  
  @scala.inline
  def apply(): dxValidationSummaryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxValidationSummaryOptions]
  }
  
  @scala.inline
  implicit class dxValidationSummaryOptionsOps[Self <: dxValidationSummaryOptions] (val x: Self) extends AnyVal {
    
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
    def setValidationGroup(value: String): Self = this.set("validationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationGroup: Self = this.set("validationGroup", js.undefined)
  }
}
