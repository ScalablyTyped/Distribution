package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeItem extends js.Object {
  def createResponse(
    hour: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    minute: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ItemResponse
  def duplicate(): TimeItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getPoints(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTitle(): java.lang.String
  def getType(): ItemType
  def isRequired(): scala.Boolean
  def setGeneralFeedback(feedback: QuizFeedback): TimeItem
  def setHelpText(text: java.lang.String): TimeItem
  def setPoints(points: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TimeItem
  def setRequired(enabled: scala.Boolean): TimeItem
  def setTitle(title: java.lang.String): TimeItem
}

object TimeItem {
  @scala.inline
  def apply(
    createResponse: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      ItemResponse
    ],
    duplicate: js.Function0[TimeItem],
    getGeneralFeedback: js.Function0[QuizFeedback],
    getHelpText: js.Function0[java.lang.String],
    getId: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getPoints: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getTitle: js.Function0[java.lang.String],
    getType: js.Function0[ItemType],
    isRequired: js.Function0[scala.Boolean],
    setGeneralFeedback: js.Function1[QuizFeedback, TimeItem],
    setHelpText: js.Function1[java.lang.String, TimeItem],
    setPoints: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, TimeItem],
    setRequired: js.Function1[scala.Boolean, TimeItem],
    setTitle: js.Function1[java.lang.String, TimeItem]
  ): TimeItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createResponse")(createResponse)
    __obj.updateDynamic("duplicate")(duplicate)
    __obj.updateDynamic("getGeneralFeedback")(getGeneralFeedback)
    __obj.updateDynamic("getHelpText")(getHelpText)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getIndex")(getIndex)
    __obj.updateDynamic("getPoints")(getPoints)
    __obj.updateDynamic("getTitle")(getTitle)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("isRequired")(isRequired)
    __obj.updateDynamic("setGeneralFeedback")(setGeneralFeedback)
    __obj.updateDynamic("setHelpText")(setHelpText)
    __obj.updateDynamic("setPoints")(setPoints)
    __obj.updateDynamic("setRequired")(setRequired)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.asInstanceOf[TimeItem]
  }
}

