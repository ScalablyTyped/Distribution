package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffineTransform extends js.Object {
  def getScaleX(): scala.Double
  def getScaleY(): scala.Double
  def getShearX(): scala.Double
  def getShearY(): scala.Double
  def getTranslateX(): scala.Double
  def getTranslateY(): scala.Double
  def toBuilder(): AffineTransformBuilder
}

object AffineTransform {
  @scala.inline
  def apply(
    getScaleX: () => scala.Double,
    getScaleY: () => scala.Double,
    getShearX: () => scala.Double,
    getShearY: () => scala.Double,
    getTranslateX: () => scala.Double,
    getTranslateY: () => scala.Double,
    toBuilder: () => AffineTransformBuilder
  ): AffineTransform = {
    val __obj = js.Dynamic.literal(getScaleX = js.Any.fromFunction0(getScaleX), getScaleY = js.Any.fromFunction0(getScaleY), getShearX = js.Any.fromFunction0(getShearX), getShearY = js.Any.fromFunction0(getShearY), getTranslateX = js.Any.fromFunction0(getTranslateX), getTranslateY = js.Any.fromFunction0(getTranslateY), toBuilder = js.Any.fromFunction0(toBuilder))
  
    __obj.asInstanceOf[AffineTransform]
  }
}

