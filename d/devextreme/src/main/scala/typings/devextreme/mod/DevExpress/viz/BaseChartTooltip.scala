package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.format
import typings.devextreme.mod.global.JQuery
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:BaseChart.Options.tooltip]
  */
@js.native
trait BaseChartTooltip extends BaseWidgetTooltip {
  
  /**
    * [descr:BaseChart.Options.tooltip.argumentFormat]
    */
  var argumentFormat: js.UndefOr[format] = js.native
  
  /**
    * [descr:BaseChart.Options.tooltip.contentTemplate]
    */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[/* pointInfo */ js.Any, /* element */ dxElement, String | Element | JQuery])
  ] = js.native
  
  /**
    * [descr:BaseChart.Options.tooltip.customizeTooltip]
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* pointInfo */ js.Any, _]] = js.native
  
  /**
    * [descr:BaseChart.Options.tooltip.interactive]
    */
  var interactive: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:BaseChart.Options.tooltip.shared]
    */
  var shared: js.UndefOr[Boolean] = js.native
}
object BaseChartTooltip {
  
  @scala.inline
  def apply(): BaseChartTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartTooltip]
  }
  
  @scala.inline
  implicit class BaseChartTooltipOps[Self <: BaseChartTooltip] (val x: Self) extends AnyVal {
    
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
    def setArgumentFormatFunction1(value: /* value */ Double | Date => String): Self = this.set("argumentFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArgumentFormat(value: format): Self = this.set("argumentFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgumentFormat: Self = this.set("argumentFormat", js.undefined)
    
    @scala.inline
    def setContentTemplateFunction2(value: (/* pointInfo */ js.Any, /* element */ dxElement) => String | Element | JQuery): Self = this.set("contentTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContentTemplate(
      value: template | (js.Function2[/* pointInfo */ js.Any, /* element */ dxElement, String | Element | JQuery])
    ): Self = this.set("contentTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentTemplate: Self = this.set("contentTemplate", js.undefined)
    
    @scala.inline
    def setCustomizeTooltip(value: /* pointInfo */ js.Any => _): Self = this.set("customizeTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeTooltip: Self = this.set("customizeTooltip", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
  }
}
