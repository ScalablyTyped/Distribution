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

