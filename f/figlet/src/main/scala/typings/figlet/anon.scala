package typings.figlet

import typings.figlet.mod.Fonts_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<figlet.figlet.Defaults> */
  trait PartialDefaults extends StObject {
    
    var font: js.UndefOr[Fonts_] = js.undefined
    
    var fontPath: js.UndefOr[String] = js.undefined
  }
  object PartialDefaults {
    
    inline def apply(): PartialDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDefaults]
    }
    
    extension [Self <: PartialDefaults](x: Self) {
      
      inline def setFont(value: Fonts_): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontPath(value: String): Self = StObject.set(x, "fontPath", value.asInstanceOf[js.Any])
      
      inline def setFontPathUndefined: Self = StObject.set(x, "fontPath", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    }
  }
}
