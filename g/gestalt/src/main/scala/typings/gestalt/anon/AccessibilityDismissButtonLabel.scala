package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityDismissButtonLabel extends StObject {
  
  var accessibilityDismissButtonLabel: String
}
object AccessibilityDismissButtonLabel {
  
  inline def apply(accessibilityDismissButtonLabel: String): AccessibilityDismissButtonLabel = {
    val __obj = js.Dynamic.literal(accessibilityDismissButtonLabel = accessibilityDismissButtonLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityDismissButtonLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibilityDismissButtonLabel] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityDismissButtonLabel(value: String): Self = StObject.set(x, "accessibilityDismissButtonLabel", value.asInstanceOf[js.Any])
  }
}
