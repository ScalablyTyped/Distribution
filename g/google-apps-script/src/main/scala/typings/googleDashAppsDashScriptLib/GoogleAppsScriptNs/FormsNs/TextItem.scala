package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextItem extends js.Object {
  def clearValidation(): TextItem
  def createResponse(response: java.lang.String): ItemResponse
  def duplicate(): TextItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getPoints(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTitle(): java.lang.String
  def getType(): ItemType
  def isRequired(): scala.Boolean
  def setGeneralFeedback(feedback: QuizFeedback): TextItem
  def setHelpText(text: java.lang.String): TextItem
  def setPoints(points: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TextItem
  def setRequired(enabled: scala.Boolean): TextItem
  def setTitle(title: java.lang.String): TextItem
  def setValidation(validation: TextValidation): TextItem
}

object TextItem {
  @scala.inline
  def apply(
    clearValidation: js.Function0[TextItem],
    createResponse: js.Function1[java.lang.String, ItemResponse],
    duplicate: js.Function0[TextItem],
    getGeneralFeedback: js.Function0[QuizFeedback],
    getHelpText: js.Function0[java.lang.String],
    getId: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getPoints: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getTitle: js.Function0[java.lang.String],
    getType: js.Function0[ItemType],
    isRequired: js.Function0[scala.Boolean],
    setGeneralFeedback: js.Function1[QuizFeedback, TextItem],
    setHelpText: js.Function1[java.lang.String, TextItem],
    setPoints: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, TextItem],
    setRequired: js.Function1[scala.Boolean, TextItem],
    setTitle: js.Function1[java.lang.String, TextItem],
    setValidation: js.Function1[TextValidation, TextItem]
  ): TextItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearValidation")(clearValidation)
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
    __obj.updateDynamic("setValidation")(setValidation)
    __obj.asInstanceOf[TextItem]
  }
}

