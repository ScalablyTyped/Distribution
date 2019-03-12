package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphTextItem extends js.Object {
  def clearValidation(): ParagraphTextItem
  def createResponse(response: java.lang.String): ItemResponse
  def duplicate(): ParagraphTextItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getPoints(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTitle(): java.lang.String
  def getType(): ItemType
  def isRequired(): scala.Boolean
  def setGeneralFeedback(feedback: QuizFeedback): ParagraphTextItem
  def setHelpText(text: java.lang.String): ParagraphTextItem
  def setPoints(points: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ParagraphTextItem
  def setRequired(enabled: scala.Boolean): ParagraphTextItem
  def setTitle(title: java.lang.String): ParagraphTextItem
  def setValidation(validation: ParagraphTextValidation): ParagraphTextItem
}

object ParagraphTextItem {
  @scala.inline
  def apply(
    clearValidation: () => ParagraphTextItem,
    createResponse: java.lang.String => ItemResponse,
    duplicate: () => ParagraphTextItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => java.lang.String,
    getId: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getPoints: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getTitle: () => java.lang.String,
    getType: () => ItemType,
    isRequired: () => scala.Boolean,
    setGeneralFeedback: QuizFeedback => ParagraphTextItem,
    setHelpText: java.lang.String => ParagraphTextItem,
    setPoints: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ParagraphTextItem,
    setRequired: scala.Boolean => ParagraphTextItem,
    setTitle: java.lang.String => ParagraphTextItem,
    setValidation: ParagraphTextValidation => ParagraphTextItem
  ): ParagraphTextItem = {
    val __obj = js.Dynamic.literal(clearValidation = js.Any.fromFunction0(clearValidation), createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getPoints = js.Any.fromFunction0(getPoints), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle), setValidation = js.Any.fromFunction1(setValidation))
  
    __obj.asInstanceOf[ParagraphTextItem]
  }
}

