package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemSeparator extends js.Object {
  def addStyleDependentName(styleName: java.lang.String): MenuItemSeparator
  def addStyleName(styleName: java.lang.String): MenuItemSeparator
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setHeight(height: java.lang.String): MenuItemSeparator
  def setId(id: java.lang.String): MenuItemSeparator
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): MenuItemSeparator
  def setSize(width: java.lang.String, height: java.lang.String): MenuItemSeparator
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): MenuItemSeparator
  def setStyleAttributes(attributes: js.Object): MenuItemSeparator
  def setStyleName(styleName: java.lang.String): MenuItemSeparator
  def setStylePrimaryName(styleName: java.lang.String): MenuItemSeparator
  def setTag(tag: java.lang.String): MenuItemSeparator
  def setTitle(title: java.lang.String): MenuItemSeparator
  def setVisible(visible: scala.Boolean): MenuItemSeparator
  def setWidth(width: java.lang.String): MenuItemSeparator
}

object MenuItemSeparator {
  @scala.inline
  def apply(
    addStyleDependentName: java.lang.String => MenuItemSeparator,
    addStyleName: java.lang.String => MenuItemSeparator,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setHeight: java.lang.String => MenuItemSeparator,
    setId: java.lang.String => MenuItemSeparator,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => MenuItemSeparator,
    setSize: (java.lang.String, java.lang.String) => MenuItemSeparator,
    setStyleAttribute: (java.lang.String, java.lang.String) => MenuItemSeparator,
    setStyleAttributes: js.Object => MenuItemSeparator,
    setStyleName: java.lang.String => MenuItemSeparator,
    setStylePrimaryName: java.lang.String => MenuItemSeparator,
    setTag: java.lang.String => MenuItemSeparator,
    setTitle: java.lang.String => MenuItemSeparator,
    setVisible: scala.Boolean => MenuItemSeparator,
    setWidth: java.lang.String => MenuItemSeparator
  ): MenuItemSeparator = {
    val __obj = js.Dynamic.literal(addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[MenuItemSeparator]
  }
}

