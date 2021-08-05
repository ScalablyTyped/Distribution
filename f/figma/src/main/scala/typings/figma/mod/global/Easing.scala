package typings.figma.mod.global

import typings.figma.figmaStrings.EASE_IN
import typings.figma.figmaStrings.EASE_IN_AND_OUT
import typings.figma.figmaStrings.EASE_OUT
import typings.figma.figmaStrings.LINEAR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Easing extends StObject {
  
  val `type`: EASE_IN | EASE_OUT | EASE_IN_AND_OUT | LINEAR
}
object Easing {
  
  inline def apply(`type`: EASE_IN | EASE_OUT | EASE_IN_AND_OUT | LINEAR): Easing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easing]
  }
  
  extension [Self <: Easing](x: Self) {
    
    inline def setType(value: EASE_IN | EASE_OUT | EASE_IN_AND_OUT | LINEAR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
