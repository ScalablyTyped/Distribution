package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

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
  def addStyleDependentName(styleName: java.lang.String): ResetButton
  def addStyleName(styleName: java.lang.String): ResetButton
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAccessKey(accessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char): ResetButton
  def setEnabled(enabled: scala.Boolean): ResetButton
  def setFocus(focus: scala.Boolean): ResetButton
  def setHTML(html: java.lang.String): ResetButton
  def setHeight(height: java.lang.String): ResetButton
  def setId(id: java.lang.String): ResetButton
  def setLayoutData(layout: js.Object): ResetButton
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ResetButton
  def setSize(width: java.lang.String, height: java.lang.String): ResetButton
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): ResetButton
  def setStyleAttributes(attributes: js.Object): ResetButton
  def setStyleName(styleName: java.lang.String): ResetButton
  def setStylePrimaryName(styleName: java.lang.String): ResetButton
  def setTabIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ResetButton
  def setTag(tag: java.lang.String): ResetButton
  def setText(text: java.lang.String): ResetButton
  def setTitle(title: java.lang.String): ResetButton
  def setVisible(visible: scala.Boolean): ResetButton
  def setWidth(width: java.lang.String): ResetButton
}

object ResetButton {
  @scala.inline
  def apply(
    addBlurHandler: js.Function1[Handler, ResetButton],
    addClickHandler: js.Function1[Handler, ResetButton],
    addFocusHandler: js.Function1[Handler, ResetButton],
    addKeyDownHandler: js.Function1[Handler, ResetButton],
    addKeyPressHandler: js.Function1[Handler, ResetButton],
    addKeyUpHandler: js.Function1[Handler, ResetButton],
    addMouseDownHandler: js.Function1[Handler, ResetButton],
    addMouseMoveHandler: js.Function1[Handler, ResetButton],
    addMouseOutHandler: js.Function1[Handler, ResetButton],
    addMouseOverHandler: js.Function1[Handler, ResetButton],
    addMouseUpHandler: js.Function1[Handler, ResetButton],
    addMouseWheelHandler: js.Function1[Handler, ResetButton],
    addStyleDependentName: js.Function1[java.lang.String, ResetButton],
    addStyleName: js.Function1[java.lang.String, ResetButton],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setAccessKey: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char, ResetButton],
    setEnabled: js.Function1[scala.Boolean, ResetButton],
    setFocus: js.Function1[scala.Boolean, ResetButton],
    setHTML: js.Function1[java.lang.String, ResetButton],
    setHeight: js.Function1[java.lang.String, ResetButton],
    setId: js.Function1[java.lang.String, ResetButton],
    setLayoutData: js.Function1[js.Object, ResetButton],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      ResetButton
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, ResetButton],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, ResetButton],
    setStyleAttributes: js.Function1[js.Object, ResetButton],
    setStyleName: js.Function1[java.lang.String, ResetButton],
    setStylePrimaryName: js.Function1[java.lang.String, ResetButton],
    setTabIndex: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ResetButton],
    setTag: js.Function1[java.lang.String, ResetButton],
    setText: js.Function1[java.lang.String, ResetButton],
    setTitle: js.Function1[java.lang.String, ResetButton],
    setVisible: js.Function1[scala.Boolean, ResetButton],
    setWidth: js.Function1[java.lang.String, ResetButton]
  ): ResetButton = {
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
    __obj.asInstanceOf[ResetButton]
  }
}

