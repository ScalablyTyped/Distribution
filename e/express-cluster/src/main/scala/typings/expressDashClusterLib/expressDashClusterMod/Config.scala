package typings
package expressDashClusterLib.expressDashClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var count: js.UndefOr[scala.Double] = js.undefined
  var outputStream: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  var respawn: js.UndefOr[scala.Boolean] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
  var workerListener: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    outputStream: nodeLib.NodeJSNs.WritableStream = null,
    respawn: js.UndefOr[scala.Boolean] = js.undefined,
    verbose: js.UndefOr[scala.Boolean] = js.undefined,
    workerListener: js.Function0[scala.Unit] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (outputStream != null) __obj.updateDynamic("outputStream")(outputStream)
    if (!js.isUndefined(respawn)) __obj.updateDynamic("respawn")(respawn)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    if (workerListener != null) __obj.updateDynamic("workerListener")(workerListener)
    __obj.asInstanceOf[Config]
  }
}

