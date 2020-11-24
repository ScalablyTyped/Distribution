package typings.fluentuiTheme

import typings.fluentuiTheme.themeMod.PartialTheme
import typings.fluentuiTheme.themeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fluentui/theme/lib/createTheme", JSImport.Namespace)
@js.native
object createThemeMod extends js.Object {
  
  def createTheme(): Theme = js.native
  def createTheme(theme: js.UndefOr[scala.Nothing], depComments: Boolean): Theme = js.native
  def createTheme(theme: PartialTheme): Theme = js.native
  def createTheme(theme: PartialTheme, depComments: Boolean): Theme = js.native
}
