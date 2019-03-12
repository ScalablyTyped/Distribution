package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

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
  def addStyleDependentName(styleName: java.lang.String): Image
  def addStyleName(styleName: java.lang.String): Image
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setHeight(height: java.lang.String): Image
  def setId(id: java.lang.String): Image
  def setLayoutData(layout: js.Object): Image
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Image
  def setResource(resource: Component): Image
  def setSize(width: java.lang.String, height: java.lang.String): Image
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): Image
  def setStyleAttributes(attributes: js.Object): Image
  def setStyleName(styleName: java.lang.String): Image
  def setStylePrimaryName(styleName: java.lang.String): Image
  def setTag(tag: java.lang.String): Image
  def setTitle(title: java.lang.String): Image
  def setUrl(url: java.lang.String): Image
  def setUrlAndVisibleRect(
    url: java.lang.String,
    left: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    top: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Image
  def setVisible(visible: scala.Boolean): Image
  def setVisibleRect(
    left: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    top: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Image
  def setWidth(width: java.lang.String): Image
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
    addStyleDependentName: java.lang.String => Image,
    addStyleName: java.lang.String => Image,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    setHeight: java.lang.String => Image,
    setId: java.lang.String => Image,
    setLayoutData: js.Object => Image,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => Image,
    setResource: Component => Image,
    setSize: (java.lang.String, java.lang.String) => Image,
    setStyleAttribute: (java.lang.String, java.lang.String) => Image,
    setStyleAttributes: js.Object => Image,
    setStyleName: java.lang.String => Image,
    setStylePrimaryName: java.lang.String => Image,
    setTag: java.lang.String => Image,
    setTitle: java.lang.String => Image,
    setUrl: java.lang.String => Image,
    setUrlAndVisibleRect: (java.lang.String, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => Image,
    setVisible: scala.Boolean => Image,
    setVisibleRect: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => Image,
    setWidth: java.lang.String => Image
  ): Image = {
    val __obj = js.Dynamic.literal(addClickHandler = js.Any.fromFunction1(addClickHandler), addErrorHandler = js.Any.fromFunction1(addErrorHandler), addLoadHandler = js.Any.fromFunction1(addLoadHandler), addMouseDownHandler = js.Any.fromFunction1(addMouseDownHandler), addMouseMoveHandler = js.Any.fromFunction1(addMouseMoveHandler), addMouseOutHandler = js.Any.fromFunction1(addMouseOutHandler), addMouseOverHandler = js.Any.fromFunction1(addMouseOverHandler), addMouseUpHandler = js.Any.fromFunction1(addMouseUpHandler), addMouseWheelHandler = js.Any.fromFunction1(addMouseWheelHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setPixelSize = js.Any.fromFunction2(setPixelSize), setResource = js.Any.fromFunction1(setResource), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setUrl = js.Any.fromFunction1(setUrl), setUrlAndVisibleRect = js.Any.fromFunction5(setUrlAndVisibleRect), setVisible = js.Any.fromFunction1(setVisible), setVisibleRect = js.Any.fromFunction4(setVisibleRect), setWidth = js.Any.fromFunction1(setWidth))
  
    __obj.asInstanceOf[Image]
  }
}

