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
    val __obj = js.Dynamic.literal(addBlurHandler = addBlurHandler, addClickHandler = addClickHandler, addFocusHandler = addFocusHandler, addKeyDownHandler = addKeyDownHandler, addKeyPressHandler = addKeyPressHandler, addKeyUpHandler = addKeyUpHandler, addMouseDownHandler = addMouseDownHandler, addMouseMoveHandler = addMouseMoveHandler, addMouseOutHandler = addMouseOutHandler, addMouseOverHandler = addMouseOverHandler, addMouseUpHandler = addMouseUpHandler, addMouseWheelHandler = addMouseWheelHandler, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, getId = getId, getTag = getTag, getType = getType, setAccessKey = setAccessKey, setEnabled = setEnabled, setFocus = setFocus, setHTML = setHTML, setHeight = setHeight, setId = setId, setLayoutData = setLayoutData, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTabIndex = setTabIndex, setTag = setTag, setText = setText, setTitle = setTitle, setVisible = setVisible, setWidth = setWidth)
  
    __obj.asInstanceOf[PushButton]
  }
}

