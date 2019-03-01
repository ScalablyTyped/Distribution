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

object MenuItem {
  @scala.inline
  def apply(
    addStyleDependentName: js.Function1[java.lang.String, MenuItem],
    addStyleName: js.Function1[java.lang.String, MenuItem],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setCommand: js.Function1[Handler, MenuItem],
    setHTML: js.Function1[java.lang.String, MenuItem],
    setHeight: js.Function1[java.lang.String, MenuItem],
    setId: js.Function1[java.lang.String, MenuItem],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      MenuItem
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, MenuItem],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, MenuItem],
    setStyleAttributes: js.Function1[js.Object, MenuItem],
    setStyleName: js.Function1[java.lang.String, MenuItem],
    setStylePrimaryName: js.Function1[java.lang.String, MenuItem],
    setSubMenu: js.Function1[MenuBar, MenuItem],
    setTag: js.Function1[java.lang.String, MenuItem],
    setText: js.Function1[java.lang.String, MenuItem],
    setTitle: js.Function1[java.lang.String, MenuItem],
    setVisible: js.Function1[scala.Boolean, MenuItem],
    setWidth: js.Function1[java.lang.String, MenuItem]
  ): MenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addStyleDependentName")(addStyleDependentName)
    __obj.updateDynamic("addStyleName")(addStyleName)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getTag")(getTag)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("setCommand")(setCommand)
    __obj.updateDynamic("setHTML")(setHTML)
    __obj.updateDynamic("setHeight")(setHeight)
    __obj.updateDynamic("setId")(setId)
    __obj.updateDynamic("setPixelSize")(setPixelSize)
    __obj.updateDynamic("setSize")(setSize)
    __obj.updateDynamic("setStyleAttribute")(setStyleAttribute)
    __obj.updateDynamic("setStyleAttributes")(setStyleAttributes)
    __obj.updateDynamic("setStyleName")(setStyleName)
    __obj.updateDynamic("setStylePrimaryName")(setStylePrimaryName)
    __obj.updateDynamic("setSubMenu")(setSubMenu)
    __obj.updateDynamic("setTag")(setTag)
    __obj.updateDynamic("setText")(setText)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("setWidth")(setWidth)
    __obj.asInstanceOf[MenuItem]
  }
}

