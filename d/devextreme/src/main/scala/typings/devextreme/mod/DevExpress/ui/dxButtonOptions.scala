package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Icon
import typings.devextreme.anon.ValidationGroup
import typings.devextreme.devextremeStrings.back
import typings.devextreme.devextremeStrings.contained
import typings.devextreme.devextremeStrings.danger
import typings.devextreme.devextremeStrings.default
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.success
import typings.devextreme.devextremeStrings.text
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxButtonOptions extends WidgetOptions[dxButton] {
  
  /**
    * [descr:dxButton.Options.icon]
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxButton.Options.onClick]
    */
  var onClick: js.UndefOr[js.Function1[/* e */ ValidationGroup, _]] = js.native
  
  /**
    * [descr:dxButton.Options.stylingMode]
    */
  var stylingMode: js.UndefOr[text | outlined | contained] = js.native
  
  /**
    * [descr:dxButton.Options.template]
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ Icon, /* contentElement */ dxElement, String | Element | JQuery])
  ] = js.native
  
  /**
    * [descr:dxButton.Options.text]
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxButton.Options.type]
    */
  var `type`: js.UndefOr[back | danger | default | normal | success] = js.native
  
  /**
    * [descr:dxButton.Options.useSubmitBehavior]
    */
  var useSubmitBehavior: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxButton.Options.validationGroup]
    */
  var validationGroup: js.UndefOr[String] = js.native
}
object dxButtonOptions {
  
  @scala.inline
  def apply(): dxButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxButtonOptions]
  }
  
  @scala.inline
  implicit class dxButtonOptionsOps[Self <: dxButtonOptions] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* e */ ValidationGroup => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setStylingMode(value: text | outlined | contained): Self = this.set("stylingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylingMode: Self = this.set("stylingMode", js.undefined)
    
    @scala.inline
    def setTemplateFunction2(value: (/* buttonData */ Icon, /* contentElement */ dxElement) => String | Element | JQuery): Self = this.set("template", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ Icon, /* contentElement */ dxElement, String | Element | JQuery])
    ): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(value: back | danger | default | normal | success): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseSubmitBehavior(value: Boolean): Self = this.set("useSubmitBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSubmitBehavior: Self = this.set("useSubmitBehavior", js.undefined)
    
    @scala.inline
    def setValidationGroup(value: String): Self = this.set("validationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationGroup: Self = this.set("validationGroup", js.undefined)
  }
}
