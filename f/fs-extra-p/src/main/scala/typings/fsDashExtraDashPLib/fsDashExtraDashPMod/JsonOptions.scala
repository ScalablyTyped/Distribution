package typings
package fsDashExtraDashPLib.fsDashExtraDashPMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonOptions extends OpenOptions {
  var spaces: scala.Double
}

object JsonOptions {
  @scala.inline
  def apply(
    spaces: scala.Double,
    encoding: java.lang.String = null,
    flag: java.lang.String = null,
    mode: scala.Double | java.lang.String = null
  ): JsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("spaces")(spaces)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonOptions]
  }
}

