package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScaleItem extends js.Object {
  def createResponse(response: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ItemResponse
  def duplicate(): ScaleItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getLeftLabel(): java.lang.String
  def getLowerBound(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getPoints(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getRightLabel(): java.lang.String
  def getTitle(): java.lang.String
  def getType(): ItemType
  def getUpperBound(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def isRequired(): scala.Boolean
  def setBounds(
    lower: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    upper: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ScaleItem
  def setGeneralFeedback(feedback: QuizFeedback): ScaleItem
  def setHelpText(text: java.lang.String): ScaleItem
  def setLabels(lower: java.lang.String, upper: java.lang.String): ScaleItem
  def setPoints(points: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ScaleItem
  def setRequired(enabled: scala.Boolean): ScaleItem
  def setTitle(title: java.lang.String): ScaleItem
}

