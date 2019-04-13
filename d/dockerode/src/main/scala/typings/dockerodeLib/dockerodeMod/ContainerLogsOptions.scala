package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerLogsOptions extends js.Object {
  var details: js.UndefOr[scala.Boolean] = js.undefined
  var follow: js.UndefOr[scala.Boolean] = js.undefined
  var since: js.UndefOr[scala.Double] = js.undefined
  var stderr: js.UndefOr[scala.Boolean] = js.undefined
  var stdout: js.UndefOr[scala.Boolean] = js.undefined
  var tail: js.UndefOr[scala.Double] = js.undefined
  var timestamps: js.UndefOr[scala.Boolean] = js.undefined
}

object ContainerLogsOptions {
  @scala.inline
  def apply(
    details: js.UndefOr[scala.Boolean] = js.undefined,
    follow: js.UndefOr[scala.Boolean] = js.undefined,
    since: scala.Int | scala.Double = null,
    stderr: js.UndefOr[scala.Boolean] = js.undefined,
    stdout: js.UndefOr[scala.Boolean] = js.undefined,
    tail: scala.Int | scala.Double = null,
    timestamps: js.UndefOr[scala.Boolean] = js.undefined
  ): ContainerLogsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(details)) __obj.updateDynamic("details")(details)
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow)
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (!js.isUndefined(stderr)) __obj.updateDynamic("stderr")(stderr)
    if (!js.isUndefined(stdout)) __obj.updateDynamic("stdout")(stdout)
    if (tail != null) __obj.updateDynamic("tail")(tail.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamps)) __obj.updateDynamic("timestamps")(timestamps)
    __obj.asInstanceOf[ContainerLogsOptions]
  }
}

