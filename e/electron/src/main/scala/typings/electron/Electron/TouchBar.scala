package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBar extends StObject {
  
  var escapeItem: TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer | Null = js.native
}
object TouchBar {
  
  @scala.inline
  def apply(): TouchBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBar]
  }
  
  @scala.inline
  implicit class TouchBarMutableBuilder[Self <: TouchBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEscapeItem(
      value: TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer
    ): Self = StObject.set(x, "escapeItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeItemNull: Self = StObject.set(x, "escapeItem", null)
  }
}
