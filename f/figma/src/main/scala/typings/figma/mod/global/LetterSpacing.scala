package typings.figma.mod.global

import typings.figma.figmaStrings.PERCENT
import typings.figma.figmaStrings.PIXELS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LetterSpacing extends StObject {
  
  val unit: PIXELS | PERCENT = js.native
  
  val value: Double = js.native
}
object LetterSpacing {
  
  @scala.inline
  def apply(unit: PIXELS | PERCENT, value: Double): LetterSpacing = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LetterSpacing]
  }
  
  @scala.inline
  implicit class LetterSpacingMutableBuilder[Self <: LetterSpacing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: PIXELS | PERCENT): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
