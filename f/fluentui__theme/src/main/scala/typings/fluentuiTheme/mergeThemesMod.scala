package typings.fluentuiTheme

import typings.fluentuiTheme.themeMod.PartialTheme
import typings.fluentuiTheme.themeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeThemesMod {
  
  @JSImport("@fluentui/theme/lib/mergeThemes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mergeThemes(theme: Theme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeThemes")(theme.asInstanceOf[js.Any]).asInstanceOf[Theme]
  @scala.inline
  def mergeThemes(theme: Theme, partialTheme: PartialTheme): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeThemes")(theme.asInstanceOf[js.Any], partialTheme.asInstanceOf[js.Any])).asInstanceOf[Theme]
}
