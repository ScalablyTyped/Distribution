package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupPanel extends js.Object {
  def add(widget: Widget): PopupPanel
  def addAutoHidePartner(partner: Component): PopupPanel
  def addCloseHandler(handler: Handler): PopupPanel
  def addStyleDependentName(styleName: java.lang.String): PopupPanel
  def addStyleName(styleName: java.lang.String): PopupPanel
  def clear(): PopupPanel
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def hide(): PopupPanel
  def setAnimationEnabled(animationEnabled: scala.Boolean): PopupPanel
  def setAutoHideEnabled(enabled: scala.Boolean): PopupPanel
  def setGlassEnabled(enabled: scala.Boolean): PopupPanel
  def setGlassStyleName(styleName: java.lang.String): PopupPanel
  def setHeight(height: java.lang.String): PopupPanel
  def setId(id: java.lang.String): PopupPanel
  def setLayoutData(layout: js.Object): PopupPanel
  def setModal(modal: scala.Boolean): PopupPanel
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): PopupPanel
  def setPopupPosition(
    left: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    top: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): PopupPanel
  def setPopupPositionAndShow(a: Component): PopupPanel
  def setPreviewingAllNativeEvents(previewing: scala.Boolean): PopupPanel
  def setSize(width: java.lang.String, height: java.lang.String): PopupPanel
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): PopupPanel
  def setStyleAttributes(attributes: js.Object): PopupPanel
  def setStyleName(styleName: java.lang.String): PopupPanel
  def setStylePrimaryName(styleName: java.lang.String): PopupPanel
  def setTag(tag: java.lang.String): PopupPanel
  def setTitle(title: java.lang.String): PopupPanel
  def setVisible(visible: scala.Boolean): PopupPanel
  def setWidget(widget: Widget): PopupPanel
  def setWidth(width: java.lang.String): PopupPanel
  def show(): PopupPanel
}

