package typings.extjs.Ext.chart

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
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
  implicit class ILegendMutableBuilder[Self <: ILegend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxFill(value: String): Self = StObject.set(x, "boxFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxFillUndefined: Self = StObject.set(x, "boxFill", js.undefined)
    
    @scala.inline
    def setBoxStroke(value: String): Self = StObject.set(x, "boxStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxStrokeUndefined: Self = StObject.set(x, "boxStroke", js.undefined)
    
    @scala.inline
    def setBoxStrokeWidth(value: String): Self = StObject.set(x, "boxStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxStrokeWidthUndefined: Self = StObject.set(x, "boxStrokeWidth", js.undefined)
    
    @scala.inline
    def setBoxZIndex(value: Double): Self = StObject.set(x, "boxZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxZIndexUndefined: Self = StObject.set(x, "boxZIndex", js.undefined)
    
    @scala.inline
    def setIsVertical(value: Boolean): Self = StObject.set(x, "isVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
    
    @scala.inline
    def setItemSpacing(value: Double): Self = StObject.set(x, "itemSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSpacingUndefined: Self = StObject.set(x, "itemSpacing", js.undefined)
    
    @scala.inline
    def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    @scala.inline
    def setLabelFont(value: String): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setToggle(value: /* show */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
