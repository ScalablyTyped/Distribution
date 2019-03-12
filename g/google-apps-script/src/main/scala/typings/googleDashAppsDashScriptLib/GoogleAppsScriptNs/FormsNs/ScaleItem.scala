package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleItem extends js.Object {
  def createResponse(response: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ItemResponse
  def duplicate(): ScaleItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getLeftLabel(): java.lang.String
  def getLowerBound(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getPoints(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getRightLabel(): java.lang.String
  def getTitle(): java.lang.String
  def getType(): ItemType
  def getUpperBound(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def isRequired(): scala.Boolean
  def setBounds(
    lower: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    upper: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ScaleItem
  def setGeneralFeedback(feedback: QuizFeedback): ScaleItem
  def setHelpText(text: java.lang.String): ScaleItem
  def setLabels(lower: java.lang.String, upper: java.lang.String): ScaleItem
  def setPoints(points: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ScaleItem
  def setRequired(enabled: scala.Boolean): ScaleItem
  def setTitle(title: java.lang.String): ScaleItem
}

object ScaleItem {
  @scala.inline
  def apply(
    createResponse: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ItemResponse,
    duplicate: () => ScaleItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => java.lang.String,
    getId: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getLeftLabel: () => java.lang.String,
    getLowerBound: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getPoints: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getRightLabel: () => java.lang.String,
    getTitle: () => java.lang.String,
    getType: () => ItemType,
    getUpperBound: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    isRequired: () => scala.Boolean,
    setBounds: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => ScaleItem,
    setGeneralFeedback: QuizFeedback => ScaleItem,
    setHelpText: java.lang.String => ScaleItem,
    setLabels: (java.lang.String, java.lang.String) => ScaleItem,
    setPoints: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ScaleItem,
    setRequired: scala.Boolean => ScaleItem,
    setTitle: java.lang.String => ScaleItem
  ): ScaleItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getLeftLabel = js.Any.fromFunction0(getLeftLabel), getLowerBound = js.Any.fromFunction0(getLowerBound), getPoints = js.Any.fromFunction0(getPoints), getRightLabel = js.Any.fromFunction0(getRightLabel), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), getUpperBound = js.Any.fromFunction0(getUpperBound), isRequired = js.Any.fromFunction0(isRequired), setBounds = js.Any.fromFunction2(setBounds), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setLabels = js.Any.fromFunction2(setLabels), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[ScaleItem]
  }
}

