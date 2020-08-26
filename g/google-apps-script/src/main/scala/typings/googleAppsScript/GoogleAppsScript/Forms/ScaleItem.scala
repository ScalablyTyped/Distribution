package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item that allows the respondent to choose one option from a numbered sequence of radio
  * buttons. Items can be accessed or created from a Form. When used in a quiz, these items
  * are graded.
  *
  *     // Open a form by ID and add a new scale item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addScaleItem();
  *     item.setTitle('Pick a number between 1 and 10')
  *         .setBounds(1, 10);
  */
@js.native
trait ScaleItem extends js.Object {
  def createResponse(response: Integer): ItemResponse = js.native
  def duplicate(): ScaleItem = js.native
  def getGeneralFeedback(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getLeftLabel(): String = js.native
  def getLowerBound(): Integer = js.native
  def getPoints(): Integer = js.native
  def getRightLabel(): String = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def getUpperBound(): Integer = js.native
  def isRequired(): Boolean = js.native
  def setBounds(lower: Integer, upper: Integer): ScaleItem = js.native
  def setGeneralFeedback(feedback: QuizFeedback): ScaleItem = js.native
  def setHelpText(text: String): ScaleItem = js.native
  def setLabels(lower: String, upper: String): ScaleItem = js.native
  def setPoints(points: Integer): ScaleItem = js.native
  def setRequired(enabled: Boolean): ScaleItem = js.native
  def setTitle(title: String): ScaleItem = js.native
}

object ScaleItem {
  @scala.inline
  def apply(
    createResponse: Integer => ItemResponse,
    duplicate: () => ScaleItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getLeftLabel: () => String,
    getLowerBound: () => Integer,
    getPoints: () => Integer,
    getRightLabel: () => String,
    getTitle: () => String,
    getType: () => ItemType,
    getUpperBound: () => Integer,
    isRequired: () => Boolean,
    setBounds: (Integer, Integer) => ScaleItem,
    setGeneralFeedback: QuizFeedback => ScaleItem,
    setHelpText: String => ScaleItem,
    setLabels: (String, String) => ScaleItem,
    setPoints: Integer => ScaleItem,
    setRequired: Boolean => ScaleItem,
    setTitle: String => ScaleItem
  ): ScaleItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getLeftLabel = js.Any.fromFunction0(getLeftLabel), getLowerBound = js.Any.fromFunction0(getLowerBound), getPoints = js.Any.fromFunction0(getPoints), getRightLabel = js.Any.fromFunction0(getRightLabel), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), getUpperBound = js.Any.fromFunction0(getUpperBound), isRequired = js.Any.fromFunction0(isRequired), setBounds = js.Any.fromFunction2(setBounds), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setLabels = js.Any.fromFunction2(setLabels), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[ScaleItem]
  }
  @scala.inline
  implicit class ScaleItemOps[Self <: ScaleItem] (val x: Self) extends AnyVal {
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
    def setCreateResponse(value: Integer => ItemResponse): Self = this.set("createResponse", js.Any.fromFunction1(value))
    @scala.inline
    def setDuplicate(value: () => ScaleItem): Self = this.set("duplicate", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGeneralFeedback(value: () => QuizFeedback): Self = this.set("getGeneralFeedback", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHelpText(value: () => String): Self = this.set("getHelpText", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => Integer): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIndex(value: () => Integer): Self = this.set("getIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLeftLabel(value: () => String): Self = this.set("getLeftLabel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLowerBound(value: () => Integer): Self = this.set("getLowerBound", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPoints(value: () => Integer): Self = this.set("getPoints", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRightLabel(value: () => String): Self = this.set("getRightLabel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => ItemType): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUpperBound(value: () => Integer): Self = this.set("getUpperBound", js.Any.fromFunction0(value))
    @scala.inline
    def setIsRequired(value: () => Boolean): Self = this.set("isRequired", js.Any.fromFunction0(value))
    @scala.inline
    def setSetBounds(value: (Integer, Integer) => ScaleItem): Self = this.set("setBounds", js.Any.fromFunction2(value))
    @scala.inline
    def setSetGeneralFeedback(value: QuizFeedback => ScaleItem): Self = this.set("setGeneralFeedback", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHelpText(value: String => ScaleItem): Self = this.set("setHelpText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLabels(value: (String, String) => ScaleItem): Self = this.set("setLabels", js.Any.fromFunction2(value))
    @scala.inline
    def setSetPoints(value: Integer => ScaleItem): Self = this.set("setPoints", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRequired(value: Boolean => ScaleItem): Self = this.set("setRequired", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTitle(value: String => ScaleItem): Self = this.set("setTitle", js.Any.fromFunction1(value))
  }
  
}

