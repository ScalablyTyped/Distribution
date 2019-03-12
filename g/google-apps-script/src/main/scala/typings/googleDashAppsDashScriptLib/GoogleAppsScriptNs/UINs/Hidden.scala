package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hidden extends js.Object {
  def addStyleDependentName(styleName: java.lang.String): Hidden
  def addStyleName(styleName: java.lang.String): Hidden
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setDefaultValue(value: java.lang.String): Hidden
  def setHeight(height: java.lang.String): Hidden
  def setID(id: java.lang.String): Hidden
  def setId(id: java.lang.String): Hidden
  def setLayoutData(layout: js.Object): Hidden
  def setName(name: java.lang.String): Hidden
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Hidden
  def setSize(width: java.lang.String, height: java.lang.String): Hidden
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): Hidden
  def setStyleAttributes(attributes: js.Object): Hidden
  def setStyleName(styleName: java.lang.String): Hidden
  def setStylePrimaryName(styleName: java.lang.String): Hidden
  def setTag(tag: java.lang.String): Hidden
  def setTitle(title: java.lang.String): Hidden
  def setValue(value: java.lang.String): Hidden
  def setVisible(visible: scala.Boolean): Hidden
  def setWidth(width: java.lang.String): Hidden
}

object Hidden {
  @scala.inline
  def apply(
    addStyleDependentName: java.lang.String => Hidden,
    addStyleName: java.lang.String => Hidden,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setDefaultValue: java.lang.String => Hidden,
    setHeight: java.lang.String => Hidden,
    setID: java.lang.String => Hidden,
    setId: java.lang.String => Hidden,
    setLayoutData: js.Object => Hidden,
    setName: java.lang.String => Hidden,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => Hidden,
    setSize: (java.lang.String, java.lang.String) => Hidden,
    setStyleAttribute: (java.lang.String, java.lang.String) => Hidden,
    setStyleAttributes: js.Object => Hidden,
    setStyleName: java.lang.String => Hidden,
    setStylePrimaryName: java.lang.String => Hidden,
    setTag: java.lang.String => Hidden,
    setTitle: java.lang.String => Hidden,
    setValue: java.lang.String => Hidden,
    setVisible: scala.Boolean => Hidden,
    setWidth: java.lang.String => Hidden
  ): Hidden = {
    val __obj = js.Dynamic.literal(addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setDefaultValue = js.Any.fromFunction1(setDefaultValue), setHeight = js.Any.fromFunction1(setHeight), setID = js.Any.fromFunction1(setID), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setName = js.Any.fromFunction1(setName), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setValue = js.Any.fromFunction1(setValue), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[Hidden]
  }
}

