package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DialogBox extends js.Object {
  def add(widget: Widget): DialogBox
  def addAutoHidePartner(partner: Component): DialogBox
  def addCloseHandler(handler: Handler): DialogBox
  def addStyleDependentName(styleName: java.lang.String): DialogBox
  def addStyleName(styleName: java.lang.String): DialogBox
  def clear(): DialogBox
  def getId(): java.lang.String
  def getTag(): java.lang.String
  def getType(): java.lang.String
  def hide(): DialogBox
  def setAnimationEnabled(animationEnabled: scala.Boolean): DialogBox
  def setAutoHideEnabled(enabled: scala.Boolean): DialogBox
  def setGlassEnabled(enabled: scala.Boolean): DialogBox
  def setGlassStyleName(styleName: java.lang.String): DialogBox
  def setHTML(html: java.lang.String): DialogBox
  def setHeight(height: java.lang.String): DialogBox
  def setId(id: java.lang.String): DialogBox
  def setLayoutData(layout: js.Object): DialogBox
  def setModal(modal: scala.Boolean): DialogBox
  def setPixelSize(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): DialogBox
  def setPopupPosition(
    left: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    top: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): DialogBox
  def setPopupPositionAndShow(a: Component): DialogBox
  def setPreviewingAllNativeEvents(previewing: scala.Boolean): DialogBox
  def setSize(width: java.lang.String, height: java.lang.String): DialogBox
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): DialogBox
  def setStyleAttributes(attributes: js.Object): DialogBox
  def setStyleName(styleName: java.lang.String): DialogBox
  def setStylePrimaryName(styleName: java.lang.String): DialogBox
  def setTag(tag: java.lang.String): DialogBox
  def setText(text: java.lang.String): DialogBox
  def setTitle(title: java.lang.String): DialogBox
  def setVisible(visible: scala.Boolean): DialogBox
  def setWidget(widget: Widget): DialogBox
  def setWidth(width: java.lang.String): DialogBox
  def show(): DialogBox
}

