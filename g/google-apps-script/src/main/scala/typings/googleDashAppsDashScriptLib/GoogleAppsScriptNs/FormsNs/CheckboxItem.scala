package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxItem extends js.Object {
  def clearValidation(): CheckboxItem = js.native
  def createChoice(value: java.lang.String): Choice = js.native
  def createChoice(value: java.lang.String, isCorrect: scala.Boolean): Choice = js.native
  def createResponse(responses: js.Array[java.lang.String]): ItemResponse = js.native
  def duplicate(): CheckboxItem = js.native
  def getChoices(): js.Array[Choice] = js.native
  def getFeedbackForCorrect(): QuizFeedback = js.native
  def getFeedbackForIncorrect(): QuizFeedback = js.native
  def getHelpText(): java.lang.String = js.native
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getPoints(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getTitle(): java.lang.String = js.native
  def getType(): ItemType = js.native
  def hasOtherOption(): scala.Boolean = js.native
  def isRequired(): scala.Boolean = js.native
  def setChoiceValues(values: js.Array[java.lang.String]): CheckboxItem = js.native
  def setChoices(choices: js.Array[Choice]): CheckboxItem = js.native
  def setFeedbackForCorrect(feedback: QuizFeedback): CheckboxItem = js.native
  def setFeedbackForIncorrect(feedback: QuizFeedback): CheckboxItem = js.native
  def setHelpText(text: java.lang.String): CheckboxItem = js.native
  def setPoints(points: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): CheckboxItem = js.native
  def setRequired(enabled: scala.Boolean): CheckboxItem = js.native
  def setTitle(title: java.lang.String): CheckboxItem = js.native
  def setValidation(validation: CheckboxValidation): CheckboxItem = js.native
  def showOtherOption(enabled: scala.Boolean): CheckboxItem = js.native
}

