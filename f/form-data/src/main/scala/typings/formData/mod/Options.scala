package typings.formData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dataSize: js.UndefOr[Double] = js.undefined
  var maxDataSize: js.UndefOr[Double] = js.undefined
  var pauseStreams: js.UndefOr[Boolean] = js.undefined
  var readable: js.UndefOr[Boolean] = js.undefined
  var writable: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dataSize: Int | Double = null,
    maxDataSize: Int | Double = null,
    pauseStreams: js.UndefOr[Boolean] = js.undefined,
    readable: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dataSize != null) __obj.updateDynamic("dataSize")(dataSize.asInstanceOf[js.Any])
    if (maxDataSize != null) __obj.updateDynamic("maxDataSize")(maxDataSize.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseStreams)) __obj.updateDynamic("pauseStreams")(pauseStreams.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

