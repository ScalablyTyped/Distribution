package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemSeparator extends js.Object {
  def addStyleDependentName(styleName: String): MenuItemSeparator
  def addStyleName(styleName: String): MenuItemSeparator
  def getId(): String
  def getTag(): String
  def getType(): String
  def setHeight(height: String): MenuItemSeparator
  def setId(id: String): MenuItemSeparator
  def setPixelSize(width: Integer, height: Integer): MenuItemSeparator
  def setSize(width: String, height: String): MenuItemSeparator
  def setStyleAttribute(attribute: String, value: String): MenuItemSeparator
  def setStyleAttributes(attributes: js.Any): MenuItemSeparator
  def setStyleName(styleName: String): MenuItemSeparator
  def setStylePrimaryName(styleName: String): MenuItemSeparator
  def setTag(tag: String): MenuItemSeparator
  def setTitle(title: String): MenuItemSeparator
  def setVisible(visible: Boolean): MenuItemSeparator
  def setWidth(width: String): MenuItemSeparator
}

object MenuItemSeparator {
  @scala.inline
  def apply(
    addStyleDependentName: String => MenuItemSeparator,
    addStyleName: String => MenuItemSeparator,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setHeight: String => MenuItemSeparator,
    setId: String => MenuItemSeparator,
    setPixelSize: (Integer, Integer) => MenuItemSeparator,
    setSize: (String, String) => MenuItemSeparator,
    setStyleAttribute: (String, String) => MenuItemSeparator,
    setStyleAttributes: js.Any => MenuItemSeparator,
    setStyleName: String => MenuItemSeparator,
    setStylePrimaryName: String => MenuItemSeparator,
    setTag: String => MenuItemSeparator,
    setTitle: String => MenuItemSeparator,
    setVisible: Boolean => MenuItemSeparator,
    setWidth: String => MenuItemSeparator
  ): MenuItemSeparator = {
    val __obj = js.Dynamic.literal(addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[MenuItemSeparator]
  }
}

