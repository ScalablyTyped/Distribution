package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Percent
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFunnelTooltip extends BaseWidgetTooltip {
  
  /**
    * [descr:dxFunnel.Options.tooltip.contentTemplate]
    */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[/* info */ Percent, /* element */ dxElement, String | Element | JQuery])
  ] = js.native
  
  /**
    * [descr:dxFunnel.Options.tooltip.customizeTooltip]
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* info */ Percent, _]] = js.native
}
object dxFunnelTooltip {
  
  @scala.inline
  def apply(): dxFunnelTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFunnelTooltip]
  }
  
  @scala.inline
  implicit class dxFunnelTooltipOps[Self <: dxFunnelTooltip] (val x: Self) extends AnyVal {
    
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
    def setContentTemplateFunction2(value: (/* info */ Percent, /* element */ dxElement) => String | Element | JQuery): Self = this.set("contentTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContentTemplate(
      value: template | (js.Function2[/* info */ Percent, /* element */ dxElement, String | Element | JQuery])
    ): Self = this.set("contentTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentTemplate: Self = this.set("contentTemplate", js.undefined)
    
    @scala.inline
    def setCustomizeTooltip(value: /* info */ Percent => _): Self = this.set("customizeTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeTooltip: Self = this.set("customizeTooltip", js.undefined)
  }
}
