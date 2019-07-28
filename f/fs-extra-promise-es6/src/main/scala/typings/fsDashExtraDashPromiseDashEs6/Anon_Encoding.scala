package typings.fsDashExtraDashPromiseDashEs6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var fd: js.UndefOr[Double] = js.undefined
  var flags: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: String = null, fd: Int | Double = null, flags: String = null, mode: Int | Double = null): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Encoding]
  }
}

