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
    __obj.updateDynamic("setHTML")(setHTML)
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
    __obj.updateDynamic("setText")(setText)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("setWidget")(setWidget)
    __obj.updateDynamic("setWidth")(setWidth)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[DialogBox]
  }
}

