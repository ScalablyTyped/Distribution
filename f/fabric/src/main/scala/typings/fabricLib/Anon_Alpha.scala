package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alpha extends js.Object {
  var alpha: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Alpha {
  @scala.inline
  def apply(
    alpha: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    mode: java.lang.String = null
  ): Anon_Alpha = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[Anon_Alpha]
  }
}

