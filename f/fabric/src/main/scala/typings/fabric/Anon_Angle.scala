package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Angle extends js.Object {
  var angle: Double
  var scaleX: Double
  var scaleY: Double
  var skewX: Double
  var skewY: Double
  var translateX: Double
  var translateY: Double
}

object Anon_Angle {
  @scala.inline
  def apply(
    angle: Double,
    scaleX: Double,
    scaleY: Double,
    skewX: Double,
    skewY: Double,
    translateX: Double,
    translateY: Double
  ): Anon_Angle = {
    val __obj = js.Dynamic.literal(angle = angle, scaleX = scaleX, scaleY = scaleY, skewX = skewX, skewY = skewY, translateX = translateX, translateY = translateY)
  
    __obj.asInstanceOf[Anon_Angle]
  }
}

