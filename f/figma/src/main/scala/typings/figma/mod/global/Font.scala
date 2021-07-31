package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font extends StObject {
  
  var fontName: FontName
}
object Font {
  
  @scala.inline
  def apply(fontName: FontName): Font = {
    val __obj = js.Dynamic.literal(fontName = fontName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit class FontMutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontName(value: FontName): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
  }
}
