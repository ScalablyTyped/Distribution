package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains options affecting the touch scrolling functionality.
  */
trait ASPxClientTouchUIOptions extends StObject {
  
  /**
    * Gets or sets the name of the CSS class defining the horizontal scroll bar's appearance.
    */
  var hScrollClassName: String
  
  /**
    * Gets or sets a value that specifies whether or not the horizontal scroll bar should be displayed.
    */
  var showHorizontalScrollbar: Boolean
  
  /**
    * Gets or sets a value that specifies whether or not the vertical scroll bar should be displayed.
    */
  var showVerticalScrollbar: Boolean
  
  /**
    * Gets or sets the name of the CSS class defining the vertical scroll bar's appearance.
    */
  var vScrollClassName: String
}
object ASPxClientTouchUIOptions {
  
  inline def apply(
    hScrollClassName: String,
    showHorizontalScrollbar: Boolean,
    showVerticalScrollbar: Boolean,
    vScrollClassName: String
  ): ASPxClientTouchUIOptions = {
    val __obj = js.Dynamic.literal(hScrollClassName = hScrollClassName.asInstanceOf[js.Any], showHorizontalScrollbar = showHorizontalScrollbar.asInstanceOf[js.Any], showVerticalScrollbar = showVerticalScrollbar.asInstanceOf[js.Any], vScrollClassName = vScrollClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTouchUIOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientTouchUIOptions] (val x: Self) extends AnyVal {
    
    inline def setHScrollClassName(value: String): Self = StObject.set(x, "hScrollClassName", value.asInstanceOf[js.Any])
    
    inline def setShowHorizontalScrollbar(value: Boolean): Self = StObject.set(x, "showHorizontalScrollbar", value.asInstanceOf[js.Any])
    
    inline def setShowVerticalScrollbar(value: Boolean): Self = StObject.set(x, "showVerticalScrollbar", value.asInstanceOf[js.Any])
    
    inline def setVScrollClassName(value: String): Self = StObject.set(x, "vScrollClassName", value.asInstanceOf[js.Any])
  }
}
