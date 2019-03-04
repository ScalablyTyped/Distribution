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
    getScaleX: js.Function0[stdLib.Number],
    getScaleY: js.Function0[stdLib.Number],
    getShearX: js.Function0[stdLib.Number],
    getShearY: js.Function0[stdLib.Number],
    getTranslateX: js.Function0[stdLib.Number],
    getTranslateY: js.Function0[stdLib.Number],
    toBuilder: js.Function0[AffineTransformBuilder]
  ): AffineTransform = {
    val __obj = js.Dynamic.literal(getScaleX = getScaleX, getScaleY = getScaleY, getShearX = getShearX, getShearY = getShearY, getTranslateX = getTranslateX, getTranslateY = getTranslateY, toBuilder = toBuilder)
  
    __obj.asInstanceOf[AffineTransform]
  }
}

