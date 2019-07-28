package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBar extends js.Object {
  def addBeforeSelectionHandler(handler: Handler): TabBar = js.native
  def addSelectionHandler(handler: Handler): TabBar = js.native
  def addStyleDependentName(styleName: String): TabBar = js.native
  def addStyleName(styleName: String): TabBar = js.native
  def addTab(title: String): TabBar = js.native
  def addTab(title: String, asHtml: Boolean): TabBar = js.native
  def addTab(widget: Widget): TabBar = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def selectTab(index: Integer): TabBar = js.native
  def setHeight(height: String): TabBar = js.native
  def setId(id: String): TabBar = js.native
  def setLayoutData(layout: js.Any): TabBar = js.native
  def setPixelSize(width: Integer, height: Integer): TabBar = js.native
  def setSize(width: String, height: String): TabBar = js.native
  def setStyleAttribute(attribute: String, value: String): TabBar = js.native
  def setStyleAttributes(attributes: js.Any): TabBar = js.native
  def setStyleName(styleName: String): TabBar = js.native
  def setStylePrimaryName(styleName: String): TabBar = js.native
  def setTabEnabled(index: Integer, enabled: Boolean): TabBar = js.native
  def setTabText(index: Integer, text: String): TabBar = js.native
  def setTag(tag: String): TabBar = js.native
  def setTitle(title: String): TabBar = js.native
  def setVisible(visible: Boolean): TabBar = js.native
  def setWidth(width: String): TabBar = js.native
}

