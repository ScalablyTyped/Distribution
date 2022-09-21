package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.events.EventInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseSparklineOptions[TComponent]
  extends StObject
     with BaseWidgetOptions[TComponent] {
  
  /**
    * A function that is executed when a tooltip becomes hidden.
    */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent], Unit]] = js.undefined
  
  /**
    * A function that is executed when a tooltip appears.
    */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent], Unit]] = js.undefined
  
  /**
    * Configures the tooltip.
    */
  @JSName("tooltip")
  var tooltip_BaseSparklineOptions: js.UndefOr[BaseSparklineTooltip] = js.undefined
}
object BaseSparklineOptions {
  
  inline def apply[TComponent](): BaseSparklineOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSparklineOptions[TComponent]]
  }
  
  extension [Self <: BaseSparklineOptions[?], TComponent](x: Self & BaseSparklineOptions[TComponent]) {
    
    inline def setOnTooltipHidden(value: /* e */ EventInfo[TComponent] => Unit): Self = StObject.set(x, "onTooltipHidden", js.Any.fromFunction1(value))
    
    inline def setOnTooltipHiddenUndefined: Self = StObject.set(x, "onTooltipHidden", js.undefined)
    
    inline def setOnTooltipShown(value: /* e */ EventInfo[TComponent] => Unit): Self = StObject.set(x, "onTooltipShown", js.Any.fromFunction1(value))
    
    inline def setOnTooltipShownUndefined: Self = StObject.set(x, "onTooltipShown", js.undefined)
    
    inline def setTooltip(value: BaseSparklineTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
