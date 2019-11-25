package typings.filesize.filesizeMod.Filesize

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
    if (B != null) __obj.updateDynamic("B")(B.asInstanceOf[js.Any])
    if (EB != null) __obj.updateDynamic("EB")(EB.asInstanceOf[js.Any])
    if (GB != null) __obj.updateDynamic("GB")(GB.asInstanceOf[js.Any])
    if (KB != null) __obj.updateDynamic("KB")(KB.asInstanceOf[js.Any])
    if (MB != null) __obj.updateDynamic("MB")(MB.asInstanceOf[js.Any])
    if (PB != null) __obj.updateDynamic("PB")(PB.asInstanceOf[js.Any])
    if (TB != null) __obj.updateDynamic("TB")(TB.asInstanceOf[js.Any])
    if (YB != null) __obj.updateDynamic("YB")(YB.asInstanceOf[js.Any])
    if (ZB != null) __obj.updateDynamic("ZB")(ZB.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiJedecBytes]
  }
}

