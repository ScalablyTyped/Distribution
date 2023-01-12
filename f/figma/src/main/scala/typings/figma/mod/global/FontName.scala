package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontName extends StObject {
  
  val family: String
  
  val style: String
}
object FontName {
  
  inline def apply(family: String, style: String): FontName = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontName] (val x: Self) extends AnyVal {
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
