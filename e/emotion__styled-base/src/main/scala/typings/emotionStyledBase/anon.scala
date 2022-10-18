package typings.emotionStyledBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[Theme /* <: js.Object */] extends StObject {
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object `0` {
    
    inline def apply[Theme /* <: js.Object */](): `0`[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[Theme]]
    }
    
    extension [Self <: `0`[?], Theme /* <: js.Object */](x: Self & `0`[Theme]) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
