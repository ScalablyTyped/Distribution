package typings.friendlyDashErrorsDashWebpackDashPlugin.friendlyDashErrorsDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Severity extends js.Object

@JSImport("friendly-errors-webpack-plugin", "Severity")
@js.native
object Severity extends js.Object {
  @js.native
  sealed trait Error extends Severity
  
  @js.native
  sealed trait Warning extends Severity
  
  /* "error" */ val Error: typings.friendlyDashErrorsDashWebpackDashPlugin.friendlyDashErrorsDashWebpackDashPluginMod.Severity.Error with String = js.native
  /* "warning" */ val Warning: typings.friendlyDashErrorsDashWebpackDashPlugin.friendlyDashErrorsDashWebpackDashPluginMod.Severity.Warning with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Severity with String] = js.native
}

