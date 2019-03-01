package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValue extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): KeyValue
  def setBottomLabel(text: java.lang.String): KeyValue
  def setButton(button: Button): KeyValue
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): KeyValue
  def setContent(text: java.lang.String): KeyValue
  def setIcon(icon: Icon): KeyValue
  def setIconAltText(altText: java.lang.String): KeyValue
  def setIconUrl(url: java.lang.String): KeyValue
  def setMultiline(multiline: scala.Boolean): KeyValue
  def setOnClickAction(action: Action): KeyValue
  def setOnClickOpenLinkAction(action: Action): KeyValue
  def setOpenLink(openLink: OpenLink): KeyValue
  def setSwitch(switchToSet: Switch): KeyValue
  def setTopLabel(text: java.lang.String): KeyValue
}

object KeyValue {
  @scala.inline
  def apply(
    setAuthorizationAction: js.Function1[AuthorizationAction, KeyValue],
    setBottomLabel: js.Function1[java.lang.String, KeyValue],
    setButton: js.Function1[Button, KeyValue],
    setComposeAction: js.Function2[Action, ComposedEmailType, KeyValue],
    setContent: js.Function1[java.lang.String, KeyValue],
    setIcon: js.Function1[Icon, KeyValue],
    setIconAltText: js.Function1[java.lang.String, KeyValue],
    setIconUrl: js.Function1[java.lang.String, KeyValue],
    setMultiline: js.Function1[scala.Boolean, KeyValue],
    setOnClickAction: js.Function1[Action, KeyValue],
    setOnClickOpenLinkAction: js.Function1[Action, KeyValue],
    setOpenLink: js.Function1[OpenLink, KeyValue],
    setSwitch: js.Function1[Switch, KeyValue],
    setTopLabel: js.Function1[java.lang.String, KeyValue]
  ): KeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAuthorizationAction")(setAuthorizationAction)
    __obj.updateDynamic("setBottomLabel")(setBottomLabel)
    __obj.updateDynamic("setButton")(setButton)
    __obj.updateDynamic("setComposeAction")(setComposeAction)
    __obj.updateDynamic("setContent")(setContent)
    __obj.updateDynamic("setIcon")(setIcon)
    __obj.updateDynamic("setIconAltText")(setIconAltText)
    __obj.updateDynamic("setIconUrl")(setIconUrl)
    __obj.updateDynamic("setMultiline")(setMultiline)
    __obj.updateDynamic("setOnClickAction")(setOnClickAction)
    __obj.updateDynamic("setOnClickOpenLinkAction")(setOnClickOpenLinkAction)
    __obj.updateDynamic("setOpenLink")(setOpenLink)
    __obj.updateDynamic("setSwitch")(setSwitch)
    __obj.updateDynamic("setTopLabel")(setTopLabel)
    __obj.asInstanceOf[KeyValue]
  }
}

