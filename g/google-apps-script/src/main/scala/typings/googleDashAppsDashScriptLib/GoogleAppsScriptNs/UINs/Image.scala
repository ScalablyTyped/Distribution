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
    addClickHandler: js.Function1[Handler, Image],
    addErrorHandler: js.Function1[Handler, Image],
    addLoadHandler: js.Function1[Handler, Image],
    addMouseDownHandler: js.Function1[Handler, Image],
    addMouseMoveHandler: js.Function1[Handler, Image],
    addMouseOutHandler: js.Function1[Handler, Image],
    addMouseOverHandler: js.Function1[Handler, Image],
    addMouseUpHandler: js.Function1[Handler, Image],
    addMouseWheelHandler: js.Function1[Handler, Image],
    addStyleDependentName: js.Function1[java.lang.String, Image],
    addStyleName: js.Function1[java.lang.String, Image],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    setHeight: js.Function1[java.lang.String, Image],
    setId: js.Function1[java.lang.String, Image],
    setLayoutData: js.Function1[js.Object, Image],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      Image
    ],
    setResource: js.Function1[Component, Image],
    setSize: js.Function2[java.lang.String, java.lang.String, Image],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, Image],
    setStyleAttributes: js.Function1[js.Object, Image],
    setStyleName: js.Function1[java.lang.String, Image],
    setStylePrimaryName: js.Function1[java.lang.String, Image],
    setTag: js.Function1[java.lang.String, Image],
    setTitle: js.Function1[java.lang.String, Image],
    setUrl: js.Function1[java.lang.String, Image],
    setUrlAndVisibleRect: js.Function5[
      java.lang.String, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      Image
    ],
    setVisible: js.Function1[scala.Boolean, Image],
    setVisibleRect: js.Function4[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      Image
    ],
    setWidth: js.Function1[java.lang.String, Image]
  ): Image = {
    val __obj = js.Dynamic.literal(addClickHandler = addClickHandler, addErrorHandler = addErrorHandler, addLoadHandler = addLoadHandler, addMouseDownHandler = addMouseDownHandler, addMouseMoveHandler = addMouseMoveHandler, addMouseOutHandler = addMouseOutHandler, addMouseOverHandler = addMouseOverHandler, addMouseUpHandler = addMouseUpHandler, addMouseWheelHandler = addMouseWheelHandler, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, getId = getId, getTag = getTag, getType = getType, setHeight = setHeight, setId = setId, setLayoutData = setLayoutData, setPixelSize = setPixelSize, setResource = setResource, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTag = setTag, setTitle = setTitle, setUrl = setUrl, setUrlAndVisibleRect = setUrlAndVisibleRect, setVisible = setVisible, setVisibleRect = setVisibleRect, setWidth = setWidth)
  
    __obj.asInstanceOf[Image]
  }
}

