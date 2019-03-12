package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleButton extends js.Object {
  def addBlurHandler(handler: Handler): ToggleButton
  def addClickHandler(handler: Handler): ToggleButton
  def addFocusHandler(handler: Handler): ToggleButton
  def addKeyDownHandler(handler: Handler): ToggleButton
  def addKeyPressHandler(handler: Handler): ToggleButton
  def addKeyUpHandler(handler: Handler): ToggleButton
  def addMouseDownHandler(handler: Handler): ToggleButton
  def addMouseMoveHandler(handler: Handler): ToggleButton
  def addMouseOutHandler(handler: Handler): ToggleButton
  def addMouseOverHandler(handler: Handler): ToggleButton
  def addMouseUpHandler(handler: Handler): ToggleButton
  def addMouseWheelHandler(handler: Handler): ToggleButton
  def addStyleDependentName(styleName: java.lang.String): ToggleButton
  def addStyleName(styleName: java.lang.String): ToggleButton
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAccessKey(accessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char): ToggleButton
  def setDown(down: scala.Boolean): ToggleButton
  def setEnabled(enabled: scala.Boolean): ToggleButton
  def setFocus(focus: scala.Boolean): ToggleButton
  def setHTML(html: java.lang.String): ToggleButton
  def setHeight(height: java.lang.String): ToggleButton
  def setId(id: java.lang.String): ToggleButton
  def setLayoutData(layout: js.Object): ToggleButton
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ToggleButton
  def setSize(width: java.lang.String, height: java.lang.String): ToggleButton
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): ToggleButton
  def setStyleAttributes(attributes: js.Object): ToggleButton
  def setStyleName(styleName: java.lang.String): ToggleButton
  def setStylePrimaryName(styleName: java.lang.String): ToggleButton
  def setTabIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ToggleButton
  def setTag(tag: java.lang.String): ToggleButton
  def setText(text: java.lang.String): ToggleButton
  def setTitle(title: java.lang.String): ToggleButton
  def setVisible(visible: scala.Boolean): ToggleButton
  def setWidth(width: java.lang.String): ToggleButton
}

object ToggleButton {
  @scala.inline
  def apply(
    addBlurHandler: Handler => ToggleButton,
    addClickHandler: Handler => ToggleButton,
    addFocusHandler: Handler => ToggleButton,
    addKeyDownHandler: Handler => ToggleButton,
    addKeyPressHandler: Handler => ToggleButton,
    addKeyUpHandler: Handler => ToggleButton,
    addMouseDownHandler: Handler => ToggleButton,
    addMouseMoveHandler: Handler => ToggleButton,
    addMouseOutHandler: Handler => ToggleButton,
    addMouseOverHandler: Handler => ToggleButton,
    addMouseUpHandler: Handler => ToggleButton,
    addMouseWheelHandler: Handler => ToggleButton,
    addStyleDependentName: java.lang.String => ToggleButton,
    addStyleName: java.lang.String => ToggleButton,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setAccessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char => ToggleButton,
    setDown: scala.Boolean => ToggleButton,
    setEnabled: scala.Boolean => ToggleButton,
    setFocus: scala.Boolean => ToggleButton,
    setHTML: java.lang.String => ToggleButton,
    setHeight: java.lang.String => ToggleButton,
    setId: java.lang.String => ToggleButton,
    setLayoutData: js.Object => ToggleButton,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => ToggleButton,
    setSize: (java.lang.String, java.lang.String) => ToggleButton,
    setStyleAttribute: (java.lang.String, java.lang.String) => ToggleButton,
    setStyleAttributes: js.Object => ToggleButton,
    setStyleName: java.lang.String => ToggleButton,
    setStylePrimaryName: java.lang.String => ToggleButton,
    setTabIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ToggleButton,
    setTag: java.lang.String => ToggleButton,
    setText: java.lang.String => ToggleButton,
    setTitle: java.lang.String => ToggleButton,
    setVisible: scala.Boolean => ToggleButton,
    setWidth: java.lang.String => ToggleButton
  ): ToggleButton = {
    val __obj = js.Dynamic.literal(addBlurHandler = js.Any.fromFunction1(addBlurHandler), addClickHandler = js.Any.fromFunction1(addClickHandler), addFocusHandler = js.Any.fromFunction1(addFocusHandler), addKeyDownHandler = js.Any.fromFunction1(addKeyDownHandler), addKeyPressHandler = js.Any.fromFunction1(addKeyPressHandler), addKeyUpHandler = js.Any.fromFunction1(addKeyUpHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAccessKey = js.Any.fromFunction1(setAccessKey), setDown = js.Any.fromFunction1(setDown), setEnabled = js.Any.fromFunction1(setEnabled), setFocus = js.Any.fromFunction1(setFocus), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[ToggleButton]
  }
}

