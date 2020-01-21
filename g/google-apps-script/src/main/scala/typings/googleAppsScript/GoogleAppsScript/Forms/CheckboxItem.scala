package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item that allows the respondent to select one or more checkboxes, as well as an
  * optional "other" field. Items can be accessed or created from a Form. When used in a
  * quiz, these items are autograded.
  *
  *     // Open a form by ID and add a new checkbox item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addCheckboxItem();
  *     item.setTitle('What condiments would you like on your hot dog?')
  *         .setChoices([
  *               item.createChoice('Ketchup'),
  *               item.createChoice('Mustard'),
  *               item.createChoice('Relish')
  *         ])
  *         .showOtherOption(true);
  */
@js.native
trait CheckboxItem extends js.Object {
  def clearValidation(): CheckboxItem = js.native
  def createChoice(value: String): Choice = js.native
  def createChoice(value: String, isCorrect: Boolean): Choice = js.native
  def createResponse(responses: js.Array[String]): ItemResponse = js.native
  def duplicate(): CheckboxItem = js.native
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
  def setChoiceValues(values: js.Array[String]): CheckboxItem = js.native
  def setChoices(choices: js.Array[Choice]): CheckboxItem = js.native
  def setFeedbackForCorrect(feedback: QuizFeedback): CheckboxItem = js.native
  def setFeedbackForIncorrect(feedback: QuizFeedback): CheckboxItem = js.native
  def setHelpText(text: String): CheckboxItem = js.native
  def setPoints(points: Integer): CheckboxItem = js.native
  def setRequired(enabled: Boolean): CheckboxItem = js.native
  def setTitle(title: String): CheckboxItem = js.native
  def setValidation(validation: CheckboxValidation): CheckboxItem = js.native
  def showOtherOption(enabled: Boolean): CheckboxItem = js.native
}

