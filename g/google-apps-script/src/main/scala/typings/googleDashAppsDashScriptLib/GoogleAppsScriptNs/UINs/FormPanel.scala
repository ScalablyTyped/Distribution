package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FormPanel extends js.Object {
  def add(widget: Widget): FormPanel
  def addStyleDependentName(styleName: java.lang.String): FormPanel
  def addStyleName(styleName: java.lang.String): FormPanel
  def addSubmitCompleteHandler(handler: Handler): FormPanel
  def addSubmitHandler(handler: Handler): FormPanel
  def clear(): FormPanel
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAction(action: java.lang.String): FormPanel
  def setEncoding(encoding: java.lang.String): FormPanel
  def setHeight(height: java.lang.String): FormPanel
  def setId(id: java.lang.String): FormPanel
  def setLayoutData(layout: js.Object): FormPanel
  def setMethod(method: java.lang.String): FormPanel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): FormPanel
  def setSize(width: java.lang.String, height: java.lang.String): FormPanel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): FormPanel
  def setStyleAttributes(attributes: js.Object): FormPanel
  def setStyleName(styleName: java.lang.String): FormPanel
  def setStylePrimaryName(styleName: java.lang.String): FormPanel
  def setTag(tag: java.lang.String): FormPanel
  def setTitle(title: java.lang.String): FormPanel
  def setVisible(visible: scala.Boolean): FormPanel
  def setWidget(widget: Widget): FormPanel
  def setWidth(width: java.lang.String): FormPanel
}

