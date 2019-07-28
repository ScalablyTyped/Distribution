package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogBox extends js.Object {
  def add(widget: Widget): DialogBox
  def addAutoHidePartner(partner: Component): DialogBox
  def addCloseHandler(handler: Handler): DialogBox
  def addStyleDependentName(styleName: String): DialogBox
  def addStyleName(styleName: String): DialogBox
  def clear(): DialogBox
  def getId(): String
  def getTag(): String
  def getType(): String
  def hide(): DialogBox
  def setAnimationEnabled(animationEnabled: Boolean): DialogBox
  def setAutoHideEnabled(enabled: Boolean): DialogBox
  def setGlassEnabled(enabled: Boolean): DialogBox
  def setGlassStyleName(styleName: String): DialogBox
  def setHTML(html: String): DialogBox
  def setHeight(height: String): DialogBox
  def setId(id: String): DialogBox
  def setLayoutData(layout: js.Any): DialogBox
  def setModal(modal: Boolean): DialogBox
  def setPixelSize(width: Integer, height: Integer): DialogBox
  def setPopupPosition(left: Integer, top: Integer): DialogBox
  def setPopupPositionAndShow(a: Component): DialogBox
  def setPreviewingAllNativeEvents(previewing: Boolean): DialogBox
  def setSize(width: String, height: String): DialogBox
  def setStyleAttribute(attribute: String, value: String): DialogBox
  def setStyleAttributes(attributes: js.Any): DialogBox
  def setStyleName(styleName: String): DialogBox
  def setStylePrimaryName(styleName: String): DialogBox
  def setTag(tag: String): DialogBox
  def setText(text: String): DialogBox
  def setTitle(title: String): DialogBox
  def setVisible(visible: Boolean): DialogBox
  def setWidget(widget: Widget): DialogBox
  def setWidth(width: String): DialogBox
  def show(): DialogBox
}

object DialogBox {
  @scala.inline
  def apply(
    add: Widget => DialogBox,
    addAutoHidePartner: Component => DialogBox,
    addCloseHandler: Handler => DialogBox,
    addStyleDependentName: String => DialogBox,
    addStyleName: String => DialogBox,
    clear: () => DialogBox,
    getId: () => String,
    getTag: () => String,
    getType: () => String,
    hide: () => DialogBox,
    setAnimationEnabled: Boolean => DialogBox,
    setAutoHideEnabled: Boolean => DialogBox,
    setGlassEnabled: Boolean => DialogBox,
    setGlassStyleName: String => DialogBox,
    setHTML: String => DialogBox,
    setHeight: String => DialogBox,
    setId: String => DialogBox,
    setLayoutData: js.Any => DialogBox,
    setModal: Boolean => DialogBox,
    setPixelSize: (Integer, Integer) => DialogBox,
    setPopupPosition: (Integer, Integer) => DialogBox,
    setPopupPositionAndShow: Component => DialogBox,
    setPreviewingAllNativeEvents: Boolean => DialogBox,
    setSize: (String, String) => DialogBox,
    setStyleAttribute: (String, String) => DialogBox,
    setStyleAttributes: js.Any => DialogBox,
    setStyleName: String => DialogBox,
    setStylePrimaryName: String => DialogBox,
    setTag: String => DialogBox,
    setText: String => DialogBox,
    setTitle: String => DialogBox,
    setVisible: Boolean => DialogBox,
    setWidget: Widget => DialogBox,
    setWidth: String => DialogBox,
    show: () => DialogBox
  ): DialogBox = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAutoHidePartner = js.Any.fromFunction1(addAutoHidePartner), addCloseHandler = js.Any.fromFunction1(addCloseHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), hide = js.Any.fromFunction0(hide), setAnimationEnabled = js.Any.fromFunction1(setAnimationEnabled), setAutoHideEnabled = js.Any.fromFunction1(setAutoHideEnabled), setGlassEnabled = js.Any.fromFunction1(setGlassEnabled), setGlassStyleName = js.Any.fromFunction1(setGlassStyleName), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setModal = js.Any.fromFunction1(setModal), setPixelSize = js.Any.fromFunction2(setPixelSize), setPopupPosition = js.Any.fromFunction2(setPopupPosition), setPopupPositionAndShow = js.Any.fromFunction1(setPopupPositionAndShow), setPreviewingAllNativeEvents = js.Any.fromFunction1(setPreviewingAllNativeEvents), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[DialogBox]
  }
}

