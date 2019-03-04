package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Angle extends js.Object {
  var angle: scala.Double
  var scaleX: scala.Double
  var scaleY: scala.Double
  var skewX: scala.Double
  var skewY: scala.Double
  var translateX: scala.Double
  var translateY: scala.Double
}

object Anon_Angle {
  @scala.inline
  def apply(
    angle: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    skewX: scala.Double,
    skewY: scala.Double,
    translateX: scala.Double,
    translateY: scala.Double
  ): Anon_Angle = {
    val __obj = js.Dynamic.literal(angle = angle, scaleX = scaleX, scaleY = scaleY, skewX = skewX, skewY = skewY, translateX = translateX, translateY = translateY)
  
    __obj.asInstanceOf[Anon_Angle]
  }
}

