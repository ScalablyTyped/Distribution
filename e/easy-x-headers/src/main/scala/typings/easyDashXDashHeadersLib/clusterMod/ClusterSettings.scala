package typings
package easyDashXDashHeadersLib.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSettings extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var exec: js.UndefOr[java.lang.String] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object ClusterSettings {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] = null,
    exec: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): ClusterSettings = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (exec != null) __obj.updateDynamic("exec")(exec)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[ClusterSettings]
  }
}

