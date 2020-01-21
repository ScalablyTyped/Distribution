package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item that allows the respondent to indicate a length of time. Items can be accessed or
  * created from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new duration item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addDurationItem();
  *     item.setTitle('How long can you hold your breath?');
  */
trait DurationItem extends js.Object {
  def createResponse(hours: Integer, minutes: Integer, seconds: Integer): ItemResponse
  def duplicate(): DurationItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getPoints(): Integer
  def getTitle(): String
  def getType(): ItemType
  def isRequired(): Boolean
  def setGeneralFeedback(feedback: QuizFeedback): DurationItem
  def setHelpText(text: String): DurationItem
  def setPoints(points: Integer): DurationItem
  def setRequired(enabled: Boolean): DurationItem
  def setTitle(title: String): DurationItem
}

object DurationItem {
  @scala.inline
  def apply(
    createResponse: (Integer, Integer, Integer) => ItemResponse,
    duplicate: () => DurationItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getPoints: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    isRequired: () => Boolean,
    setGeneralFeedback: QuizFeedback => DurationItem,
    setHelpText: String => DurationItem,
    setPoints: Integer => DurationItem,
    setRequired: Boolean => DurationItem,
    setTitle: String => DurationItem
  ): DurationItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction3(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getPoints = js.Any.fromFunction0(getPoints), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[DurationItem]
  }
}

