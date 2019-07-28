package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Char
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextBox extends js.Object {
  def addBlurHandler(handler: Handler): TextBox = js.native
  def addChangeHandler(handler: Handler): TextBox = js.native
  def addClickHandler(handler: Handler): TextBox = js.native
  def addFocusHandler(handler: Handler): TextBox = js.native
  def addKeyDownHandler(handler: Handler): TextBox = js.native
  def addKeyPressHandler(handler: Handler): TextBox = js.native
  def addKeyUpHandler(handler: Handler): TextBox = js.native
  def addMouseDownHandler(handler: Handler): TextBox = js.native
  def addMouseMoveHandler(handler: Handler): TextBox = js.native
  def addMouseOutHandler(handler: Handler): TextBox = js.native
  def addMouseOverHandler(handler: Handler): TextBox = js.native
  def addMouseUpHandler(handler: Handler): TextBox = js.native
  def addMouseWheelHandler(handler: Handler): TextBox = js.native
  def addStyleDependentName(styleName: String): TextBox = js.native
  def addStyleName(styleName: String): TextBox = js.native
  def addValueChangeHandler(handler: Handler): TextBox = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def setAccessKey(accessKey: Char): TextBox = js.native
  def setCursorPos(position: Integer): TextBox = js.native
  def setDirection(direction: Component): TextBox = js.native
  def setEnabled(enabled: Boolean): TextBox = js.native
  def setFocus(focus: Boolean): TextBox = js.native
  def setHeight(height: String): TextBox = js.native
  def setId(id: String): TextBox = js.native
  def setLayoutData(layout: js.Any): TextBox = js.native
  def setMaxLength(length: Integer): TextBox = js.native
  def setName(name: String): TextBox = js.native
  def setPixelSize(width: Integer, height: Integer): TextBox = js.native
  def setReadOnly(readOnly: Boolean): TextBox = js.native
  def setSelectionRange(position: Integer, length: Integer): TextBox = js.native
  def setSize(width: String, height: String): TextBox = js.native
  def setStyleAttribute(attribute: String, value: String): TextBox = js.native
  def setStyleAttributes(attributes: js.Any): TextBox = js.native
  def setStyleName(styleName: String): TextBox = js.native
  def setStylePrimaryName(styleName: String): TextBox = js.native
  def setTabIndex(index: Integer): TextBox = js.native
  def setTag(tag: String): TextBox = js.native
  def setText(text: String): TextBox = js.native
  def setTextAlignment(textAlign: Component): TextBox = js.native
  def setTitle(title: String): TextBox = js.native
  def setValue(value: String): TextBox = js.native
  def setValue(value: String, fireEvents: Boolean): TextBox = js.native
  def setVisible(visible: Boolean): TextBox = js.native
  def setVisibleLength(length: Integer): TextBox = js.native
  def setWidth(width: String): TextBox = js.native
}

