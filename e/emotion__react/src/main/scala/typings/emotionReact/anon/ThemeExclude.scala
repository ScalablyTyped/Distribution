package typings.emotionReact.anon

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeExclude extends StObject {
  
  var theme: Exclude[js.Any, Unit]
}
object ThemeExclude {
  
  @scala.inline
  def apply(theme: Exclude[js.Any, Unit]): ThemeExclude = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeExclude]
  }
  
  @scala.inline
  implicit class ThemeExcludeMutableBuilder[Self <: ThemeExclude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTheme(value: Exclude[js.Any, Unit]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
