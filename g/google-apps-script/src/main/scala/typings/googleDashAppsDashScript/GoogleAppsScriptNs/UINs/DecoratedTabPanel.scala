package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratedTabPanel extends js.Object {
  def add(widget: Widget): DecoratedTabPanel = js.native
  def add(widget: Widget, tabWidget: Widget): DecoratedTabPanel = js.native
  def add(widget: Widget, text: String): DecoratedTabPanel = js.native
  def add(widget: Widget, text: String, asHtml: Boolean): DecoratedTabPanel = js.native
  def addBeforeSelectionHandler(handler: Handler): DecoratedTabPanel = js.native
  def addSelectionHandler(handler: Handler): DecoratedTabPanel = js.native
  def addStyleDependentName(styleName: String): DecoratedTabPanel = js.native
  def addStyleName(styleName: String): DecoratedTabPanel = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def selectTab(index: Integer): DecoratedTabPanel = js.native
  def setAnimationEnabled(animationEnabled: Boolean): DecoratedTabPanel = js.native
  def setHeight(height: String): DecoratedTabPanel = js.native
  def setId(id: String): DecoratedTabPanel = js.native
  def setLayoutData(layout: js.Any): DecoratedTabPanel = js.native
  def setPixelSize(width: Integer, height: Integer): DecoratedTabPanel = js.native
  def setSize(width: String, height: String): DecoratedTabPanel = js.native
  def setStyleAttribute(attribute: String, value: String): DecoratedTabPanel = js.native
  def setStyleAttributes(attributes: js.Any): DecoratedTabPanel = js.native
  def setStyleName(styleName: String): DecoratedTabPanel = js.native
  def setStylePrimaryName(styleName: String): DecoratedTabPanel = js.native
  def setTag(tag: String): DecoratedTabPanel = js.native
  def setTitle(title: String): DecoratedTabPanel = js.native
  def setVisible(visible: Boolean): DecoratedTabPanel = js.native
  def setWidth(width: String): DecoratedTabPanel = js.native
}

