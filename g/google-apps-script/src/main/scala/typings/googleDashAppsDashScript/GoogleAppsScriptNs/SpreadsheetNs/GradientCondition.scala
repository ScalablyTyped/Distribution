package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientCondition extends js.Object {
  def getMaxColor(): String
  def getMaxType(): InterpolationType
  def getMaxValue(): String
  def getMidColor(): String
  def getMidType(): InterpolationType
  def getMidValue(): String
  def getMinColor(): String
  def getMinType(): InterpolationType
  def getMinValue(): String
}

object GradientCondition {
  @scala.inline
  def apply(
    getMaxColor: () => String,
    getMaxType: () => InterpolationType,
    getMaxValue: () => String,
    getMidColor: () => String,
    getMidType: () => InterpolationType,
    getMidValue: () => String,
    getMinColor: () => String,
    getMinType: () => InterpolationType,
    getMinValue: () => String
  ): GradientCondition = {
    val __obj = js.Dynamic.literal(getMaxColor = js.Any.fromFunction0(getMaxColor), getMaxType = js.Any.fromFunction0(getMaxType), getMaxValue = js.Any.fromFunction0(getMaxValue), getMidColor = js.Any.fromFunction0(getMidColor), getMidType = js.Any.fromFunction0(getMidType), getMidValue = js.Any.fromFunction0(getMidValue), getMinColor = js.Any.fromFunction0(getMinColor), getMinType = js.Any.fromFunction0(getMinType), getMinValue = js.Any.fromFunction0(getMinValue))
  
    __obj.asInstanceOf[GradientCondition]
  }
}

