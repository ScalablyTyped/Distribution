package typings.dropzone.dropzoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropzoneDictFileSizeUnits extends js.Object {
  var b: js.UndefOr[String] = js.undefined
  var gb: js.UndefOr[String] = js.undefined
  var kb: js.UndefOr[String] = js.undefined
  var mb: js.UndefOr[String] = js.undefined
  var tb: js.UndefOr[String] = js.undefined
}

object DropzoneDictFileSizeUnits {
  @scala.inline
  def apply(b: String = null, gb: String = null, kb: String = null, mb: String = null, tb: String = null): DropzoneDictFileSizeUnits = {
    val __obj = js.Dynamic.literal()
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (gb != null) __obj.updateDynamic("gb")(gb.asInstanceOf[js.Any])
    if (kb != null) __obj.updateDynamic("kb")(kb.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (tb != null) __obj.updateDynamic("tb")(tb.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropzoneDictFileSizeUnits]
  }
}

