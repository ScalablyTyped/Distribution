package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Char
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBox extends js.Object {
  def addBlurHandler(handler: Handler): ListBox = js.native
  def addChangeHandler(handler: Handler): ListBox = js.native
  def addClickHandler(handler: Handler): ListBox = js.native
  def addFocusHandler(handler: Handler): ListBox = js.native
  def addItem(text: String): ListBox = js.native
  def addItem(text: String, value: String): ListBox = js.native
  def addKeyDownHandler(handler: Handler): ListBox = js.native
  def addKeyPressHandler(handler: Handler): ListBox = js.native
  def addKeyUpHandler(handler: Handler): ListBox = js.native
  def addMouseDownHandler(handler: Handler): ListBox = js.native
  def addMouseMoveHandler(handler: Handler): ListBox = js.native
  def addMouseOutHandler(handler: Handler): ListBox = js.native
  def addMouseOverHandler(handler: Handler): ListBox = js.native
  def addMouseUpHandler(handler: Handler): ListBox = js.native
  def addMouseWheelHandler(handler: Handler): ListBox = js.native
  def addStyleDependentName(styleName: String): ListBox = js.native
  def addStyleName(styleName: String): ListBox = js.native
  def clear(): ListBox = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def removeItem(index: Integer): ListBox = js.native
  def setAccessKey(accessKey: Char): ListBox = js.native
  def setEnabled(enabled: Boolean): ListBox = js.native
  def setFocus(focus: Boolean): ListBox = js.native
  def setHeight(height: String): ListBox = js.native
  def setId(id: String): ListBox = js.native
  def setItemSelected(index: Integer, selected: Boolean): ListBox = js.native
  def setItemText(index: Integer, text: String): ListBox = js.native
  def setLayoutData(layout: js.Any): ListBox = js.native
  def setName(name: String): ListBox = js.native
  def setPixelSize(width: Integer, height: Integer): ListBox = js.native
  def setSelectedIndex(index: Integer): ListBox = js.native
  def setSize(width: String, height: String): ListBox = js.native
  def setStyleAttribute(attribute: String, value: String): ListBox = js.native
  def setStyleAttributes(attributes: js.Any): ListBox = js.native
  def setStyleName(styleName: String): ListBox = js.native
  def setStylePrimaryName(styleName: String): ListBox = js.native
  def setTabIndex(index: Integer): ListBox = js.native
  def setTag(tag: String): ListBox = js.native
  def setTitle(title: String): ListBox = js.native
  def setValue(index: Integer, value: String): ListBox = js.native
  def setVisible(visible: Boolean): ListBox = js.native
  def setVisibleItemCount(count: Integer): ListBox = js.native
  def setWidth(width: String): ListBox = js.native
}

