package typings.emotionReact.anon

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeExclude extends StObject {
  
  var theme: Exclude[js.Any, Unit]
}
object ThemeExclude {
  
  inline def apply(theme: Exclude[js.Any, Unit]): ThemeExclude = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeExclude]
  }
  
  extension [Self <: ThemeExclude](x: Self) {
    
    inline def setTheme(value: Exclude[js.Any, Unit]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
