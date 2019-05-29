package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffineTransformBuilder extends js.Object {
  def build(): AffineTransform
  def setScaleX(scaleX: scala.Double): AffineTransformBuilder
  def setScaleY(scaleY: scala.Double): AffineTransformBuilder
  def setShearX(shearX: scala.Double): AffineTransformBuilder
  def setShearY(shearY: scala.Double): AffineTransformBuilder
  def setTranslateX(translateX: scala.Double): AffineTransformBuilder
  def setTranslateY(translateY: scala.Double): AffineTransformBuilder
}

object AffineTransformBuilder {
  @scala.inline
  def apply(
    build: () => AffineTransform,
    setScaleX: scala.Double => AffineTransformBuilder,
    setScaleY: scala.Double => AffineTransformBuilder,
    setShearX: scala.Double => AffineTransformBuilder,
    setShearY: scala.Double => AffineTransformBuilder,
    setTranslateX: scala.Double => AffineTransformBuilder,
    setTranslateY: scala.Double => AffineTransformBuilder
  ): AffineTransformBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setScaleX = js.Any.fromFunction1(setScaleX), setScaleY = js.Any.fromFunction1(setScaleY), setShearX = js.Any.fromFunction1(setShearX), setShearY = js.Any.fromFunction1(setShearY), setTranslateX = js.Any.fromFunction1(setTranslateX), setTranslateY = js.Any.fromFunction1(setTranslateY))
  
    __obj.asInstanceOf[AffineTransformBuilder]
  }
}

