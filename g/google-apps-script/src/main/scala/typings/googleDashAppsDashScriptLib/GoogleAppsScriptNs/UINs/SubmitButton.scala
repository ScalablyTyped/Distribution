package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

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
  def addStyleDependentName(styleName: java.lang.String): SubmitButton
  def addStyleName(styleName: java.lang.String): SubmitButton
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAccessKey(accessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char): SubmitButton
  def setEnabled(enabled: scala.Boolean): SubmitButton
  def setFocus(focus: scala.Boolean): SubmitButton
  def setHTML(html: java.lang.String): SubmitButton
  def setHeight(height: java.lang.String): SubmitButton
  def setId(id: java.lang.String): SubmitButton
  def setLayoutData(layout: js.Object): SubmitButton
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): SubmitButton
  def setSize(width: java.lang.String, height: java.lang.String): SubmitButton
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): SubmitButton
  def setStyleAttributes(attributes: js.Object): SubmitButton
  def setStyleName(styleName: java.lang.String): SubmitButton
  def setStylePrimaryName(styleName: java.lang.String): SubmitButton
  def setTabIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): SubmitButton
  def setTag(tag: java.lang.String): SubmitButton
  def setText(text: java.lang.String): SubmitButton
  def setTitle(title: java.lang.String): SubmitButton
  def setVisible(visible: scala.Boolean): SubmitButton
  def setWidth(width: java.lang.String): SubmitButton
}

object SubmitButton {
  @scala.inline
  def apply(
    addBlurHandler: js.Function1[Handler, SubmitButton],
    addClickHandler: js.Function1[Handler, SubmitButton],
    addFocusHandler: js.Function1[Handler, SubmitButton],
    addKeyDownHandler: js.Function1[Handler, SubmitButton],
    addKeyPressHandler: js.Function1[Handler, SubmitButton],
    addKeyUpHandler: js.Function1[Handler, SubmitButton],
    addMouseDownHandler: js.Function1[Handler, SubmitButton],
    addMouseMoveHandler: js.Function1[Handler, SubmitButton],
    addMouseOutHandler: js.Function1[Handler, SubmitButton],
    addMouseOverHandler: js.Function1[Handler, SubmitButton],
    addMouseUpHandler: js.Function1[Handler, SubmitButton],
    addMouseWheelHandler: js.Function1[Handler, SubmitButton],
    addStyleDependentName: js.Function1[java.lang.String, SubmitButton],
    addStyleName: js.Function1[java.lang.String, SubmitButton],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setAccessKey: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char, SubmitButton],
    setEnabled: js.Function1[scala.Boolean, SubmitButton],
    setFocus: js.Function1[scala.Boolean, SubmitButton],
    setHTML: js.Function1[java.lang.String, SubmitButton],
    setHeight: js.Function1[java.lang.String, SubmitButton],
    setId: js.Function1[java.lang.String, SubmitButton],
    setLayoutData: js.Function1[js.Object, SubmitButton],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      SubmitButton
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, SubmitButton],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, SubmitButton],
    setStyleAttributes: js.Function1[js.Object, SubmitButton],
    setStyleName: js.Function1[java.lang.String, SubmitButton],
    setStylePrimaryName: js.Function1[java.lang.String, SubmitButton],
    setTabIndex: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, SubmitButton],
    setTag: js.Function1[java.lang.String, SubmitButton],
    setText: js.Function1[java.lang.String, SubmitButton],
    setTitle: js.Function1[java.lang.String, SubmitButton],
    setVisible: js.Function1[scala.Boolean, SubmitButton],
    setWidth: js.Function1[java.lang.String, SubmitButton]
  ): SubmitButton = {
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
    __obj.asInstanceOf[SubmitButton]
  }
}

