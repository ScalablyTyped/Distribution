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

