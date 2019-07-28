package typings.easeljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rotation extends js.Object {
  var rotation: Double
  var scaleX: Double
  var scaleY: Double
  var skewX: Double
  var skewY: Double
  var x: Double
  var y: Double
}

object Anon_Rotation {
  @scala.inline
  def apply(
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    skewX: Double,
    skewY: Double,
    x: Double,
    y: Double
  ): Anon_Rotation = {
    val __obj = js.Dynamic.literal(rotation = rotation, scaleX = scaleX, scaleY = scaleY, skewX = skewX, skewY = skewY, x = x, y = y)
  
    __obj.asInstanceOf[Anon_Rotation]
  }
}

