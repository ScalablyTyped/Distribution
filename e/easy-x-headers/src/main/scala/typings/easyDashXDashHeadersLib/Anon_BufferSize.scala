package typings
package easyDashXDashHeadersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferSize extends js.Object {
  var bufferSize: js.UndefOr[scala.Double] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var fd: js.UndefOr[java.lang.String] = js.undefined
  var flags: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BufferSize {
  @scala.inline
  def apply(
    bufferSize: scala.Int | scala.Double = null,
    encoding: java.lang.String = null,
    fd: java.lang.String = null,
    flags: java.lang.String = null,
    mode: scala.Int | scala.Double = null
  ): Anon_BufferSize = {
    val __obj = js.Dynamic.literal()
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fd != null) __obj.updateDynamic("fd")(fd)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BufferSize]
  }
}

