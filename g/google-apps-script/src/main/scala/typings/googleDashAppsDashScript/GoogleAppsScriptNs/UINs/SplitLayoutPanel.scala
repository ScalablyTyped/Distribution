package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitLayoutPanel extends js.Object {
  def add(widget: Widget): SplitLayoutPanel = js.native
  def addEast(widget: Widget, width: Double): SplitLayoutPanel = js.native
  def addNorth(widget: Widget, height: Double): SplitLayoutPanel = js.native
  def addSouth(widget: Widget, height: Double): SplitLayoutPanel = js.native
  def addStyleDependentName(styleName: String): SplitLayoutPanel = js.native
  def addStyleName(styleName: String): SplitLayoutPanel = js.native
  def addWest(widget: Widget, width: Double): SplitLayoutPanel = js.native
  def clear(): SplitLayoutPanel = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def remove(index: Integer): SplitLayoutPanel = js.native
  def remove(widget: Widget): SplitLayoutPanel = js.native
  def setHeight(height: String): SplitLayoutPanel = js.native
  def setId(id: String): SplitLayoutPanel = js.native
  def setLayoutData(layout: js.Any): SplitLayoutPanel = js.native
  def setPixelSize(width: Integer, height: Integer): SplitLayoutPanel = js.native
  def setSize(width: String, height: String): SplitLayoutPanel = js.native
  def setStyleAttribute(attribute: String, value: String): SplitLayoutPanel = js.native
  def setStyleAttributes(attributes: js.Any): SplitLayoutPanel = js.native
  def setStyleName(styleName: String): SplitLayoutPanel = js.native
  def setStylePrimaryName(styleName: String): SplitLayoutPanel = js.native
  def setTag(tag: String): SplitLayoutPanel = js.native
  def setTitle(title: String): SplitLayoutPanel = js.native
  def setVisible(visible: Boolean): SplitLayoutPanel = js.native
  def setWidgetMinSize(widget: Widget, minSize: Integer): SplitLayoutPanel = js.native
  def setWidth(width: String): SplitLayoutPanel = js.native
}

