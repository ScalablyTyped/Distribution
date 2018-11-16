package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MenuItem extends js.Object {
  def addStyleDependentName(styleName: java.lang.String): MenuItem
  def addStyleName(styleName: java.lang.String): MenuItem
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setCommand(handler: Handler): MenuItem
  def setHTML(html: java.lang.String): MenuItem
  def setHeight(height: java.lang.String): MenuItem
  def setId(id: java.lang.String): MenuItem
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): MenuItem
  def setSize(width: java.lang.String, height: java.lang.String): MenuItem
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): MenuItem
  def setStyleAttributes(attributes: js.Object): MenuItem
  def setStyleName(styleName: java.lang.String): MenuItem
  def setStylePrimaryName(styleName: java.lang.String): MenuItem
  def setSubMenu(subMenu: MenuBar): MenuItem
  def setTag(tag: java.lang.String): MenuItem
  def setText(text: java.lang.String): MenuItem
  def setTitle(title: java.lang.String): MenuItem
  def setVisible(visible: scala.Boolean): MenuItem
  def setWidth(width: java.lang.String): MenuItem
}

