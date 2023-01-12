package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseWidgetLoadingIndicator extends StObject {
  
  /**
    * Colors the background of the loading indicator.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the loading indicator should be displayed and hidden automatically.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies font properties for the loading indicator.
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * Allows you to change the loading indicator&apos;s visibility.
    */
  var show: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the text to be displayed by the loading indicator.
    */
  var text: js.UndefOr[String] = js.undefined
}
object BaseWidgetLoadingIndicator {
  
  inline def apply(): BaseWidgetLoadingIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetLoadingIndicator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseWidgetLoadingIndicator] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
