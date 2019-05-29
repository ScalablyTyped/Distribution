package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePicker extends js.Object {
  def addStyleDependentName(styleName: java.lang.String): DatePicker
  def addStyleName(styleName: java.lang.String): DatePicker
  def addValueChangeHandler(handler: Handler): DatePicker
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setCurrentMonth(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date): DatePicker
  def setHeight(height: java.lang.String): DatePicker
  def setId(id: java.lang.String): DatePicker
  def setLayoutData(layout: js.Object): DatePicker
  def setName(name: java.lang.String): DatePicker
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): DatePicker
  def setSize(width: java.lang.String, height: java.lang.String): DatePicker
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): DatePicker
  def setStyleAttributes(attributes: js.Object): DatePicker
  def setStyleName(styleName: java.lang.String): DatePicker
  def setStylePrimaryName(styleName: java.lang.String): DatePicker
  def setTag(tag: java.lang.String): DatePicker
  def setTitle(title: java.lang.String): DatePicker
  def setValue(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date): DatePicker
  def setVisible(visible: scala.Boolean): DatePicker
  def setWidth(width: java.lang.String): DatePicker
}

object DatePicker {
  @scala.inline
  def apply(
    addStyleDependentName: java.lang.String => DatePicker,
    addStyleName: java.lang.String => DatePicker,
    addValueChangeHandler: Handler => DatePicker,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setCurrentMonth: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date => DatePicker,
    setHeight: java.lang.String => DatePicker,
    setId: java.lang.String => DatePicker,
    setLayoutData: js.Object => DatePicker,
    setName: java.lang.String => DatePicker,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => DatePicker,
    setSize: (java.lang.String, java.lang.String) => DatePicker,
    setStyleAttribute: (java.lang.String, java.lang.String) => DatePicker,
    setStyleAttributes: js.Object => DatePicker,
    setStyleName: java.lang.String => DatePicker,
    setStylePrimaryName: java.lang.String => DatePicker,
    setTag: java.lang.String => DatePicker,
    setTitle: java.lang.String => DatePicker,
    setValue: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date => DatePicker,
    setVisible: scala.Boolean => DatePicker,
    setWidth: java.lang.String => DatePicker
  ): DatePicker = {
    val __obj = js.Dynamic.literal(addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), addValueChangeHandler = js.Any.fromFunction1(addValueChangeHandler), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setCurrentMonth = js.Any.fromFunction1(setCurrentMonth), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setName = js.Any.fromFunction1(setName), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setValue = js.Any.fromFunction1(setValue), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[DatePicker]
  }
}

