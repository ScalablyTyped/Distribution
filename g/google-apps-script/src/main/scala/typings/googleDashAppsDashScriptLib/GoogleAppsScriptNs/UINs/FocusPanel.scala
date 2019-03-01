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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("addBlurHandler")(addBlurHandler)
    __obj.updateDynamic("addClickHandler")(addClickHandler)
    __obj.updateDynamic("addFocusHandler")(addFocusHandler)
    __obj.updateDynamic("addKeyDownHandler")(addKeyDownHandler)
    __obj.updateDynamic("addKeyPressHandler")(addKeyPressHandler)
    __obj.updateDynamic("addKeyUpHandler")(addKeyUpHandler)
    __obj.updateDynamic("addMouseDownHandler")(addMouseDownHandler)
    __obj.updateDynamic("addMouseMoveHandler")(addMouseMoveHandler)
    __obj.updateDynamic("addMouseOutHandler")(addMouseOutHandler)
    __obj.updateDynamic("addMouseOverHandler")(addMouseOverHandler)
    __obj.updateDynamic("addMouseUpHandler")(addMouseUpHandler)
    __obj.updateDynamic("addMouseWheelHandler")(addMouseWheelHandler)
    __obj.updateDynamic("addStyleDependentName")(addStyleDependentName)
    __obj.updateDynamic("addStyleName")(addStyleName)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getTag")(getTag)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("setAccessKey")(setAccessKey)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.updateDynamic("setHeight")(setHeight)
    __obj.updateDynamic("setId")(setId)
    __obj.updateDynamic("setLayoutData")(setLayoutData)
    __obj.updateDynamic("setPixelSize")(setPixelSize)
    __obj.updateDynamic("setSize")(setSize)
    __obj.updateDynamic("setStyleAttribute")(setStyleAttribute)
    __obj.updateDynamic("setStyleAttributes")(setStyleAttributes)
    __obj.updateDynamic("setStyleName")(setStyleName)
    __obj.updateDynamic("setStylePrimaryName")(setStylePrimaryName)
    __obj.updateDynamic("setTabIndex")(setTabIndex)
    __obj.updateDynamic("setTag")(setTag)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("setWidget")(setWidget)
    __obj.updateDynamic("setWidth")(setWidth)
    __obj.asInstanceOf[FocusPanel]
  }
}

