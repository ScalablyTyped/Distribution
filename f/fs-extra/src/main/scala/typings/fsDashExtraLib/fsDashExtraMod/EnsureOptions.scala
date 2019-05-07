package typings
package fsDashExtraLib.fsDashExtraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnsureOptions extends js.Object {
  var mode: js.UndefOr[scala.Double] = js.undefined
}

object EnsureOptions {
  @scala.inline
  def apply(mode: scala.Int | scala.Double = null): EnsureOptions = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnsureOptions]
  }
}

