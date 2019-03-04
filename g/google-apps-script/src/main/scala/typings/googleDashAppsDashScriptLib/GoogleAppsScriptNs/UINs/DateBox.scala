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
  def setLayoutData(layout: js.Object): DateBox
  def setName(name: java.lang.String): DateBox
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): DateBox
  def setSize(width: java.lang.String, height: java.lang.String): DateBox
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): DateBox
  def setStyleAttributes(attributes: js.Object): DateBox
  def setStyleName(styleName: java.lang.String): DateBox
  def setStylePrimaryName(styleName: java.lang.String): DateBox
  def setTabIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): DateBox
  def setTag(tag: java.lang.String): DateBox
  def setTitle(title: java.lang.String): DateBox
  def setValue(date: stdLib.Date): DateBox
  def setVisible(visible: scala.Boolean): DateBox
  def setWidth(width: java.lang.String): DateBox
  def showDatePicker(): DateBox
}

object DateBox {
  @scala.inline
  def apply(
    addStyleDependentName: js.Function1[java.lang.String, DateBox],
    addStyleName: js.Function1[java.lang.String, DateBox],
    addValueChangeHandler: js.Function1[Handler, DateBox],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    hideDatePicker: js.Function0[DateBox],
    setAccessKey: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char, DateBox],
    setEnabled: js.Function1[scala.Boolean, DateBox],
    setFireEventsForInvalid: js.Function1[scala.Boolean, DateBox],
    setFocus: js.Function1[scala.Boolean, DateBox],
    setFormat: js.Function1[DateTimeFormat, DateBox],
    setHeight: js.Function1[java.lang.String, DateBox],
    setId: js.Function1[java.lang.String, DateBox],
    setLayoutData: js.Function1[js.Object, DateBox],
    setName: js.Function1[java.lang.String, DateBox],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      DateBox
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, DateBox],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, DateBox],
    setStyleAttributes: js.Function1[js.Object, DateBox],
    setStyleName: js.Function1[java.lang.String, DateBox],
    setStylePrimaryName: js.Function1[java.lang.String, DateBox],
    setTabIndex: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, DateBox],
    setTag: js.Function1[java.lang.String, DateBox],
    setTitle: js.Function1[java.lang.String, DateBox],
    setValue: js.Function1[stdLib.Date, DateBox],
    setVisible: js.Function1[scala.Boolean, DateBox],
    setWidth: js.Function1[java.lang.String, DateBox],
    showDatePicker: js.Function0[DateBox]
  ): DateBox = {
    val __obj = js.Dynamic.literal(addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, addValueChangeHandler = addValueChangeHandler, getId = getId, getTag = getTag, getType = getType, hideDatePicker = hideDatePicker, setAccessKey = setAccessKey, setEnabled = setEnabled, setFireEventsForInvalid = setFireEventsForInvalid, setFocus = setFocus, setFormat = setFormat, setHeight = setHeight, setId = setId, setLayoutData = setLayoutData, setName = setName, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTabIndex = setTabIndex, setTag = setTag, setTitle = setTitle, setValue = setValue, setVisible = setVisible, setWidth = setWidth, showDatePicker = showDatePicker)
  
    __obj.asInstanceOf[DateBox]
  }
}

