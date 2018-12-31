package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextItem extends js.Object {
  def clearValidation(): TextItem
  def createResponse(response: java.lang.String): ItemResponse
  def duplicate(): TextItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getPoints(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTitle(): java.lang.String
  def getType(): ItemType
  def isRequired(): scala.Boolean
  def setGeneralFeedback(feedback: QuizFeedback): TextItem
  def setHelpText(text: java.lang.String): TextItem
  def setPoints(points: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TextItem
  def setRequired(enabled: scala.Boolean): TextItem
  def setTitle(title: java.lang.String): TextItem
  def setValidation(validation: TextValidation): TextItem
}

