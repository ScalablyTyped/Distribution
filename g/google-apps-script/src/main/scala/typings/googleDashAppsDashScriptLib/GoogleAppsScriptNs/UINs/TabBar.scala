package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBar extends js.Object {
  def addBeforeSelectionHandler(handler: Handler): TabBar = js.native
  def addSelectionHandler(handler: Handler): TabBar = js.native
  def addStyleDependentName(styleName: java.lang.String): TabBar = js.native
  def addStyleName(styleName: java.lang.String): TabBar = js.native
  def addTab(title: java.lang.String): TabBar = js.native
  def addTab(title: java.lang.String, asHtml: scala.Boolean): TabBar = js.native
  def addTab(widget: Widget): TabBar = js.native
  def getId(): java.lang.String = js.native
  def getTag(): java.lang.String = js.native
  def getType(): java.lang.String = js.native
  def selectTab(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TabBar = js.native
  def setHeight(height: java.lang.String): TabBar = js.native
  def setId(id: java.lang.String): TabBar = js.native
  def setLayoutData(layout: js.Any): TabBar = js.native
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): TabBar = js.native
  def setSize(width: java.lang.String, height: java.lang.String): TabBar = js.native
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): TabBar = js.native
  def setStyleAttributes(attributes: js.Any): TabBar = js.native
  def setStyleName(styleName: java.lang.String): TabBar = js.native
  def setStylePrimaryName(styleName: java.lang.String): TabBar = js.native
  def setTabEnabled(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, enabled: scala.Boolean): TabBar = js.native
  def setTabText(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, text: java.lang.String): TabBar = js.native
  def setTag(tag: java.lang.String): TabBar = js.native
  def setTitle(title: java.lang.String): TabBar = js.native
  def setVisible(visible: scala.Boolean): TabBar = js.native
  def setWidth(width: java.lang.String): TabBar = js.native
}

