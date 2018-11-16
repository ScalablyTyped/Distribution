package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FocusPanel extends js.Object {
  def add(widget: Widget): FocusPanel
  def addBlurHandler(handler: Handler): FocusPanel
  def addClickHandler(handler: Handler): FocusPanel
  def addFocusHandler(handler: Handler): FocusPanel
  def addKeyDownHandler(handler: Handler): FocusPanel
  def addKeyPressHandler(handler: Handler): FocusPanel
  def addKeyUpHandler(handler: Handler): FocusPanel
  def addMouseDownHandler(handler: Handler): FocusPanel
  def addMouseMoveHandler(handler: Handler): FocusPanel
  def addMouseOutHandler(handler: Handler): FocusPanel
  def addMouseOverHandler(handler: Handler): FocusPanel
  def addMouseUpHandler(handler: Handler): FocusPanel
  def addMouseWheelHandler(handler: Handler): FocusPanel
  def addStyleDependentName(styleName: java.lang.String): FocusPanel
  def addStyleName(styleName: java.lang.String): FocusPanel
  def clear(): FocusPanel
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAccessKey(accessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char): FocusPanel
  def setFocus(focus: scala.Boolean): FocusPanel
  def setHeight(height: java.lang.String): FocusPanel
  def setId(id: java.lang.String): FocusPanel
  def setLayoutData(layout: js.Object): FocusPanel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): FocusPanel
  def setSize(width: java.lang.String, height: java.lang.String): FocusPanel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): FocusPanel
  def setStyleAttributes(attributes: js.Object): FocusPanel
  def setStyleName(styleName: java.lang.String): FocusPanel
  def setStylePrimaryName(styleName: java.lang.String): FocusPanel
  def setTabIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): FocusPanel
  def setTag(tag: java.lang.String): FocusPanel
  def setTitle(title: java.lang.String): FocusPanel
  def setVisible(visible: scala.Boolean): FocusPanel
  def setWidget(widget: Widget): FocusPanel
  def setWidth(width: java.lang.String): FocusPanel
}

