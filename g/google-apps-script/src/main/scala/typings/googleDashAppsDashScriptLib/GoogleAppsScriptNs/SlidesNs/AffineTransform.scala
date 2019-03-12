package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffineTransform extends js.Object {
  def getScaleX(): stdLib.Number
  def getScaleY(): stdLib.Number
  def getShearX(): stdLib.Number
  def getShearY(): stdLib.Number
  def getTranslateX(): stdLib.Number
  def getTranslateY(): stdLib.Number
  def toBuilder(): AffineTransformBuilder
}

object AffineTransform {
  @scala.inline
  def apply(
    getScaleX: () => stdLib.Number,
    getScaleY: () => stdLib.Number,
    getShearX: () => stdLib.Number,
    getShearY: () => stdLib.Number,
    getTranslateX: () => stdLib.Number,
    getTranslateY: () => stdLib.Number,
    toBuilder: () => AffineTransformBuilder
  ): AffineTransform = {
    val __obj = js.Dynamic.literal(getScaleX = js.Any.fromFunction0(getScaleX), getScaleY = js.Any.fromFunction0(getScaleY), getShearX = js.Any.fromFunction0(getShearX), getShearY = js.Any.fromFunction0(getShearY), getTranslateX = js.Any.fromFunction0(getTranslateX), getTranslateY = js.Any.fromFunction0(getTranslateY), toBuilder = js.Any.fromFunction0(toBuilder))
  
    __obj.asInstanceOf[AffineTransform]
  }
}

