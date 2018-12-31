package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplePanel extends js.Object {
  def add(widget: Widget): SimplePanel
  def addStyleDependentName(styleName: java.lang.String): SimplePanel
  def addStyleName(styleName: java.lang.String): SimplePanel
  def clear(): SimplePanel
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setHeight(height: java.lang.String): SimplePanel
  def setId(id: java.lang.String): SimplePanel
  def setLayoutData(layout: js.Object): SimplePanel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): SimplePanel
  def setSize(width: java.lang.String, height: java.lang.String): SimplePanel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): SimplePanel
  def setStyleAttributes(attributes: js.Object): SimplePanel
  def setStyleName(styleName: java.lang.String): SimplePanel
  def setStylePrimaryName(styleName: java.lang.String): SimplePanel
  def setTag(tag: java.lang.String): SimplePanel
  def setTitle(title: java.lang.String): SimplePanel
  def setVisible(visible: scala.Boolean): SimplePanel
  def setWidget(widget: Widget): SimplePanel
  def setWidth(width: java.lang.String): SimplePanel
}

