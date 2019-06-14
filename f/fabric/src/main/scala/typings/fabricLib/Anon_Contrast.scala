package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contrast extends js.Object {
  var contrast: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Contrast {
  @scala.inline
  def apply(contrast: scala.Int | scala.Double = null): Anon_Contrast = {
    val __obj = js.Dynamic.literal()
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Contrast]
  }
}

