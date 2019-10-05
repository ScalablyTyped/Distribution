package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItem extends js.Object {
  def createChoice(value: String): Choice = js.native
  def createChoice(value: String, isCorrect: Boolean): Choice = js.native
  def createChoice(value: String, navigationItem: PageBreakItem): Choice = js.native
  def createChoice(value: String, navigationType: PageNavigationType): Choice = js.native
  def createResponse(response: String): ItemResponse = js.native
  def duplicate(): ListItem = js.native
  def getChoices(): js.Array[Choice] = js.native
  def getFeedbackForCorrect(): QuizFeedback = js.native
  def getFeedbackForIncorrect(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPoints(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def isRequired(): Boolean = js.native
  def setChoiceValues(values: js.Array[String]): ListItem = js.native
  def setChoices(choices: js.Array[Choice]): ListItem = js.native
  def setFeedbackForCorrect(feedback: QuizFeedback): ListItem = js.native
  def setFeedbackForIncorrect(feedback: QuizFeedback): ListItem = js.native
  def setHelpText(text: String): ListItem = js.native
  def setPoints(points: Integer): ListItem = js.native
  def setRequired(enabled: Boolean): ListItem = js.native
  def setTitle(title: String): ListItem = js.native
}

