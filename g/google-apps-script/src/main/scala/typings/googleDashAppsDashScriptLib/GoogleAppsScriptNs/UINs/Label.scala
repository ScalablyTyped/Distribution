package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  def addClickHandler(handler: Handler): Label
  def addMouseDownHandler(handler: Handler): Label
  def addMouseMoveHandler(handler: Handler): Label
  def addMouseOutHandler(handler: Handler): Label
  def addMouseOverHandler(handler: Handler): Label
  def addMouseUpHandler(handler: Handler): Label
  def addMouseWheelHandler(handler: Handler): Label
  def addStyleDependentName(styleName: java.lang.String): Label
  def addStyleName(styleName: java.lang.String): Label
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setDirection(direction: Component): Label
  def setHeight(height: java.lang.String): Label
  def setHorizontalAlignment(horizontalAlignment: HorizontalAlignment): Label
  def setId(id: java.lang.String): Label
  def setLayoutData(layout: js.Object): Label
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Label
  def setSize(width: java.lang.String, height: java.lang.String): Label
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): Label
  def setStyleAttributes(attributes: js.Object): Label
  def setStyleName(styleName: java.lang.String): Label
  def setStylePrimaryName(styleName: java.lang.String): Label
  def setTag(tag: java.lang.String): Label
  def setText(text: java.lang.String): Label
  def setTitle(title: java.lang.String): Label
  def setVisible(visible: scala.Boolean): Label
  def setWidth(width: java.lang.String): Label
  def setWordWrap(wordWrap: scala.Boolean): Label
}

object Label {
  @scala.inline
  def apply(
    addClickHandler: js.Function1[Handler, Label],
    addMouseDownHandler: js.Function1[Handler, Label],
    addMouseMoveHandler: js.Function1[Handler, Label],
    addMouseOutHandler: js.Function1[Handler, Label],
    addMouseOverHandler: js.Function1[Handler, Label],
    addMouseUpHandler: js.Function1[Handler, Label],
    addMouseWheelHandler: js.Function1[Handler, Label],
    addStyleDependentName: js.Function1[java.lang.String, Label],
    addStyleName: js.Function1[java.lang.String, Label],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setDirection: js.Function1[Component, Label],
    setHeight: js.Function1[java.lang.String, Label],
    setHorizontalAlignment: js.Function1[HorizontalAlignment, Label],
    setId: js.Function1[java.lang.String, Label],
    setLayoutData: js.Function1[js.Object, Label],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      Label
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, Label],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, Label],
    setStyleAttributes: js.Function1[js.Object, Label],
    setStyleName: js.Function1[java.lang.String, Label],
    setStylePrimaryName: js.Function1[java.lang.String, Label],
    setTag: js.Function1[java.lang.String, Label],
    setText: js.Function1[java.lang.String, Label],
    setTitle: js.Function1[java.lang.String, Label],
    setVisible: js.Function1[scala.Boolean, Label],
    setWidth: js.Function1[java.lang.String, Label],
    setWordWrap: js.Function1[scala.Boolean, Label]
  ): Label = {
    val __obj = js.Dynamic.literal(addClickHandler = addClickHandler, addMouseDownHandler = addMouseDownHandler, addMouseMoveHandler = addMouseMoveHandler, addMouseOutHandler = addMouseOutHandler, addMouseOverHandler = addMouseOverHandler, addMouseUpHandler = addMouseUpHandler, addMouseWheelHandler = addMouseWheelHandler, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, getId = getId, getTag = getTag, getType = getType, setDirection = setDirection, setHeight = setHeight, setHorizontalAlignment = setHorizontalAlignment, setId = setId, setLayoutData = setLayoutData, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTag = setTag, setText = setText, setTitle = setTitle, setVisible = setVisible, setWidth = setWidth, setWordWrap = setWordWrap)
  
    __obj.asInstanceOf[Label]
  }
}

