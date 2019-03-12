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

object PopupPanel {
  @scala.inline
  def apply(
    add: Widget => PopupPanel,
    addAutoHidePartner: Component => PopupPanel,
    addCloseHandler: Handler => PopupPanel,
    addStyleDependentName: java.lang.String => PopupPanel,
    addStyleName: java.lang.String => PopupPanel,
    clear: () => PopupPanel,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    hide: () => PopupPanel,
    setAnimationEnabled: scala.Boolean => PopupPanel,
    setAutoHideEnabled: scala.Boolean => PopupPanel,
    setGlassEnabled: scala.Boolean => PopupPanel,
    setGlassStyleName: java.lang.String => PopupPanel,
    setHeight: java.lang.String => PopupPanel,
    setId: java.lang.String => PopupPanel,
    setLayoutData: js.Object => PopupPanel,
    setModal: scala.Boolean => PopupPanel,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => PopupPanel,
    setPopupPosition: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => PopupPanel,
    setPopupPositionAndShow: Component => PopupPanel,
    setPreviewingAllNativeEvents: scala.Boolean => PopupPanel,
    setSize: (java.lang.String, java.lang.String) => PopupPanel,
    setStyleAttribute: (java.lang.String, java.lang.String) => PopupPanel,
    setStyleAttributes: js.Object => PopupPanel,
    setStyleName: java.lang.String => PopupPanel,
    setStylePrimaryName: java.lang.String => PopupPanel,
    setTag: java.lang.String => PopupPanel,
    setTitle: java.lang.String => PopupPanel,
    setVisible: scala.Boolean => PopupPanel,
    setWidget: Widget => PopupPanel,
    setWidth: java.lang.String => PopupPanel,
    show: () => PopupPanel
  ): PopupPanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAutoHidePartner = js.Any.fromFunction1(addAutoHidePartner), addCloseHandler = js.Any.fromFunction1(addCloseHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), hide = js.Any.fromFunction0(hide), setAnimationEnabled = js.Any.fromFunction1(setAnimationEnabled), setAutoHideEnabled = js.Any.fromFunction1(setAutoHideEnabled), setGlassEnabled = js.Any.fromFunction1(setGlassEnabled), setGlassStyleName = js.Any.fromFunction1(setGlassStyleName), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setModal = js.Any.fromFunction1(setModal), setPixelSize = js.Any.fromFunction2(setPixelSize), setPopupPosition = js.Any.fromFunction2(setPopupPosition), setPopupPositionAndShow = js.Any.fromFunction1(setPopupPositionAndShow), setPreviewingAllNativeEvents = js.Any.fromFunction1(setPreviewingAllNativeEvents), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[PopupPanel]
  }
}

