package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hidden extends js.Object {
  def addStyleDependentName(styleName: String): Hidden
  def addStyleName(styleName: String): Hidden
  def getId(): String
  def getTag(): String
  def getType(): String
  def setDefaultValue(value: String): Hidden
  def setHeight(height: String): Hidden
  def setID(id: String): Hidden
  def setId(id: String): Hidden
  def setLayoutData(layout: js.Any): Hidden
  def setName(name: String): Hidden
  def setPixelSize(width: Integer, height: Integer): Hidden
  def setSize(width: String, height: String): Hidden
  def setStyleAttribute(attribute: String, value: String): Hidden
  def setStyleAttributes(attributes: js.Any): Hidden
  def setStyleName(styleName: String): Hidden
  def setStylePrimaryName(styleName: String): Hidden
  def setTag(tag: String): Hidden
  def setTitle(title: String): Hidden
  def setValue(value: String): Hidden
  def setVisible(visible: Boolean): Hidden
  def setWidth(width: String): Hidden
}

object Hidden {
  @scala.inline
  def apply(
    addStyleDependentName: String => Hidden,
    addStyleName: String => Hidden,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setDefaultValue: String => Hidden,
    setHeight: String => Hidden,
    setID: String => Hidden,
    setId: String => Hidden,
    setLayoutData: js.Any => Hidden,
    setName: String => Hidden,
    setPixelSize: (Integer, Integer) => Hidden,
    setSize: (String, String) => Hidden,
    setStyleAttribute: (String, String) => Hidden,
    setStyleAttributes: js.Any => Hidden,
    setStyleName: String => Hidden,
    setStylePrimaryName: String => Hidden,
    setTag: String => Hidden,
    setTitle: String => Hidden,
    setValue: String => Hidden,
    setVisible: Boolean => Hidden,
    setWidth: String => Hidden
  ): Hidden = {
    val __obj = js.Dynamic.literal(addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setDefaultValue = js.Any.fromFunction1(setDefaultValue), setHeight = js.Any.fromFunction1(setHeight), setID = js.Any.fromFunction1(setID), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setName = js.Any.fromFunction1(setName), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setValue = js.Any.fromFunction1(setValue), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[Hidden]
  }
}

