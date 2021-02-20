package typings.emotionReact.anon

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeExclude extends StObject {
  
  var theme: Exclude[_, js.UndefOr[scala.Nothing]] = js.native
}
object ThemeExclude {
  
  @scala.inline
  def apply(theme: Exclude[_, js.UndefOr[scala.Nothing]]): ThemeExclude = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeExclude]
  }
  
  @scala.inline
  implicit class ThemeExcludeMutableBuilder[Self <: ThemeExclude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTheme(value: Exclude[_, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
