package typings.expoFont

import typings.expoFont.fontTypesMod.FontDisplay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<expo-font.expo-font/build/Font.types.FontResource, 'display'> */
  @js.native
  trait PickFontResourcedisplay extends StObject {
    
    var display: js.UndefOr[FontDisplay] = js.native
  }
  object PickFontResourcedisplay {
    
    @scala.inline
    def apply(): PickFontResourcedisplay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickFontResourcedisplay]
    }
    
    @scala.inline
    implicit class PickFontResourcedisplayMutableBuilder[Self <: PickFontResourcedisplay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: FontDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    }
  }
}
