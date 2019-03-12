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
    addClickHandler: Handler => HTML,
    addMouseDownHandler: Handler => HTML,
    addMouseMoveHandler: Handler => HTML,
    addMouseOutHandler: Handler => HTML,
    addMouseOverHandler: Handler => HTML,
    addMouseUpHandler: Handler => HTML,
    addMouseWheelHandler: Handler => HTML,
    addStyleDependentName: java.lang.String => HTML,
    addStyleName: java.lang.String => HTML,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setDirection: Component => HTML,
    setHTML: java.lang.String => HTML,
    setHeight: java.lang.String => HTML,
    setHorizontalAlignment: HorizontalAlignment => HTML,
    setId: java.lang.String => HTML,
    setLayoutData: js.Object => HTML,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => HTML,
    setSize: (java.lang.String, java.lang.String) => HTML,
    setStyleAttribute: (java.lang.String, java.lang.String) => HTML,
    setStyleAttributes: js.Object => HTML,
    setStyleName: java.lang.String => HTML,
    setStylePrimaryName: java.lang.String => HTML,
    setTag: java.lang.String => HTML,
    setText: java.lang.String => HTML,
    setTitle: java.lang.String => HTML,
    setVisible: scala.Boolean => HTML,
    setWidth: java.lang.String => HTML,
    setWordWrap: scala.Boolean => HTML
  ): HTML = {
    val __obj = js.Dynamic.literal(addClickHandler = js.Any.fromFunction1(addClickHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setDirection = js.Any.fromFunction1(setDirection), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setHorizontalAlignment = js.Any.fromFunction1(setHorizontalAlignment), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth), setWordWrap = js.Any.fromFunction1(setWordWrap))
  
    __obj.asInstanceOf[HTML]
  }
}

