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
    addClickHandler: Handler => Label,
    addMouseDownHandler: Handler => Label,
    addMouseMoveHandler: Handler => Label,
    addMouseOutHandler: Handler => Label,
    addMouseOverHandler: Handler => Label,
    addMouseUpHandler: Handler => Label,
    addMouseWheelHandler: Handler => Label,
    addStyleDependentName: java.lang.String => Label,
    addStyleName: java.lang.String => Label,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setDirection: Component => Label,
    setHeight: java.lang.String => Label,
    setHorizontalAlignment: HorizontalAlignment => Label,
    setId: java.lang.String => Label,
    setLayoutData: js.Object => Label,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => Label,
    setSize: (java.lang.String, java.lang.String) => Label,
    setStyleAttribute: (java.lang.String, java.lang.String) => Label,
    setStyleAttributes: js.Object => Label,
    setStyleName: java.lang.String => Label,
    setStylePrimaryName: java.lang.String => Label,
    setTag: java.lang.String => Label,
    setText: java.lang.String => Label,
    setTitle: java.lang.String => Label,
    setVisible: scala.Boolean => Label,
    setWidth: java.lang.String => Label,
    setWordWrap: scala.Boolean => Label
  ): Label = {
    val __obj = js.Dynamic.literal(addClickHandler = js.Any.fromFunction1(addClickHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setDirection = js.Any.fromFunction1(setDirection), setHeight = js.Any.fromFunction1(setHeight), setHorizontalAlignment = js.Any.fromFunction1(setHorizontalAlignment), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth), setWordWrap = js.Any.fromFunction1(setWordWrap))
  
    __obj.asInstanceOf[Label]
  }
}

