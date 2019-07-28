package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupPanel extends js.Object {
  def add(widget: Widget): PopupPanel
  def addAutoHidePartner(partner: Component): PopupPanel
  def addCloseHandler(handler: Handler): PopupPanel
  def addStyleDependentName(styleName: String): PopupPanel
  def addStyleName(styleName: String): PopupPanel
  def clear(): PopupPanel
  def getId(): String
  def getTag(): String
  def getType(): String
  def hide(): PopupPanel
  def setAnimationEnabled(animationEnabled: Boolean): PopupPanel
  def setAutoHideEnabled(enabled: Boolean): PopupPanel
  def setGlassEnabled(enabled: Boolean): PopupPanel
  def setGlassStyleName(styleName: String): PopupPanel
  def setHeight(height: String): PopupPanel
  def setId(id: String): PopupPanel
  def setLayoutData(layout: js.Any): PopupPanel
  def setModal(modal: Boolean): PopupPanel
  def setPixelSize(width: Integer, height: Integer): PopupPanel
  def setPopupPosition(left: Integer, top: Integer): PopupPanel
  def setPopupPositionAndShow(a: Component): PopupPanel
  def setPreviewingAllNativeEvents(previewing: Boolean): PopupPanel
  def setSize(width: String, height: String): PopupPanel
  def setStyleAttribute(attribute: String, value: String): PopupPanel
  def setStyleAttributes(attributes: js.Any): PopupPanel
  def setStyleName(styleName: String): PopupPanel
  def setStylePrimaryName(styleName: String): PopupPanel
  def setTag(tag: String): PopupPanel
  def setTitle(title: String): PopupPanel
  def setVisible(visible: Boolean): PopupPanel
  def setWidget(widget: Widget): PopupPanel
  def setWidth(width: String): PopupPanel
  def show(): PopupPanel
}

object PopupPanel {
  @scala.inline
  def apply(
    add: Widget => PopupPanel,
    addAutoHidePartner: Component => PopupPanel,
    addCloseHandler: Handler => PopupPanel,
    addStyleDependentName: String => PopupPanel,
    addStyleName: String => PopupPanel,
    clear: () => PopupPanel,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    hide: () => PopupPanel,
    setAnimationEnabled: Boolean => PopupPanel,
    setAutoHideEnabled: Boolean => PopupPanel,
    setGlassEnabled: Boolean => PopupPanel,
    setGlassStyleName: String => PopupPanel,
    setHeight: String => PopupPanel,
    setId: String => PopupPanel,
    setLayoutData: js.Any => PopupPanel,
    setModal: Boolean => PopupPanel,
    setPixelSize: (Integer, Integer) => PopupPanel,
    setPopupPosition: (Integer, Integer) => PopupPanel,
    setPopupPositionAndShow: Component => PopupPanel,
    setPreviewingAllNativeEvents: Boolean => PopupPanel,
    setSize: (String, String) => PopupPanel,
    setStyleAttribute: (String, String) => PopupPanel,
    setStyleAttributes: js.Any => PopupPanel,
    setStyleName: String => PopupPanel,
    setStylePrimaryName: String => PopupPanel,
    setTag: String => PopupPanel,
    setTitle: String => PopupPanel,
    setVisible: Boolean => PopupPanel,
    setWidget: Widget => PopupPanel,
    setWidth: String => PopupPanel,
    show: () => PopupPanel
  ): PopupPanel = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAutoHidePartner = js.Any.fromFunction1(addAutoHidePartner), addCloseHandler = js.Any.fromFunction1(addCloseHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), hide = js.Any.fromFunction0(hide), setAnimationEnabled = js.Any.fromFunction1(setAnimationEnabled), setAutoHideEnabled = js.Any.fromFunction1(setAutoHideEnabled), setGlassEnabled = js.Any.fromFunction1(setGlassEnabled), setGlassStyleName = js.Any.fromFunction1(setGlassStyleName), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setModal = js.Any.fromFunction1(setModal), setPixelSize = js.Any.fromFunction2(setPixelSize), setPopupPosition = js.Any.fromFunction2(setPopupPosition), setPopupPositionAndShow = js.Any.fromFunction1(setPopupPositionAndShow), setPreviewingAllNativeEvents = js.Any.fromFunction1(setPreviewingAllNativeEvents), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[PopupPanel]
  }
}

