package typings.dockerode.mod

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
    since: js.UndefOr[Double] = js.undefined,
    stderr: js.UndefOr[Boolean] = js.undefined,
    stdout: js.UndefOr[Boolean] = js.undefined,
    tail: js.UndefOr[Double] = js.undefined,
    timestamps: js.UndefOr[Boolean] = js.undefined
  ): ContainerLogsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(details)) __obj.updateDynamic("details")(details.get.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(since)) __obj.updateDynamic("since")(since.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stderr)) __obj.updateDynamic("stderr")(stderr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stdout)) __obj.updateDynamic("stdout")(stdout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tail)) __obj.updateDynamic("tail")(tail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamps)) __obj.updateDynamic("timestamps")(timestamps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerLogsOptions]
  }
}

