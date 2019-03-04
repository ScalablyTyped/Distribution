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
    add: js.Function1[Widget, DialogBox],
    addAutoHidePartner: js.Function1[Component, DialogBox],
    addCloseHandler: js.Function1[Handler, DialogBox],
    addStyleDependentName: js.Function1[java.lang.String, DialogBox],
    addStyleName: js.Function1[java.lang.String, DialogBox],
    clear: js.Function0[DialogBox],
    getId: js.Function0[java.lang.String],
    getTag: js.Function0[java.lang.String],
    getType: js.Function0[java.lang.String],
    hide: js.Function0[DialogBox],
    setAnimationEnabled: js.Function1[scala.Boolean, DialogBox],
    setAutoHideEnabled: js.Function1[scala.Boolean, DialogBox],
    setGlassEnabled: js.Function1[scala.Boolean, DialogBox],
    setGlassStyleName: js.Function1[java.lang.String, DialogBox],
    setHTML: js.Function1[java.lang.String, DialogBox],
    setHeight: js.Function1[java.lang.String, DialogBox],
    setId: js.Function1[java.lang.String, DialogBox],
    setLayoutData: js.Function1[js.Object, DialogBox],
    setModal: js.Function1[scala.Boolean, DialogBox],
    setPixelSize: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      DialogBox
    ],
    setPopupPosition: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      DialogBox
    ],
    setPopupPositionAndShow: js.Function1[Component, DialogBox],
    setPreviewingAllNativeEvents: js.Function1[scala.Boolean, DialogBox],
    setSize: js.Function2[java.lang.String, java.lang.String, DialogBox],
    setStyleAttribute: js.Function2[java.lang.String, java.lang.String, DialogBox],
    setStyleAttributes: js.Function1[js.Object, DialogBox],
    setStyleName: js.Function1[java.lang.String, DialogBox],
    setStylePrimaryName: js.Function1[java.lang.String, DialogBox],
    setTag: js.Function1[java.lang.String, DialogBox],
    setText: js.Function1[java.lang.String, DialogBox],
    setTitle: js.Function1[java.lang.String, DialogBox],
    setVisible: js.Function1[scala.Boolean, DialogBox],
    setWidget: js.Function1[Widget, DialogBox],
    setWidth: js.Function1[java.lang.String, DialogBox],
    show: js.Function0[DialogBox]
  ): DialogBox = {
    val __obj = js.Dynamic.literal(add = add, addAutoHidePartner = addAutoHidePartner, addCloseHandler = addCloseHandler, addStyleDependentName = addStyleDependentName, addStyleName = addStyleName, clear = clear, getId = getId, getTag = getTag, getType = getType, hide = hide, setAnimationEnabled = setAnimationEnabled, setAutoHideEnabled = setAutoHideEnabled, setGlassEnabled = setGlassEnabled, setGlassStyleName = setGlassStyleName, setHTML = setHTML, setHeight = setHeight, setId = setId, setLayoutData = setLayoutData, setModal = setModal, setPixelSize = setPixelSize, setPopupPosition = setPopupPosition, setPopupPositionAndShow = setPopupPositionAndShow, setPreviewingAllNativeEvents = setPreviewingAllNativeEvents, setSize = setSize, setStyleAttribute = setStyleAttribute, setStyleAttributes = setStyleAttributes, setStyleName = setStyleName, setStylePrimaryName = setStylePrimaryName, setTag = setTag, setText = setText, setTitle = setTitle, setVisible = setVisible, setWidget = setWidget, setWidth = setWidth, show = show)
  
    __obj.asInstanceOf[DialogBox]
  }
}

