package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Char
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleRadioButton extends js.Object {
  def addBlurHandler(handler: Handler): SimpleRadioButton
  def addClickHandler(handler: Handler): SimpleRadioButton
  def addFocusHandler(handler: Handler): SimpleRadioButton
  def addKeyDownHandler(handler: Handler): SimpleRadioButton
  def addKeyPressHandler(handler: Handler): SimpleRadioButton
  def addKeyUpHandler(handler: Handler): SimpleRadioButton
  def addMouseDownHandler(handler: Handler): SimpleRadioButton
  def addMouseMoveHandler(handler: Handler): SimpleRadioButton
  def addMouseOutHandler(handler: Handler): SimpleRadioButton
  def addMouseOverHandler(handler: Handler): SimpleRadioButton
  def addMouseUpHandler(handler: Handler): SimpleRadioButton
  def addMouseWheelHandler(handler: Handler): SimpleRadioButton
  def addStyleDependentName(styleName: String): SimpleRadioButton
  def addStyleName(styleName: String): SimpleRadioButton
  def getId(): String
  def getTag(): String
  def getType(): String
  def setAccessKey(accessKey: Char): SimpleRadioButton
  def setChecked(checked: Boolean): SimpleRadioButton
  def setEnabled(enabled: Boolean): SimpleRadioButton
  def setFocus(focus: Boolean): SimpleRadioButton
  def setHeight(height: String): SimpleRadioButton
  def setId(id: String): SimpleRadioButton
  def setLayoutData(layout: js.Any): SimpleRadioButton
  def setName(name: String): SimpleRadioButton
  def setPixelSize(width: Integer, height: Integer): SimpleRadioButton
  def setSize(width: String, height: String): SimpleRadioButton
  def setStyleAttribute(attribute: String, value: String): SimpleRadioButton
  def setStyleAttributes(attributes: js.Any): SimpleRadioButton
  def setStyleName(styleName: String): SimpleRadioButton
  def setStylePrimaryName(styleName: String): SimpleRadioButton
  def setTabIndex(index: Integer): SimpleRadioButton
  def setTag(tag: String): SimpleRadioButton
  def setTitle(title: String): SimpleRadioButton
  def setVisible(visible: Boolean): SimpleRadioButton
  def setWidth(width: String): SimpleRadioButton
}

object SimpleRadioButton {
  @scala.inline
  def apply(
    addBlurHandler: Handler => SimpleRadioButton,
    addClickHandler: Handler => SimpleRadioButton,
    addFocusHandler: Handler => SimpleRadioButton,
    addKeyDownHandler: Handler => SimpleRadioButton,
    addKeyPressHandler: Handler => SimpleRadioButton,
    addKeyUpHandler: Handler => SimpleRadioButton,
    addMouseDownHandler: Handler => SimpleRadioButton,
    addMouseMoveHandler: Handler => SimpleRadioButton,
    addMouseOutHandler: Handler => SimpleRadioButton,
    addMouseOverHandler: Handler => SimpleRadioButton,
    addMouseUpHandler: Handler => SimpleRadioButton,
    addMouseWheelHandler: Handler => SimpleRadioButton,
    addStyleDependentName: String => SimpleRadioButton,
    addStyleName: String => SimpleRadioButton,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setAccessKey: Char => SimpleRadioButton,
    setChecked: Boolean => SimpleRadioButton,
    setEnabled: Boolean => SimpleRadioButton,
    setFocus: Boolean => SimpleRadioButton,
    setHeight: String => SimpleRadioButton,
    setId: String => SimpleRadioButton,
    setLayoutData: js.Any => SimpleRadioButton,
    setName: String => SimpleRadioButton,
    setPixelSize: (Integer, Integer) => SimpleRadioButton,
    setSize: (String, String) => SimpleRadioButton,
    setStyleAttribute: (String, String) => SimpleRadioButton,
    setStyleAttributes: js.Any => SimpleRadioButton,
    setStyleName: String => SimpleRadioButton,
    setStylePrimaryName: String => SimpleRadioButton,
    setTabIndex: Integer => SimpleRadioButton,
    setTag: String => SimpleRadioButton,
    setTitle: String => SimpleRadioButton,
    setVisible: Boolean => SimpleRadioButton,
    setWidth: String => SimpleRadioButton
  ): SimpleRadioButton = {
    val __obj = js.Dynamic.literal(addBlurHandler = js.Any.fromFunction1(addBlurHandler), addClickHandler = js.Any.fromFunction1(addClickHandler), addFocusHandler = js.Any.fromFunction1(addFocusHandler), addKeyDownHandler = js.Any.fromFunction1(addKeyDownHandler), addKeyPressHandler = js.Any.fromFunction1(addKeyPressHandler), addKeyUpHandler = js.Any.fromFunction1(addKeyUpHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAccessKey = js.Any.fromFunction1(setAccessKey), setChecked = js.Any.fromFunction1(setChecked), setEnabled = js.Any.fromFunction1(setEnabled), setFocus = js.Any.fromFunction1(setFocus), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setName = js.Any.fromFunction1(setName), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[SimpleRadioButton]
  }
}

