package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  def addBlurHandler(handler: Handler): Button
  def addClickHandler(handler: Handler): Button
  def addFocusHandler(handler: Handler): Button
  def addKeyDownHandler(handler: Handler): Button
  def addKeyPressHandler(handler: Handler): Button
  def addKeyUpHandler(handler: Handler): Button
  def addMouseDownHandler(handler: Handler): Button
  def addMouseMoveHandler(handler: Handler): Button
  def addMouseOutHandler(handler: Handler): Button
  def addMouseOverHandler(handler: Handler): Button
  def addMouseUpHandler(handler: Handler): Button
  def addMouseWheelHandler(handler: Handler): Button
  def addStyleDependentName(styleName: java.lang.String): Button
  def addStyleName(styleName: java.lang.String): Button
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAccessKey(accessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char): Button
  def setEnabled(enabled: scala.Boolean): Button
  def setFocus(focus: scala.Boolean): Button
  def setHTML(html: java.lang.String): Button
  def setHeight(height: java.lang.String): Button
  def setId(id: java.lang.String): Button
  def setLayoutData(layout: js.Any): Button
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Button
  def setSize(width: java.lang.String, height: java.lang.String): Button
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): Button
  def setStyleAttributes(attributes: js.Any): Button
  def setStyleName(styleName: java.lang.String): Button
  def setStylePrimaryName(styleName: java.lang.String): Button
  def setTabIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Button
  def setTag(tag: java.lang.String): Button
  def setText(text: java.lang.String): Button
  def setTitle(title: java.lang.String): Button
  def setVisible(visible: scala.Boolean): Button
  def setWidth(width: java.lang.String): Button
}

object Button {
  @scala.inline
  def apply(
    addBlurHandler: Handler => Button,
    addClickHandler: Handler => Button,
    addFocusHandler: Handler => Button,
    addKeyDownHandler: Handler => Button,
    addKeyPressHandler: Handler => Button,
    addKeyUpHandler: Handler => Button,
    addMouseDownHandler: Handler => Button,
    addMouseMoveHandler: Handler => Button,
    addMouseOutHandler: Handler => Button,
    addMouseOverHandler: Handler => Button,
    addMouseUpHandler: Handler => Button,
    addMouseWheelHandler: Handler => Button,
    addStyleDependentName: java.lang.String => Button,
    addStyleName: java.lang.String => Button,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setAccessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char => Button,
    setEnabled: scala.Boolean => Button,
    setFocus: scala.Boolean => Button,
    setHTML: java.lang.String => Button,
    setHeight: java.lang.String => Button,
    setId: java.lang.String => Button,
    setLayoutData: js.Any => Button,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => Button,
    setSize: (java.lang.String, java.lang.String) => Button,
    setStyleAttribute: (java.lang.String, java.lang.String) => Button,
    setStyleAttributes: js.Any => Button,
    setStyleName: java.lang.String => Button,
    setStylePrimaryName: java.lang.String => Button,
    setTabIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => Button,
    setTag: java.lang.String => Button,
    setText: java.lang.String => Button,
    setTitle: java.lang.String => Button,
    setVisible: scala.Boolean => Button,
    setWidth: java.lang.String => Button
  ): Button = {
    val __obj = js.Dynamic.literal(addBlurHandler = js.Any.fromFunction1(addBlurHandler), addClickHandler = js.Any.fromFunction1(addClickHandler), addFocusHandler = js.Any.fromFunction1(addFocusHandler), addKeyDownHandler = js.Any.fromFunction1(addKeyDownHandler), addKeyPressHandler = js.Any.fromFunction1(addKeyPressHandler), addKeyUpHandler = js.Any.fromFunction1(addKeyUpHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAccessKey = js.Any.fromFunction1(setAccessKey), setEnabled = js.Any.fromFunction1(setEnabled), setFocus = js.Any.fromFunction1(setFocus), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[Button]
  }
}

