package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxLength extends StObject {
  
  var characterCount: Double
  
  var errorAccessibilityLabel: String
}
object MaxLength {
  
  inline def apply(characterCount: Double, errorAccessibilityLabel: String): MaxLength = {
    val __obj = js.Dynamic.literal(characterCount = characterCount.asInstanceOf[js.Any], errorAccessibilityLabel = errorAccessibilityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxLength] (val x: Self) extends AnyVal {
    
    inline def setCharacterCount(value: Double): Self = StObject.set(x, "characterCount", value.asInstanceOf[js.Any])
    
    inline def setErrorAccessibilityLabel(value: String): Self = StObject.set(x, "errorAccessibilityLabel", value.asInstanceOf[js.Any])
  }
}
