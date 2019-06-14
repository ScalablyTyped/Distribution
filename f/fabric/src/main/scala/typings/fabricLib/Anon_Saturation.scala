package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Saturation extends js.Object {
  var saturation: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Saturation {
  @scala.inline
  def apply(saturation: scala.Int | scala.Double = null): Anon_Saturation = {
    val __obj = js.Dynamic.literal()
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Saturation]
  }
}

