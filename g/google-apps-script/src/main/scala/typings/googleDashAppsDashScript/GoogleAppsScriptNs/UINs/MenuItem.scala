package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  def addStyleDependentName(styleName: String): MenuItem
  def addStyleName(styleName: String): MenuItem
  def getId(): String
  def getTag(): String
  def getType(): String
  def setCommand(handler: Handler): MenuItem
  def setHTML(html: String): MenuItem
  def setHeight(height: String): MenuItem
  def setId(id: String): MenuItem
  def setPixelSize(width: Integer, height: Integer): MenuItem
  def setSize(width: String, height: String): MenuItem
  def setStyleAttribute(attribute: String, value: String): MenuItem
  def setStyleAttributes(attributes: js.Any): MenuItem
  def setStyleName(styleName: String): MenuItem
  def setStylePrimaryName(styleName: String): MenuItem
  def setSubMenu(subMenu: MenuBar): MenuItem
  def setTag(tag: String): MenuItem
  def setText(text: String): MenuItem
  def setTitle(title: String): MenuItem
  def setVisible(visible: Boolean): MenuItem
  def setWidth(width: String): MenuItem
}

object MenuItem {
  @scala.inline
  def apply(
    addStyleDependentName: String => MenuItem,
    addStyleName: String => MenuItem,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setCommand: Handler => MenuItem,
    setHTML: String => MenuItem,
    setHeight: String => MenuItem,
    setId: String => MenuItem,
    setPixelSize: (Integer, Integer) => MenuItem,
    setSize: (String, String) => MenuItem,
    setStyleAttribute: (String, String) => MenuItem,
    setStyleAttributes: js.Any => MenuItem,
    setStyleName: String => MenuItem,
    setStylePrimaryName: String => MenuItem,
    setSubMenu: MenuBar => MenuItem,
    setTag: String => MenuItem,
    setText: String => MenuItem,
    setTitle: String => MenuItem,
    setVisible: Boolean => MenuItem,
    setWidth: String => MenuItem
  ): MenuItem = {
    val __obj = js.Dynamic.literal(addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setCommand = js.Any.fromFunction1(setCommand), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setSubMenu = js.Any.fromFunction1(setSubMenu), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[MenuItem]
  }
}

