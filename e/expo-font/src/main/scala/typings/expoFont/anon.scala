package typings.expoFont

import typings.expoFont.fontTypesMod.FontDisplay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<expo-font.expo-font/build/Font.types.FontResource, 'display'> */
  trait PickFontResourcedisplay extends StObject {
    
    var display: js.UndefOr[FontDisplay] = js.undefined
  }
  object PickFontResourcedisplay {
    
    inline def apply(): PickFontResourcedisplay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickFontResourcedisplay]
    }
    
    extension [Self <: PickFontResourcedisplay](x: Self) {
      
      inline def setDisplay(value: FontDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    }
  }
}
