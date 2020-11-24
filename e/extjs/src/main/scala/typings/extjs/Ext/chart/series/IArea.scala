package typings.extjs.Ext.chart.series

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IArea extends ICartesian {
  
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Highlight the specified item
    * @param item Object {Object} Info about the item; same format as returned by getItemForPoint
    */
  @JSName("highlightItem")
  var highlightItem_IArea: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Highlight this entire series
    * @param item Object Info about the item; same format as returned by getItemForPoint.
    */
  var highlightSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.native
  
  /** [Method] Un highlights the specified item
    * @param item Object Info about the item; same format as returned by getItemForPoint
    */
  @JSName("unHighlightItem")
  var unHighlightItem_IArea: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] UnHighlight this entire series
    * @param item Object Info about the item; same format as returned by getItemForPoint.
    */
  var unHighlightSeries: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
}
object IArea {
  
  @scala.inline
  def apply(): IArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArea]
  }
  
  @scala.inline
  implicit class IAreaOps[Self <: IArea] (val x: Self) extends AnyVal {
    
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
    def setDrawSeries(value: () => Unit): Self = this.set("drawSeries", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDrawSeries: Self = this.set("drawSeries", js.undefined)
    
    @scala.inline
    def setHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = this.set("highlightItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHighlightItem: Self = this.set("highlightItem", js.undefined)
    
    @scala.inline
    def setHighlightSeries(value: /* item */ js.UndefOr[js.Any] => Unit): Self = this.set("highlightSeries", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHighlightSeries: Self = this.set("highlightSeries", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUnHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = this.set("unHighlightItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnHighlightItem: Self = this.set("unHighlightItem", js.undefined)
    
    @scala.inline
    def setUnHighlightSeries(value: /* item */ js.UndefOr[js.Any] => Unit): Self = this.set("unHighlightSeries", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnHighlightSeries: Self = this.set("unHighlightSeries", js.undefined)
  }
}
