package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Date
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeItem extends js.Object {
  def createResponse(response: Date): ItemResponse
  def duplicate(): DateTimeItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getPoints(): Integer
  def getTitle(): String
  def getType(): ItemType
  def includesYear(): Boolean
  def isRequired(): Boolean
  def setGeneralFeedback(feedback: QuizFeedback): DateTimeItem
  def setHelpText(text: String): DateTimeItem
  def setIncludesYear(enableYear: Boolean): DateTimeItem
  def setPoints(points: Integer): DateTimeItem
  def setRequired(enabled: Boolean): DateTimeItem
  def setTitle(title: String): DateTimeItem
}

object DateTimeItem {
  @scala.inline
  def apply(
    createResponse: Date => ItemResponse,
    duplicate: () => DateTimeItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getPoints: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    includesYear: () => Boolean,
    isRequired: () => Boolean,
    setGeneralFeedback: QuizFeedback => DateTimeItem,
    setHelpText: String => DateTimeItem,
    setIncludesYear: Boolean => DateTimeItem,
    setPoints: Integer => DateTimeItem,
    setRequired: Boolean => DateTimeItem,
    setTitle: String => DateTimeItem
  ): DateTimeItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getPoints = js.Any.fromFunction0(getPoints), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), includesYear = js.Any.fromFunction0(includesYear), isRequired = js.Any.fromFunction0(isRequired), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setIncludesYear = js.Any.fromFunction1(setIncludesYear), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[DateTimeItem]
  }
}

