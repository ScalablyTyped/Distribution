package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleButton extends js.Object {
  def addBlurHandler(handler: Handler): ToggleButton
  def addClickHandler(handler: Handler): ToggleButton
  def addFocusHandler(handler: Handler): ToggleButton
  def addKeyDownHandler(handler: Handler): ToggleButton
  def addKeyPressHandler(handler: Handler): ToggleButton
  def addKeyUpHandler(handler: Handler): ToggleButton
  def addMouseDownHandler(handler: Handler): ToggleButton
  def addMouseMoveHandler(handler: Handler): ToggleButton
  def addMouseOutHandler(handler: Handler): ToggleButton
  def addMouseOverHandler(handler: Handler): ToggleButton
  def addMouseUpHandler(handler: Handler): ToggleButton
  def addMouseWheelHandler(handler: Handler): ToggleButton
  def addStyleDependentName(styleName: java.lang.String): ToggleButton
  def addStyleName(styleName: java.lang.String): ToggleButton
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAccessKey(accessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char): ToggleButton
  def setDown(down: scala.Boolean): ToggleButton
  def setEnabled(enabled: scala.Boolean): ToggleButton
  def setFocus(focus: scala.Boolean): ToggleButton
  def setHTML(html: java.lang.String): ToggleButton
  def setHeight(height: java.lang.String): ToggleButton
  def setId(id: java.lang.String): ToggleButton
  def setLayoutData(layout: js.Object): ToggleButton
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ToggleButton
  def setSize(width: java.lang.String, height: java.lang.String): ToggleButton
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): ToggleButton
  def setStyleAttributes(attributes: js.Object): ToggleButton
  def setStyleName(styleName: java.lang.String): ToggleButton
  def setStylePrimaryName(styleName: java.lang.String): ToggleButton
  def setTabIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ToggleButton
  def setTag(tag: java.lang.String): ToggleButton
  def setText(text: java.lang.String): ToggleButton
  def setTitle(title: java.lang.String): ToggleButton
  def setVisible(visible: scala.Boolean): ToggleButton
  def setWidth(width: java.lang.String): ToggleButton
}

object ToggleButton {
  @scala.inline
  def apply(
    addBlurHandler: js.Function1[Handler, ToggleButton],
    addClickHandler: js.Function1[Handler, ToggleButton],
    addFocusHandler: js.Function1[Handler, ToggleButton],
    addKeyDownHandler: js.Function1[Handler, ToggleButton],
    addKeyPressHandler: js.Function1[Handler, ToggleButton],
    addKeyUpHandler: js.Function1[Handler, ToggleButton],
    addMouseDownHandler: js.Function1[Handler, ToggleButton],
    addMouseMoveHandler: js.Function1[Handler, ToggleButton],
    addMouseOutHandler: js.Function1[Handler, ToggleButton],
    addMouseOverHandler: js.Function1[Handler, ToggleButton],
    addMouseUpHandler: js.Function1[Handler, ToggleButton],
    addMouseWheelHandler: js.Function1[Handler, ToggleButton],
    addStyleDependentName: js.Function1[java.lang.String, ToggleButton],
    addStyleName: js.Function1[java.lang.String, ToggleButton],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setAccessKey: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char, ToggleButton],
    setDown: js.Function1[scala.Boolean, ToggleButton],
    setEnabled: js.Function1[scala.Boolean, ToggleButton],
    setFocus: js.Function1[scala.Boolean, ToggleButton],
    setHTML: js.Function1[java.lang.String, ToggleButton],
    setHeight: js.Function1[java.lang.String, ToggleButton],
    setId: js.Function1[java.lang.String, ToggleButton],
    setLayoutData: js.Function1[js.Object, ToggleButton],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      ToggleButton
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, ToggleButton],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, ToggleButton],
    setStyleAttributes: js.Function1[js.Object, ToggleButton],
    setStyleName: js.Function1[java.lang.String, ToggleButton],
    setStylePrimaryName: js.Function1[java.lang.String, ToggleButton],
    setTabIndex: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ToggleButton],
    setTag: js.Function1[java.lang.String, ToggleButton],
    setText: js.Function1[java.lang.String, ToggleButton],
    setTitle: js.Function1[java.lang.String, ToggleButton],
    setVisible: js.Function1[scala.Boolean, ToggleButton],
    setWidth: js.Function1[java.lang.String, ToggleButton]
  ): ToggleButton = {
    val __obj = js.Dynamic.literal(addBlurHandler = addBlurHandler, addClickHandler = addClickHandler, addFocusHandler = addFocusHandler, addKeyDownHandler = addKeyDownHandler, addKeyPressHandler = addKeyPressHandler, addKeyUpHandler = addKeyUpHandler, addMouseDownHandler = addMouseDownHandler, addMouseMoveHandler = addMouseMoveHandler, addMouseOutHandler = addMouseOutHandler, addMouseOverHandler = addMouseOverHandler, addMouseUpHandler = addMouseUpHandler, addMouseWheelHandler = addMouseWheelHandler, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, getId = getId, getTag = getTag, getType = getType, setAccessKey = setAccessKey, setDown = setDown, setEnabled = setEnabled, setFocus = setFocus, setHTML = setHTML, setHeight = setHeight, setId = setId, setLayoutData = setLayoutData, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTabIndex = setTabIndex, setTag = setTag, setText = setText, setTitle = setTitle, setVisible = setVisible, setWidth = setWidth)
  
    __obj.asInstanceOf[ToggleButton]
  }
}

