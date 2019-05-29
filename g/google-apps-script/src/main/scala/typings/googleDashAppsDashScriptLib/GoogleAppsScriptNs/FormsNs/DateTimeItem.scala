package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeItem extends js.Object {
  def createResponse(response: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date): ItemResponse
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
    createResponse: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date => ItemResponse,
    duplicate: () => DateTimeItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => java.lang.String,
    getId: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getPoints: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getTitle: () => java.lang.String,
    getType: () => ItemType,
    includesYear: () => scala.Boolean,
    isRequired: () => scala.Boolean,
    setGeneralFeedback: QuizFeedback => DateTimeItem,
    setHelpText: java.lang.String => DateTimeItem,
    setIncludesYear: scala.Boolean => DateTimeItem,
    setPoints: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => DateTimeItem,
    setRequired: scala.Boolean => DateTimeItem,
    setTitle: java.lang.String => DateTimeItem
  ): DateTimeItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getPoints = js.Any.fromFunction0(getPoints), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), includesYear = js.Any.fromFunction0(includesYear), isRequired = js.Any.fromFunction0(isRequired), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setIncludesYear = js.Any.fromFunction1(setIncludesYear), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[DateTimeItem]
  }
}

