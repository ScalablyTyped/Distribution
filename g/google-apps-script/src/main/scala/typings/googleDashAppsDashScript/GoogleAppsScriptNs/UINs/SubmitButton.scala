package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Char
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitButton extends js.Object {
  def addBlurHandler(handler: Handler): SubmitButton
  def addClickHandler(handler: Handler): SubmitButton
  def addFocusHandler(handler: Handler): SubmitButton
  def addKeyDownHandler(handler: Handler): SubmitButton
  def addKeyPressHandler(handler: Handler): SubmitButton
  def addKeyUpHandler(handler: Handler): SubmitButton
  def addMouseDownHandler(handler: Handler): SubmitButton
  def addMouseMoveHandler(handler: Handler): SubmitButton
  def addMouseOutHandler(handler: Handler): SubmitButton
  def addMouseOverHandler(handler: Handler): SubmitButton
  def addMouseUpHandler(handler: Handler): SubmitButton
  def addMouseWheelHandler(handler: Handler): SubmitButton
  def addStyleDependentName(styleName: String): SubmitButton
  def addStyleName(styleName: String): SubmitButton
  def getId(): String
  def getTag(): String
  def getType(): String
  def setAccessKey(accessKey: Char): SubmitButton
  def setEnabled(enabled: Boolean): SubmitButton
  def setFocus(focus: Boolean): SubmitButton
  def setHTML(html: String): SubmitButton
  def setHeight(height: String): SubmitButton
  def setId(id: String): SubmitButton
  def setLayoutData(layout: js.Any): SubmitButton
  def setPixelSize(width: Integer, height: Integer): SubmitButton
  def setSize(width: String, height: String): SubmitButton
  def setStyleAttribute(attribute: String, value: String): SubmitButton
  def setStyleAttributes(attributes: js.Any): SubmitButton
  def setStyleName(styleName: String): SubmitButton
  def setStylePrimaryName(styleName: String): SubmitButton
  def setTabIndex(index: Integer): SubmitButton
  def setTag(tag: String): SubmitButton
  def setText(text: String): SubmitButton
  def setTitle(title: String): SubmitButton
  def setVisible(visible: Boolean): SubmitButton
  def setWidth(width: String): SubmitButton
}

object SubmitButton {
  @scala.inline
  def apply(
    addBlurHandler: Handler => SubmitButton,
    addClickHandler: Handler => SubmitButton,
    addFocusHandler: Handler => SubmitButton,
    addKeyDownHandler: Handler => SubmitButton,
    addKeyPressHandler: Handler => SubmitButton,
    addKeyUpHandler: Handler => SubmitButton,
    addMouseDownHandler: Handler => SubmitButton,
    addMouseMoveHandler: Handler => SubmitButton,
    addMouseOutHandler: Handler => SubmitButton,
    addMouseOverHandler: Handler => SubmitButton,
    addMouseUpHandler: Handler => SubmitButton,
    addMouseWheelHandler: Handler => SubmitButton,
    addStyleDependentName: String => SubmitButton,
    addStyleName: String => SubmitButton,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setAccessKey: Char => SubmitButton,
    setEnabled: Boolean => SubmitButton,
    setFocus: Boolean => SubmitButton,
    setHTML: String => SubmitButton,
    setHeight: String => SubmitButton,
    setId: String => SubmitButton,
    setLayoutData: js.Any => SubmitButton,
    setPixelSize: (Integer, Integer) => SubmitButton,
    setSize: (String, String) => SubmitButton,
    setStyleAttribute: (String, String) => SubmitButton,
    setStyleAttributes: js.Any => SubmitButton,
    setStyleName: String => SubmitButton,
    setStylePrimaryName: String => SubmitButton,
    setTabIndex: Integer => SubmitButton,
    setTag: String => SubmitButton,
    setText: String => SubmitButton,
    setTitle: String => SubmitButton,
    setVisible: Boolean => SubmitButton,
    setWidth: String => SubmitButton
  ): SubmitButton = {
    val __obj = js.Dynamic.literal(addBlurHandler = js.Any.fromFunction1(addBlurHandler), addClickHandler = js.Any.fromFunction1(addClickHandler), addFocusHandler = js.Any.fromFunction1(addFocusHandler), addKeyDownHandler = js.Any.fromFunction1(addKeyDownHandler), addKeyPressHandler = js.Any.fromFunction1(addKeyPressHandler), addKeyUpHandler = js.Any.fromFunction1(addKeyUpHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAccessKey = js.Any.fromFunction1(setAccessKey), setEnabled = js.Any.fromFunction1(setEnabled), setFocus = js.Any.fromFunction1(setFocus), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[SubmitButton]
  }
}

