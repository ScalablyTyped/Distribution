package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBar extends StObject {
  
  /**
    * A `TouchBarItem` that will replace the "esc" button on the touch bar when set.
    * Setting to `null` restores the default "esc" button. Changing this value
    * immediately updates the escape item in the touch bar.
    */
  var escapeItem: TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer | Null
}
object TouchBar {
  
  inline def apply(): TouchBar = {
    val __obj = js.Dynamic.literal(escapeItem = null)
    __obj.asInstanceOf[TouchBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchBar] (val x: Self) extends AnyVal {
    
    inline def setEscapeItem(
      value: TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer
    ): Self = StObject.set(x, "escapeItem", value.asInstanceOf[js.Any])
    
    inline def setEscapeItemNull: Self = StObject.set(x, "escapeItem", null)
  }
}
