package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineLabel extends js.Object {
  def addClickHandler(handler: Handler): InlineLabel
  def addMouseDownHandler(handler: Handler): InlineLabel
  def addMouseMoveHandler(handler: Handler): InlineLabel
  def addMouseOutHandler(handler: Handler): InlineLabel
  def addMouseOverHandler(handler: Handler): InlineLabel
  def addMouseUpHandler(handler: Handler): InlineLabel
  def addMouseWheelHandler(handler: Handler): InlineLabel
  def addStyleDependentName(styleName: String): InlineLabel
  def addStyleName(styleName: String): InlineLabel
  def getId(): String
  def getTag(): String
  def getType(): String
  def setDirection(direction: Component): InlineLabel
  def setHeight(height: String): InlineLabel
  def setHorizontalAlignment(horizontalAlignment: HorizontalAlignment): InlineLabel
  def setId(id: String): InlineLabel
  def setLayoutData(layout: js.Any): InlineLabel
  def setPixelSize(width: Integer, height: Integer): InlineLabel
  def setSize(width: String, height: String): InlineLabel
  def setStyleAttribute(attribute: String, value: String): InlineLabel
  def setStyleAttributes(attributes: js.Any): InlineLabel
  def setStyleName(styleName: String): InlineLabel
  def setStylePrimaryName(styleName: String): InlineLabel
  def setTag(tag: String): InlineLabel
  def setText(text: String): InlineLabel
  def setTitle(title: String): InlineLabel
  def setVisible(visible: Boolean): InlineLabel
  def setWidth(width: String): InlineLabel
  def setWordWrap(wordWrap: Boolean): InlineLabel
}

object InlineLabel {
  @scala.inline
  def apply(
    addClickHandler: Handler => InlineLabel,
    addMouseDownHandler: Handler => InlineLabel,
    addMouseMoveHandler: Handler => InlineLabel,
    addMouseOutHandler: Handler => InlineLabel,
    addMouseOverHandler: Handler => InlineLabel,
    addMouseUpHandler: Handler => InlineLabel,
    addMouseWheelHandler: Handler => InlineLabel,
    addStyleDependentName: String => InlineLabel,
    addStyleName: String => InlineLabel,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setDirection: Component => InlineLabel,
    setHeight: String => InlineLabel,
    setHorizontalAlignment: HorizontalAlignment => InlineLabel,
    setId: String => InlineLabel,
    setLayoutData: js.Any => InlineLabel,
    setPixelSize: (Integer, Integer) => InlineLabel,
    setSize: (String, String) => InlineLabel,
    setStyleAttribute: (String, String) => InlineLabel,
    setStyleAttributes: js.Any => InlineLabel,
    setStyleName: String => InlineLabel,
    setStylePrimaryName: String => InlineLabel,
    setTag: String => InlineLabel,
    setText: String => InlineLabel,
    setTitle: String => InlineLabel,
    setVisible: Boolean => InlineLabel,
    setWidth: String => InlineLabel,
    setWordWrap: Boolean => InlineLabel
  ): InlineLabel = {
    val __obj = js.Dynamic.literal(addClickHandler = js.Any.fromFunction1(addClickHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setDirection = js.Any.fromFunction1(setDirection), setHeight = js.Any.fromFunction1(setHeight), setHorizontalAlignment = js.Any.fromFunction1(setHorizontalAlignment), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth), setWordWrap = js.Any.fromFunction1(setWordWrap))
  
    __obj.asInstanceOf[InlineLabel]
  }
}

