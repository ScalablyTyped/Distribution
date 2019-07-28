package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackPanel extends js.Object {
  def add(widget: Widget): StackPanel = js.native
  def add(widget: Widget, text: String): StackPanel = js.native
  def add(widget: Widget, text: String, asHtml: Boolean): StackPanel = js.native
  def addStyleDependentName(styleName: String): StackPanel = js.native
  def addStyleName(styleName: String): StackPanel = js.native
  def clear(): StackPanel = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def remove(index: Integer): StackPanel = js.native
  def remove(widget: Widget): StackPanel = js.native
  def setHeight(height: String): StackPanel = js.native
  def setId(id: String): StackPanel = js.native
  def setLayoutData(layout: js.Any): StackPanel = js.native
  def setPixelSize(width: Integer, height: Integer): StackPanel = js.native
  def setSize(width: String, height: String): StackPanel = js.native
  def setStackText(index: Integer, text: String): StackPanel = js.native
  def setStackText(index: Integer, text: String, asHtml: Boolean): StackPanel = js.native
  def setStyleAttribute(attribute: String, value: String): StackPanel = js.native
  def setStyleAttributes(attributes: js.Any): StackPanel = js.native
  def setStyleName(styleName: String): StackPanel = js.native
  def setStylePrimaryName(styleName: String): StackPanel = js.native
  def setTag(tag: String): StackPanel = js.native
  def setTitle(title: String): StackPanel = js.native
  def setVisible(visible: Boolean): StackPanel = js.native
  def setWidth(width: String): StackPanel = js.native
}

