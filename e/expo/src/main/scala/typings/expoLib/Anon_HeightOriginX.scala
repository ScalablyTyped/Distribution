package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightOriginX extends js.Object {
  var height: scala.Double
  var originX: scala.Double
  var originY: scala.Double
  var width: scala.Double
}

object Anon_HeightOriginX {
  @scala.inline
  def apply(height: scala.Double, originX: scala.Double, originY: scala.Double, width: scala.Double): Anon_HeightOriginX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("originX")(originX)
    __obj.updateDynamic("originY")(originY)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_HeightOriginX]
  }
}

