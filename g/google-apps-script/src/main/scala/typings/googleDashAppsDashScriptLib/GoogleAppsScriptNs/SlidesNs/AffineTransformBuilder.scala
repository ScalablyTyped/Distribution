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
    build: js.Function0[AffineTransform],
    setScaleX: js.Function1[stdLib.Number, AffineTransformBuilder],
    setScaleY: js.Function1[stdLib.Number, AffineTransformBuilder],
    setShearX: js.Function1[stdLib.Number, AffineTransformBuilder],
    setShearY: js.Function1[stdLib.Number, AffineTransformBuilder],
    setTranslateX: js.Function1[stdLib.Number, AffineTransformBuilder],
    setTranslateY: js.Function1[stdLib.Number, AffineTransformBuilder]
  ): AffineTransformBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("setScaleX")(setScaleX)
    __obj.updateDynamic("setScaleY")(setScaleY)
    __obj.updateDynamic("setShearX")(setShearX)
    __obj.updateDynamic("setShearY")(setShearY)
    __obj.updateDynamic("setTranslateX")(setTranslateX)
    __obj.updateDynamic("setTranslateY")(setTranslateY)
    __obj.asInstanceOf[AffineTransformBuilder]
  }
}

