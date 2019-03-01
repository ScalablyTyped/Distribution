package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

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
  def addStyleDependentName(styleName: java.lang.String): PushButton
  def addStyleName(styleName: java.lang.String): PushButton
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAccessKey(accessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char): PushButton
  def setEnabled(enabled: scala.Boolean): PushButton
  def setFocus(focus: scala.Boolean): PushButton
  def setHTML(html: java.lang.String): PushButton
  def setHeight(height: java.lang.String): PushButton
  def setId(id: java.lang.String): PushButton
  def setLayoutData(layout: js.Object): PushButton
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): PushButton
  def setSize(width: java.lang.String, height: java.lang.String): PushButton
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): PushButton
  def setStyleAttributes(attributes: js.Object): PushButton
  def setStyleName(styleName: java.lang.String): PushButton
  def setStylePrimaryName(styleName: java.lang.String): PushButton
  def setTabIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): PushButton
  def setTag(tag: java.lang.String): PushButton
  def setText(text: java.lang.String): PushButton
  def setTitle(title: java.lang.String): PushButton
  def setVisible(visible: scala.Boolean): PushButton
  def setWidth(width: java.lang.String): PushButton
}

object PushButton {
  @scala.inline
  def apply(
    addBlurHandler: js.Function1[Handler, PushButton],
    addClickHandler: js.Function1[Handler, PushButton],
    addFocusHandler: js.Function1[Handler, PushButton],
    addKeyDownHandler: js.Function1[Handler, PushButton],
    addKeyPressHandler: js.Function1[Handler, PushButton],
    addKeyUpHandler: js.Function1[Handler, PushButton],
    addMouseDownHandler: js.Function1[Handler, PushButton],
    addMouseMoveHandler: js.Function1[Handler, PushButton],
    addMouseOutHandler: js.Function1[Handler, PushButton],
    addMouseOverHandler: js.Function1[Handler, PushButton],
    addMouseUpHandler: js.Function1[Handler, PushButton],
    addMouseWheelHandler: js.Function1[Handler, PushButton],
    addStyleDependentName: js.Function1[java.lang.String, PushButton],
    addStyleName: js.Function1[java.lang.String, PushButton],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setAccessKey: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char, PushButton],
    setEnabled: js.Function1[scala.Boolean, PushButton],
    setFocus: js.Function1[scala.Boolean, PushButton],
    setHTML: js.Function1[java.lang.String, PushButton],
    setHeight: js.Function1[java.lang.String, PushButton],
    setId: js.Function1[java.lang.String, PushButton],
    setLayoutData: js.Function1[js.Object, PushButton],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      PushButton
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, PushButton],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, PushButton],
    setStyleAttributes: js.Function1[js.Object, PushButton],
    setStyleName: js.Function1[java.lang.String, PushButton],
    setStylePrimaryName: js.Function1[java.lang.String, PushButton],
    setTabIndex: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, PushButton],
    setTag: js.Function1[java.lang.String, PushButton],
    setText: js.Function1[java.lang.String, PushButton],
    setTitle: js.Function1[java.lang.String, PushButton],
    setVisible: js.Function1[scala.Boolean, PushButton],
    setWidth: js.Function1[java.lang.String, PushButton]
  ): PushButton = {
    val __obj = js.Dynamic.literal()
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
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getTag")(getTag)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("setAccessKey")(setAccessKey)
    __obj.updateDynamic("setEnabled")(setEnabled)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.updateDynamic("setHTML")(setHTML)
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
    __obj.updateDynamic("setText")(setText)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("setWidth")(setWidth)
    __obj.asInstanceOf[PushButton]
  }
}

