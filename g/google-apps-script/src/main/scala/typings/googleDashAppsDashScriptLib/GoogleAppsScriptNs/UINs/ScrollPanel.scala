package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScrollPanel extends js.Object {
  def add(widget: Widget): ScrollPanel
  def addScrollHandler(handler: Handler): ScrollPanel
  def addStyleDependentName(styleName: java.lang.String): ScrollPanel
  def addStyleName(styleName: java.lang.String): ScrollPanel
  def clear(): ScrollPanel
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def setAlwaysShowScrollBars(alwaysShow: scala.Boolean): ScrollPanel
  def setHeight(height: java.lang.String): ScrollPanel
  def setHorizontalScrollPosition(position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ScrollPanel
  def setId(id: java.lang.String): ScrollPanel
  def setLayoutData(layout: js.Object): ScrollPanel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ScrollPanel
  def setScrollPosition(position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ScrollPanel
  def setSize(width: java.lang.String, height: java.lang.String): ScrollPanel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): ScrollPanel
  def setStyleAttributes(attributes: js.Object): ScrollPanel
  def setStyleName(styleName: java.lang.String): ScrollPanel
  def setStylePrimaryName(styleName: java.lang.String): ScrollPanel
  def setTag(tag: java.lang.String): ScrollPanel
  def setTitle(title: java.lang.String): ScrollPanel
  def setVisible(visible: scala.Boolean): ScrollPanel
  def setWidget(widget: Widget): ScrollPanel
  def setWidth(width: java.lang.String): ScrollPanel
}

