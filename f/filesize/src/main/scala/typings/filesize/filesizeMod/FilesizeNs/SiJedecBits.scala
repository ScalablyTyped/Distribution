package typings.filesize.filesizeMod.FilesizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiJedecBits extends js.Object {
  var Eb: js.UndefOr[String] = js.undefined
  var Gb: js.UndefOr[String] = js.undefined
  var Kb: js.UndefOr[String] = js.undefined
  var Mb: js.UndefOr[String] = js.undefined
  var Pb: js.UndefOr[String] = js.undefined
  var Tb: js.UndefOr[String] = js.undefined
  var Yb: js.UndefOr[String] = js.undefined
  var Zb: js.UndefOr[String] = js.undefined
  var b: js.UndefOr[String] = js.undefined
}

object SiJedecBits {
  @scala.inline
  def apply(
    Eb: String = null,
    Gb: String = null,
    Kb: String = null,
    Mb: String = null,
    Pb: String = null,
    Tb: String = null,
    Yb: String = null,
    Zb: String = null,
    b: String = null
  ): SiJedecBits = {
    val __obj = js.Dynamic.literal()
    if (Eb != null) __obj.updateDynamic("Eb")(Eb)
    if (Gb != null) __obj.updateDynamic("Gb")(Gb)
    if (Kb != null) __obj.updateDynamic("Kb")(Kb)
    if (Mb != null) __obj.updateDynamic("Mb")(Mb)
    if (Pb != null) __obj.updateDynamic("Pb")(Pb)
    if (Tb != null) __obj.updateDynamic("Tb")(Tb)
    if (Yb != null) __obj.updateDynamic("Yb")(Yb)
    if (Zb != null) __obj.updateDynamic("Zb")(Zb)
    if (b != null) __obj.updateDynamic("b")(b)
    __obj.asInstanceOf[SiJedecBits]
  }
}

