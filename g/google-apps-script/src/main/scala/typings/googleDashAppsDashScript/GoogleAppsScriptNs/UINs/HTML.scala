package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
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
  def addStyleDependentName(styleName: String): HTML
  def addStyleName(styleName: String): HTML
  def getId(): String
  def getTag(): String
  def getType(): String
  def setDirection(direction: Component): HTML
  def setHTML(html: String): HTML
  def setHeight(height: String): HTML
  def setHorizontalAlignment(horizontalAlignment: HorizontalAlignment): HTML
  def setId(id: String): HTML
  def setLayoutData(layout: js.Any): HTML
  def setPixelSize(width: Integer, height: Integer): HTML
  def setSize(width: String, height: String): HTML
  def setStyleAttribute(attribute: String, value: String): HTML
  def setStyleAttributes(attributes: js.Any): HTML
  def setStyleName(styleName: String): HTML
  def setStylePrimaryName(styleName: String): HTML
  def setTag(tag: String): HTML
  def setText(text: String): HTML
  def setTitle(title: String): HTML
  def setVisible(visible: Boolean): HTML
  def setWidth(width: String): HTML
  def setWordWrap(wordWrap: Boolean): HTML
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
    addStyleDependentName: String => HTML,
    addStyleName: String => HTML,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setDirection: Component => HTML,
    setHTML: String => HTML,
    setHeight: String => HTML,
    setHorizontalAlignment: HorizontalAlignment => HTML,
    setId: String => HTML,
    setLayoutData: js.Any => HTML,
    setPixelSize: (Integer, Integer) => HTML,
    setSize: (String, String) => HTML,
    setStyleAttribute: (String, String) => HTML,
    setStyleAttributes: js.Any => HTML,
    setStyleName: String => HTML,
    setStylePrimaryName: String => HTML,
    setTag: String => HTML,
    setText: String => HTML,
    setTitle: String => HTML,
    setVisible: Boolean => HTML,
    setWidth: String => HTML,
    setWordWrap: Boolean => HTML
  ): HTML = {
    val __obj = js.Dynamic.literal(addClickHandler = js.Any.fromFunction1(addClickHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setDirection = js.Any.fromFunction1(setDirection), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setHorizontalAlignment = js.Any.fromFunction1(setHorizontalAlignment), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth), setWordWrap = js.Any.fromFunction1(setWordWrap))
  
    __obj.asInstanceOf[HTML]
  }
}

