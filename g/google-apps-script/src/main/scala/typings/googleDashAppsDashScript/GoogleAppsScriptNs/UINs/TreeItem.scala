package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeItem extends js.Object {
  def addItem(item: TreeItem): TreeItem = js.native
  def addItem(text: String): TreeItem = js.native
  def addItem(widget: Widget): TreeItem = js.native
  def addStyleDependentName(styleName: String): TreeItem = js.native
  def addStyleName(styleName: String): TreeItem = js.native
  def clear(): TreeItem = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def setHTML(html: String): TreeItem = js.native
  def setHeight(height: String): TreeItem = js.native
  def setId(id: String): TreeItem = js.native
  def setPixelSize(width: Integer, height: Integer): TreeItem = js.native
  def setSelected(selected: Boolean): TreeItem = js.native
  def setSize(width: String, height: String): TreeItem = js.native
  def setState(open: Boolean): TreeItem = js.native
  def setState(open: Boolean, fireEvents: Boolean): TreeItem = js.native
  def setStyleAttribute(attribute: String, value: String): TreeItem = js.native
  def setStyleAttributes(attributes: js.Any): TreeItem = js.native
  def setStyleName(styleName: String): TreeItem = js.native
  def setStylePrimaryName(styleName: String): TreeItem = js.native
  def setTag(tag: String): TreeItem = js.native
  def setText(text: String): TreeItem = js.native
  def setTitle(title: String): TreeItem = js.native
  def setUserObject(a: js.Any): TreeItem = js.native
  def setVisible(visible: Boolean): TreeItem = js.native
  def setWidget(widget: Widget): TreeItem = js.native
  def setWidth(width: String): TreeItem = js.native
}

