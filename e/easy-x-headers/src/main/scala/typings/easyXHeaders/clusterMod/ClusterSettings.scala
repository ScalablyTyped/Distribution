package typings.easyXHeaders.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSettings extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var exec: js.UndefOr[String] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
}

object ClusterSettings {
  @scala.inline
  def apply(args: js.Array[String] = null, exec: String = null, silent: js.UndefOr[Boolean] = js.undefined): ClusterSettings = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSettings]
  }
}

