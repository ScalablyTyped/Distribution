package typings.formData.mod

import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends ReadableOptions {
  var dataSize: js.UndefOr[Double] = js.undefined
  var maxDataSize: js.UndefOr[Double] = js.undefined
  var pauseStreams: js.UndefOr[Boolean] = js.undefined
  var readable: js.UndefOr[Boolean] = js.undefined
  var writable: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    dataSize: Int | Double = null,
    destroy: js.ThisFunction2[
      /* this */ Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    encoding: String = null,
    highWaterMark: Int | Double = null,
    maxDataSize: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    pauseStreams: js.UndefOr[Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit] = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.asInstanceOf[js.Any])
    if (dataSize != null) __obj.updateDynamic("dataSize")(dataSize.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (maxDataSize != null) __obj.updateDynamic("maxDataSize")(maxDataSize.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseStreams)) __obj.updateDynamic("pauseStreams")(pauseStreams.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

