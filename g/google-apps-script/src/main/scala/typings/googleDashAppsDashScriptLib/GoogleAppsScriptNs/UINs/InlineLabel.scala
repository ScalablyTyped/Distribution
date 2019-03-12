package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

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
  def addStyleDependentName(styleName: java.lang.String): InlineLabel
  def addStyleName(styleName: java.lang.String): InlineLabel
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setDirection(direction: Component): InlineLabel
  def setHeight(height: java.lang.String): InlineLabel
  def setHorizontalAlignment(horizontalAlignment: HorizontalAlignment): InlineLabel
  def setId(id: java.lang.String): InlineLabel
  def setLayoutData(layout: js.Object): InlineLabel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): InlineLabel
  def setSize(width: java.lang.String, height: java.lang.String): InlineLabel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): InlineLabel
  def setStyleAttributes(attributes: js.Object): InlineLabel
  def setStyleName(styleName: java.lang.String): InlineLabel
  def setStylePrimaryName(styleName: java.lang.String): InlineLabel
  def setTag(tag: java.lang.String): InlineLabel
  def setText(text: java.lang.String): InlineLabel
  def setTitle(title: java.lang.String): InlineLabel
  def setVisible(visible: scala.Boolean): InlineLabel
  def setWidth(width: java.lang.String): InlineLabel
  def setWordWrap(wordWrap: scala.Boolean): InlineLabel
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
    addStyleDependentName: java.lang.String => InlineLabel,
    addStyleName: java.lang.String => InlineLabel,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setDirection: Component => InlineLabel,
    setHeight: java.lang.String => InlineLabel,
    setHorizontalAlignment: HorizontalAlignment => InlineLabel,
    setId: java.lang.String => InlineLabel,
    setLayoutData: js.Object => InlineLabel,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => InlineLabel,
    setSize: (java.lang.String, java.lang.String) => InlineLabel,
    setStyleAttribute: (java.lang.String, java.lang.String) => InlineLabel,
    setStyleAttributes: js.Object => InlineLabel,
    setStyleName: java.lang.String => InlineLabel,
    setStylePrimaryName: java.lang.String => InlineLabel,
    setTag: java.lang.String => InlineLabel,
    setText: java.lang.String => InlineLabel,
    setTitle: java.lang.String => InlineLabel,
    setVisible: scala.Boolean => InlineLabel,
    setWidth: java.lang.String => InlineLabel,
    setWordWrap: scala.Boolean => InlineLabel
  ): InlineLabel = {
    val __obj = js.Dynamic.literal(addClickHandler = js.Any.fromFunction1(addClickHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setDirection = js.Any.fromFunction1(setDirection), setHeight = js.Any.fromFunction1(setHeight), setHorizontalAlignment = js.Any.fromFunction1(setHorizontalAlignment), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth), setWordWrap = js.Any.fromFunction1(setWordWrap))
  
    __obj.asInstanceOf[InlineLabel]
  }
}

