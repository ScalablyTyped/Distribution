package typings
package dygraphsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X extends js.Object {
  var x: js.UndefOr[dygraphsLib.dygraphsNs.PerAxisOptions] = js.undefined
  var y: js.UndefOr[dygraphsLib.dygraphsNs.PerAxisOptions] = js.undefined
  var y2: js.UndefOr[dygraphsLib.dygraphsNs.PerAxisOptions] = js.undefined
}

object Anon_X {
  @scala.inline
  def apply(
    x: dygraphsLib.dygraphsNs.PerAxisOptions = null,
    y: dygraphsLib.dygraphsNs.PerAxisOptions = null,
    y2: dygraphsLib.dygraphsNs.PerAxisOptions = null
  ): Anon_X = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    if (y2 != null) __obj.updateDynamic("y2")(y2)
    __obj.asInstanceOf[Anon_X]
  }
}

