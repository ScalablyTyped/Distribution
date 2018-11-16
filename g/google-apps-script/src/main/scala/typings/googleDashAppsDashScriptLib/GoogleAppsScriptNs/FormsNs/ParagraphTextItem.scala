package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ParagraphTextItem extends js.Object {
  def clearValidation(): ParagraphTextItem
  def createResponse(response: java.lang.String): ItemResponse
  def duplicate(): ParagraphTextItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getPoints(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTitle(): java.lang.String
  def getType(): ItemType
  def isRequired(): scala.Boolean
  def setGeneralFeedback(feedback: QuizFeedback): ParagraphTextItem
  def setHelpText(text: java.lang.String): ParagraphTextItem
  def setPoints(points: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ParagraphTextItem
  def setRequired(enabled: scala.Boolean): ParagraphTextItem
  def setTitle(title: java.lang.String): ParagraphTextItem
  def setValidation(validation: ParagraphTextValidation): ParagraphTextItem
}

