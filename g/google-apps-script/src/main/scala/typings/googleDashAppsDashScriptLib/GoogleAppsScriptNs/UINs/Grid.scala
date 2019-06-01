package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grid extends js.Object {
  def addClickHandler(handler: Handler): Grid = js.native
  def addStyleDependentName(styleName: java.lang.String): Grid = js.native
  def addStyleName(styleName: java.lang.String): Grid = js.native
  def clear(): Grid = js.native
  def getId(): java.lang.String = js.native
  def getTag(): java.lang.String = js.native
  def getType(): java.lang.String = js.native
  def resize(
    rows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    columns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Grid = js.native
  def setBorderWidth(width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Grid = js.native
  def setCellPadding(padding: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Grid = js.native
  def setCellSpacing(spacing: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Grid = js.native
  def setColumnStyleAttribute(
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    attribute: java.lang.String,
    value: java.lang.String
  ): Grid = js.native
  def setColumnStyleAttributes(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, attributes: js.Any): Grid = js.native
  def setHeight(height: java.lang.String): Grid = js.native
  def setId(id: java.lang.String): Grid = js.native
  def setLayoutData(layout: js.Any): Grid = js.native
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Grid = js.native
  def setRowStyleAttribute(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    attribute: java.lang.String,
    value: java.lang.String
  ): Grid = js.native
  def setRowStyleAttributes(row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, attributes: js.Any): Grid = js.native
  def setSize(width: java.lang.String, height: java.lang.String): Grid = js.native
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): Grid = js.native
  def setStyleAttribute(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    attribute: java.lang.String,
    value: java.lang.String
  ): Grid = js.native
  def setStyleAttributes(attributes: js.Any): Grid = js.native
  def setStyleAttributes(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    attributes: js.Any
  ): Grid = js.native
  def setStyleName(styleName: java.lang.String): Grid = js.native
  def setStylePrimaryName(styleName: java.lang.String): Grid = js.native
  def setTag(tag: java.lang.String): Grid = js.native
  def setText(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    text: java.lang.String
  ): Grid = js.native
  def setTitle(title: java.lang.String): Grid = js.native
  def setVisible(visible: scala.Boolean): Grid = js.native
  def setWidget(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    widget: Widget
  ): Grid = js.native
  def setWidth(width: java.lang.String): Grid = js.native
}

