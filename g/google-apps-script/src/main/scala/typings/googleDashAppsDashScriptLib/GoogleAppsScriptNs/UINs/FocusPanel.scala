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
    add: js.Function1[Widget, FocusPanel],
    addBlurHandler: js.Function1[Handler, FocusPanel],
    addClickHandler: js.Function1[Handler, FocusPanel],
    addFocusHandler: js.Function1[Handler, FocusPanel],
    addKeyDownHandler: js.Function1[Handler, FocusPanel],
    addKeyPressHandler: js.Function1[Handler, FocusPanel],
    addKeyUpHandler: js.Function1[Handler, FocusPanel],
    addMouseDownHandler: js.Function1[Handler, FocusPanel],
    addMouseMoveHandler: js.Function1[Handler, FocusPanel],
    addMouseOutHandler: js.Function1[Handler, FocusPanel],
    addMouseOverHandler: js.Function1[Handler, FocusPanel],
    addMouseUpHandler: js.Function1[Handler, FocusPanel],
    addMouseWheelHandler: js.Function1[Handler, FocusPanel],
    addStyleDependentName: js.Function1[java.lang.String, FocusPanel],
    addStyleName: js.Function1[java.lang.String, FocusPanel],
    clear: js.Function0[FocusPanel],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setAccessKey: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char, FocusPanel],
    setFocus: js.Function1[scala.Boolean, FocusPanel],
    setHeight: js.Function1[java.lang.String, FocusPanel],
    setId: js.Function1[java.lang.String, FocusPanel],
    setLayoutData: js.Function1[js.Object, FocusPanel],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      FocusPanel
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, FocusPanel],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, FocusPanel],
    setStyleAttributes: js.Function1[js.Object, FocusPanel],
    setStyleName: js.Function1[java.lang.String, FocusPanel],
    setStylePrimaryName: js.Function1[java.lang.String, FocusPanel],
    setTabIndex: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, FocusPanel],
    setTag: js.Function1[java.lang.String, FocusPanel],
    setTitle: js.Function1[java.lang.String, FocusPanel],
    setVisible: js.Function1[scala.Boolean, FocusPanel],
    setWidget: js.Function1[Widget, FocusPanel],
    setWidth: js.Function1[java.lang.String, FocusPanel]
  ): FocusPanel = {
    val __obj = js.Dynamic.literal(add = add, addBlurHandler = addBlurHandler, addClickHandler = addClickHandler, addFocusHandler = addFocusHandler, addKeyDownHandler = addKeyDownHandler, addKeyPressHandler = addKeyPressHandler, addKeyUpHandler = addKeyUpHandler, addMouseDownHandler = addMouseDownHandler, addMouseMoveHandler = addMouseMoveHandler, addMouseOutHandler = addMouseOutHandler, addMouseOverHandler = addMouseOverHandler, addMouseUpHandler = addMouseUpHandler, addMouseWheelHandler = addMouseWheelHandler, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, clear = clear, getId = getId, getTag = getTag, getType = getType, setAccessKey = setAccessKey, setFocus = setFocus, setHeight = setHeight, setId = setId, setLayoutData = setLayoutData, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTabIndex = setTabIndex, setTag = setTag, setTitle = setTitle, setVisible = setVisible, setWidget = setWidget, setWidth = setWidth)
  
    __obj.asInstanceOf[FocusPanel]
  }
}

