package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Char
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleCheckBox extends js.Object {
  def addBlurHandler(handler: Handler): SimpleCheckBox
  def addClickHandler(handler: Handler): SimpleCheckBox
  def addFocusHandler(handler: Handler): SimpleCheckBox
  def addKeyDownHandler(handler: Handler): SimpleCheckBox
  def addKeyPressHandler(handler: Handler): SimpleCheckBox
  def addKeyUpHandler(handler: Handler): SimpleCheckBox
  def addMouseDownHandler(handler: Handler): SimpleCheckBox
  def addMouseMoveHandler(handler: Handler): SimpleCheckBox
  def addMouseOutHandler(handler: Handler): SimpleCheckBox
  def addMouseOverHandler(handler: Handler): SimpleCheckBox
  def addMouseUpHandler(handler: Handler): SimpleCheckBox
  def addMouseWheelHandler(handler: Handler): SimpleCheckBox
  def addStyleDependentName(styleName: String): SimpleCheckBox
  def addStyleName(styleName: String): SimpleCheckBox
  def getId(): String
  def getTag(): String
  def getType(): String
  def setAccessKey(accessKey: Char): SimpleCheckBox
  def setChecked(checked: Boolean): SimpleCheckBox
  def setEnabled(enabled: Boolean): SimpleCheckBox
  def setFocus(focus: Boolean): SimpleCheckBox
  def setHeight(height: String): SimpleCheckBox
  def setId(id: String): SimpleCheckBox
  def setLayoutData(layout: js.Any): SimpleCheckBox
  def setName(name: String): SimpleCheckBox
  def setPixelSize(width: Integer, height: Integer): SimpleCheckBox
  def setSize(width: String, height: String): SimpleCheckBox
  def setStyleAttribute(attribute: String, value: String): SimpleCheckBox
  def setStyleAttributes(attributes: js.Any): SimpleCheckBox
  def setStyleName(styleName: String): SimpleCheckBox
  def setStylePrimaryName(styleName: String): SimpleCheckBox
  def setTabIndex(index: Integer): SimpleCheckBox
  def setTag(tag: String): SimpleCheckBox
  def setTitle(title: String): SimpleCheckBox
  def setVisible(visible: Boolean): SimpleCheckBox
  def setWidth(width: String): SimpleCheckBox
}

object SimpleCheckBox {
  @scala.inline
  def apply(
    addBlurHandler: Handler => SimpleCheckBox,
    addClickHandler: Handler => SimpleCheckBox,
    addFocusHandler: Handler => SimpleCheckBox,
    addKeyDownHandler: Handler => SimpleCheckBox,
    addKeyPressHandler: Handler => SimpleCheckBox,
    addKeyUpHandler: Handler => SimpleCheckBox,
    addMouseDownHandler: Handler => SimpleCheckBox,
    addMouseMoveHandler: Handler => SimpleCheckBox,
    addMouseOutHandler: Handler => SimpleCheckBox,
    addMouseOverHandler: Handler => SimpleCheckBox,
    addMouseUpHandler: Handler => SimpleCheckBox,
    addMouseWheelHandler: Handler => SimpleCheckBox,
    addStyleDependentName: String => SimpleCheckBox,
    addStyleName: String => SimpleCheckBox,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setAccessKey: Char => SimpleCheckBox,
    setChecked: Boolean => SimpleCheckBox,
    setEnabled: Boolean => SimpleCheckBox,
    setFocus: Boolean => SimpleCheckBox,
    setHeight: String => SimpleCheckBox,
    setId: String => SimpleCheckBox,
    setLayoutData: js.Any => SimpleCheckBox,
    setName: String => SimpleCheckBox,
    setPixelSize: (Integer, Integer) => SimpleCheckBox,
    setSize: (String, String) => SimpleCheckBox,
    setStyleAttribute: (String, String) => SimpleCheckBox,
    setStyleAttributes: js.Any => SimpleCheckBox,
    setStyleName: String => SimpleCheckBox,
    setStylePrimaryName: String => SimpleCheckBox,
    setTabIndex: Integer => SimpleCheckBox,
    setTag: String => SimpleCheckBox,
    setTitle: String => SimpleCheckBox,
    setVisible: Boolean => SimpleCheckBox,
    setWidth: String => SimpleCheckBox
  ): SimpleCheckBox = {
    val __obj = js.Dynamic.literal(addBlurHandler = js.Any.fromFunction1(addBlurHandler), addClickHandler = js.Any.fromFunction1(addClickHandler), addFocusHandler = js.Any.fromFunction1(addFocusHandler), addKeyDownHandler = js.Any.fromFunction1(addKeyDownHandler), addKeyPressHandler = js.Any.fromFunction1(addKeyPressHandler), addKeyUpHandler = js.Any.fromFunction1(addKeyUpHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAccessKey = js.Any.fromFunction1(setAccessKey), setChecked = js.Any.fromFunction1(setChecked), setEnabled = js.Any.fromFunction1(setEnabled), setFocus = js.Any.fromFunction1(setFocus), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setName = js.Any.fromFunction1(setName), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[SimpleCheckBox]
  }
}

