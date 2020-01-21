package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item that allows the respondent to enter a single line of text. Items can be accessed
  * or created from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new text item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addTextItem();
  *     item.setTitle('What is your name?');
  */
trait TextItem extends js.Object {
  def clearValidation(): TextItem
  def createResponse(response: String): ItemResponse
  def duplicate(): TextItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getPoints(): Integer
  def getTitle(): String
  def getType(): ItemType
  def isRequired(): Boolean
  def setGeneralFeedback(feedback: QuizFeedback): TextItem
  def setHelpText(text: String): TextItem
  def setPoints(points: Integer): TextItem
  def setRequired(enabled: Boolean): TextItem
  def setTitle(title: String): TextItem
  def setValidation(validation: TextValidation): TextItem
}

object TextItem {
  @scala.inline
  def apply(
    clearValidation: () => TextItem,
    createResponse: String => ItemResponse,
    duplicate: () => TextItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getPoints: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    isRequired: () => Boolean,
    setGeneralFeedback: QuizFeedback => TextItem,
    setHelpText: String => TextItem,
    setPoints: Integer => TextItem,
    setRequired: Boolean => TextItem,
    setTitle: String => TextItem,
    setValidation: TextValidation => TextItem
  ): TextItem = {
    val __obj = js.Dynamic.literal(clearValidation = js.Any.fromFunction0(clearValidation), createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getPoints = js.Any.fromFunction0(getPoints), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle), setValidation = js.Any.fromFunction1(setValidation))
  
    __obj.asInstanceOf[TextItem]
  }
}

