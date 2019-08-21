package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutMixin extends js.Object {
  val absoluteTransform: Transform
  val height: Double
  var relativeTransform: Transform
  var rotation: Double
   // In degrees
  val width: Double
  var x: Double
  var y: Double
  def resize(width: Double, height: Double): Unit
  def resizeWithoutConstraints(width: Double, height: Double): Unit
}

object LayoutMixin {
  @scala.inline
  def apply(
    absoluteTransform: Transform,
    height: Double,
    relativeTransform: Transform,
    resize: (Double, Double) => Unit,
    resizeWithoutConstraints: (Double, Double) => Unit,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double
  ): LayoutMixin = {
    val __obj = js.Dynamic.literal(absoluteTransform = absoluteTransform, height = height, relativeTransform = relativeTransform, resize = js.Any.fromFunction2(resize), resizeWithoutConstraints = js.Any.fromFunction2(resizeWithoutConstraints), rotation = rotation, width = width, x = x, y = y)
  
    __obj.asInstanceOf[LayoutMixin]
  }
}

