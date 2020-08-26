package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access gradient (color) conditions in ConditionalFormatRuleApis.
  * Each conditional format rule may contain a single gradient condition. A gradient condition is
  * defined by three points along a number scale (min, mid, and max), each of which has a color, a
  * value, and a InterpolationType. The content of a cell is
  * compared to the values in the number scale and the color applied to the cell is interpolated
  * based on the cell content's proximity to the gradient condition min, mid, and max points.
  *
  *     // Logs all the information inside gradient conditional format rules on a sheet.
  *     var sheet = SpreadsheetApp.getActiveSheet();
  *     var rules = sheet.getConditionalFormatRules();
  *     for (int i = 0; i < rules.length; i++) {
  *       var gradient = rules[i].getGradientCondition();
  *       Logger.log("The conditional format gradient information for rule %d:\n
  *         MinColor %s, MinType %s, MinValue %s, \n
  *         MidColor %s, MidType %s, MidValue %s, \n
  *         MaxColor %s, MaxType %s, MaxValue %s \n", i,
  *         gradient.getMinColor(), gradient.getMinType(), gradient.getMinValue(),
  *         gradient.getMidColor(), gradient.getMidType(), gradient.getMidValue(),
  *         gradient.getMaxColor(), gradient.getMaxType(), gradient.getMaxValue());
  *     }
  */
@js.native
trait GradientCondition extends js.Object {
  def getMaxColor(): String = js.native
  def getMaxType(): InterpolationType | Null = js.native
  def getMaxValue(): String = js.native
  def getMidColor(): String = js.native
  def getMidType(): InterpolationType | Null = js.native
  def getMidValue(): String = js.native
  def getMinColor(): String = js.native
  def getMinType(): InterpolationType | Null = js.native
  def getMinValue(): String = js.native
}

object GradientCondition {
  @scala.inline
  def apply(
    getMaxColor: () => String,
    getMaxType: () => InterpolationType | Null,
    getMaxValue: () => String,
    getMidColor: () => String,
    getMidType: () => InterpolationType | Null,
    getMidValue: () => String,
    getMinColor: () => String,
    getMinType: () => InterpolationType | Null,
    getMinValue: () => String
  ): GradientCondition = {
    val __obj = js.Dynamic.literal(getMaxColor = js.Any.fromFunction0(getMaxColor), getMaxType = js.Any.fromFunction0(getMaxType), getMaxValue = js.Any.fromFunction0(getMaxValue), getMidColor = js.Any.fromFunction0(getMidColor), getMidType = js.Any.fromFunction0(getMidType), getMidValue = js.Any.fromFunction0(getMidValue), getMinColor = js.Any.fromFunction0(getMinColor), getMinType = js.Any.fromFunction0(getMinType), getMinValue = js.Any.fromFunction0(getMinValue))
    __obj.asInstanceOf[GradientCondition]
  }
  @scala.inline
  implicit class GradientConditionOps[Self <: GradientCondition] (val x: Self) extends AnyVal {
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
    def setGetMaxColor(value: () => String): Self = this.set("getMaxColor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMaxType(value: () => InterpolationType | Null): Self = this.set("getMaxType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMaxValue(value: () => String): Self = this.set("getMaxValue", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMidColor(value: () => String): Self = this.set("getMidColor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMidType(value: () => InterpolationType | Null): Self = this.set("getMidType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMidValue(value: () => String): Self = this.set("getMidValue", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMinColor(value: () => String): Self = this.set("getMinColor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMinType(value: () => InterpolationType | Null): Self = this.set("getMinType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMinValue(value: () => String): Self = this.set("getMinValue", js.Any.fromFunction0(value))
  }
  
}

