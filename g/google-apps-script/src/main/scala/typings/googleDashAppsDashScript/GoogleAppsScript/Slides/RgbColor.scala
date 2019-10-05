package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbColor extends js.Object {
  def asHexString(): String
  def getBlue(): Integer
  def getColorType(): ColorType
  def getGreen(): Integer
  def getRed(): Integer
}

object RgbColor {
  @scala.inline
  def apply(
    asHexString: () => String,
    getBlue: () => Integer,
    getColorType: () => ColorType,
    getGreen: () => Integer,
    getRed: () => Integer
  ): RgbColor = {
    val __obj = js.Dynamic.literal(asHexString = js.Any.fromFunction0(asHexString), getBlue = js.Any.fromFunction0(getBlue), getColorType = js.Any.fromFunction0(getColorType), getGreen = js.Any.fromFunction0(getGreen), getRed = js.Any.fromFunction0(getRed))
  
    __obj.asInstanceOf[RgbColor]
  }
}

