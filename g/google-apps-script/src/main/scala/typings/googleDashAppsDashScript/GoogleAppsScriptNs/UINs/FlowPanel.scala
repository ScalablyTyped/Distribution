package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowPanel extends js.Object {
  def add(widget: Widget): FlowPanel = js.native
  def addStyleDependentName(styleName: String): FlowPanel = js.native
  def addStyleName(styleName: String): FlowPanel = js.native
  def clear(): FlowPanel = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def insert(widget: Widget, beforeIndex: Integer): FlowPanel = js.native
  def remove(index: Integer): FlowPanel = js.native
  def remove(widget: Widget): FlowPanel = js.native
  def setHeight(height: String): FlowPanel = js.native
  def setId(id: String): FlowPanel = js.native
  def setLayoutData(layout: js.Any): FlowPanel = js.native
  def setPixelSize(width: Integer, height: Integer): FlowPanel = js.native
  def setSize(width: String, height: String): FlowPanel = js.native
  def setStyleAttribute(attribute: String, value: String): FlowPanel = js.native
  def setStyleAttributes(attributes: js.Any): FlowPanel = js.native
  def setStyleName(styleName: String): FlowPanel = js.native
  def setStylePrimaryName(styleName: String): FlowPanel = js.native
  def setTag(tag: String): FlowPanel = js.native
  def setTitle(title: String): FlowPanel = js.native
  def setVisible(visible: Boolean): FlowPanel = js.native
  def setWidth(width: String): FlowPanel = js.native
}

