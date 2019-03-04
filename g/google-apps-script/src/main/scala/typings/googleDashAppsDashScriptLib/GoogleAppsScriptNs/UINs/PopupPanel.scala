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
    add: js.Function1[Widget, PopupPanel],
    addAutoHidePartner: js.Function1[Component, PopupPanel],
    addCloseHandler: js.Function1[Handler, PopupPanel],
    addStyleDependentName: js.Function1[java.lang.String, PopupPanel],
    addStyleName: js.Function1[java.lang.String, PopupPanel],
    clear: js.Function0[PopupPanel],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    hide: js.Function0[PopupPanel],
    setAnimationEnabled: js.Function1[scala.Boolean, PopupPanel],
    setAutoHideEnabled: js.Function1[scala.Boolean, PopupPanel],
    setGlassEnabled: js.Function1[scala.Boolean, PopupPanel],
    setGlassStyleName: js.Function1[java.lang.String, PopupPanel],
    setHeight: js.Function1[java.lang.String, PopupPanel],
    setId: js.Function1[java.lang.String, PopupPanel],
    setLayoutData: js.Function1[js.Object, PopupPanel],
    setModal: js.Function1[scala.Boolean, PopupPanel],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      PopupPanel
    ],
    setPopupPosition: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      PopupPanel
    ],
    setPopupPositionAndShow: js.Function1[Component, PopupPanel],
    setPreviewingAllNativeEvents: js.Function1[scala.Boolean, PopupPanel],
    setSize: js.Function2[java.lang.String, java.lang.String, PopupPanel],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, PopupPanel],
    setStyleAttributes: js.Function1[js.Object, PopupPanel],
    setStyleName: js.Function1[java.lang.String, PopupPanel],
    setStylePrimaryName: js.Function1[java.lang.String, PopupPanel],
    setTag: js.Function1[java.lang.String, PopupPanel],
    setTitle: js.Function1[java.lang.String, PopupPanel],
    setVisible: js.Function1[scala.Boolean, PopupPanel],
    setWidget: js.Function1[Widget, PopupPanel],
    setWidth: js.Function1[java.lang.String, PopupPanel],
    show: js.Function0[PopupPanel]
  ): PopupPanel = {
    val __obj = js.Dynamic.literal(add = add, addAutoHidePartner = addAutoHidePartner, addCloseHandler = addCloseHandler, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, clear = clear, getId = getId, getTag = getTag, getType = getType, hide = hide, setAnimationEnabled = setAnimationEnabled, setAutoHideEnabled = setAutoHideEnabled, setGlassEnabled = setGlassEnabled, setGlassStyleName = setGlassStyleName, setHeight = setHeight, setId = setId, setLayoutData = setLayoutData, setModal = setModal, setPixelSize = setPixelSize, setPopupPosition = setPopupPosition, setPopupPositionAndShow = setPopupPositionAndShow, setPreviewingAllNativeEvents = setPreviewingAllNativeEvents, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTag = setTag, setTitle = setTitle, setVisible = setVisible, setWidget = setWidget, setWidth = setWidth, show = show)
  
    __obj.asInstanceOf[PopupPanel]
  }
}

