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

