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
    getMaxColor: js.Function0[java.lang.String],
    getMaxType: js.Function0[InterpolationType],
    getMaxValue: js.Function0[java.lang.String],
    getMidColor: js.Function0[java.lang.String],
    getMidType: js.Function0[InterpolationType],
    getMidValue: js.Function0[java.lang.String],
    getMinColor: js.Function0[java.lang.String],
    getMinType: js.Function0[InterpolationType],
    getMinValue: js.Function0[java.lang.String]
  ): GradientCondition = {
    val __obj = js.Dynamic.literal(getMaxColor = getMaxColor, getMaxType = getMaxType, getMaxValue = getMaxValue, getMidColor = getMidColor, getMidType = getMidType, getMidValue = getMidValue, getMinColor = getMinColor, getMinType = getMinType, getMinValue = getMinValue)
  
    __obj.asInstanceOf[GradientCondition]
  }
}

