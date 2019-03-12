package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushButton extends js.Object {
  def addBlurHandler(handler: Handler): PushButton
  def addClickHandler(handler: Handler): PushButton
  def addFocusHandler(handler: Handler): PushButton
  def addKeyDownHandler(handler: Handler): PushButton
  def addKeyPressHandler(handler: Handler): PushButton
  def addKeyUpHandler(handler: Handler): PushButton
  def addMouseDownHandler(handler: Handler): PushButton
  def addMouseMoveHandler(handler: Handler): PushButton
  def addMouseOutHandler(handler: Handler): PushButton
  def addMouseOverHandler(handler: Handler): PushButton
  def addMouseUpHandler(handler: Handler): PushButton
  def addMouseWheelHandler(handler: Handler): PushButton
  def addStyleDependentName(styleName: java.lang.String): PushButton
  def addStyleName(styleName: java.lang.String): PushButton
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAccessKey(accessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char): PushButton
  def setEnabled(enabled: scala.Boolean): PushButton
  def setFocus(focus: scala.Boolean): PushButton
  def setHTML(html: java.lang.String): PushButton
  def setHeight(height: java.lang.String): PushButton
  def setId(id: java.lang.String): PushButton
  def setLayoutData(layout: js.Object): PushButton
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): PushButton
  def setSize(width: java.lang.String, height: java.lang.String): PushButton
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): PushButton
  def setStyleAttributes(attributes: js.Object): PushButton
  def setStyleName(styleName: java.lang.String): PushButton
  def setStylePrimaryName(styleName: java.lang.String): PushButton
  def setTabIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): PushButton
  def setTag(tag: java.lang.String): PushButton
  def setText(text: java.lang.String): PushButton
  def setTitle(title: java.lang.String): PushButton
  def setVisible(visible: scala.Boolean): PushButton
  def setWidth(width: java.lang.String): PushButton
}

object PushButton {
  @scala.inline
  def apply(
    addBlurHandler: Handler => PushButton,
    addClickHandler: Handler => PushButton,
    addFocusHandler: Handler => PushButton,
    addKeyDownHandler: Handler => PushButton,
    addKeyPressHandler: Handler => PushButton,
    addKeyUpHandler: Handler => PushButton,
    addMouseDownHandler: Handler => PushButton,
    addMouseMoveHandler: Handler => PushButton,
    addMouseOutHandler: Handler => PushButton,
    addMouseOverHandler: Handler => PushButton,
    addMouseUpHandler: Handler => PushButton,
    addMouseWheelHandler: Handler => PushButton,
    addStyleDependentName: java.lang.String => PushButton,
    addStyleName: java.lang.String => PushButton,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setAccessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char => PushButton,
    setEnabled: scala.Boolean => PushButton,
    setFocus: scala.Boolean => PushButton,
    setHTML: java.lang.String => PushButton,
    setHeight: java.lang.String => PushButton,
    setId: java.lang.String => PushButton,
    setLayoutData: js.Object => PushButton,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => PushButton,
    setSize: (java.lang.String, java.lang.String) => PushButton,
    setStyleAttribute: (java.lang.String, java.lang.String) => PushButton,
    setStyleAttributes: js.Object => PushButton,
    setStyleName: java.lang.String => PushButton,
    setStylePrimaryName: java.lang.String => PushButton,
    setTabIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => PushButton,
    setTag: java.lang.String => PushButton,
    setText: java.lang.String => PushButton,
    setTitle: java.lang.String => PushButton,
    setVisible: scala.Boolean => PushButton,
    setWidth: java.lang.String => PushButton
  ): PushButton = {
    val __obj = js.Dynamic.literal(addBlurHandler = js.Any.fromFunction1(addBlurHandler), addClickHandler = js.Any.fromFunction1(addClickHandler), addFocusHandler = js.Any.fromFunction1(addFocusHandler), addKeyDownHandler = js.Any.fromFunction1(addKeyDownHandler), addKeyPressHandler = js.Any.fromFunction1(addKeyPressHandler), addKeyUpHandler = js.Any.fromFunction1(addKeyUpHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAccessKey = js.Any.fromFunction1(setAccessKey), setEnabled = js.Any.fromFunction1(setEnabled), setFocus = js.Any.fromFunction1(setFocus), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[PushButton]
  }
}

