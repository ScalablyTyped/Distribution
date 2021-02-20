package typings.flot.jquery.flot

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait legendOptions extends StObject {
  
  //number of pixels or [x margin, y margin]
  var backgroundColor: js.UndefOr[js.Any] = js.native
  
  //null or color
  var backgroundOpacity: js.UndefOr[Double] = js.native
  
  // between 0 and 1
  var container: js.UndefOr[JQuery[HTMLElement]] = js.native
  
  //  null or (fn: string, series object -> string)
  var labelBoxBorderColor: js.UndefOr[js.Any] = js.native
  
  var labelFormatter: js.UndefOr[js.Function2[/* label */ String, /* series */ js.Any, String]] = js.native
  
  //"ne" or "nw" or "se" or "sw"
  var margin: js.UndefOr[js.Any] = js.native
  
  //color
  var noColumns: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  // null or jQuery object/DOM element/jQuery expression
  var sorted: js.UndefOr[js.Any] = js.native
}
object legendOptions {
  
  @scala.inline
  def apply(): legendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[legendOptions]
  }
  
  @scala.inline
  implicit class legendOptionsMutableBuilder[Self <: legendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: js.Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundOpacity(value: Double): Self = StObject.set(x, "backgroundOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundOpacityUndefined: Self = StObject.set(x, "backgroundOpacity", js.undefined)
    
    @scala.inline
    def setContainer(value: JQuery[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setLabelBoxBorderColor(value: js.Any): Self = StObject.set(x, "labelBoxBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelBoxBorderColorUndefined: Self = StObject.set(x, "labelBoxBorderColor", js.undefined)
    
    @scala.inline
    def setLabelFormatter(value: (/* label */ String, /* series */ js.Any) => String): Self = StObject.set(x, "labelFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLabelFormatterUndefined: Self = StObject.set(x, "labelFormatter", js.undefined)
    
    @scala.inline
    def setMargin(value: js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setNoColumns(value: Double): Self = StObject.set(x, "noColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoColumnsUndefined: Self = StObject.set(x, "noColumns", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSorted(value: js.Any): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
  }
}
