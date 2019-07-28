package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Char
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
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
  def addStyleDependentName(styleName: String): Button
  def addStyleName(styleName: String): Button
  def getId(): String
  def getTag(): String
  def getType(): String
  def setAccessKey(accessKey: Char): Button
  def setEnabled(enabled: Boolean): Button
  def setFocus(focus: Boolean): Button
  def setHTML(html: String): Button
  def setHeight(height: String): Button
  def setId(id: String): Button
  def setLayoutData(layout: js.Any): Button
  def setPixelSize(width: Integer, height: Integer): Button
  def setSize(width: String, height: String): Button
  def setStyleAttribute(attribute: String, value: String): Button
  def setStyleAttributes(attributes: js.Any): Button
  def setStyleName(styleName: String): Button
  def setStylePrimaryName(styleName: String): Button
  def setTabIndex(index: Integer): Button
  def setTag(tag: String): Button
  def setText(text: String): Button
  def setTitle(title: String): Button
  def setVisible(visible: Boolean): Button
  def setWidth(width: String): Button
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
    addStyleDependentName: String => Button,
    addStyleName: String => Button,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setAccessKey: Char => Button,
    setEnabled: Boolean => Button,
    setFocus: Boolean => Button,
    setHTML: String => Button,
    setHeight: String => Button,
    setId: String => Button,
    setLayoutData: js.Any => Button,
    setPixelSize: (Integer, Integer) => Button,
    setSize: (String, String) => Button,
    setStyleAttribute: (String, String) => Button,
    setStyleAttributes: js.Any => Button,
    setStyleName: String => Button,
    setStylePrimaryName: String => Button,
    setTabIndex: Integer => Button,
    setTag: String => Button,
    setText: String => Button,
    setTitle: String => Button,
    setVisible: Boolean => Button,
    setWidth: String => Button
  ): Button = {
    val __obj = js.Dynamic.literal(addBlurHandler = js.Any.fromFunction1(addBlurHandler), addClickHandler = js.Any.fromFunction1(addClickHandler), addFocusHandler = js.Any.fromFunction1(addFocusHandler), addKeyDownHandler = js.Any.fromFunction1(addKeyDownHandler), addKeyPressHandler = js.Any.fromFunction1(addKeyPressHandler), addKeyUpHandler = js.Any.fromFunction1(addKeyUpHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAccessKey = js.Any.fromFunction1(setAccessKey), setEnabled = js.Any.fromFunction1(setEnabled), setFocus = js.Any.fromFunction1(setFocus), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[Button]
  }
}

