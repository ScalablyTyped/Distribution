package typings
package fsDashExtraDashPromiseDashEs6Lib.fsDashExtraDashPromiseDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenOptions extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var flag: js.UndefOr[java.lang.String] = js.undefined
}

object OpenOptions {
  @scala.inline
  def apply(encoding: java.lang.String = null, flag: java.lang.String = null): OpenOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    __obj.asInstanceOf[OpenOptions]
  }
}

