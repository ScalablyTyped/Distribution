package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDismiss extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  def onDismiss(): Unit
}
object OnDismiss {
  
  inline def apply(onDismiss: () => Unit): OnDismiss = {
    val __obj = js.Dynamic.literal(onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[OnDismiss]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnDismiss] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
  }
}
