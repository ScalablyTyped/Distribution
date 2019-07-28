package typings.expressDashCluster.expressDashClusterMod

import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var outputStream: js.UndefOr[WritableStream] = js.undefined
  var respawn: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
  var workerListener: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    count: Int | Double = null,
    outputStream: WritableStream = null,
    respawn: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    workerListener: () => Unit = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (outputStream != null) __obj.updateDynamic("outputStream")(outputStream)
    if (!js.isUndefined(respawn)) __obj.updateDynamic("respawn")(respawn)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    if (workerListener != null) __obj.updateDynamic("workerListener")(js.Any.fromFunction0(workerListener))
    __obj.asInstanceOf[Config]
  }
}

