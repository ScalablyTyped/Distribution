package typings
package fsDashPromiseLib.fsDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteJsonOptions extends WriteOptions {
  var replacer: js.UndefOr[JsonReplacer] = js.undefined
  var spaces: js.UndefOr[scala.Double] = js.undefined
}

object WriteJsonOptions {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    flag: java.lang.String = null,
    mode: scala.Int | scala.Double = null,
    replacer: JsonReplacer = null,
    spaces: scala.Int | scala.Double = null
  ): WriteJsonOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteJsonOptions]
  }
}

