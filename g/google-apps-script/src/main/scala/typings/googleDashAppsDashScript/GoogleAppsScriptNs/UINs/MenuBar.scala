package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuBar extends js.Object {
  def addCloseHandler(handler: Handler): MenuBar = js.native
  def addItem(item: MenuItem): MenuBar = js.native
  def addItem(text: String, asHtml: Boolean, command: Handler): MenuBar = js.native
  def addItem(text: String, asHtml: Boolean, subMenu: MenuBar): MenuBar = js.native
  def addItem(text: String, command: Handler): MenuBar = js.native
  def addItem(text: String, subMenu: MenuBar): MenuBar = js.native
  def addSeparator(): MenuBar = js.native
  def addSeparator(separator: MenuItemSeparator): MenuBar = js.native
  def addStyleDependentName(styleName: String): MenuBar = js.native
  def addStyleName(styleName: String): MenuBar = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def setAnimationEnabled(animationEnabled: Boolean): MenuBar = js.native
  def setAutoOpen(autoOpen: Boolean): MenuBar = js.native
  def setHeight(height: String): MenuBar = js.native
  def setId(id: String): MenuBar = js.native
  def setLayoutData(layout: js.Any): MenuBar = js.native
  def setPixelSize(width: Integer, height: Integer): MenuBar = js.native
  def setSize(width: String, height: String): MenuBar = js.native
  def setStyleAttribute(attribute: String, value: String): MenuBar = js.native
  def setStyleAttributes(attributes: js.Any): MenuBar = js.native
  def setStyleName(styleName: String): MenuBar = js.native
  def setStylePrimaryName(styleName: String): MenuBar = js.native
  def setTag(tag: String): MenuBar = js.native
  def setTitle(title: String): MenuBar = js.native
  def setVisible(visible: Boolean): MenuBar = js.native
  def setWidth(width: String): MenuBar = js.native
}

