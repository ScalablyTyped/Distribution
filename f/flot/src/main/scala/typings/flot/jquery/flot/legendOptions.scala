package typings.flot.jquery.flot

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait legendOptions extends StObject {
  
  //number of pixels or [x margin, y margin]
  var backgroundColor: js.UndefOr[Any] = js.undefined
  
  //null or color
  var backgroundOpacity: js.UndefOr[Double] = js.undefined
  
  // between 0 and 1
  var container: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  
  //  null or (fn: string, series object -> string)
  var labelBoxBorderColor: js.UndefOr[Any] = js.undefined
  
  var labelFormatter: js.UndefOr[js.Function2[/* label */ String, /* series */ Any, String]] = js.undefined
  
  //"ne" or "nw" or "se" or "sw"
  var margin: js.UndefOr[Any] = js.undefined
  
  //color
  var noColumns: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  // null or jQuery object/DOM element/jQuery expression
  var sorted: js.UndefOr[Any] = js.undefined
}
object legendOptions {
  
  inline def apply(): legendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[legendOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: legendOptions] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundOpacity(value: Double): Self = StObject.set(x, "backgroundOpacity", value.asInstanceOf[js.Any])
    
    inline def setBackgroundOpacityUndefined: Self = StObject.set(x, "backgroundOpacity", js.undefined)
    
    inline def setContainer(value: JQuery[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setLabelBoxBorderColor(value: Any): Self = StObject.set(x, "labelBoxBorderColor", value.asInstanceOf[js.Any])
    
    inline def setLabelBoxBorderColorUndefined: Self = StObject.set(x, "labelBoxBorderColor", js.undefined)
    
    inline def setLabelFormatter(value: (/* label */ String, /* series */ Any) => String): Self = StObject.set(x, "labelFormatter", js.Any.fromFunction2(value))
    
    inline def setLabelFormatterUndefined: Self = StObject.set(x, "labelFormatter", js.undefined)
    
    inline def setMargin(value: Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setNoColumns(value: Double): Self = StObject.set(x, "noColumns", value.asInstanceOf[js.Any])
    
    inline def setNoColumnsUndefined: Self = StObject.set(x, "noColumns", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSorted(value: Any): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
    
    inline def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
  }
}
