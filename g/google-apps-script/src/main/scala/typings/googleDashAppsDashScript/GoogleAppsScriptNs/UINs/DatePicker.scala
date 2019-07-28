package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Date
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePicker extends js.Object {
  def addStyleDependentName(styleName: String): DatePicker
  def addStyleName(styleName: String): DatePicker
  def addValueChangeHandler(handler: Handler): DatePicker
  def getId(): String
  def getTag(): String
  def getType(): String
  def setCurrentMonth(date: Date): DatePicker
  def setHeight(height: String): DatePicker
  def setId(id: String): DatePicker
  def setLayoutData(layout: js.Any): DatePicker
  def setName(name: String): DatePicker
  def setPixelSize(width: Integer, height: Integer): DatePicker
  def setSize(width: String, height: String): DatePicker
  def setStyleAttribute(attribute: String, value: String): DatePicker
  def setStyleAttributes(attributes: js.Any): DatePicker
  def setStyleName(styleName: String): DatePicker
  def setStylePrimaryName(styleName: String): DatePicker
  def setTag(tag: String): DatePicker
  def setTitle(title: String): DatePicker
  def setValue(date: Date): DatePicker
  def setVisible(visible: Boolean): DatePicker
  def setWidth(width: String): DatePicker
}

object DatePicker {
  @scala.inline
  def apply(
    addStyleDependentName: String => DatePicker,
    addStyleName: String => DatePicker,
    addValueChangeHandler: Handler => DatePicker,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setCurrentMonth: Date => DatePicker,
    setHeight: String => DatePicker,
    setId: String => DatePicker,
    setLayoutData: js.Any => DatePicker,
    setName: String => DatePicker,
    setPixelSize: (Integer, Integer) => DatePicker,
    setSize: (String, String) => DatePicker,
    setStyleAttribute: (String, String) => DatePicker,
    setStyleAttributes: js.Any => DatePicker,
    setStyleName: String => DatePicker,
    setStylePrimaryName: String => DatePicker,
    setTag: String => DatePicker,
    setTitle: String => DatePicker,
    setValue: Date => DatePicker,
    setVisible: Boolean => DatePicker,
    setWidth: String => DatePicker
  ): DatePicker = {
    val __obj = js.Dynamic.literal(addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), addValueChangeHandler = js.Any.fromFunction1(addValueChangeHandler), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setCurrentMonth = js.Any.fromFunction1(setCurrentMonth), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setName = js.Any.fromFunction1(setName), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setValue = js.Any.fromFunction1(setValue), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[DatePicker]
  }
}

