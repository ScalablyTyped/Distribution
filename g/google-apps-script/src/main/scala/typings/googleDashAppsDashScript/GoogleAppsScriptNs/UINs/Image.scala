package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  def addClickHandler(handler: Handler): Image
  def addErrorHandler(handler: Handler): Image
  def addLoadHandler(handler: Handler): Image
  def addMouseDownHandler(handler: Handler): Image
  def addMouseMoveHandler(handler: Handler): Image
  def addMouseOutHandler(handler: Handler): Image
  def addMouseOverHandler(handler: Handler): Image
  def addMouseUpHandler(handler: Handler): Image
  def addMouseWheelHandler(handler: Handler): Image
  def addStyleDependentName(styleName: String): Image
  def addStyleName(styleName: String): Image
  def getId(): String
  def getTag(): String
  def getType(): String
  def setHeight(height: String): Image
  def setId(id: String): Image
  def setLayoutData(layout: js.Any): Image
  def setPixelSize(width: Integer, height: Integer): Image
  def setResource(resource: Component): Image
  def setSize(width: String, height: String): Image
  def setStyleAttribute(attribute: String, value: String): Image
  def setStyleAttributes(attributes: js.Any): Image
  def setStyleName(styleName: String): Image
  def setStylePrimaryName(styleName: String): Image
  def setTag(tag: String): Image
  def setTitle(title: String): Image
  def setUrl(url: String): Image
  def setUrlAndVisibleRect(url: String, left: Integer, top: Integer, width: Integer, height: Integer): Image
  def setVisible(visible: Boolean): Image
  def setVisibleRect(left: Integer, top: Integer, width: Integer, height: Integer): Image
  def setWidth(width: String): Image
}

object Image {
  @scala.inline
  def apply(
    addClickHandler: Handler => Image,
    addErrorHandler: Handler => Image,
    addLoadHandler: Handler => Image,
    addMouseDownHandler: Handler => Image,
    addMouseMoveHandler: Handler => Image,
    addMouseOutHandler: Handler => Image,
    addMouseOverHandler: Handler => Image,
    addMouseUpHandler: Handler => Image,
    addMouseWheelHandler: Handler => Image,
    addStyleDependentName: String => Image,
    addStyleName: String => Image,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    setHeight: String => Image,
    setId: String => Image,
    setLayoutData: js.Any => Image,
    setPixelSize: (Integer, Integer) => Image,
    setResource: Component => Image,
    setSize: (String, String) => Image,
    setStyleAttribute: (String, String) => Image,
    setStyleAttributes: js.Any => Image,
    setStyleName: String => Image,
    setStylePrimaryName: String => Image,
    setTag: String => Image,
    setTitle: String => Image,
    setUrl: String => Image,
    setUrlAndVisibleRect: (String, Integer, Integer, Integer, Integer) => Image,
    setVisible: Boolean => Image,
    setVisibleRect: (Integer, Integer, Integer, Integer) => Image,
    setWidth: String => Image
  ): Image = {
    val __obj = js.Dynamic.literal(addClickHandler = js.Any.fromFunction1(addClickHandler), addErrorHandler = js.Any.fromFunction1(addErrorHandler), addLoadHandler = js.Any.fromFunction1(addLoadHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setResource = js.Any.fromFunction1(setResource), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setUrl = js.Any.fromFunction1(setUrl), setUrlAndVisibleRect = js.Any.fromFunction5(setUrlAndVisibleRect), setVisible = js.Any.fromFunction1(setVisible), setVisibleRect = js.Any.fromFunction4(setVisibleRect), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[Image]
  }
}

