package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationItem extends js.Object {
  def createResponse(
    hours: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    minutes: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    seconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ItemResponse
  def duplicate(): DurationItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getPoints(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTitle(): java.lang.String
  def getType(): ItemType
  def isRequired(): scala.Boolean
  def setGeneralFeedback(feedback: QuizFeedback): DurationItem
  def setHelpText(text: java.lang.String): DurationItem
  def setPoints(points: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): DurationItem
  def setRequired(enabled: scala.Boolean): DurationItem
  def setTitle(title: java.lang.String): DurationItem
}

object DurationItem {
  @scala.inline
  def apply(
    createResponse: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => ItemResponse,
    duplicate: () => DurationItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => java.lang.String,
    getId: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getPoints: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getTitle: () => java.lang.String,
    getType: () => ItemType,
    isRequired: () => scala.Boolean,
    setGeneralFeedback: QuizFeedback => DurationItem,
    setHelpText: java.lang.String => DurationItem,
    setPoints: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => DurationItem,
    setRequired: scala.Boolean => DurationItem,
    setTitle: java.lang.String => DurationItem
  ): DurationItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction3(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getPoints = js.Any.fromFunction0(getPoints), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[DurationItem]
  }
}

