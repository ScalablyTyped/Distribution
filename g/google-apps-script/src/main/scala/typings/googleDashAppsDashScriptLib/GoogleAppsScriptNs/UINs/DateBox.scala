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

