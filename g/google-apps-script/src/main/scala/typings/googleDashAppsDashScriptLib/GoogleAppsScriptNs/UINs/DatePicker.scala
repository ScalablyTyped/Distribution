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
  def setCurrentMonth(date: stdLib.Date): DatePicker
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
  def setValue(date: stdLib.Date): DatePicker
  def setVisible(visible: scala.Boolean): DatePicker
  def setWidth(width: java.lang.String): DatePicker
}

object DatePicker {
  @scala.inline
  def apply(
    addStyleDependentName: js.Function1[java.lang.String, DatePicker],
    addStyleName: js.Function1[java.lang.String, DatePicker],
    addValueChangeHandler: js.Function1[Handler, DatePicker],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setCurrentMonth: js.Function1[stdLib.Date, DatePicker],
    setHeight: js.Function1[java.lang.String, DatePicker],
    setId: js.Function1[java.lang.String, DatePicker],
    setLayoutData: js.Function1[js.Object, DatePicker],
    setName: js.Function1[java.lang.String, DatePicker],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      DatePicker
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, DatePicker],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, DatePicker],
    setStyleAttributes: js.Function1[js.Object, DatePicker],
    setStyleName: js.Function1[java.lang.String, DatePicker],
    setStylePrimaryName: js.Function1[java.lang.String, DatePicker],
    setTag: js.Function1[java.lang.String, DatePicker],
    setTitle: js.Function1[java.lang.String, DatePicker],
    setValue: js.Function1[stdLib.Date, DatePicker],
    setVisible: js.Function1[scala.Boolean, DatePicker],
    setWidth: js.Function1[java.lang.String, DatePicker]
  ): DatePicker = {
    val __obj = js.Dynamic.literal(addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, addValueChangeHandler = addValueChangeHandler, getId = getId, getTag = getTag, getType = getType, setCurrentMonth = setCurrentMonth, setHeight = setHeight, setId = setId, setLayoutData = setLayoutData, setName = setName, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTag = setTag, setTitle = setTitle, setValue = setValue, setVisible = setVisible, setWidth = setWidth)
  
    __obj.asInstanceOf[DatePicker]
  }
}

