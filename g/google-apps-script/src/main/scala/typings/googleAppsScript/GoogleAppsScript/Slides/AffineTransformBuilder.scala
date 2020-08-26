package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for AffineTransform objects. Defaults to the identity transform.
  *
  * Call AffineTransformBuilder#build() to get the AffineTransform object.
  *
  *     var transform =
  *         SlidesApp.newAffineTransformBuilder().setScaleX(2.0).setShearY(1.1).build();
  *
  *     The resulting transform matrix is
  *       [ 2.0   0.0   0.0 ]
  *       [ 1.1   1.0   0.0 ]
  *       [  0     0     1  ]
  */
@js.native
trait AffineTransformBuilder extends js.Object {
  def build(): AffineTransform = js.native
  def setScaleX(scaleX: Double): AffineTransformBuilder = js.native
  def setScaleY(scaleY: Double): AffineTransformBuilder = js.native
  def setShearX(shearX: Double): AffineTransformBuilder = js.native
  def setShearY(shearY: Double): AffineTransformBuilder = js.native
  def setTranslateX(translateX: Double): AffineTransformBuilder = js.native
  def setTranslateY(translateY: Double): AffineTransformBuilder = js.native
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
  @scala.inline
  implicit class AffineTransformBuilderOps[Self <: AffineTransformBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuild(value: () => AffineTransform): Self = this.set("build", js.Any.fromFunction0(value))
    @scala.inline
    def setSetScaleX(value: Double => AffineTransformBuilder): Self = this.set("setScaleX", js.Any.fromFunction1(value))
    @scala.inline
    def setSetScaleY(value: Double => AffineTransformBuilder): Self = this.set("setScaleY", js.Any.fromFunction1(value))
    @scala.inline
    def setSetShearX(value: Double => AffineTransformBuilder): Self = this.set("setShearX", js.Any.fromFunction1(value))
    @scala.inline
    def setSetShearY(value: Double => AffineTransformBuilder): Self = this.set("setShearY", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTranslateX(value: Double => AffineTransformBuilder): Self = this.set("setTranslateX", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTranslateY(value: Double => AffineTransformBuilder): Self = this.set("setTranslateY", js.Any.fromFunction1(value))
  }
  
}

