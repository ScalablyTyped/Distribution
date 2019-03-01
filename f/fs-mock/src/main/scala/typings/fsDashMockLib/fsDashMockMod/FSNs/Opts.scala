package typings
package fsDashMockLib.fsDashMockMod.FSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  var drives: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var windows: js.UndefOr[scala.Boolean] = js.undefined
}

object Opts {
  @scala.inline
  def apply(
    drives: js.Array[java.lang.String] = null,
    root: java.lang.String = null,
    windows: js.UndefOr[scala.Boolean] = js.undefined
  ): Opts = {
    val __obj = js.Dynamic.literal()
    if (drives != null) __obj.updateDynamic("drives")(drives)
    if (root != null) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(windows)) __obj.updateDynamic("windows")(windows)
    __obj.asInstanceOf[Opts]
  }
}

