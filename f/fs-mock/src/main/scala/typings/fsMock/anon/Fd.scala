package typings.fsMock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fd extends js.Object {
  var bufferSize: js.UndefOr[Double] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var fd: js.UndefOr[String] = js.undefined
  var flags: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
}

object Fd {
  @scala.inline
  def apply(
    bufferSize: js.UndefOr[Double] = js.undefined,
    encoding: String = null,
    fd: String = null,
    flags: String = null,
    mode: String = null
  ): Fd = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bufferSize)) __obj.updateDynamic("bufferSize")(bufferSize.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fd]
  }
}

