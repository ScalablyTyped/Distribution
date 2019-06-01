package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateBox extends js.Object {
  def addStyleDependentName(styleName: java.lang.String): DateBox
  def addStyleName(styleName: java.lang.String): DateBox
  def addValueChangeHandler(handler: Handler): DateBox
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def hideDatePicker(): DateBox
  def setAccessKey(accessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char): DateBox
  def setEnabled(enabled: scala.Boolean): DateBox
  def setFireEventsForInvalid(fireEvents: scala.Boolean): DateBox
  def setFocus(focus: scala.Boolean): DateBox
  def setFormat(dateTimeFormat: DateTimeFormat): DateBox
  def setHeight(height: java.lang.String): DateBox
  def setId(id: java.lang.String): DateBox
  def setLayoutData(layout: js.Any): DateBox
  def setName(name: java.lang.String): DateBox
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): DateBox
  def setSize(width: java.lang.String, height: java.lang.String): DateBox
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): DateBox
  def setStyleAttributes(attributes: js.Any): DateBox
  def setStyleName(styleName: java.lang.String): DateBox
  def setStylePrimaryName(styleName: java.lang.String): DateBox
  def setTabIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): DateBox
  def setTag(tag: java.lang.String): DateBox
  def setTitle(title: java.lang.String): DateBox
  def setValue(date: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date): DateBox
  def setVisible(visible: scala.Boolean): DateBox
  def setWidth(width: java.lang.String): DateBox
  def showDatePicker(): DateBox
}

object DateBox {
  @scala.inline
  def apply(
    addStyleDependentName: java.lang.String => DateBox,
    addStyleName: java.lang.String => DateBox,
    addValueChangeHandler: Handler => DateBox,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    hideDatePicker: () => DateBox,
    setAccessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char => DateBox,
    setEnabled: scala.Boolean => DateBox,
    setFireEventsForInvalid: scala.Boolean => DateBox,
    setFocus: scala.Boolean => DateBox,
    setFormat: DateTimeFormat => DateBox,
    setHeight: java.lang.String => DateBox,
    setId: java.lang.String => DateBox,
    setLayoutData: js.Any => DateBox,
    setName: java.lang.String => DateBox,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => DateBox,
    setSize: (java.lang.String, java.lang.String) => DateBox,
    setStyleAttribute: (java.lang.String, java.lang.String) => DateBox,
    setStyleAttributes: js.Any => DateBox,
    setStyleName: java.lang.String => DateBox,
    setStylePrimaryName: java.lang.String => DateBox,
    setTabIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => DateBox,
    setTag: java.lang.String => DateBox,
    setTitle: java.lang.String => DateBox,
    setValue: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Date => DateBox,
    setVisible: scala.Boolean => DateBox,
    setWidth: java.lang.String => DateBox,
    showDatePicker: () => DateBox
  ): DateBox = {
    val __obj = js.Dynamic.literal(addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), addValueChangeHandler = js.Any.fromFunction1(addValueChangeHandler), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), hideDatePicker = js.Any.fromFunction0(hideDatePicker), setAccessKey = js.Any.fromFunction1(setAccessKey), setEnabled = js.Any.fromFunction1(setEnabled), setFireEventsForInvalid = js.Any.fromFunction1(setFireEventsForInvalid), setFocus = js.Any.fromFunction1(setFocus), setFormat = js.Any.fromFunction1(setFormat), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setName = js.Any.fromFunction1(setName), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setValue = js.Any.fromFunction1(setValue), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth), showDatePicker = js.Any.fromFunction0(showDatePicker))
  
    __obj.asInstanceOf[DateBox]
  }
}

