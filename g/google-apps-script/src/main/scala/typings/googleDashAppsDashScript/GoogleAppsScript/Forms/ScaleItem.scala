package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleItem extends js.Object {
  def createResponse(response: Integer): ItemResponse
  def duplicate(): ScaleItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getLeftLabel(): String
  def getLowerBound(): Integer
  def getPoints(): Integer
  def getRightLabel(): String
  def getTitle(): String
  def getType(): ItemType
  def getUpperBound(): Integer
  def isRequired(): Boolean
  def setBounds(lower: Integer, upper: Integer): ScaleItem
  def setGeneralFeedback(feedback: QuizFeedback): ScaleItem
  def setHelpText(text: String): ScaleItem
  def setLabels(lower: String, upper: String): ScaleItem
  def setPoints(points: Integer): ScaleItem
  def setRequired(enabled: Boolean): ScaleItem
  def setTitle(title: String): ScaleItem
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
}

