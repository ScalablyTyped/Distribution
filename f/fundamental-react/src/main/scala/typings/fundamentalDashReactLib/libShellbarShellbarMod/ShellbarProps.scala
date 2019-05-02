package typings
package fundamentalDashReactLib.libShellbarShellbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellbarProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* Holds all product actions and links. */
  var actions: js.UndefOr[js.Array[fundamentalDashReactLib.Anon_CallbackEvent]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* For use with applications that utilize CoPilot. */
  var copilot: js.UndefOr[scala.Boolean] = js.undefined
  var localizedText: js.UndefOr[fundamentalDashReactLib.Anon_CounterLabelNotificationsButton] = js.undefined
  /* Provide an img tag for a logo other than the SAP logo. One of the two props (`logo` or `logoSAP`) should be set. */
  var logo: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /* Renders the SAP logo in the Shellbar. One of the two props (`logo` or `logoSAP`) should be set. */
  var logoSAP: js.UndefOr[scala.Boolean] = js.undefined
  /* Information about pending notifications. */
  var notifications: js.UndefOr[fundamentalDashReactLib.Anon_CallbackEventLabel] = js.undefined
  /* Holds product titles and navigation. */
  var productMenu: js.UndefOr[js.Array[fundamentalDashReactLib.Anon_Args]] = js.undefined
  /* For navigating between products. */
  var productSwitcher: js.UndefOr[js.Object] = js.undefined
  /* List of the products. */
  var productSwitcherList: js.UndefOr[js.Array[fundamentalDashReactLib.Anon_CallbackEventGlyph]] = js.undefined
  /* Displays the current application when no product menu is used. */
  var productTitle: js.UndefOr[java.lang.String] = js.undefined
  /* User information (_e.g._ name, initials, etc.) */
  var profile: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* List of items for the profile menu. */
  var profileMenu: js.UndefOr[js.Array[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /* Holds `searchInput` properties. */
  var searchInput: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Displays an application context. Should be used rarely. */
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
}

object ShellbarProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    actions: js.Array[fundamentalDashReactLib.Anon_CallbackEvent] = null,
    className: java.lang.String = null,
    copilot: js.UndefOr[scala.Boolean] = js.undefined,
    localizedText: fundamentalDashReactLib.Anon_CounterLabelNotificationsButton = null,
    logo: reactLib.reactMod.ReactNode = null,
    logoSAP: js.UndefOr[scala.Boolean] = js.undefined,
    notifications: fundamentalDashReactLib.Anon_CallbackEventLabel = null,
    productMenu: js.Array[fundamentalDashReactLib.Anon_Args] = null,
    productSwitcher: js.Object = null,
    productSwitcherList: js.Array[fundamentalDashReactLib.Anon_CallbackEventGlyph] = null,
    productTitle: java.lang.String = null,
    profile: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    profileMenu: js.Array[org.scalablytyped.runtime.StringDictionary[_]] = null,
    searchInput: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    subtitle: java.lang.String = null
  ): ShellbarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(copilot)) __obj.updateDynamic("copilot")(copilot)
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(logoSAP)) __obj.updateDynamic("logoSAP")(logoSAP)
    if (notifications != null) __obj.updateDynamic("notifications")(notifications)
    if (productMenu != null) __obj.updateDynamic("productMenu")(productMenu)
    if (productSwitcher != null) __obj.updateDynamic("productSwitcher")(productSwitcher)
    if (productSwitcherList != null) __obj.updateDynamic("productSwitcherList")(productSwitcherList)
    if (productTitle != null) __obj.updateDynamic("productTitle")(productTitle)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (profileMenu != null) __obj.updateDynamic("profileMenu")(profileMenu)
    if (searchInput != null) __obj.updateDynamic("searchInput")(searchInput)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    __obj.asInstanceOf[ShellbarProps]
  }
}

