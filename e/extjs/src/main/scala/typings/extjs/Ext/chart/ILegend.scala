package typings.extjs.Ext.chart

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILegend
  extends StObject
     with IBase {
  
  /** [Config Option] (String) */
  var boxFill: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var boxStroke: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var boxStrokeWidth: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Number) */
  var boxZIndex: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Boolean) */
  var isVertical: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var itemSpacing: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var labelColor: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var labelFont: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Number) */
  var padding: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.undefined
  
  /** [Method] toggle
    * @param show Boolean Whether to show or hide the legend.
    */
  var toggle: js.UndefOr[js.Function1[/* show */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var update: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var x: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var y: js.UndefOr[Double] = js.undefined
}
object ILegend {
  
  inline def apply(): ILegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILegend]
  }
  
  extension [Self <: ILegend](x: Self) {
    
    inline def setBoxFill(value: String): Self = StObject.set(x, "boxFill", value.asInstanceOf[js.Any])
    
    inline def setBoxFillUndefined: Self = StObject.set(x, "boxFill", js.undefined)
    
    inline def setBoxStroke(value: String): Self = StObject.set(x, "boxStroke", value.asInstanceOf[js.Any])
    
    inline def setBoxStrokeUndefined: Self = StObject.set(x, "boxStroke", js.undefined)
    
    inline def setBoxStrokeWidth(value: String): Self = StObject.set(x, "boxStrokeWidth", value.asInstanceOf[js.Any])
    
    inline def setBoxStrokeWidthUndefined: Self = StObject.set(x, "boxStrokeWidth", js.undefined)
    
    inline def setBoxZIndex(value: Double): Self = StObject.set(x, "boxZIndex", value.asInstanceOf[js.Any])
    
    inline def setBoxZIndexUndefined: Self = StObject.set(x, "boxZIndex", js.undefined)
    
    inline def setIsVertical(value: Boolean): Self = StObject.set(x, "isVertical", value.asInstanceOf[js.Any])
    
    inline def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
    
    inline def setItemSpacing(value: Double): Self = StObject.set(x, "itemSpacing", value.asInstanceOf[js.Any])
    
    inline def setItemSpacingUndefined: Self = StObject.set(x, "itemSpacing", js.undefined)
    
    inline def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    inline def setLabelFont(value: String): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
    
    inline def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setToggle(value: /* show */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
