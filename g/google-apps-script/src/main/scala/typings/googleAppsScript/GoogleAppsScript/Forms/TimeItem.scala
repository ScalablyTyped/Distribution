package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item that allows the respondent to indicate a time of day. Items can be accessed or
  * created from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new time item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addTimeItem();
  *     item.setTitle('What time do you usually wake up in the morning?');
  */
@js.native
trait TimeItem extends js.Object {
  def createResponse(hour: Integer, minute: Integer): ItemResponse = js.native
  def duplicate(): TimeItem = js.native
  def getGeneralFeedback(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPoints(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def isRequired(): Boolean = js.native
  def setGeneralFeedback(feedback: QuizFeedback): TimeItem = js.native
  def setHelpText(text: String): TimeItem = js.native
  def setPoints(points: Integer): TimeItem = js.native
  def setRequired(enabled: Boolean): TimeItem = js.native
  def setTitle(title: String): TimeItem = js.native
}

object TimeItem {
  @scala.inline
  def apply(
    createResponse: (Integer, Integer) => ItemResponse,
    duplicate: () => TimeItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getPoints: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    isRequired: () => Boolean,
    setGeneralFeedback: QuizFeedback => TimeItem,
    setHelpText: String => TimeItem,
    setPoints: Integer => TimeItem,
    setRequired: Boolean => TimeItem,
    setTitle: String => TimeItem
  ): TimeItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction2(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getPoints = js.Any.fromFunction0(getPoints), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[TimeItem]
  }
  @scala.inline
  implicit class TimeItemOps[Self <: TimeItem] (val x: Self) extends AnyVal {
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
    def setCreateResponse(value: (Integer, Integer) => ItemResponse): Self = this.set("createResponse", js.Any.fromFunction2(value))
    @scala.inline
    def setDuplicate(value: () => TimeItem): Self = this.set("duplicate", js.Any.fromFunction0(value))
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
    def setIsRequired(value: () => Boolean): Self = this.set("isRequired", js.Any.fromFunction0(value))
    @scala.inline
    def setSetGeneralFeedback(value: QuizFeedback => TimeItem): Self = this.set("setGeneralFeedback", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHelpText(value: String => TimeItem): Self = this.set("setHelpText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPoints(value: Integer => TimeItem): Self = this.set("setPoints", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRequired(value: Boolean => TimeItem): Self = this.set("setRequired", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTitle(value: String => TimeItem): Self = this.set("setTitle", js.Any.fromFunction1(value))
  }
  
}

