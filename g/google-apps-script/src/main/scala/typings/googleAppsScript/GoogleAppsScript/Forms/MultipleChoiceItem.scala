package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A question item that allows the respondent to select one choice from a list of radio buttons or
  * an optional "other" field. Items can be accessed or created from a Form. When used in a
  * quiz, these items are autograded.
  *
  *     // Open a form by ID and add a new multiple choice item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addMultipleChoiceItem();
  *     item.setTitle('Do you prefer cats or dogs?')
  *         .setChoices([
  *             item.createChoice('Cats'),
  *             item.createChoice('Dogs')
  *          ])
  *         .showOtherOption(true);
  */
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
