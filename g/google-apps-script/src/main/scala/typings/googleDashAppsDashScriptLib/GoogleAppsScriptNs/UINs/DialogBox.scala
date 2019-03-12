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

object DialogBox {
  @scala.inline
  def apply(
    add: Widget => DialogBox,
    addAutoHidePartner: Component => DialogBox,
    addCloseHandler: Handler => DialogBox,
    addStyleDependentName: java.lang.String => DialogBox,
    addStyleName: java.lang.String => DialogBox,
    clear: () => DialogBox,
    getId: () => java.lang.String,
    getTag: () => java.lang.String,
    getType: () => java.lang.String,
    hide: () => DialogBox,
    setAnimationEnabled: scala.Boolean => DialogBox,
    setAutoHideEnabled: scala.Boolean => DialogBox,
    setGlassEnabled: scala.Boolean => DialogBox,
    setGlassStyleName: java.lang.String => DialogBox,
    setHTML: java.lang.String => DialogBox,
    setHeight: java.lang.String => DialogBox,
    setId: java.lang.String => DialogBox,
    setLayoutData: js.Object => DialogBox,
    setModal: scala.Boolean => DialogBox,
    setPixelSize: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => DialogBox,
    setPopupPosition: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => DialogBox,
    setPopupPositionAndShow: Component => DialogBox,
    setPreviewingAllNativeEvents: scala.Boolean => DialogBox,
    setSize: (java.lang.String, java.lang.String) => DialogBox,
    setStyleAttribute: (java.lang.String, java.lang.String) => DialogBox,
    setStyleAttributes: js.Object => DialogBox,
    setStyleName: java.lang.String => DialogBox,
    setStylePrimaryName: java.lang.String => DialogBox,
    setTag: java.lang.String => DialogBox,
    setText: java.lang.String => DialogBox,
    setTitle: java.lang.String => DialogBox,
    setVisible: scala.Boolean => DialogBox,
    setWidget: Widget => DialogBox,
    setWidth: java.lang.String => DialogBox,
    show: () => DialogBox
  ): DialogBox = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAutoHidePartner = js.Any.fromFunction1(addAutoHidePartner), addCloseHandler = js.Any.fromFunction1(addCloseHandler), addStyleDependentName = js.Any.fromFunction1(addStyleDependentName), addStyleName = js.Any.fromFunction1(addStyleName), clear = js.Any.fromFunction0(clear), getId = js.Any.fromFunction0(getId), getTag = js.Any.fromFunction0(getTag), getType = js.Any.fromFunction0(getType), hide = js.Any.fromFunction0(hide), setAnimationEnabled = js.Any.fromFunction1(setAnimationEnabled), setAutoHideEnabled = js.Any.fromFunction1(setAutoHideEnabled), setGlassEnabled = js.Any.fromFunction1(setGlassEnabled), setGlassStyleName = js.Any.fromFunction1(setGlassStyleName), setHTML = js.Any.fromFunction1(setHTML), setHeight = js.Any.fromFunction1(setHeight), setId = js.Any.fromFunction1(setId), setLayoutData = js.Any.fromFunction1(setLayoutData), setModal = js.Any.fromFunction1(setModal), setPixelSize = js.Any.fromFunction2(setPixelSize), setPopupPosition = js.Any.fromFunction2(setPopupPosition), setPopupPositionAndShow = js.Any.fromFunction1(setPopupPositionAndShow), setPreviewingAllNativeEvents = js.Any.fromFunction1(setPreviewingAllNativeEvents), setSize = js.Any.fromFunction2(setSize), setStyleAttribute = js.Any.fromFunction2(setStyleAttribute), setStyleAttributes = js.Any.fromFunction1(setStyleAttributes), setStyleName = js.Any.fromFunction1(setStyleName), setStylePrimaryName = js.Any.fromFunction1(setStylePrimaryName), setTag = js.Any.fromFunction1(setTag), setText = js.Any.fromFunction1(setText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), setWidget = js.Any.fromFunction1(setWidget), setWidth = js.Any.fromFunction1(setWidth), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[DialogBox]
  }
}

