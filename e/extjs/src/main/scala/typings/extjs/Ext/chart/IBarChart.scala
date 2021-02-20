package typings.extjs.Ext.chart

import typings.extjs.Ext.chart.series.ICartesian
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBarChart extends ICartesian {
  
  /** [Config Option] (Boolean) */
  var column: js.UndefOr[Boolean] = js.native
  
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Number) */
  var groupGutter: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var gutter: js.UndefOr[Double] = js.native
  
  /** [Method] Highlight the given series item
    * @param item Object
    */
  @JSName("highlightItem")
  var highlightItem_IBarChart: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var stacked: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.native
  
  /** [Method] Un highlight any existing highlights */
  @JSName("unHighlightItem")
  var unHighlightItem_IBarChart: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Number/Object) */
  var xPadding: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number/Object) */
  var yPadding: js.UndefOr[js.Any] = js.native
}
object IBarChart {
  
  @scala.inline
  def apply(): IBarChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBarChart]
  }
  
  @scala.inline
  implicit class IBarChartMutableBuilder[Self <: IBarChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Boolean): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
    
    @scala.inline
    def setGroupGutter(value: Double): Self = StObject.set(x, "groupGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupGutterUndefined: Self = StObject.set(x, "groupGutter", js.undefined)
    
    @scala.inline
    def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
    
    @scala.inline
    def setHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
    
    @scala.inline
    def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUnHighlightItem(value: () => Unit): Self = StObject.set(x, "unHighlightItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnHighlightItemUndefined: Self = StObject.set(x, "unHighlightItem", js.undefined)
    
    @scala.inline
    def setXPadding(value: js.Any): Self = StObject.set(x, "xPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPaddingUndefined: Self = StObject.set(x, "xPadding", js.undefined)
    
    @scala.inline
    def setYPadding(value: js.Any): Self = StObject.set(x, "yPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYPaddingUndefined: Self = StObject.set(x, "yPadding", js.undefined)
  }
}
