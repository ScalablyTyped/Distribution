package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffineTransformBuilder extends js.Object {
  def build(): AffineTransform
  def setScaleX(scaleX: stdLib.Number): AffineTransformBuilder
  def setScaleY(scaleY: stdLib.Number): AffineTransformBuilder
  def setShearX(shearX: stdLib.Number): AffineTransformBuilder
  def setShearY(shearY: stdLib.Number): AffineTransformBuilder
  def setTranslateX(translateX: stdLib.Number): AffineTransformBuilder
  def setTranslateY(translateY: stdLib.Number): AffineTransformBuilder
}

object AffineTransformBuilder {
  @scala.inline
  def apply(
    build: () => AffineTransform,
    setScaleX: stdLib.Number => AffineTransformBuilder,
    setScaleY: stdLib.Number => AffineTransformBuilder,
    setShearX: stdLib.Number => AffineTransformBuilder,
    setShearY: stdLib.Number => AffineTransformBuilder,
    setTranslateX: stdLib.Number => AffineTransformBuilder,
    setTranslateY: stdLib.Number => AffineTransformBuilder
  ): AffineTransformBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setScaleX = js.Any.fromFunction1(setScaleX), setScaleY = js.Any.fromFunction1(setScaleY), setShearX = js.Any.fromFunction1(setShearX), setShearY = js.Any.fromFunction1(setShearY), setTranslateX = js.Any.fromFunction1(setTranslateX), setTranslateY = js.Any.fromFunction1(setTranslateY))
  
    __obj.asInstanceOf[AffineTransformBuilder]
  }
}

