package typings.extjs.Ext.chart

import typings.extjs.Ext.chart.series.ICartesian
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStackedBarChart
  extends StObject
     with ICartesian {
  
  /** [Config Option] (Boolean) */
  var column: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var groupGutter: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var gutter: js.UndefOr[Double] = js.undefined
  
  /** [Method] Highlight the given series item
    * @param item Object
    */
  @JSName("highlightItem")
  var highlightItem_IStackedBarChart: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var stacked: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object) */
  var style: js.UndefOr[Any] = js.undefined
  
  /** [Method] Un highlight any existing highlights */
  @JSName("unHighlightItem")
  var unHighlightItem_IStackedBarChart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Number/Object) */
  var xPadding: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number/Object) */
  var yPadding: js.UndefOr[Any] = js.undefined
}
object IStackedBarChart {
  
  inline def apply(): IStackedBarChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackedBarChart]
  }
  
  extension [Self <: IStackedBarChart](x: Self) {
    
    inline def setColumn(value: Boolean): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
    
    inline def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
    
    inline def setGroupGutter(value: Double): Self = StObject.set(x, "groupGutter", value.asInstanceOf[js.Any])
    
    inline def setGroupGutterUndefined: Self = StObject.set(x, "groupGutter", js.undefined)
    
    inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
    
    inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
    
    inline def setHighlightItem(value: /* item */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1(value))
    
    inline def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
    
    inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
    
    inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUnHighlightItem(value: () => Unit): Self = StObject.set(x, "unHighlightItem", js.Any.fromFunction0(value))
    
    inline def setUnHighlightItemUndefined: Self = StObject.set(x, "unHighlightItem", js.undefined)
    
    inline def setXPadding(value: Any): Self = StObject.set(x, "xPadding", value.asInstanceOf[js.Any])
    
    inline def setXPaddingUndefined: Self = StObject.set(x, "xPadding", js.undefined)
    
    inline def setYPadding(value: Any): Self = StObject.set(x, "yPadding", value.asInstanceOf[js.Any])
    
    inline def setYPaddingUndefined: Self = StObject.set(x, "yPadding", js.undefined)
  }
}
