package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A 3x3 matrix used to transform source coordinates (x1, y1) into destination coordinates (x2, y2)
  * according to matrix multiplication:
  *
  *     [ x2 ]   [ scaleX shearX translateX ] [ x1 ]
  *     [ y2 ] = [ shearY scaleY translateY ] [ y1 ]
  *     [ 1  ]   [   0      0        1      ] [ 1  ]
  *
  * After transformation,
  *
  *     x2 = scaleX * x1 + shearX * y1 + translateX
  *     y2 = scaleY * y1 + shearY * x1 + translateY
  */
trait AffineTransform extends js.Object {
  def getScaleX(): Double
  def getScaleY(): Double
  def getShearX(): Double
  def getShearY(): Double
  def getTranslateX(): Double
  def getTranslateY(): Double
  def toBuilder(): AffineTransformBuilder
}

object AffineTransform {
  @scala.inline
  def apply(
    getScaleX: () => Double,
    getScaleY: () => Double,
    getShearX: () => Double,
    getShearY: () => Double,
    getTranslateX: () => Double,
    getTranslateY: () => Double,
    toBuilder: () => AffineTransformBuilder
  ): AffineTransform = {
    val __obj = js.Dynamic.literal(getScaleX = js.Any.fromFunction0(getScaleX), getScaleY = js.Any.fromFunction0(getScaleY), getShearX = js.Any.fromFunction0(getShearX), getShearY = js.Any.fromFunction0(getShearY), getTranslateX = js.Any.fromFunction0(getTranslateX), getTranslateY = js.Any.fromFunction0(getTranslateY), toBuilder = js.Any.fromFunction0(toBuilder))
  
    __obj.asInstanceOf[AffineTransform]
  }
}

