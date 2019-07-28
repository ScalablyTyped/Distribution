package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
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
  def addStyleDependentName(styleName: String): Label
  def addStyleName(styleName: String): Label
  def getId(): String
  def getTag(): String
  def getType(): String
  def setDirection(direction: Component): Label
  def setHeight(height: String): Label
  def setHorizontalAlignment(horizontalAlignment: HorizontalAlignment): Label
  def setId(id: String): Label
  def setLayoutData(layout: js.Any): Label
  def setPixelSize(width: Integer, height: Integer): Label
  def setSize(width: String, height: String): Label
  def setStyleAttribute(attribute: String, value: String): Label
  def setStyleAttributes(attributes: js.Any): Label
  def setStyleName(styleName: String): Label
  def setStylePrimaryName(styleName: String): Label
  def setTag(tag: String): Label
  def setText(text: String): Label
  def setTitle(title: String): Label
  def setVisible(visible: Boolean): Label
  def setWidth(width: String): Label
  def setWordWrap(wordWrap: Boolean): Label
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
    addStyleDependentName: String => Label,
    addStyleName: String => Label,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setDirection: Component => Label,
    setHeight: String => Label,
    setHorizontalAlignment: HorizontalAlignment => Label,
    setId: String => Label,
    setLayoutData: js.Any => Label,
    setPixelSize: (Integer, Integer) => Label,
    setSize: (String, String) => Label,
    setStyleAttribute: (String, String) => Label,
    setStyleAttributes: js.Any => Label,
    setStyleName: String => Label,
    setStylePrimaryName: String => Label,
    setTag: String => Label,
    setText: String => Label,
    setTitle: String => Label,
    setVisible: Boolean => Label,
    setWidth: String => Label,
    setWordWrap: Boolean => Label
  ): Label = {
    val __obj = js.Dynamic.literal(addClickHandler = js.Any.fromFunction1(addClickHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setDirection = js.Any.fromFunction1(setDirection), setHeight = js.Any.fromFunction1(setHeight), setHorizontalAlignment = js.Any.fromFunction1(setHorizontalAlignment), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidth = js.Any.fromFunction1(setWidth), setWordWrap = js.Any.fromFunction1(setWordWrap))
  
    __obj.asInstanceOf[Label]
  }
}

