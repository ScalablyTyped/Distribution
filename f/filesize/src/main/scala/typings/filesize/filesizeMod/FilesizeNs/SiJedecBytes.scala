package typings.filesize.filesizeMod.FilesizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiJedecBytes extends js.Object {
  var B: js.UndefOr[String] = js.undefined
  var EB: js.UndefOr[String] = js.undefined
  var GB: js.UndefOr[String] = js.undefined
  var KB: js.UndefOr[String] = js.undefined
  var MB: js.UndefOr[String] = js.undefined
  var PB: js.UndefOr[String] = js.undefined
  var TB: js.UndefOr[String] = js.undefined
  var YB: js.UndefOr[String] = js.undefined
  var ZB: js.UndefOr[String] = js.undefined
}

object SiJedecBytes {
  @scala.inline
  def apply(
    B: String = null,
    EB: String = null,
    GB: String = null,
    KB: String = null,
    MB: String = null,
    PB: String = null,
    TB: String = null,
    YB: String = null,
    ZB: String = null
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

