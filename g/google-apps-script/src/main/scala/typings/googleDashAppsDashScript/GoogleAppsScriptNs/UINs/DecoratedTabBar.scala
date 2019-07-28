package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratedTabBar extends js.Object {
  def addBeforeSelectionHandler(handler: Handler): DecoratedTabBar = js.native
  def addSelectionHandler(handler: Handler): DecoratedTabBar = js.native
  def addStyleDependentName(styleName: String): DecoratedTabBar = js.native
  def addStyleName(styleName: String): DecoratedTabBar = js.native
  def addTab(title: String): DecoratedTabBar = js.native
  def addTab(title: String, asHtml: Boolean): DecoratedTabBar = js.native
  def addTab(widget: Widget): DecoratedTabBar = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def selectTab(index: Integer): DecoratedTabBar = js.native
  def setHeight(height: String): DecoratedTabBar = js.native
  def setId(id: String): DecoratedTabBar = js.native
  def setLayoutData(layout: js.Any): DecoratedTabBar = js.native
  def setPixelSize(width: Integer, height: Integer): DecoratedTabBar = js.native
  def setSize(width: String, height: String): DecoratedTabBar = js.native
  def setStyleAttribute(attribute: String, value: String): DecoratedTabBar = js.native
  def setStyleAttributes(attributes: js.Any): DecoratedTabBar = js.native
  def setStyleName(styleName: String): DecoratedTabBar = js.native
  def setStylePrimaryName(styleName: String): DecoratedTabBar = js.native
  def setTabEnabled(index: Integer, enabled: Boolean): DecoratedTabBar = js.native
  def setTabText(index: Integer, text: String): DecoratedTabBar = js.native
  def setTag(tag: String): DecoratedTabBar = js.native
  def setTitle(title: String): DecoratedTabBar = js.native
  def setVisible(visible: Boolean): DecoratedTabBar = js.native
  def setWidth(width: String): DecoratedTabBar = js.native
}

