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

