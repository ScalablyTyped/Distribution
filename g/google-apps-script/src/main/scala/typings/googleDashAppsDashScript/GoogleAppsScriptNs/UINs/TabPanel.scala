package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabPanel extends js.Object {
  def add(widget: Widget): TabPanel = js.native
  def add(widget: Widget, tabWidget: Widget): TabPanel = js.native
  def add(widget: Widget, text: String): TabPanel = js.native
  def add(widget: Widget, text: String, asHtml: Boolean): TabPanel = js.native
  def addBeforeSelectionHandler(handler: Handler): TabPanel = js.native
  def addSelectionHandler(handler: Handler): TabPanel = js.native
  def addStyleDependentName(styleName: String): TabPanel = js.native
  def addStyleName(styleName: String): TabPanel = js.native
  def getId(): String = js.native
  def getTag(): String = js.native
  def getType(): String = js.native
  def selectTab(index: Integer): TabPanel = js.native
  def setAnimationEnabled(animationEnabled: Boolean): TabPanel = js.native
  def setHeight(height: String): TabPanel = js.native
  def setId(id: String): TabPanel = js.native
  def setLayoutData(layout: js.Any): TabPanel = js.native
  def setPixelSize(width: Integer, height: Integer): TabPanel = js.native
  def setSize(width: String, height: String): TabPanel = js.native
  def setStyleAttribute(attribute: String, value: String): TabPanel = js.native
  def setStyleAttributes(attributes: js.Any): TabPanel = js.native
  def setStyleName(styleName: String): TabPanel = js.native
  def setStylePrimaryName(styleName: String): TabPanel = js.native
  def setTag(tag: String): TabPanel = js.native
  def setTitle(title: String): TabPanel = js.native
  def setVisible(visible: Boolean): TabPanel = js.native
  def setWidth(width: String): TabPanel = js.native
}

