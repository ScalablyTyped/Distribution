package typings
package friendlyDashErrorsDashWebpackDashPluginLib.friendlyDashErrorsDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Severity extends js.Object

@JSImport("friendly-errors-webpack-plugin", "Severity")
@js.native
object Severity extends js.Object {
  @js.native
  sealed trait Error
    extends friendlyDashErrorsDashWebpackDashPluginLib.friendlyDashErrorsDashWebpackDashPluginMod.Severity
  
  @js.native
  sealed trait Warning
    extends friendlyDashErrorsDashWebpackDashPluginLib.friendlyDashErrorsDashWebpackDashPluginMod.Severity
  
  /* "error" */ val Error: Error with java.lang.String = js.native
  /* "warning" */ val Warning: Warning with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    friendlyDashErrorsDashWebpackDashPluginLib.friendlyDashErrorsDashWebpackDashPluginMod.Severity with java.lang.String
  ] = js.native
}

