package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

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
  def addStyleDependentName(styleName: java.lang.String): FocusPanel
  def addStyleName(styleName: java.lang.String): FocusPanel
  def clear(): FocusPanel
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAccessKey(accessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char): FocusPanel
  def setFocus(focus: scala.Boolean): FocusPanel
  def setHeight(height: java.lang.String): FocusPanel
  def setId(id: java.lang.String): FocusPanel
  def setLayoutData(layout: js.Object): FocusPanel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): FocusPanel
  def setSize(width: java.lang.String, height: java.lang.String): FocusPanel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): FocusPanel
  def setStyleAttributes(attributes: js.Object): FocusPanel
  def setStyleName(styleName: java.lang.String): FocusPanel
  def setStylePrimaryName(styleName: java.lang.String): FocusPanel
  def setTabIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): FocusPanel
  def setTag(tag: java.lang.String): FocusPanel
  def setTitle(title: java.lang.String): FocusPanel
  def setVisible(visible: scala.Boolean): FocusPanel
  def setWidget(widget: Widget): FocusPanel
  def setWidth(width: java.lang.String): FocusPanel
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
    addStyleDependentName: java.lang.String => FocusPanel,
    addStyleName: java.lang.String => FocusPanel,
    clear: () => FocusPanel,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setAccessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char => FocusPanel,
    setFocus: scala.Boolean => FocusPanel,
    setHeight: java.lang.String => FocusPanel,
    setId: java.lang.String => FocusPanel,
    setLayoutData: js.Object => FocusPanel,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => FocusPanel,
    setSize: (java.lang.String, java.lang.String) => FocusPanel,
    setStyleAttribute: (java.lang.String, java.lang.String) => FocusPanel,
    setStyleAttributes: js.Object => FocusPanel,
    setStyleName: java.lang.String => FocusPanel,
    setStylePrimaryName: java.lang.String => FocusPanel,
    setTabIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => FocusPanel,
    setTag: java.lang.String => FocusPanel,
    setTitle: java.lang.String => FocusPanel,
    setVisible: scala.Boolean => FocusPanel,
    setWidget: Widget => FocusPanel,
    setWidth: java.lang.String => FocusPanel
  ): FocusPanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addBlurHandler = js.Any.fromFunction1(addBlurHandler), addClickHandler = js.Any.fromFunction1(addClickHandler), addFocusHandler = js.Any.fromFunction1(addFocusHandler), addKeyDownHandler = js.Any.fromFunction1(addKeyDownHandler), addKeyPressHandler = js.Any.fromFunction1(addKeyPressHandler), addKeyUpHandler = js.Any.fromFunction1(addKeyUpHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setAccessKey = js.Any.fromFunction1(setAccessKey), setFocus = js.Any.fromFunction1(setFocus), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTabIndex = js.Any.fromFunction1(setTabIndex), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[FocusPanel]
  }
}

