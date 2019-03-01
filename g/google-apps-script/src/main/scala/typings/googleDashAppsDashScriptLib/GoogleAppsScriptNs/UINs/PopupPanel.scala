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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("addAutoHidePartner")(addAutoHidePartner)
    __obj.updateDynamic("addCloseHandler")(addCloseHandler)
    __obj.updateDynamic("addStyleDependentName")(addStyleDependentName)
    __obj.updateDynamic("addStyleName")(addStyleName)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getTag")(getTag)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("setAnimationEnabled")(setAnimationEnabled)
    __obj.updateDynamic("setAutoHideEnabled")(setAutoHideEnabled)
    __obj.updateDynamic("setGlassEnabled")(setGlassEnabled)
    __obj.updateDynamic("setGlassStyleName")(setGlassStyleName)
    __obj.updateDynamic("setHeight")(setHeight)
    __obj.updateDynamic("setId")(setId)
    __obj.updateDynamic("setLayoutData")(setLayoutData)
    __obj.updateDynamic("setModal")(setModal)
    __obj.updateDynamic("setPixelSize")(setPixelSize)
    __obj.updateDynamic("setPopupPosition")(setPopupPosition)
    __obj.updateDynamic("setPopupPositionAndShow")(setPopupPositionAndShow)
    __obj.updateDynamic("setPreviewingAllNativeEvents")(setPreviewingAllNativeEvents)
    __obj.updateDynamic("setSize")(setSize)
    __obj.updateDynamic("setStyleAttribute")(setStyleAttribute)
    __obj.updateDynamic("setStyleAttributes")(setStyleAttributes)
    __obj.updateDynamic("setStyleName")(setStyleName)
    __obj.updateDynamic("setStylePrimaryName")(setStylePrimaryName)
    __obj.updateDynamic("setTag")(setTag)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("setWidget")(setWidget)
    __obj.updateDynamic("setWidth")(setWidth)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[PopupPanel]
  }
}

