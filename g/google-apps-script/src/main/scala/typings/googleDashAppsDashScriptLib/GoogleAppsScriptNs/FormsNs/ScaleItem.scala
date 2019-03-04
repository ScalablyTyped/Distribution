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
    createResponse: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ItemResponse],
    duplicate: js.Function0[ScaleItem],
    getGeneralFeedback: js.Function0[QuizFeedback],
    getHelpText: js.Function0[java.lang.String],
    getId: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getLeftLabel: js.Function0[java.lang.String],
    getLowerBound: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getPoints: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getRightLabel: js.Function0[java.lang.String],
    getTitle: js.Function0[java.lang.String],
    getType: js.Function0[ItemType],
    getUpperBound: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    isRequired: js.Function0[scala.Boolean],
    setBounds: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      ScaleItem
    ],
    setGeneralFeedback: js.Function1[QuizFeedback, ScaleItem],
    setHelpText: js.Function1[java.lang.String, ScaleItem],
    setLabels: js.Function2[java.lang.String, java.lang.String, ScaleItem],
    setPoints: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ScaleItem],
    setRequired: js.Function1[scala.Boolean, ScaleItem],
    setTitle: js.Function1[java.lang.String, ScaleItem]
  ): ScaleItem = {
    val __obj = js.Dynamic.literal(createResponse = createResponse, duplicate = duplicate, getGeneralFeedback = getGeneralFeedback, getHelpText = getHelpText, getId = getId, getIndex = getIndex, getLeftLabel = getLeftLabel, getLowerBound = getLowerBound, getPoints = getPoints, getRightLabel = getRightLabel, getTitle = getTitle, getType = getType, getUpperBound = getUpperBound, isRequired = isRequired, setBounds = setBounds, setGeneralFeedback = setGeneralFeedback, setHelpText = setHelpText, setLabels = setLabels, setPoints = setPoints, setRequired = setRequired, setTitle = setTitle)
  
    __obj.asInstanceOf[ScaleItem]
  }
}

