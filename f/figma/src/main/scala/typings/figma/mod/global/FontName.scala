package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontName extends StObject {
  
  val family: String = js.native
  
  val style: String = js.native
}
object FontName {
  
  @scala.inline
  def apply(family: String, style: String): FontName = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontName]
  }
  
  @scala.inline
  implicit class FontNameMutableBuilder[Self <: FontName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
