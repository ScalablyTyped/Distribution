package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabPanel extends js.Object {
  def add(widget: Widget): TabPanel = js.native
  def add(widget: Widget, tabWidget: Widget): TabPanel = js.native
  def add(widget: Widget, text: java.lang.String): TabPanel = js.native
  def add(widget: Widget, text: java.lang.String, asHtml: scala.Boolean): TabPanel = js.native
  def addBeforeSelectionHandler(handler: Handler): TabPanel = js.native
  def addSelectionHandler(handler: Handler): TabPanel = js.native
  def addStyleDependentName(styleName: java.lang.String): TabPanel = js.native
  def addStyleName(styleName: java.lang.String): TabPanel = js.native
  def getId(): java.lang.String = js.native
  def getTag(): java.lang.String = js.native
  def getType(): java.lang.String = js.native
  def selectTab(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TabPanel = js.native
  def setAnimationEnabled(animationEnabled: scala.Boolean): TabPanel = js.native
  def setHeight(height: java.lang.String): TabPanel = js.native
  def setId(id: java.lang.String): TabPanel = js.native
  def setLayoutData(layout: js.Object): TabPanel = js.native
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): TabPanel = js.native
  def setSize(width: java.lang.String, height: java.lang.String): TabPanel = js.native
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): TabPanel = js.native
  def setStyleAttributes(attributes: js.Object): TabPanel = js.native
  def setStyleName(styleName: java.lang.String): TabPanel = js.native
  def setStylePrimaryName(styleName: java.lang.String): TabPanel = js.native
  def setTag(tag: java.lang.String): TabPanel = js.native
  def setTitle(title: java.lang.String): TabPanel = js.native
  def setVisible(visible: scala.Boolean): TabPanel = js.native
  def setWidth(width: java.lang.String): TabPanel = js.native
}

