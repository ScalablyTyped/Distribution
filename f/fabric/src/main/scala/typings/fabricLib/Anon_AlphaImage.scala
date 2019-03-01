package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlphaImage extends js.Object {
  var alpha: js.UndefOr[scala.Double] = js.undefined
  var image: js.UndefOr[fabricLib.fabricDashImplMod.Image] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AlphaImage {
  @scala.inline
  def apply(
    alpha: scala.Int | scala.Double = null,
    image: fabricLib.fabricDashImplMod.Image = null,
    mode: java.lang.String = null
  ): Anon_AlphaImage = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[Anon_AlphaImage]
  }
}

