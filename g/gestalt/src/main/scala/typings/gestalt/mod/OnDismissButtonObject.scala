package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDismissButtonObject extends StObject {
  
  var accessibilityLabel: String
  
  def onDismiss(): Unit
}
object OnDismissButtonObject {
  
  inline def apply(accessibilityLabel: String, onDismiss: () => Unit): OnDismissButtonObject = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[OnDismissButtonObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnDismissButtonObject] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
  }
}
