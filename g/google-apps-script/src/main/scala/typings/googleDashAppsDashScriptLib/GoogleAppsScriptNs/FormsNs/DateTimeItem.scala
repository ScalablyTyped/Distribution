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

