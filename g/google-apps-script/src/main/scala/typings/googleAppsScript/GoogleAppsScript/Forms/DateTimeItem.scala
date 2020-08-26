package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item that allows the respondent to indicate a date and time. Items can be accessed or
  * created from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new date-time item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addDateTimeItem();
  *     item.setTitle('When do you want to meet?');
  */
@js.native
trait DateTimeItem extends js.Object {
  def createResponse(response: Date): ItemResponse = js.native
  def duplicate(): DateTimeItem = js.native
  def getGeneralFeedback(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPoints(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def includesYear(): Boolean = js.native
  def isRequired(): Boolean = js.native
  def setGeneralFeedback(feedback: QuizFeedback): DateTimeItem = js.native
  def setHelpText(text: String): DateTimeItem = js.native
  def setIncludesYear(enableYear: Boolean): DateTimeItem = js.native
  def setPoints(points: Integer): DateTimeItem = js.native
  def setRequired(enabled: Boolean): DateTimeItem = js.native
  def setTitle(title: String): DateTimeItem = js.native
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
  @scala.inline
  implicit class DateTimeItemOps[Self <: DateTimeItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateResponse(value: Date => ItemResponse): Self = this.set("createResponse", js.Any.fromFunction1(value))
    @scala.inline
    def setDuplicate(value: () => DateTimeItem): Self = this.set("duplicate", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGeneralFeedback(value: () => QuizFeedback): Self = this.set("getGeneralFeedback", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHelpText(value: () => String): Self = this.set("getHelpText", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => Integer): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIndex(value: () => Integer): Self = this.set("getIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPoints(value: () => Integer): Self = this.set("getPoints", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => ItemType): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setIncludesYear(value: () => Boolean): Self = this.set("includesYear", js.Any.fromFunction0(value))
    @scala.inline
    def setIsRequired(value: () => Boolean): Self = this.set("isRequired", js.Any.fromFunction0(value))
    @scala.inline
    def setSetGeneralFeedback(value: QuizFeedback => DateTimeItem): Self = this.set("setGeneralFeedback", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHelpText(value: String => DateTimeItem): Self = this.set("setHelpText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIncludesYear(value: Boolean => DateTimeItem): Self = this.set("setIncludesYear", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPoints(value: Integer => DateTimeItem): Self = this.set("setPoints", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRequired(value: Boolean => DateTimeItem): Self = this.set("setRequired", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTitle(value: String => DateTimeItem): Self = this.set("setTitle", js.Any.fromFunction1(value))
  }
  
}

