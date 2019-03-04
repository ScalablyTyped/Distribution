package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  def addBlurHandler(handler: Handler): Button
  def addClickHandler(handler: Handler): Button
  def addFocusHandler(handler: Handler): Button
  def addKeyDownHandler(handler: Handler): Button
  def addKeyPressHandler(handler: Handler): Button
  def addKeyUpHandler(handler: Handler): Button
  def addMouseDownHandler(handler: Handler): Button
  def addMouseMoveHandler(handler: Handler): Button
  def addMouseOutHandler(handler: Handler): Button
  def addMouseOverHandler(handler: Handler): Button
  def addMouseUpHandler(handler: Handler): Button
  def addMouseWheelHandler(handler: Handler): Button
  def addStyleDependentName(styleName: java.lang.String): Button
  def addStyleName(styleName: java.lang.String): Button
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAccessKey(accessKey: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char): Button
  def setEnabled(enabled: scala.Boolean): Button
  def setFocus(focus: scala.Boolean): Button
  def setHTML(html: java.lang.String): Button
  def setHeight(height: java.lang.String): Button
  def setId(id: java.lang.String): Button
  def setLayoutData(layout: js.Object): Button
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Button
  def setSize(width: java.lang.String, height: java.lang.String): Button
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): Button
  def setStyleAttributes(attributes: js.Object): Button
  def setStyleName(styleName: java.lang.String): Button
  def setStylePrimaryName(styleName: java.lang.String): Button
  def setTabIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Button
  def setTag(tag: java.lang.String): Button
  def setText(text: java.lang.String): Button
  def setTitle(title: java.lang.String): Button
  def setVisible(visible: scala.Boolean): Button
  def setWidth(width: java.lang.String): Button
}

object Button {
  @scala.inline
  def apply(
    addBlurHandler: js.Function1[Handler, Button],
    addClickHandler: js.Function1[Handler, Button],
    addFocusHandler: js.Function1[Handler, Button],
    addKeyDownHandler: js.Function1[Handler, Button],
    addKeyPressHandler: js.Function1[Handler, Button],
    addKeyUpHandler: js.Function1[Handler, Button],
    addMouseDownHandler: js.Function1[Handler, Button],
    addMouseMoveHandler: js.Function1[Handler, Button],
    addMouseOutHandler: js.Function1[Handler, Button],
    addMouseOverHandler: js.Function1[Handler, Button],
    addMouseUpHandler: js.Function1[Handler, Button],
    addMouseWheelHandler: js.Function1[Handler, Button],
    addStyleDependentName: js.Function1[java.lang.String, Button],
    addStyleName: js.Function1[java.lang.String, Button],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setAccessKey: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char, Button],
    setEnabled: js.Function1[scala.Boolean, Button],
    setFocus: js.Function1[scala.Boolean, Button],
    setHTML: js.Function1[java.lang.String, Button],
    setHeight: js.Function1[java.lang.String, Button],
    setId: js.Function1[java.lang.String, Button],
    setLayoutData: js.Function1[js.Object, Button],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      Button
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, Button],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, Button],
    setStyleAttributes: js.Function1[js.Object, Button],
    setStyleName: js.Function1[java.lang.String, Button],
    setStylePrimaryName: js.Function1[java.lang.String, Button],
    setTabIndex: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, Button],
    setTag: js.Function1[java.lang.String, Button],
    setText: js.Function1[java.lang.String, Button],
    setTitle: js.Function1[java.lang.String, Button],
    setVisible: js.Function1[scala.Boolean, Button],
    setWidth: js.Function1[java.lang.String, Button]
  ): Button = {
    val __obj = js.Dynamic.literal(addBlurHandler = addBlurHandler, addClickHandler = addClickHandler, addFocusHandler = addFocusHandler, addKeyDownHandler = addKeyDownHandler, addKeyPressHandler = addKeyPressHandler, addKeyUpHandler = addKeyUpHandler, addMouseDownHandler = addMouseDownHandler, addMouseMoveHandler = addMouseMoveHandler, addMouseOutHandler = addMouseOutHandler, addMouseOverHandler = addMouseOverHandler, addMouseUpHandler = addMouseUpHandler, addMouseWheelHandler = addMouseWheelHandler, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, getId = getId, getTag = getTag, getType = getType, setAccessKey = setAccessKey, setEnabled = setEnabled, setFocus = setFocus, setHTML = setHTML, setHeight = setHeight, setId = setId, setLayoutData = setLayoutData, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTabIndex = setTabIndex, setTag = setTag, setText = setText, setTitle = setTitle, setVisible = setVisible, setWidth = setWidth)
  
    __obj.asInstanceOf[Button]
  }
}

