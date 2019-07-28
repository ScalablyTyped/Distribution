package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Char
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetButton extends js.Object {
  def addBlurHandler(handler: Handler): ResetButton
  def addClickHandler(handler: Handler): ResetButton
  def addFocusHandler(handler: Handler): ResetButton
  def addKeyDownHandler(handler: Handler): ResetButton
  def addKeyPressHandler(handler: Handler): ResetButton
  def addKeyUpHandler(handler: Handler): ResetButton
  def addMouseDownHandler(handler: Handler): ResetButton
  def addMouseMoveHandler(handler: Handler): ResetButton
  def addMouseOutHandler(handler: Handler): ResetButton
  def addMouseOverHandler(handler: Handler): ResetButton
  def addMouseUpHandler(handler: Handler): ResetButton
  def addMouseWheelHandler(handler: Handler): ResetButton
  def addStyleDependentName(styleName: String): ResetButton
  def addStyleName(styleName: String): ResetButton
  def getId(): String
  def getTag(): String
  def getType(): String
  def setAccessKey(accessKey: Char): ResetButton
  def setEnabled(enabled: Boolean): ResetButton
  def setFocus(focus: Boolean): ResetButton
  def setHTML(html: String): ResetButton
  def setHeight(height: String): ResetButton
  def setId(id: String): ResetButton
  def setLayoutData(layout: js.Any): ResetButton
  def setPixelSize(width: Integer, height: Integer): ResetButton
  def setSize(width: String, height: String): ResetButton
  def setStyleAttribute(attribute: String, value: String): ResetButton
  def setStyleAttributes(attributes: js.Any): ResetButton
  def setStyleName(styleName: String): ResetButton
  def setStylePrimaryName(styleName: String): ResetButton
  def setTabIndex(index: Integer): ResetButton
  def setTag(tag: String): ResetButton
  def setText(text: String): ResetButton
  def setTitle(title: String): ResetButton
  def setVisible(visible: Boolean): ResetButton
  def setWidth(width: String): ResetButton
}

object ResetButton {
  @scala.inline
  def apply(
    addBlurHandler: Handler => ResetButton,
    addClickHandler: Handler => ResetButton,
    addFocusHandler: Handler => ResetButton,
    addKeyDownHandler: Handler => ResetButton,
    addKeyPressHandler: Handler => ResetButton,
    addKeyUpHandler: Handler => ResetButton,
    addMouseDownHandler: Handler => ResetButton,
    addMouseMoveHandler: Handler => ResetButton,
    addMouseOutHandler: Handler => ResetButton,
    addMouseOverHandler: Handler => ResetButton,
    addMouseUpHandler: Handler => ResetButton,
    addMouseWheelHandler: Handler => ResetButton,
    addStyleDependentName: String => ResetButton,
    addStyleName: String => ResetButton,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setAccessKey: Char => ResetButton,
    setEnabled: Boolean => ResetButton,
    setFocus: Boolean => ResetButton,
    setHTML: String => ResetButton,
    setHeight: String => ResetButton,
    setId: String => ResetButton,
    setLayoutData: js.Any => ResetButton,
    setPixelSize: (Integer, Integer) => ResetButton,
    setSize: (String, String) => ResetButton,
    setStyleAttribute: (String, String) => ResetButton,
    setStyleAttributes: js.Any => ResetButton,
    setStyleName: String => ResetButton,
    setStylePrimaryName: String => ResetButton,
    setTabIndex: Integer => ResetButton,
    setTag: String => ResetButton,
    setText: String => ResetButton,
    setTitle: String => ResetButton,
    setVisible: Boolean => ResetButton,
    setWidth: String => ResetButton
  ): ResetButton = {
    val __obj = js.Dynamic.literal(addBlurHandler = js.Any.fromFunction1(addBlurHandler), addClickHandler = js.Any.fromFunction1(addClickHandler), addFocusHandler = js.Any.fromFunction1(addFocusHandler), addKeyDownHandler = js.Any.fromFunction1(addKeyDownHandler), addKeyPressHandler = js.Any.fromFunction1(addKeyPressHandler), addKeyUpHandler = js.Any.fromFunction1(addKeyUpHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAccessKey = js.Any.fromFunction1(setAccessKey), setEnabled = js.Any.fromFunction1(setEnabled), setFocus = js.Any.fromFunction1(setFocus), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[ResetButton]
  }
}

