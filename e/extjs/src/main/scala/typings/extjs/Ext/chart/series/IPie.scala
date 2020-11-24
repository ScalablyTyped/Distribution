package typings.extjs.Ext.chart.series

import typings.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPie extends ISeries {
  
  /** [Config Option] (String) */
  var angleField: js.UndefOr[String] = js.native
  
  /** [Config Option] (Array) */
  var colorSet: js.UndefOr[Array] = js.native
  
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.native
  
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var highlightDuration: js.UndefOr[Double] = js.native
  
  /** [Method] Highlight the specified item
    * @param item Object {Object} Info about the item; same format as returned by getItemForPoint
    */
  @JSName("highlightItem")
  var highlightItem_IPie: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (String) */
  var lengthField: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.native
  
  /** [Method] Un highlights the specified item
    * @param item Object {Object} Info about the item; same format as returned by getItemForPoint
    */
  @JSName("unHighlightItem")
  var unHighlightItem_IPie: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (String) */
  var xField: js.UndefOr[String] = js.native
}
object IPie {
  
  @scala.inline
  def apply(): IPie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPie]
  }
  
  @scala.inline
  implicit class IPieOps[Self <: IPie] (val x: Self) extends AnyVal {
    
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
    def setAngleField(value: String): Self = this.set("angleField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleField: Self = this.set("angleField", js.undefined)
    
    @scala.inline
    def setColorSet(value: Array): Self = this.set("colorSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSet: Self = this.set("colorSet", js.undefined)
    
    @scala.inline
    def setDonut(value: js.Any): Self = this.set("donut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDonut: Self = this.set("donut", js.undefined)
    
    @scala.inline
    def setDrawSeries(value: () => Unit): Self = this.set("drawSeries", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDrawSeries: Self = this.set("drawSeries", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setHighlightDuration(value: Double): Self = this.set("highlightDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightDuration: Self = this.set("highlightDuration", js.undefined)
    
    @scala.inline
    def setHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = this.set("highlightItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHighlightItem: Self = this.set("highlightItem", js.undefined)
    
    @scala.inline
    def setLengthField(value: String): Self = this.set("lengthField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLengthField: Self = this.set("lengthField", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUnHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = this.set("unHighlightItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnHighlightItem: Self = this.set("unHighlightItem", js.undefined)
    
    @scala.inline
    def setXField(value: String): Self = this.set("xField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXField: Self = this.set("xField", js.undefined)
  }
}
