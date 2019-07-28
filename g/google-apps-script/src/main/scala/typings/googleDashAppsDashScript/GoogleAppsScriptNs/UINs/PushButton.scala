package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Char
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
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
  def addStyleDependentName(styleName: String): PushButton
  def addStyleName(styleName: String): PushButton
  def getId(): String
  def getTag(): String
  def getType(): String
  def setAccessKey(accessKey: Char): PushButton
  def setEnabled(enabled: Boolean): PushButton
  def setFocus(focus: Boolean): PushButton
  def setHTML(html: String): PushButton
  def setHeight(height: String): PushButton
  def setId(id: String): PushButton
  def setLayoutData(layout: js.Any): PushButton
  def setPixelSize(width: Integer, height: Integer): PushButton
  def setSize(width: String, height: String): PushButton
  def setStyleAttribute(attribute: String, value: String): PushButton
  def setStyleAttributes(attributes: js.Any): PushButton
  def setStyleName(styleName: String): PushButton
  def setStylePrimaryName(styleName: String): PushButton
  def setTabIndex(index: Integer): PushButton
  def setTag(tag: String): PushButton
  def setText(text: String): PushButton
  def setTitle(title: String): PushButton
  def setVisible(visible: Boolean): PushButton
  def setWidth(width: String): PushButton
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
    addStyleDependentName: String => PushButton,
    addStyleName: String => PushButton,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setAccessKey: Char => PushButton,
    setEnabled: Boolean => PushButton,
    setFocus: Boolean => PushButton,
    setHTML: String => PushButton,
    setHeight: String => PushButton,
    setId: String => PushButton,
    setLayoutData: js.Any => PushButton,
    setPixelSize: (Integer, Integer) => PushButton,
    setSize: (String, String) => PushButton,
    setStyleAttribute: (String, String) => PushButton,
    setStyleAttributes: js.Any => PushButton,
    setStyleName: String => PushButton,
    setStylePrimaryName: String => PushButton,
    setTabIndex: Integer => PushButton,
    setTag: String => PushButton,
    setText: String => PushButton,
    setTitle: String => PushButton,
    setVisible: Boolean => PushButton,
    setWidth: String => PushButton
  ): PushButton = {
    val __obj = js.Dynamic.literal(addBlurHandler = js.Any.fromFunction1(addBlurHandler), addClickHandler = js.Any.fromFunction1(addClickHandler), addFocusHandler = js.Any.fromFunction1(addFocusHandler), addKeyDownHandler = js.Any.fromFunction1(addKeyDownHandler), addKeyPressHandler = js.Any.fromFunction1(addKeyPressHandler), addKeyUpHandler = js.Any.fromFunction1(addKeyUpHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAccessKey = js.Any.fromFunction1(setAccessKey), setEnabled = js.Any.fromFunction1(setEnabled), setFocus = js.Any.fromFunction1(setFocus), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[PushButton]
  }
}

