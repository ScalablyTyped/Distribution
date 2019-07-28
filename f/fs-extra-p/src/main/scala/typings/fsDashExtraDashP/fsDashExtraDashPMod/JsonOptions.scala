package typings.fsDashExtraDashP.fsDashExtraDashPMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonOptions extends OpenOptions {
  var spaces: Double
}

object JsonOptions {
  @scala.inline
  def apply(spaces: Double, encoding: String = null, flag: String = null, mode: Double | String = null): JsonOptions = {
    val __obj = js.Dynamic.literal(spaces = spaces)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonOptions]
  }
}

