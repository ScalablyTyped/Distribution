package typings
package fsDashExtraDashPromiseDashEs6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var fd: js.UndefOr[scala.Double] = js.undefined
  var flags: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    fd: scala.Int | scala.Double = null,
    flags: java.lang.String = null,
    mode: scala.Int | scala.Double = null
  ): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Encoding]
  }
}

