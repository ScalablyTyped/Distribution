package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeItem extends js.Object {
  def createResponse(response: stdLib.Date): ItemResponse
  def duplicate(): DateTimeItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getPoints(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTitle(): java.lang.String
  def getType(): ItemType
  def includesYear(): scala.Boolean
  def isRequired(): scala.Boolean
  def setGeneralFeedback(feedback: QuizFeedback): DateTimeItem
  def setHelpText(text: java.lang.String): DateTimeItem
  def setIncludesYear(enableYear: scala.Boolean): DateTimeItem
  def setPoints(points: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): DateTimeItem
  def setRequired(enabled: scala.Boolean): DateTimeItem
  def setTitle(title: java.lang.String): DateTimeItem
}

object DateTimeItem {
  @scala.inline
  def apply(
    createResponse: js.Function1[stdLib.Date, ItemResponse],
    duplicate: js.Function0[DateTimeItem],
    getGeneralFeedback: js.Function0[QuizFeedback],
    getHelpText: js.Function0[java.lang.String],
    getId: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getPoints: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getTitle: js.Function0[java.lang.String],
    getType: js.Function0[ItemType],
    includesYear: js.Function0[scala.Boolean],
    isRequired: js.Function0[scala.Boolean],
    setGeneralFeedback: js.Function1[QuizFeedback, DateTimeItem],
    setHelpText: js.Function1[java.lang.String, DateTimeItem],
    setIncludesYear: js.Function1[scala.Boolean, DateTimeItem],
    setPoints: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, DateTimeItem],
    setRequired: js.Function1[scala.Boolean, DateTimeItem],
    setTitle: js.Function1[java.lang.String, DateTimeItem]
  ): DateTimeItem = {
    val __obj = js.Dynamic.literal(createResponse = createResponse, duplicate = duplicate, getGeneralFeedback = getGeneralFeedback, getHelpText = getHelpText, getId = getId, getIndex = getIndex, getPoints = getPoints, getTitle = getTitle, getType = getType, includesYear = includesYear, isRequired = isRequired, setGeneralFeedback = setGeneralFeedback, setHelpText = setHelpText, setIncludesYear = setIncludesYear, setPoints = setPoints, setRequired = setRequired, setTitle = setTitle)
  
    __obj.asInstanceOf[DateTimeItem]
  }
}

