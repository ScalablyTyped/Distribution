package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexTable extends js.Object {
  def addCell(row: Integer): FlexTable = js.native
  def addClickHandler(handler: Handler): FlexTable = js.native
  def addStyleDependentName(styleName: String): FlexTable = js.native
  def addStyleName(styleName: String): FlexTable = js.native
  def clear(): FlexTable = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def insertCell(beforeRow: Integer, beforeColumn: Integer): FlexTable = js.native
  def insertRow(beforeRow: Integer): FlexTable = js.native
  def removeCell(row: Integer, column: Integer): FlexTable = js.native
  def removeCells(row: Integer, column: Integer, num: Integer): FlexTable = js.native
  def removeRow(row: Integer): FlexTable = js.native
  def setBorderWidth(width: Integer): FlexTable = js.native
  def setCellPadding(padding: Integer): FlexTable = js.native
  def setCellSpacing(spacing: Integer): FlexTable = js.native
  def setColumnStyleAttribute(column: Integer, attribute: String, value: String): FlexTable = js.native
  def setColumnStyleAttributes(column: Integer, attributes: js.Any): FlexTable = js.native
  def setHeight(height: String): FlexTable = js.native
  def setId(id: String): FlexTable = js.native
  def setLayoutData(layout: js.Any): FlexTable = js.native
  def setPixelSize(width: Integer, height: Integer): FlexTable = js.native
  def setRowStyleAttribute(row: Integer, attribute: String, value: String): FlexTable = js.native
  def setRowStyleAttributes(row: Integer, attributes: js.Any): FlexTable = js.native
  def setSize(width: String, height: String): FlexTable = js.native
  def setStyleAttribute(attribute: String, value: String): FlexTable = js.native
  def setStyleAttribute(row: Integer, column: Integer, attribute: String, value: String): FlexTable = js.native
  def setStyleAttributes(attributes: js.Any): FlexTable = js.native
  def setStyleAttributes(row: Integer, column: Integer, attributes: js.Any): FlexTable = js.native
  def setStyleName(styleName: String): FlexTable = js.native
  def setStylePrimaryName(styleName: String): FlexTable = js.native
  def setTag(tag: String): FlexTable = js.native
  def setText(row: Integer, column: Integer, text: String): FlexTable = js.native
  def setTitle(title: String): FlexTable = js.native
  def setVisible(visible: Boolean): FlexTable = js.native
  def setWidget(row: Integer, column: Integer, widget: Widget): FlexTable = js.native
  def setWidth(width: String): FlexTable = js.native
}

