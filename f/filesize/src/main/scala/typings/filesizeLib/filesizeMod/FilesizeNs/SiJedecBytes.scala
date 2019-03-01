package typings
package filesizeLib.filesizeMod.FilesizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiJedecBytes extends js.Object {
  var B: js.UndefOr[java.lang.String] = js.undefined
  var EB: js.UndefOr[java.lang.String] = js.undefined
  var GB: js.UndefOr[java.lang.String] = js.undefined
  var KB: js.UndefOr[java.lang.String] = js.undefined
  var MB: js.UndefOr[java.lang.String] = js.undefined
  var PB: js.UndefOr[java.lang.String] = js.undefined
  var TB: js.UndefOr[java.lang.String] = js.undefined
  var YB: js.UndefOr[java.lang.String] = js.undefined
  var ZB: js.UndefOr[java.lang.String] = js.undefined
}

object SiJedecBytes {
  @scala.inline
  def apply(
    B: java.lang.String = null,
    EB: java.lang.String = null,
    GB: java.lang.String = null,
    KB: java.lang.String = null,
    MB: java.lang.String = null,
    PB: java.lang.String = null,
    TB: java.lang.String = null,
    YB: java.lang.String = null,
    ZB: java.lang.String = null
  ): SiJedecBytes = {
    val __obj = js.Dynamic.literal()
    if (B != null) __obj.updateDynamic("B")(B)
    if (EB != null) __obj.updateDynamic("EB")(EB)
    if (GB != null) __obj.updateDynamic("GB")(GB)
    if (KB != null) __obj.updateDynamic("KB")(KB)
    if (MB != null) __obj.updateDynamic("MB")(MB)
    if (PB != null) __obj.updateDynamic("PB")(PB)
    if (TB != null) __obj.updateDynamic("TB")(TB)
    if (YB != null) __obj.updateDynamic("YB")(YB)
    if (ZB != null) __obj.updateDynamic("ZB")(ZB)
    __obj.asInstanceOf[SiJedecBytes]
  }
}

