package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateItem extends js.Object {
  def createResponse(response: stdLib.Date): ItemResponse
  def duplicate(): DateItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getPoints(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTitle(): java.lang.String
  def getType(): ItemType
  def includesYear(): scala.Boolean
  def isRequired(): scala.Boolean
  def setGeneralFeedback(feedback: QuizFeedback): DateItem
  def setHelpText(text: java.lang.String): DateItem
  def setIncludesYear(enableYear: scala.Boolean): DateItem
  def setPoints(points: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): DateItem
  def setRequired(enabled: scala.Boolean): DateItem
  def setTitle(title: java.lang.String): DateItem
}

object DateItem {
  @scala.inline
  def apply(
    createResponse: js.Function1[stdLib.Date, ItemResponse],
    duplicate: js.Function0[DateItem],
    getGeneralFeedback: js.Function0[QuizFeedback],
    getHelpText: js.Function0[java.lang.String],
    getId: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getPoints: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getTitle: js.Function0[java.lang.String],
    getType: js.Function0[ItemType],
    includesYear: js.Function0[scala.Boolean],
    isRequired: js.Function0[scala.Boolean],
    setGeneralFeedback: js.Function1[QuizFeedback, DateItem],
    setHelpText: js.Function1[java.lang.String, DateItem],
    setIncludesYear: js.Function1[scala.Boolean, DateItem],
    setPoints: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, DateItem],
    setRequired: js.Function1[scala.Boolean, DateItem],
    setTitle: js.Function1[java.lang.String, DateItem]
  ): DateItem = {
    val __obj = js.Dynamic.literal(createResponse = createResponse, duplicate = duplicate, getGeneralFeedback = getGeneralFeedback, getHelpText = getHelpText, getId = getId, getIndex = getIndex, getPoints = getPoints, getTitle = getTitle, getType = getType, includesYear = includesYear, isRequired = isRequired, setGeneralFeedback = setGeneralFeedback, setHelpText = setHelpText, setIncludesYear = setIncludesYear, setPoints = setPoints, setRequired = setRequired, setTitle = setTitle)
  
    __obj.asInstanceOf[DateItem]
  }
}

