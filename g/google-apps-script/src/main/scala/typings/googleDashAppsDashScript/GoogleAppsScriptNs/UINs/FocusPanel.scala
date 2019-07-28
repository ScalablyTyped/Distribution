package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Char
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusPanel extends js.Object {
  def add(widget: Widget): FocusPanel
  def addBlurHandler(handler: Handler): FocusPanel
  def addClickHandler(handler: Handler): FocusPanel
  def addFocusHandler(handler: Handler): FocusPanel
  def addKeyDownHandler(handler: Handler): FocusPanel
  def addKeyPressHandler(handler: Handler): FocusPanel
  def addKeyUpHandler(handler: Handler): FocusPanel
  def addMouseDownHandler(handler: Handler): FocusPanel
  def addMouseMoveHandler(handler: Handler): FocusPanel
  def addMouseOutHandler(handler: Handler): FocusPanel
  def addMouseOverHandler(handler: Handler): FocusPanel
  def addMouseUpHandler(handler: Handler): FocusPanel
  def addMouseWheelHandler(handler: Handler): FocusPanel
  def addStyleDependentName(styleName: String): FocusPanel
  def addStyleName(styleName: String): FocusPanel
  def clear(): FocusPanel
  def getId(): String
  def getTag(): String
  def getType(): String
  def setAccessKey(accessKey: Char): FocusPanel
  def setFocus(focus: Boolean): FocusPanel
  def setHeight(height: String): FocusPanel
  def setId(id: String): FocusPanel
  def setLayoutData(layout: js.Any): FocusPanel
  def setPixelSize(width: Integer, height: Integer): FocusPanel
  def setSize(width: String, height: String): FocusPanel
  def setStyleAttribute(attribute: String, value: String): FocusPanel
  def setStyleAttributes(attributes: js.Any): FocusPanel
  def setStyleName(styleName: String): FocusPanel
  def setStylePrimaryName(styleName: String): FocusPanel
  def setTabIndex(index: Integer): FocusPanel
  def setTag(tag: String): FocusPanel
  def setTitle(title: String): FocusPanel
  def setVisible(visible: Boolean): FocusPanel
  def setWidget(widget: Widget): FocusPanel
  def setWidth(width: String): FocusPanel
}

object FocusPanel {
  @scala.inline
  def apply(
    add: Widget => FocusPanel,
    addBlurHandler: Handler => FocusPanel,
    addClickHandler: Handler => FocusPanel,
    addFocusHandler: Handler => FocusPanel,
    addKeyDownHandler: Handler => FocusPanel,
    addKeyPressHandler: Handler => FocusPanel,
    addKeyUpHandler: Handler => FocusPanel,
    addMouseDownHandler: Handler => FocusPanel,
    addMouseMoveHandler: Handler => FocusPanel,
    addMouseOutHandler: Handler => FocusPanel,
    addMouseOverHandler: Handler => FocusPanel,
    addMouseUpHandler: Handler => FocusPanel,
    addMouseWheelHandler: Handler => FocusPanel,
    addStyleDependentName: String => FocusPanel,
    addStyleName: String => FocusPanel,
    clear: () => FocusPanel,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setAccessKey: Char => FocusPanel,
    setFocus: Boolean => FocusPanel,
    setHeight: String => FocusPanel,
    setId: String => FocusPanel,
    setLayoutData: js.Any => FocusPanel,
    setPixelSize: (Integer, Integer) => FocusPanel,
    setSize: (String, String) => FocusPanel,
    setStyleAttribute: (String, String) => FocusPanel,
    setStyleAttributes: js.Any => FocusPanel,
    setStyleName: String => FocusPanel,
    setStylePrimaryName: String => FocusPanel,
    setTabIndex: Integer => FocusPanel,
    setTag: String => FocusPanel,
    setTitle: String => FocusPanel,
    setVisible: Boolean => FocusPanel,
    setWidget: Widget => FocusPanel,
    setWidth: String => FocusPanel
  ): FocusPanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addBlurHandler = js.Any.fromFunction1(addBlurHandler), addClickHandler = js.Any.fromFunction1(addClickHandler), addFocusHandler = js.Any.fromFunction1(addFocusHandler), addKeyDownHandler = js.Any.fromFunction1(addKeyDownHandler), addKeyPressHandler = js.Any.fromFunction1(addKeyPressHandler), addKeyUpHandler = js.Any.fromFunction1(addKeyUpHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAccessKey = js.Any.fromFunction1(setAccessKey), setFocus = js.Any.fromFunction1(setFocus), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[FocusPanel]
  }
}

