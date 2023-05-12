package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityNewTabLabel extends StObject {
  
  var accessibilityNewTabLabel: String
}
object AccessibilityNewTabLabel {
  
  inline def apply(accessibilityNewTabLabel: String): AccessibilityNewTabLabel = {
    val __obj = js.Dynamic.literal(accessibilityNewTabLabel = accessibilityNewTabLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityNewTabLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibilityNewTabLabel] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityNewTabLabel(value: String): Self = StObject.set(x, "accessibilityNewTabLabel", value.asInstanceOf[js.Any])
  }
}
