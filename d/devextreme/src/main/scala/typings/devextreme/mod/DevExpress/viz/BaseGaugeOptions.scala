package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ComponentElementModelTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseGaugeOptions[T] extends BaseWidgetOptions[T] {
  
  /**
    * [descr:BaseGauge.Options.animation]
    */
  var animation: js.UndefOr[BaseGaugeAnimation] = js.native
  
  /**
    * [descr:BaseGauge.Options.containerBackgroundColor]
    */
  var containerBackgroundColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:BaseGauge.Options.loadingIndicator]
    */
  @JSName("loadingIndicator")
  var loadingIndicator_BaseGaugeOptions: js.UndefOr[BaseGaugeLoadingIndicator] = js.native
  
  /**
    * [descr:BaseGauge.Options.onTooltipHidden]
    */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ ComponentElementModelTarget[T], _]] = js.native
  
  /**
    * [descr:BaseGauge.Options.onTooltipShown]
    */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ ComponentElementModelTarget[T], _]] = js.native
  
  /**
    * [descr:BaseGauge.Options.rangeContainer]
    */
  var rangeContainer: js.UndefOr[BaseGaugeRangeContainer] = js.native
  
  /**
    * [descr:BaseGauge.Options.scale]
    */
  var scale: js.UndefOr[BaseGaugeScale] = js.native
  
  /**
    * [descr:BaseGauge.Options.subvalues]
    */
  var subvalues: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * [descr:BaseGauge.Options.tooltip]
    */
  @JSName("tooltip")
  var tooltip_BaseGaugeOptions: js.UndefOr[BaseGaugeTooltip] = js.native
  
  /**
    * [descr:BaseGauge.Options.value]
    */
  var value: js.UndefOr[Double] = js.native
}
object BaseGaugeOptions {
  
  @scala.inline
  def apply[T](): BaseGaugeOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeOptions[T]]
  }
  
  @scala.inline
  implicit class BaseGaugeOptionsOps[Self <: BaseGaugeOptions[_], T] (val x: Self with BaseGaugeOptions[T]) extends AnyVal {
    
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
    def setAnimation(value: BaseGaugeAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setContainerBackgroundColor(value: String): Self = this.set("containerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerBackgroundColor: Self = this.set("containerBackgroundColor", js.undefined)
    
    @scala.inline
    def setLoadingIndicator(value: BaseGaugeLoadingIndicator): Self = this.set("loadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingIndicator: Self = this.set("loadingIndicator", js.undefined)
    
    @scala.inline
    def setOnTooltipHidden(value: /* e */ ComponentElementModelTarget[T] => _): Self = this.set("onTooltipHidden", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTooltipHidden: Self = this.set("onTooltipHidden", js.undefined)
    
    @scala.inline
    def setOnTooltipShown(value: /* e */ ComponentElementModelTarget[T] => _): Self = this.set("onTooltipShown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTooltipShown: Self = this.set("onTooltipShown", js.undefined)
    
    @scala.inline
    def setRangeContainer(value: BaseGaugeRangeContainer): Self = this.set("rangeContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeContainer: Self = this.set("rangeContainer", js.undefined)
    
    @scala.inline
    def setScale(value: BaseGaugeScale): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSubvaluesVarargs(value: Double*): Self = this.set("subvalues", js.Array(value :_*))
    
    @scala.inline
    def setSubvalues(value: js.Array[Double]): Self = this.set("subvalues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubvalues: Self = this.set("subvalues", js.undefined)
    
    @scala.inline
    def setTooltip(value: BaseGaugeTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
