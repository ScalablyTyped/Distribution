package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckedContexts extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var contexts: js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.browserNs.contextMenusNs.ContextType]] = js.undefined
  var documentUrlPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var icons: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[java.lang.String]] = js.undefined
  /**
    * @param tab The details of the tab where the click took place. Note: this parameter only present for
    *     extensions.
    */
  var onclick: js.UndefOr[
    js.Function2[
      /* info */ firefoxDashWebextDashBrowserLib.browserNs.contextMenusNs.OnClickData, 
      /* tab */ firefoxDashWebextDashBrowserLib.browserNs.tabsNs.Tab, 
      scala.Unit
    ]
  ] = js.undefined
  /** Note: You cannot change an item to be a child of one of its own descendants. */
  var parentId: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var targetUrlPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.contextMenusNs.ItemType] = js.undefined
  var viewTypes: js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.browserNs.extensionNs.ViewType]] = js.undefined
  /** Whether the item is visible in the menu. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CheckedContexts {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    contexts: js.Array[firefoxDashWebextDashBrowserLib.browserNs.contextMenusNs.ContextType] = null,
    documentUrlPatterns: js.Array[java.lang.String] = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    icons: org.scalablytyped.runtime.NumberDictionary[java.lang.String] = null,
    onclick: (/* info */ firefoxDashWebextDashBrowserLib.browserNs.contextMenusNs.OnClickData, /* tab */ firefoxDashWebextDashBrowserLib.browserNs.tabsNs.Tab) => scala.Unit = null,
    parentId: scala.Double | java.lang.String = null,
    targetUrlPatterns: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    `type`: firefoxDashWebextDashBrowserLib.browserNs.contextMenusNs.ItemType = null,
    viewTypes: js.Array[firefoxDashWebextDashBrowserLib.browserNs.extensionNs.ViewType] = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CheckedContexts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (contexts != null) __obj.updateDynamic("contexts")(contexts)
    if (documentUrlPatterns != null) __obj.updateDynamic("documentUrlPatterns")(documentUrlPatterns)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction2(onclick))
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (targetUrlPatterns != null) __obj.updateDynamic("targetUrlPatterns")(targetUrlPatterns)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (viewTypes != null) __obj.updateDynamic("viewTypes")(viewTypes)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Anon_CheckedContexts]
  }
}

