package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleChoiceItem extends js.Object {
  def createChoice(value: String): Choice = js.native
  def createChoice(value: String, isCorrect: Boolean): Choice = js.native
  def createChoice(value: String, navigationItem: PageBreakItem): Choice = js.native
  def createChoice(value: String, navigationType: PageNavigationType): Choice = js.native
  def createResponse(response: String): ItemResponse = js.native
  def duplicate(): MultipleChoiceItem = js.native
  def getChoices(): js.Array[Choice] = js.native
  def getFeedbackForCorrect(): QuizFeedback = js.native
  def getFeedbackForIncorrect(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPoints(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def hasOtherOption(): Boolean = js.native
  def isRequired(): Boolean = js.native
  def setChoiceValues(values: js.Array[String]): MultipleChoiceItem = js.native
  def setChoices(choices: js.Array[Choice]): MultipleChoiceItem = js.native
  def setFeedbackForCorrect(feedback: QuizFeedback): MultipleChoiceItem = js.native
  def setFeedbackForIncorrect(feedback: QuizFeedback): MultipleChoiceItem = js.native
  def setHelpText(text: String): MultipleChoiceItem = js.native
  def setPoints(points: Integer): MultipleChoiceItem = js.native
  def setRequired(enabled: Boolean): MultipleChoiceItem = js.native
  def setTitle(title: String): MultipleChoiceItem = js.native
  def showOtherOption(enabled: Boolean): MultipleChoiceItem = js.native
}

