package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Char
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
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
  def addStyleDependentName(styleName: String): ToggleButton
  def addStyleName(styleName: String): ToggleButton
  def getId(): String
  def getTag(): String
  def getType(): String
  def setAccessKey(accessKey: Char): ToggleButton
  def setDown(down: Boolean): ToggleButton
  def setEnabled(enabled: Boolean): ToggleButton
  def setFocus(focus: Boolean): ToggleButton
  def setHTML(html: String): ToggleButton
  def setHeight(height: String): ToggleButton
  def setId(id: String): ToggleButton
  def setLayoutData(layout: js.Any): ToggleButton
  def setPixelSize(width: Integer, height: Integer): ToggleButton
  def setSize(width: String, height: String): ToggleButton
  def setStyleAttribute(attribute: String, value: String): ToggleButton
  def setStyleAttributes(attributes: js.Any): ToggleButton
  def setStyleName(styleName: String): ToggleButton
  def setStylePrimaryName(styleName: String): ToggleButton
  def setTabIndex(index: Integer): ToggleButton
  def setTag(tag: String): ToggleButton
  def setText(text: String): ToggleButton
  def setTitle(title: String): ToggleButton
  def setVisible(visible: Boolean): ToggleButton
  def setWidth(width: String): ToggleButton
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
    addStyleDependentName: String => ToggleButton,
    addStyleName: String => ToggleButton,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setAccessKey: Char => ToggleButton,
    setDown: Boolean => ToggleButton,
    setEnabled: Boolean => ToggleButton,
    setFocus: Boolean => ToggleButton,
    setHTML: String => ToggleButton,
    setHeight: String => ToggleButton,
    setId: String => ToggleButton,
    setLayoutData: js.Any => ToggleButton,
    setPixelSize: (Integer, Integer) => ToggleButton,
    setSize: (String, String) => ToggleButton,
    setStyleAttribute: (String, String) => ToggleButton,
    setStyleAttributes: js.Any => ToggleButton,
    setStyleName: String => ToggleButton,
    setStylePrimaryName: String => ToggleButton,
    setTabIndex: Integer => ToggleButton,
    setTag: String => ToggleButton,
    setText: String => ToggleButton,
    setTitle: String => ToggleButton,
    setVisible: Boolean => ToggleButton,
    setWidth: String => ToggleButton
  ): ToggleButton = {
    val __obj = js.Dynamic.literal(addBlurHandler = js.Any.fromFunction1(addBlurHandler), addClickHandler = js.Any.fromFunction1(addClickHandler), addFocusHandler = js.Any.fromFunction1(addFocusHandler), addKeyDownHandler = js.Any.fromFunction1(addKeyDownHandler), addKeyPressHandler = js.Any.fromFunction1(addKeyPressHandler), addKeyUpHandler = js.Any.fromFunction1(addKeyUpHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAccessKey = js.Any.fromFunction1(setAccessKey), setDown = js.Any.fromFunction1(setDown), setEnabled = js.Any.fromFunction1(setEnabled), setFocus = js.Any.fromFunction1(setFocus), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[ToggleButton]
  }
}

