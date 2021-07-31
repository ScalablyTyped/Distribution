package typings.extjs.Ext.chart

import typings.extjs.Ext.Array
import typings.extjs.Ext.chart.series.ISeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPieSeries
  extends StObject
     with ISeries {
  
  /** [Config Option] (String) */
  var angleField: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Array) */
  var colorSet: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Number) */
  var highlightDuration: js.UndefOr[Double] = js.undefined
  
  /** [Method] Highlight the specified item
    * @param item Object {Object} Info about the item; same format as returned by getItemForPoint
    */
  @JSName("highlightItem")
  var highlightItem_IPieSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var lengthField: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Un highlights the specified item
    * @param item Object {Object} Info about the item; same format as returned by getItemForPoint
    */
  @JSName("unHighlightItem")
  var unHighlightItem_IPieSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var xField: js.UndefOr[String] = js.undefined
}
object IPieSeries {
  
  @scala.inline
  def apply(): IPieSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPieSeries]
  }
  
  @scala.inline
  implicit class IPieSeriesMutableBuilder[Self <: IPieSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngleField(value: String): Self = StObject.set(x, "angleField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleFieldUndefined: Self = StObject.set(x, "angleField", js.undefined)
    
    @scala.inline
    def setColorSet(value: Array): Self = StObject.set(x, "colorSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSetUndefined: Self = StObject.set(x, "colorSet", js.undefined)
    
    @scala.inline
    def setDonut(value: js.Any): Self = StObject.set(x, "donut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonutUndefined: Self = StObject.set(x, "donut", js.undefined)
    
    @scala.inline
    def setDrawSeries(value: () => Unit): Self = StObject.set(x, "drawSeries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setHighlightDuration(value: Double): Self = StObject.set(x, "highlightDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightDurationUndefined: Self = StObject.set(x, "highlightDuration", js.undefined)
    
    @scala.inline
    def setHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
    
    @scala.inline
    def setLengthField(value: String): Self = StObject.set(x, "lengthField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthFieldUndefined: Self = StObject.set(x, "lengthField", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUnHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "unHighlightItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnHighlightItemUndefined: Self = StObject.set(x, "unHighlightItem", js.undefined)
    
    @scala.inline
    def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
  }
}
