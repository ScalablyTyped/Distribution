package typings.fundamentalReact.shellbarMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.AnonArgs
import typings.fundamentalReact.AnonCallbackEvent
import typings.fundamentalReact.AnonCallbackEventGlyph
import typings.fundamentalReact.AnonCallbackEventLabel
import typings.fundamentalReact.AnonCounterLabelNotificationsButton
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellbarProps
  extends /* x */ StringDictionary[js.Any] {
  /* Holds all product actions and links. */
  var actions: js.UndefOr[js.Array[AnonCallbackEvent]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /* For use with applications that utilize CoPilot. */
  var copilot: js.UndefOr[Boolean] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var localizedText: js.UndefOr[AnonCounterLabelNotificationsButton] = js.undefined
  /* Provide an img tag for a logo other than the SAP logo. One of the two props (`logo` or `logoSAP`) should be set. */
  var logo: js.UndefOr[ReactNode] = js.undefined
  /* Renders the SAP logo in the Shellbar. One of the two props (`logo` or `logoSAP`) should be set. */
  var logoSAP: js.UndefOr[Boolean] = js.undefined
  /* Information about pending notifications. */
  var notifications: js.UndefOr[AnonCallbackEventLabel] = js.undefined
  /* Holds product titles and navigation. */
  var productMenu: js.UndefOr[js.Array[AnonArgs]] = js.undefined
  /* For navigating between products. */
  var productSwitcher: js.UndefOr[js.Object] = js.undefined
  /* List of the products. */
  var productSwitcherList: js.UndefOr[js.Array[AnonCallbackEventGlyph]] = js.undefined
  /* Displays the current application when no product menu is used. */
  var productTitle: js.UndefOr[String] = js.undefined
  /* User information (_e.g._ name, initials, etc.) */
  var profile: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* List of items for the profile menu. */
  var profileMenu: js.UndefOr[js.Array[StringDictionary[_]]] = js.undefined
  /* Holds `searchInput` properties. */
  var searchInput: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Displays an application context. Should be used rarely. */
  var subtitle: js.UndefOr[String] = js.undefined
}

object ShellbarProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    actions: js.Array[AnonCallbackEvent] = null,
    className: String = null,
    copilot: js.UndefOr[Boolean] = js.undefined,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    localizedText: AnonCounterLabelNotificationsButton = null,
    logo: ReactNode = null,
    logoSAP: js.UndefOr[Boolean] = js.undefined,
    notifications: AnonCallbackEventLabel = null,
    productMenu: js.Array[AnonArgs] = null,
    productSwitcher: js.Object = null,
    productSwitcherList: js.Array[AnonCallbackEventGlyph] = null,
    productTitle: String = null,
    profile: StringDictionary[js.Any] = null,
    profileMenu: js.Array[StringDictionary[_]] = null,
    searchInput: StringDictionary[js.Any] = null,
    subtitle: String = null
  ): ShellbarProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(copilot)) __obj.updateDynamic("copilot")(copilot.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(logoSAP)) __obj.updateDynamic("logoSAP")(logoSAP.asInstanceOf[js.Any])
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    if (productMenu != null) __obj.updateDynamic("productMenu")(productMenu.asInstanceOf[js.Any])
    if (productSwitcher != null) __obj.updateDynamic("productSwitcher")(productSwitcher.asInstanceOf[js.Any])
    if (productSwitcherList != null) __obj.updateDynamic("productSwitcherList")(productSwitcherList.asInstanceOf[js.Any])
    if (productTitle != null) __obj.updateDynamic("productTitle")(productTitle.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (profileMenu != null) __obj.updateDynamic("profileMenu")(profileMenu.asInstanceOf[js.Any])
    if (searchInput != null) __obj.updateDynamic("searchInput")(searchInput.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellbarProps]
  }
}

