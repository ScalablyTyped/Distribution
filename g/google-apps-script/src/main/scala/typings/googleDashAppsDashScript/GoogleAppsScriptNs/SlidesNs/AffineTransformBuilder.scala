package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffineTransformBuilder extends js.Object {
  def build(): AffineTransform
  def setScaleX(scaleX: Double): AffineTransformBuilder
  def setScaleY(scaleY: Double): AffineTransformBuilder
  def setShearX(shearX: Double): AffineTransformBuilder
  def setShearY(shearY: Double): AffineTransformBuilder
  def setTranslateX(translateX: Double): AffineTransformBuilder
  def setTranslateY(translateY: Double): AffineTransformBuilder
}

object AffineTransformBuilder {
  @scala.inline
  def apply(
    build: () => AffineTransform,
    setScaleX: Double => AffineTransformBuilder,
    setScaleY: Double => AffineTransformBuilder,
    setShearX: Double => AffineTransformBuilder,
    setShearY: Double => AffineTransformBuilder,
    setTranslateX: Double => AffineTransformBuilder,
    setTranslateY: Double => AffineTransformBuilder
  ): AffineTransformBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setScaleX = js.Any.fromFunction1(setScaleX), setScaleY = js.Any.fromFunction1(setScaleY), setShearX = js.Any.fromFunction1(setShearX), setShearY = js.Any.fromFunction1(setShearY), setTranslateX = js.Any.fromFunction1(setTranslateX), setTranslateY = js.Any.fromFunction1(setTranslateY))
  
    __obj.asInstanceOf[AffineTransformBuilder]
  }
}

