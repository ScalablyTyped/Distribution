package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridItem extends js.Object {
  def clearValidation(): GridItem
  def createResponse(responses: js.Array[java.lang.String]): ItemResponse
  def duplicate(): GridItem
  def getColumns(): js.Array[java.lang.String]
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getRows(): js.Array[java.lang.String]
  def getTitle(): java.lang.String
  def getType(): ItemType
  def isRequired(): scala.Boolean
  def setColumns(columns: js.Array[java.lang.String]): GridItem
  def setHelpText(text: java.lang.String): GridItem
  def setRequired(enabled: scala.Boolean): GridItem
  def setRows(rows: js.Array[java.lang.String]): GridItem
  def setTitle(title: java.lang.String): GridItem
  def setValidation(validation: GridValidation): GridItem
}

object GridItem {
  @scala.inline
  def apply(
    clearValidation: js.Function0[GridItem],
    createResponse: js.Function1[js.Array[java.lang.String], ItemResponse],
    duplicate: js.Function0[GridItem],
    getColumns: js.Function0[js.Array[java.lang.String]],
    getHelpText: js.Function0[java.lang.String],
    getId: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getRows: js.Function0[js.Array[java.lang.String]],
    getTitle: js.Function0[java.lang.String],
    getType: js.Function0[ItemType],
    isRequired: js.Function0[scala.Boolean],
    setColumns: js.Function1[js.Array[java.lang.String], GridItem],
    setHelpText: js.Function1[java.lang.String, GridItem],
    setRequired: js.Function1[scala.Boolean, GridItem],
    setRows: js.Function1[js.Array[java.lang.String], GridItem],
    setTitle: js.Function1[java.lang.String, GridItem],
    setValidation: js.Function1[GridValidation, GridItem]
  ): GridItem = {
    val __obj = js.Dynamic.literal(clearValidation = clearValidation, createResponse = createResponse, duplicate = duplicate, getColumns = getColumns, getHelpText = getHelpText, getId = getId, getIndex = getIndex, getRows = getRows, getTitle = getTitle, getType = getType, isRequired = isRequired, setColumns = setColumns, setHelpText = setHelpText, setRequired = setRequired, setRows = setRows, setTitle = setTitle, setValidation = setValidation)
  
    __obj.asInstanceOf[GridItem]
  }
}

