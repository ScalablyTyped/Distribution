package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxGridItem extends js.Object {
  def clearValidation(): CheckboxGridItem
  def createResponse(responses: js.Array[js.Array[java.lang.String]]): ItemResponse
  def duplicate(): CheckboxGridItem
  def getColumns(): js.Array[java.lang.String]
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getRows(): js.Array[java.lang.String]
  def getTitle(): java.lang.String
  def getType(): ItemType
  def isRequired(): scala.Boolean
  def setColumns(columns: js.Array[java.lang.String]): CheckboxGridItem
  def setHelpText(text: java.lang.String): CheckboxGridItem
  def setRequired(enabled: scala.Boolean): CheckboxGridItem
  def setRows(rows: js.Array[java.lang.String]): CheckboxGridItem
  def setTitle(title: java.lang.String): CheckboxGridItem
  def setValidation(validation: CheckboxGridValidation): CheckboxGridItem
}

object CheckboxGridItem {
  @scala.inline
  def apply(
    clearValidation: js.Function0[CheckboxGridItem],
    createResponse: js.Function1[js.Array[js.Array[java.lang.String]], ItemResponse],
    duplicate: js.Function0[CheckboxGridItem],
    getColumns: js.Function0[js.Array[java.lang.String]],
    getHelpText: js.Function0[java.lang.String],
    getId: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getRows: js.Function0[js.Array[java.lang.String]],
    getTitle: js.Function0[java.lang.String],
    getType: js.Function0[ItemType],
    isRequired: js.Function0[scala.Boolean],
    setColumns: js.Function1[js.Array[java.lang.String], CheckboxGridItem],
    setHelpText: js.Function1[java.lang.String, CheckboxGridItem],
    setRequired: js.Function1[scala.Boolean, CheckboxGridItem],
    setRows: js.Function1[js.Array[java.lang.String], CheckboxGridItem],
    setTitle: js.Function1[java.lang.String, CheckboxGridItem],
    setValidation: js.Function1[CheckboxGridValidation, CheckboxGridItem]
  ): CheckboxGridItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearValidation")(clearValidation)
    __obj.updateDynamic("createResponse")(createResponse)
    __obj.updateDynamic("duplicate")(duplicate)
    __obj.updateDynamic("getColumns")(getColumns)
    __obj.updateDynamic("getHelpText")(getHelpText)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getIndex")(getIndex)
    __obj.updateDynamic("getRows")(getRows)
    __obj.updateDynamic("getTitle")(getTitle)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("isRequired")(isRequired)
    __obj.updateDynamic("setColumns")(setColumns)
    __obj.updateDynamic("setHelpText")(setHelpText)
    __obj.updateDynamic("setRequired")(setRequired)
    __obj.updateDynamic("setRows")(setRows)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setValidation")(setValidation)
    __obj.asInstanceOf[CheckboxGridItem]
  }
}

