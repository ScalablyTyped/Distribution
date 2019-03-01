package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScaleX extends js.Object {
  var scaleX: scala.Double
  var scaleY: scala.Double
}

object Anon_ScaleX {
  @scala.inline
  def apply(scaleX: scala.Double, scaleY: scala.Double): Anon_ScaleX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scaleX")(scaleX)
    __obj.updateDynamic("scaleY")(scaleY)
    __obj.asInstanceOf[Anon_ScaleX]
  }
}

