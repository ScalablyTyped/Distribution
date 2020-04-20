package typings.figma.mod._Global_

import typings.figma.figmaStrings.CENTER
import typings.figma.figmaStrings.MAX
import typings.figma.figmaStrings.MIN
import typings.figma.figmaStrings.STRETCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutMixin extends js.Object {
  val absoluteTransform: Transform
  var constrainProportions: Boolean
  val height: Double
  var layoutAlign: MIN | CENTER | MAX | STRETCH
  var relativeTransform: Transform
  var rotation: Double
   // In degrees
  val width: Double
  var x: Double
  var y: Double
   // applicable only inside auto-layout frames
  def resize(width: Double, height: Double): Unit
  def resizeWithoutConstraints(width: Double, height: Double): Unit
}

object LayoutMixin {
  @scala.inline
  def apply(
    absoluteTransform: Transform,
    constrainProportions: Boolean,
    height: Double,
    layoutAlign: MIN | CENTER | MAX | STRETCH,
    relativeTransform: Transform,
    resize: (Double, Double) => Unit,
    resizeWithoutConstraints: (Double, Double) => Unit,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double
  ): LayoutMixin = {
    val __obj = js.Dynamic.literal(absoluteTransform = absoluteTransform.asInstanceOf[js.Any], constrainProportions = constrainProportions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layoutAlign = layoutAlign.asInstanceOf[js.Any], relativeTransform = relativeTransform.asInstanceOf[js.Any], resize = js.Any.fromFunction2(resize), resizeWithoutConstraints = js.Any.fromFunction2(resizeWithoutConstraints), rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutMixin]
  }
}

