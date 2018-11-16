package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexTable extends js.Object {
  def addCell(row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): FlexTable = js.native
  def addClickHandler(handler: Handler): FlexTable = js.native
  def addStyleDependentName(styleName: java.lang.String): FlexTable = js.native
  def addStyleName(styleName: java.lang.String): FlexTable = js.native
  def clear(): FlexTable = js.native
  def getId(): java.lang.String = js.native
  def getTag(): java.lang.String = js.native
  def getType(): java.lang.String = js.native
  def insertCell(
    beforeRow: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    beforeColumn: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): FlexTable = js.native
  def insertRow(beforeRow: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): FlexTable = js.native
  def removeCell(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): FlexTable = js.native
  def removeCells(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    num: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): FlexTable = js.native
  def removeRow(row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): FlexTable = js.native
  def setBorderWidth(width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): FlexTable = js.native
  def setCellPadding(padding: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): FlexTable = js.native
  def setCellSpacing(spacing: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): FlexTable = js.native
  def setColumnStyleAttribute(
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    attribute: java.lang.String,
    value: java.lang.String
  ): FlexTable = js.native
  def setColumnStyleAttributes(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, attributes: js.Object): FlexTable = js.native
  def setHeight(height: java.lang.String): FlexTable = js.native
  def setId(id: java.lang.String): FlexTable = js.native
  def setLayoutData(layout: js.Object): FlexTable = js.native
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): FlexTable = js.native
  def setRowStyleAttribute(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    attribute: java.lang.String,
    value: java.lang.String
  ): FlexTable = js.native
  def setRowStyleAttributes(row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, attributes: js.Object): FlexTable = js.native
  def setSize(width: java.lang.String, height: java.lang.String): FlexTable = js.native
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): FlexTable = js.native
  def setStyleAttribute(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    attribute: java.lang.String,
    value: java.lang.String
  ): FlexTable = js.native
  def setStyleAttributes(attributes: js.Object): FlexTable = js.native
  def setStyleAttributes(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    attributes: js.Object
  ): FlexTable = js.native
  def setStyleName(styleName: java.lang.String): FlexTable = js.native
  def setStylePrimaryName(styleName: java.lang.String): FlexTable = js.native
  def setTag(tag: java.lang.String): FlexTable = js.native
  def setText(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    text: java.lang.String
  ): FlexTable = js.native
  def setTitle(title: java.lang.String): FlexTable = js.native
  def setVisible(visible: scala.Boolean): FlexTable = js.native
  def setWidget(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    widget: Widget
  ): FlexTable = js.native
  def setWidth(width: java.lang.String): FlexTable = js.native
}

