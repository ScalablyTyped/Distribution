package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTML extends js.Object {
  def addClickHandler(handler: Handler): HTML
  def addMouseDownHandler(handler: Handler): HTML
  def addMouseMoveHandler(handler: Handler): HTML
  def addMouseOutHandler(handler: Handler): HTML
  def addMouseOverHandler(handler: Handler): HTML
  def addMouseUpHandler(handler: Handler): HTML
  def addMouseWheelHandler(handler: Handler): HTML
  def addStyleDependentName(styleName: java.lang.String): HTML
  def addStyleName(styleName: java.lang.String): HTML
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setDirection(direction: Component): HTML
  def setHTML(html: java.lang.String): HTML
  def setHeight(height: java.lang.String): HTML
  def setHorizontalAlignment(horizontalAlignment: HorizontalAlignment): HTML
  def setId(id: java.lang.String): HTML
  def setLayoutData(layout: js.Object): HTML
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): HTML
  def setSize(width: java.lang.String, height: java.lang.String): HTML
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): HTML
  def setStyleAttributes(attributes: js.Object): HTML
  def setStyleName(styleName: java.lang.String): HTML
  def setStylePrimaryName(styleName: java.lang.String): HTML
  def setTag(tag: java.lang.String): HTML
  def setText(text: java.lang.String): HTML
  def setTitle(title: java.lang.String): HTML
  def setVisible(visible: scala.Boolean): HTML
  def setWidth(width: java.lang.String): HTML
  def setWordWrap(wordWrap: scala.Boolean): HTML
}

object HTML {
  @scala.inline
  def apply(
    addClickHandler: js.Function1[Handler, HTML],
    addMouseDownHandler: js.Function1[Handler, HTML],
    addMouseMoveHandler: js.Function1[Handler, HTML],
    addMouseOutHandler: js.Function1[Handler, HTML],
    addMouseOverHandler: js.Function1[Handler, HTML],
    addMouseUpHandler: js.Function1[Handler, HTML],
    addMouseWheelHandler: js.Function1[Handler, HTML],
    addStyleDependentName: js.Function1[java.lang.String, HTML],
    addStyleName: js.Function1[java.lang.String, HTML],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setDirection: js.Function1[Component, HTML],
    setHTML: js.Function1[java.lang.String, HTML],
    setHeight: js.Function1[java.lang.String, HTML],
    setHorizontalAlignment: js.Function1[HorizontalAlignment, HTML],
    setId: js.Function1[java.lang.String, HTML],
    setLayoutData: js.Function1[js.Object, HTML],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      HTML
    ],
    setSize: js.Function2[java.lang.String, java.lang.String, HTML],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, HTML],
    setStyleAttributes: js.Function1[js.Object, HTML],
    setStyleName: js.Function1[java.lang.String, HTML],
    setStylePrimaryName: js.Function1[java.lang.String, HTML],
    setTag: js.Function1[java.lang.String, HTML],
    setText: js.Function1[java.lang.String, HTML],
    setTitle: js.Function1[java.lang.String, HTML],
    setVisible: js.Function1[scala.Boolean, HTML],
    setWidth: js.Function1[java.lang.String, HTML],
    setWordWrap: js.Function1[scala.Boolean, HTML]
  ): HTML = {
    val __obj = js.Dynamic.literal(addClickHandler = addClickHandler, addMouseDownHandler = addMouseDownHandler, addMouseMoveHandler = addMouseMoveHandler, addMouseOutHandler = addMouseOutHandler, addMouseOverHandler = addMouseOverHandler, addMouseUpHandler = addMouseUpHandler, addMouseWheelHandler = addMouseWheelHandler, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, getId = getId, getTag = getTag, getType = getType, setDirection = setDirection, setHTML = setHTML, setHeight = setHeight, setHorizontalAlignment = setHorizontalAlignment, setId = setId, setLayoutData = setLayoutData, setPixelSize = setPixelSize, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTag = setTag, setText = setText, setTitle = setTitle, setVisible = setVisible, setWidth = setWidth, setWordWrap = setWordWrap)
  
    __obj.asInstanceOf[HTML]
  }
}

