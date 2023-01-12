package typings.figma.mod.global

import typings.figma.figmaStrings.PERCENT
import typings.figma.figmaStrings.PIXELS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetterSpacing extends StObject {
  
  val unit: PIXELS | PERCENT
  
  val value: Double
}
object LetterSpacing {
  
  inline def apply(unit: PIXELS | PERCENT, value: Double): LetterSpacing = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LetterSpacing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LetterSpacing] (val x: Self) extends AnyVal {
    
    inline def setUnit(value: PIXELS | PERCENT): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
