package typings.gestalt.mod

import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.sm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpinnerProps extends StObject {
  
  var accessibilityLabel: String = js.native
  
  var delay: js.UndefOr[Boolean] = js.native
  
  var show: Boolean = js.native
  
  var size: js.UndefOr[sm | md] = js.native
}
object SpinnerProps {
  
  @scala.inline
  def apply(accessibilityLabel: String, show: Boolean): SpinnerProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerProps]
  }
  
  @scala.inline
  implicit class SpinnerPropsMutableBuilder[Self <: SpinnerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Boolean): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: sm | md): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
