package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grid extends js.Object {
  def addClickHandler(handler: Handler): Grid = js.native
  def addStyleDependentName(styleName: String): Grid = js.native
  def addStyleName(styleName: String): Grid = js.native
  def clear(): Grid = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def resize(rows: Integer, columns: Integer): Grid = js.native
  def setBorderWidth(width: Integer): Grid = js.native
  def setCellPadding(padding: Integer): Grid = js.native
  def setCellSpacing(spacing: Integer): Grid = js.native
  def setColumnStyleAttribute(column: Integer, attribute: String, value: String): Grid = js.native
  def setColumnStyleAttributes(column: Integer, attributes: js.Any): Grid = js.native
  def setHeight(height: String): Grid = js.native
  def setId(id: String): Grid = js.native
  def setLayoutData(layout: js.Any): Grid = js.native
  def setPixelSize(width: Integer, height: Integer): Grid = js.native
  def setRowStyleAttribute(row: Integer, attribute: String, value: String): Grid = js.native
  def setRowStyleAttributes(row: Integer, attributes: js.Any): Grid = js.native
  def setSize(width: String, height: String): Grid = js.native
  def setStyleAttribute(attribute: String, value: String): Grid = js.native
  def setStyleAttribute(row: Integer, column: Integer, attribute: String, value: String): Grid = js.native
  def setStyleAttributes(attributes: js.Any): Grid = js.native
  def setStyleAttributes(row: Integer, column: Integer, attributes: js.Any): Grid = js.native
  def setStyleName(styleName: String): Grid = js.native
  def setStylePrimaryName(styleName: String): Grid = js.native
  def setTag(tag: String): Grid = js.native
  def setText(row: Integer, column: Integer, text: String): Grid = js.native
  def setTitle(title: String): Grid = js.native
  def setVisible(visible: Boolean): Grid = js.native
  def setWidget(row: Integer, column: Integer, widget: Widget): Grid = js.native
  def setWidth(width: String): Grid = js.native
}

