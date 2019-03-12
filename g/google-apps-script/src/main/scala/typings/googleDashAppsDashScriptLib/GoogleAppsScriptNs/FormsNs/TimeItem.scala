package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeItem extends js.Object {
  def createResponse(
    hour: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    minute: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ItemResponse
  def duplicate(): TimeItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getPoints(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTitle(): java.lang.String
  def getType(): ItemType
  def isRequired(): scala.Boolean
  def setGeneralFeedback(feedback: QuizFeedback): TimeItem
  def setHelpText(text: java.lang.String): TimeItem
  def setPoints(points: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TimeItem
  def setRequired(enabled: scala.Boolean): TimeItem
  def setTitle(title: java.lang.String): TimeItem
}

object TimeItem {
  @scala.inline
  def apply(
    createResponse: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => ItemResponse,
    duplicate: () => TimeItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => java.lang.String,
    getId: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getPoints: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getTitle: () => java.lang.String,
    getType: () => ItemType,
    isRequired: () => scala.Boolean,
    setGeneralFeedback: QuizFeedback => TimeItem,
    setHelpText: java.lang.String => TimeItem,
    setPoints: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => TimeItem,
    setRequired: scala.Boolean => TimeItem,
    setTitle: java.lang.String => TimeItem
  ): TimeItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction2(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getPoints = js.Any.fromFunction0(getPoints), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[TimeItem]
  }
}

