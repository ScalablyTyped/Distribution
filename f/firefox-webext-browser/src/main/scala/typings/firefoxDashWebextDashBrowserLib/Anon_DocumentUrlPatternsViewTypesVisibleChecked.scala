package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentUrlPatternsViewTypesVisibleChecked extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var contexts: js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.browserNs.menusNs.ContextType]] = js.undefined
  var documentUrlPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var icons: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[java.lang.String]] = js.undefined
  /**
    * @param tab The details of the tab where the click took place. Note: this parameter only present for
    *     extensions.
    */
  var onclick: js.UndefOr[
    js.Function2[
      /* info */ firefoxDashWebextDashBrowserLib.browserNs.menusNs.OnClickData, 
      /* tab */ firefoxDashWebextDashBrowserLib.browserNs.tabsNs.Tab, 
      scala.Unit
    ]
  ] = js.undefined
  /** Note: You cannot change an item to be a child of one of its own descendants. */
  var parentId: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var targetUrlPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.menusNs.ItemType] = js.undefined
  var viewTypes: js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.browserNs.extensionNs.ViewType]] = js.undefined
  /** Whether the item is visible in the menu. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

