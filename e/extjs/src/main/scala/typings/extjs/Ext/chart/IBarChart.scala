package typings.extjs.Ext.chart

import typings.extjs.Ext.chart.series.ICartesian
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
  implicit class IBarChartOps[Self <: IBarChart] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Boolean): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setDrawSeries(value: () => Unit): Self = this.set("drawSeries", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDrawSeries: Self = this.set("drawSeries", js.undefined)
    
    @scala.inline
    def setGroupGutter(value: Double): Self = this.set("groupGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupGutter: Self = this.set("groupGutter", js.undefined)
    
    @scala.inline
    def setGutter(value: Double): Self = this.set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    
    @scala.inline
    def setHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = this.set("highlightItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHighlightItem: Self = this.set("highlightItem", js.undefined)
    
    @scala.inline
    def setStacked(value: Boolean): Self = this.set("stacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStacked: Self = this.set("stacked", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUnHighlightItem(value: () => Unit): Self = this.set("unHighlightItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUnHighlightItem: Self = this.set("unHighlightItem", js.undefined)
    
    @scala.inline
    def setXPadding(value: js.Any): Self = this.set("xPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXPadding: Self = this.set("xPadding", js.undefined)
    
    @scala.inline
    def setYPadding(value: js.Any): Self = this.set("yPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYPadding: Self = this.set("yPadding", js.undefined)
  }
}
