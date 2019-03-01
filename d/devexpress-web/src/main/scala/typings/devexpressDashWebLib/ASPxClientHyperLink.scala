package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxHyperLink control.
  */
trait ASPxClientHyperLink extends ASPxClientStaticEdit {
  /**
    * Gets an URL which defines the navigation location for the editor's hyperlink.
    */
  def GetNavigateUrl(): java.lang.String
  /**
    * Gets the text caption displayed for the hyperlink in the hyperlink editor.
    */
  def GetText(): java.lang.String
  /**
    * Specifies an URL which defines the navigation location for the editor's hyperlink.
    * @param url A string value which specifies an URL to where the client web browser will navigate when a hyperlink in the editor is clicked.
    */
  def SetNavigateUrl(url: java.lang.String): scala.Unit
  /**
    * Specifies the text caption displayed for the hyperlink in the hyperlink editor.
    * @param text A string value specifying the text caption for the hyperlink in the editor.
    */
  def SetText(text: java.lang.String): scala.Unit
}

object ASPxClientHyperLink {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    Click: ASPxClientEvent[ASPxClientEditEventHandler[ASPxClientStaticEdit]],
    GetCaption: js.Function0[java.lang.String],
    GetClientVisible: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetNavigateUrl: js.Function0[java.lang.String],
    GetParentControl: js.Function0[js.Object],
    GetText: js.Function0[java.lang.String],
    GetValue: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetCaption: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetNavigateUrl: js.Function1[java.lang.String, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetValue: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientHyperLink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("Click")(Click)
    __obj.updateDynamic("GetCaption")(GetCaption)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetNavigateUrl")(GetNavigateUrl)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetText")(GetText)
    __obj.updateDynamic("GetValue")(GetValue)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetCaption")(SetCaption)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetNavigateUrl")(SetNavigateUrl)
    __obj.updateDynamic("SetText")(SetText)
    __obj.updateDynamic("SetValue")(SetValue)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientHyperLink]
  }
}

