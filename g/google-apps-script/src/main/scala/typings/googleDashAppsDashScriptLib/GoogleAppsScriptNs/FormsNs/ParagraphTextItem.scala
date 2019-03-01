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
    clearValidation: js.Function0[ParagraphTextItem],
    createResponse: js.Function1[java.lang.String, ItemResponse],
    duplicate: js.Function0[ParagraphTextItem],
    getGeneralFeedback: js.Function0[QuizFeedback],
    getHelpText: js.Function0[java.lang.String],
    getId: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getPoints: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getTitle: js.Function0[java.lang.String],
    getType: js.Function0[ItemType],
    isRequired: js.Function0[scala.Boolean],
    setGeneralFeedback: js.Function1[QuizFeedback, ParagraphTextItem],
    setHelpText: js.Function1[java.lang.String, ParagraphTextItem],
    setPoints: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ParagraphTextItem],
    setRequired: js.Function1[scala.Boolean, ParagraphTextItem],
    setTitle: js.Function1[java.lang.String, ParagraphTextItem],
    setValidation: js.Function1[ParagraphTextValidation, ParagraphTextItem]
  ): ParagraphTextItem = {
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
    __obj.asInstanceOf[ParagraphTextItem]
  }
}

