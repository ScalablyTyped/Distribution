package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerLogsOptions extends js.Object {
  var details: js.UndefOr[Boolean] = js.undefined
  var follow: js.UndefOr[Boolean] = js.undefined
  var since: js.UndefOr[Double] = js.undefined
  var stderr: js.UndefOr[Boolean] = js.undefined
  var stdout: js.UndefOr[Boolean] = js.undefined
  var tail: js.UndefOr[Double] = js.undefined
  var timestamps: js.UndefOr[Boolean] = js.undefined
}

object ContainerLogsOptions {
  @scala.inline
  def apply(
    details: js.UndefOr[Boolean] = js.undefined,
    follow: js.UndefOr[Boolean] = js.undefined,
    since: Int | Double = null,
    stderr: js.UndefOr[Boolean] = js.undefined,
    stdout: js.UndefOr[Boolean] = js.undefined,
    tail: Int | Double = null,
    timestamps: js.UndefOr[Boolean] = js.undefined
  ): ContainerLogsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(details)) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (!js.isUndefined(stderr)) __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    if (!js.isUndefined(stdout)) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    if (tail != null) __obj.updateDynamic("tail")(tail.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamps)) __obj.updateDynamic("timestamps")(timestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerLogsOptions]
  }
}

