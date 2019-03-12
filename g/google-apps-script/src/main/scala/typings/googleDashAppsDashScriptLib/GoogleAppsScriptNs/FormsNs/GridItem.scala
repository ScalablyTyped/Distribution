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
    clearValidation: () => GridItem,
    createResponse: js.Array[java.lang.String] => ItemResponse,
    duplicate: () => GridItem,
    getColumns: () => js.Array[java.lang.String],
    getHelpText: () => java.lang.String,
    getId: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getRows: () => js.Array[java.lang.String],
    getTitle: () => java.lang.String,
    getType: () => ItemType,
    isRequired: () => scala.Boolean,
    setColumns: js.Array[java.lang.String] => GridItem,
    setHelpText: java.lang.String => GridItem,
    setRequired: scala.Boolean => GridItem,
    setRows: js.Array[java.lang.String] => GridItem,
    setTitle: java.lang.String => GridItem,
    setValidation: GridValidation => GridItem
  ): GridItem = {
    val __obj = js.Dynamic.literal(clearValidation = js.Any.fromFunction0(clearValidation), createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getColumns = js.Any.fromFunction0(getColumns), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getRows = js.Any.fromFunction0(getRows), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setColumns = js.Any.fromFunction1(setColumns), setHelpText = js.Any.fromFunction1(setHelpText), setRequired = js.Any.fromFunction1(setRequired), setRows = js.Any.fromFunction1(setRows), setTitle = js.Any.fromFunction1(setTitle), setValidation = js.Any.fromFunction1(setValidation))
  
    __obj.asInstanceOf[GridItem]
  }
}

