package typings.fluentuiTheme

import typings.fluentuiTheme.themeMod.PartialTheme
import typings.fluentuiTheme.themeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createThemeMod {
  
  @JSImport("@fluentui/theme/lib/createTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")().asInstanceOf[Theme]
  @scala.inline
  def createTheme(theme: Unit, depComments: Boolean): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(theme.asInstanceOf[js.Any], depComments.asInstanceOf[js.Any])).asInstanceOf[Theme]
  @scala.inline
  def createTheme(theme: PartialTheme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Theme]
  @scala.inline
  def createTheme(theme: PartialTheme, depComments: Boolean): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(theme.asInstanceOf[js.Any], depComments.asInstanceOf[js.Any])).asInstanceOf[Theme]
}
