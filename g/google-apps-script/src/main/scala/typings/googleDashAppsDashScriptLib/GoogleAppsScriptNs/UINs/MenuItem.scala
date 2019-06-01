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
  def setStyleAttributes(attributes: js.Any): MenuItem
  def setStyleName(styleName: java.lang.String): MenuItem
  def setStylePrimaryName(styleName: java.lang.String): MenuItem
  def setSubMenu(subMenu: MenuBar): MenuItem
  def setTag(tag: java.lang.String): MenuItem
  def setText(text: java.lang.String): MenuItem
  def setTitle(title: java.lang.String): MenuItem
  def setVisible(visible: scala.Boolean): MenuItem
  def setWidth(width: java.lang.String): MenuItem
}

object MenuItem {
  @scala.inline
  def apply(
    addStyleDependentName: java.lang.String => MenuItem,
    addStyleName: java.lang.String => MenuItem,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setCommand: Handler => MenuItem,
    setHTML: java.lang.String => MenuItem,
    setHeight: java.lang.String => MenuItem,
    setId: java.lang.String => MenuItem,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => MenuItem,
    setSize: (java.lang.String, java.lang.String) => MenuItem,
    setStyleAttribute: (java.lang.String, java.lang.String) => MenuItem,
    setStyleAttributes: js.Any => MenuItem,
    setStyleName: java.lang.String => MenuItem,
    setStylePrimaryName: java.lang.String => MenuItem,
    setSubMenu: MenuBar => MenuItem,
    setTag: java.lang.String => MenuItem,
    setText: java.lang.String => MenuItem,
    setTitle: java.lang.String => MenuItem,
    setVisible: scala.Boolean => MenuItem,
    setWidth: java.lang.String => MenuItem
  ): MenuItem = {
    val __obj = js.Dynamic.literal(addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setCommand = js.Any.fromFunction1(setCommand), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setSubMenu = js.Any.fromFunction1(setSubMenu), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[MenuItem]
  }
}

