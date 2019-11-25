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
    val __obj = js.Dynamic.literal(absoluteTransform = absoluteTransform.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], relativeTransform = relativeTransform.asInstanceOf[js.Any], resize = js.Any.fromFunction2(resize), resizeWithoutConstraints = js.Any.fromFunction2(resizeWithoutConstraints), rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LayoutMixin]
  }
}

