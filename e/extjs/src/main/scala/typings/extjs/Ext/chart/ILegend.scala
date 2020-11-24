package typings.extjs.Ext.chart

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILegend extends IBase {
  
  /** [Config Option] (String) */
  var boxFill: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var boxStroke: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var boxStrokeWidth: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var boxZIndex: js.UndefOr[Double] = js.native
  
  /** [Property] (Boolean) */
  var isVertical: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var itemSpacing: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var labelColor: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var labelFont: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var padding: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.native
  
  /** [Method] toggle
    * @param show Boolean Whether to show or hide the legend.
    */
  var toggle: js.UndefOr[js.Function1[/* show */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var update: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var visible: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var x: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var y: js.UndefOr[Double] = js.native
}
object ILegend {
  
  @scala.inline
  def apply(): ILegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILegend]
  }
  
  @scala.inline
  implicit class ILegendOps[Self <: ILegend] (val x: Self) extends AnyVal {
    
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
    def setBoxFill(value: String): Self = this.set("boxFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxFill: Self = this.set("boxFill", js.undefined)
    
    @scala.inline
    def setBoxStroke(value: String): Self = this.set("boxStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxStroke: Self = this.set("boxStroke", js.undefined)
    
    @scala.inline
    def setBoxStrokeWidth(value: String): Self = this.set("boxStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxStrokeWidth: Self = this.set("boxStrokeWidth", js.undefined)
    
    @scala.inline
    def setBoxZIndex(value: Double): Self = this.set("boxZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxZIndex: Self = this.set("boxZIndex", js.undefined)
    
    @scala.inline
    def setIsVertical(value: Boolean): Self = this.set("isVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVertical: Self = this.set("isVertical", js.undefined)
    
    @scala.inline
    def setItemSpacing(value: Double): Self = this.set("itemSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemSpacing: Self = this.set("itemSpacing", js.undefined)
    
    @scala.inline
    def setLabelColor(value: String): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    
    @scala.inline
    def setLabelFont(value: String): Self = this.set("labelFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFont: Self = this.set("labelFont", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setToggle(value: /* show */ js.UndefOr[Boolean] => Unit): Self = this.set("toggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
