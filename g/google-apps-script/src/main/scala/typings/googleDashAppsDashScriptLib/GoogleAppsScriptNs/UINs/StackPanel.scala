package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackPanel extends js.Object {
  def add(widget: Widget): StackPanel = js.native
  def add(widget: Widget, text: java.lang.String): StackPanel = js.native
  def add(widget: Widget, text: java.lang.String, asHtml: scala.Boolean): StackPanel = js.native
  def addStyleDependentName(styleName: java.lang.String): StackPanel = js.native
  def addStyleName(styleName: java.lang.String): StackPanel = js.native
  def clear(): StackPanel = js.native
  def getId(): java.lang.String = js.native
  def getTag(): java.lang.String = js.native
  def getType(): java.lang.String = js.native
  def remove(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): StackPanel = js.native
  def remove(widget: Widget): StackPanel = js.native
  def setHeight(height: java.lang.String): StackPanel = js.native
  def setId(id: java.lang.String): StackPanel = js.native
  def setLayoutData(layout: js.Any): StackPanel = js.native
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): StackPanel = js.native
  def setSize(width: java.lang.String, height: java.lang.String): StackPanel = js.native
  def setStackText(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, text: java.lang.String): StackPanel = js.native
  def setStackText(
    index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    text: java.lang.String,
    asHtml: scala.Boolean
  ): StackPanel = js.native
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): StackPanel = js.native
  def setStyleAttributes(attributes: js.Any): StackPanel = js.native
  def setStyleName(styleName: java.lang.String): StackPanel = js.native
  def setStylePrimaryName(styleName: java.lang.String): StackPanel = js.native
  def setTag(tag: java.lang.String): StackPanel = js.native
  def setTitle(title: java.lang.String): StackPanel = js.native
  def setVisible(visible: scala.Boolean): StackPanel = js.native
  def setWidth(width: java.lang.String): StackPanel = js.native
}

