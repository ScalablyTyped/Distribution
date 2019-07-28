package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Date
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Char
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateBox extends js.Object {
  def addStyleDependentName(styleName: String): DateBox
  def addStyleName(styleName: String): DateBox
  def addValueChangeHandler(handler: Handler): DateBox
  def getId(): String
  def getTag(): String
  def getType(): String
  def hideDatePicker(): DateBox
  def setAccessKey(accessKey: Char): DateBox
  def setEnabled(enabled: Boolean): DateBox
  def setFireEventsForInvalid(fireEvents: Boolean): DateBox
  def setFocus(focus: Boolean): DateBox
  def setFormat(dateTimeFormat: DateTimeFormat): DateBox
  def setHeight(height: String): DateBox
  def setId(id: String): DateBox
  def setLayoutData(layout: js.Any): DateBox
  def setName(name: String): DateBox
  def setPixelSize(width: Integer, height: Integer): DateBox
  def setSize(width: String, height: String): DateBox
  def setStyleAttribute(attribute: String, value: String): DateBox
  def setStyleAttributes(attributes: js.Any): DateBox
  def setStyleName(styleName: String): DateBox
  def setStylePrimaryName(styleName: String): DateBox
  def setTabIndex(index: Integer): DateBox
  def setTag(tag: String): DateBox
  def setTitle(title: String): DateBox
  def setValue(date: Date): DateBox
  def setVisible(visible: Boolean): DateBox
  def setWidth(width: String): DateBox
  def showDatePicker(): DateBox
}

object DateBox {
  @scala.inline
  def apply(
    addStyleDependentName: String => DateBox,
    addStyleName: String => DateBox,
    addValueChangeHandler: Handler => DateBox,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    hideDatePicker: () => DateBox,
    setAccessKey: Char => DateBox,
    setEnabled: Boolean => DateBox,
    setFireEventsForInvalid: Boolean => DateBox,
    setFocus: Boolean => DateBox,
    setFormat: DateTimeFormat => DateBox,
    setHeight: String => DateBox,
    setId: String => DateBox,
    setLayoutData: js.Any => DateBox,
    setName: String => DateBox,
    setPixelSize: (Integer, Integer) => DateBox,
    setSize: (String, String) => DateBox,
    setStyleAttribute: (String, String) => DateBox,
    setStyleAttributes: js.Any => DateBox,
    setStyleName: String => DateBox,
    setStylePrimaryName: String => DateBox,
    setTabIndex: Integer => DateBox,
    setTag: String => DateBox,
    setTitle: String => DateBox,
    setValue: Date => DateBox,
    setVisible: Boolean => DateBox,
    setWidth: String => DateBox,
    showDatePicker: () => DateBox
  ): DateBox = {
    val __obj = js.Dynamic.literal(addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), addValueChangeHandler = js.Any.fromFunction1(addValueChangeHandler), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), hideDatePicker = js.Any.fromFunction0(hideDatePicker), setAccessKey = js.Any.fromFunction1(setAccessKey), setEnabled = js.Any.fromFunction1(setEnabled), setFireEventsForInvalid = js.Any.fromFunction1(setFireEventsForInvalid), setFocus = js.Any.fromFunction1(setFocus), setFormat = js.Any.fromFunction1(setFormat), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setName = js.Any.fromFunction1(setName), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setValue = js.Any.fromFunction1(setValue), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth), showDatePicker = js.Any.fromFunction0(showDatePicker))
  
    __obj.asInstanceOf[DateBox]
  }
}

