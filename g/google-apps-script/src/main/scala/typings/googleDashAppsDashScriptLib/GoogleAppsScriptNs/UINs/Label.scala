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

