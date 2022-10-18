package typings.emotionReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  var theme: js.UndefOr[typings.emotionReact.mod.Theme] = js.undefined
}
object Theme {
  
  inline def apply(): Theme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme]
  }
  
  extension [Self <: Theme](x: Self) {
    
    inline def setTheme(value: typings.emotionReact.mod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
