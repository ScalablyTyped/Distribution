package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientCondition extends js.Object {
  def getMaxColor(): java.lang.String
  def getMaxType(): InterpolationType
  def getMaxValue(): java.lang.String
  def getMidColor(): java.lang.String
  def getMidType(): InterpolationType
  def getMidValue(): java.lang.String
  def getMinColor(): java.lang.String
  def getMinType(): InterpolationType
  def getMinValue(): java.lang.String
}

object GradientCondition {
  @scala.inline
  def apply(
    getMaxColor: () => java.lang.String,
    getMaxType: () => InterpolationType,
    getMaxValue: () => java.lang.String,
    getMidColor: () => java.lang.String,
    getMidType: () => InterpolationType,
    getMidValue: () => java.lang.String,
    getMinColor: () => java.lang.String,
    getMinType: () => InterpolationType,
    getMinValue: () => java.lang.String
  ): GradientCondition = {
    val __obj = js.Dynamic.literal(getMaxColor = js.Any.fromFunction0(getMaxColor), getMaxType = js.Any.fromFunction0(getMaxType), getMaxValue = js.Any.fromFunction0(getMaxValue), getMidColor = js.Any.fromFunction0(getMidColor), getMidType = js.Any.fromFunction0(getMidType), getMidValue = js.Any.fromFunction0(getMidValue), getMinColor = js.Any.fromFunction0(getMinColor), getMinType = js.Any.fromFunction0(getMinType), getMinValue = js.Any.fromFunction0(getMinValue))
  
    __obj.asInstanceOf[GradientCondition]
  }
}

