package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:BaseSparkline.Options.tooltip]
  */
@js.native
trait BaseSparklineTooltip extends BaseWidgetTooltip {
  
  /**
    * [descr:BaseSparkline.Options.tooltip.contentTemplate]
    */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[/* pointsInfo */ js.Any, /* element */ dxElement, String | Element | JQuery])
  ] = js.native
  
  /**
    * [descr:BaseSparkline.Options.tooltip.customizeTooltip]
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* pointsInfo */ js.Any, _]] = js.native
  
  /**
    * [descr:BaseSparkline.Options.tooltip.interactive]
    */
  var interactive: js.UndefOr[Boolean] = js.native
}
object BaseSparklineTooltip {
  
  @scala.inline
  def apply(): BaseSparklineTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSparklineTooltip]
  }
  
  @scala.inline
  implicit class BaseSparklineTooltipOps[Self <: BaseSparklineTooltip] (val x: Self) extends AnyVal {
    
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
    def setContentTemplateFunction2(value: (/* pointsInfo */ js.Any, /* element */ dxElement) => String | Element | JQuery): Self = this.set("contentTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContentTemplate(
      value: template | (js.Function2[/* pointsInfo */ js.Any, /* element */ dxElement, String | Element | JQuery])
    ): Self = this.set("contentTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentTemplate: Self = this.set("contentTemplate", js.undefined)
    
    @scala.inline
    def setCustomizeTooltip(value: /* pointsInfo */ js.Any => _): Self = this.set("customizeTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeTooltip: Self = this.set("customizeTooltip", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
  }
}
