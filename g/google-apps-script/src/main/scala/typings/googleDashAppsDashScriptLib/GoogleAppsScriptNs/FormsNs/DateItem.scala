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

