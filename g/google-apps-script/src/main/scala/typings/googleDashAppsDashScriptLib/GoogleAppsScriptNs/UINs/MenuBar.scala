package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuBar extends js.Object {
  def addCloseHandler(handler: Handler): MenuBar = js.native
  def addItem(item: MenuItem): MenuBar = js.native
  def addItem(text: java.lang.String, asHtml: scala.Boolean, command: Handler): MenuBar = js.native
  def addItem(text: java.lang.String, asHtml: scala.Boolean, subMenu: MenuBar): MenuBar = js.native
  def addItem(text: java.lang.String, command: Handler): MenuBar = js.native
  def addItem(text: java.lang.String, subMenu: MenuBar): MenuBar = js.native
  def addSeparator(): MenuBar = js.native
  def addSeparator(separator: MenuItemSeparator): MenuBar = js.native
  def addStyleDependentName(styleName: java.lang.String): MenuBar = js.native
  def addStyleName(styleName: java.lang.String): MenuBar = js.native
  def getId(): java.lang.String = js.native
  def getTag(): java.lang.String = js.native
  def getType(): java.lang.String = js.native
  def setAnimationEnabled(animationEnabled: scala.Boolean): MenuBar = js.native
  def setAutoOpen(autoOpen: scala.Boolean): MenuBar = js.native
  def setHeight(height: java.lang.String): MenuBar = js.native
  def setId(id: java.lang.String): MenuBar = js.native
  def setLayoutData(layout: js.Any): MenuBar = js.native
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): MenuBar = js.native
  def setSize(width: java.lang.String, height: java.lang.String): MenuBar = js.native
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): MenuBar = js.native
  def setStyleAttributes(attributes: js.Any): MenuBar = js.native
  def setStyleName(styleName: java.lang.String): MenuBar = js.native
  def setStylePrimaryName(styleName: java.lang.String): MenuBar = js.native
  def setTag(tag: java.lang.String): MenuBar = js.native
  def setTitle(title: java.lang.String): MenuBar = js.native
  def setVisible(visible: scala.Boolean): MenuBar = js.native
  def setWidth(width: java.lang.String): MenuBar = js.native
}

