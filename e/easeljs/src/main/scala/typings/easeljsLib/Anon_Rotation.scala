package typings
package easeljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rotation extends js.Object {
  var rotation: scala.Double
  var scaleX: scala.Double
  var scaleY: scala.Double
  var skewX: scala.Double
  var skewY: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Anon_Rotation {
  @scala.inline
  def apply(
    rotation: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    skewX: scala.Double,
    skewY: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): Anon_Rotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rotation")(rotation)
    __obj.updateDynamic("scaleX")(scaleX)
    __obj.updateDynamic("scaleY")(scaleY)
    __obj.updateDynamic("skewX")(skewX)
    __obj.updateDynamic("skewY")(skewY)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_Rotation]
  }
}

