package typings
package dropzoneLib.dropzoneMod.DropzoneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropzoneDictFileSizeUnits extends js.Object {
  var b: js.UndefOr[java.lang.String] = js.undefined
  var gb: js.UndefOr[java.lang.String] = js.undefined
  var kb: js.UndefOr[java.lang.String] = js.undefined
  var mb: js.UndefOr[java.lang.String] = js.undefined
  var tb: js.UndefOr[java.lang.String] = js.undefined
}

object DropzoneDictFileSizeUnits {
  @scala.inline
  def apply(
    b: java.lang.String = null,
    gb: java.lang.String = null,
    kb: java.lang.String = null,
    mb: java.lang.String = null,
    tb: java.lang.String = null
  ): DropzoneDictFileSizeUnits = {
    val __obj = js.Dynamic.literal()
    if (b != null) __obj.updateDynamic("b")(b)
    if (gb != null) __obj.updateDynamic("gb")(gb)
    if (kb != null) __obj.updateDynamic("kb")(kb)
    if (mb != null) __obj.updateDynamic("mb")(mb)
    if (tb != null) __obj.updateDynamic("tb")(tb)
    __obj.asInstanceOf[DropzoneDictFileSizeUnits]
  }
}

