package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Char
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tree extends js.Object {
  def add(widget: Widget): Tree = js.native
  def addBlurHandler(handler: Handler): Tree = js.native
  def addCloseHandler(handler: Handler): Tree = js.native
  def addFocusHandler(handler: Handler): Tree = js.native
  def addItem(item: TreeItem): Tree = js.native
  def addItem(text: String): Tree = js.native
  def addItem(widget: Widget): Tree = js.native
  def addKeyDownHandler(handler: Handler): Tree = js.native
  def addKeyPressHandler(handler: Handler): Tree = js.native
  def addKeyUpHandler(handler: Handler): Tree = js.native
  def addMouseDownHandler(handler: Handler): Tree = js.native
  def addMouseMoveHandler(handler: Handler): Tree = js.native
  def addMouseOutHandler(handler: Handler): Tree = js.native
  def addMouseOverHandler(handler: Handler): Tree = js.native
  def addMouseUpHandler(handler: Handler): Tree = js.native
  def addMouseWheelHandler(handler: Handler): Tree = js.native
  def addOpenHandler(handler: Handler): Tree = js.native
  def addSelectionHandler(handler: Handler): Tree = js.native
  def addStyleDependentName(styleName: String): Tree = js.native
  def addStyleName(styleName: String): Tree = js.native
  def clear(): Tree = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def setAccessKey(accessKey: Char): Tree = js.native
  def setAnimationEnabled(animationEnabled: Boolean): Tree = js.native
  def setFocus(focus: Boolean): Tree = js.native
  def setHeight(height: String): Tree = js.native
  def setId(id: String): Tree = js.native
  def setLayoutData(layout: js.Any): Tree = js.native
  def setPixelSize(width: Integer, height: Integer): Tree = js.native
  def setSelectedItem(item: TreeItem): Tree = js.native
  def setSelectedItem(item: TreeItem, fireEvents: Boolean): Tree = js.native
  def setSize(width: String, height: String): Tree = js.native
  def setStyleAttribute(attribute: String, value: String): Tree = js.native
  def setStyleAttributes(attributes: js.Any): Tree = js.native
  def setStyleName(styleName: String): Tree = js.native
  def setStylePrimaryName(styleName: String): Tree = js.native
  def setTabIndex(index: Integer): Tree = js.native
  def setTag(tag: String): Tree = js.native
  def setTitle(title: String): Tree = js.native
  def setVisible(visible: Boolean): Tree = js.native
  def setWidth(width: String): Tree = js.native
}

