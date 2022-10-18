package typings.emotionNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  var theme: typings.emotionReact.mod.Theme
}
object Theme {
  
  inline def apply(theme: typings.emotionReact.mod.Theme): Theme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  extension [Self <: Theme](x: Self) {
    
    inline def setTheme(value: typings.emotionReact.mod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
