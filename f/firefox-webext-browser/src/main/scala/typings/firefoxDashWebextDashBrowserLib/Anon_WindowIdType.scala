package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_WindowIdType extends js.Object {
  /** Find a view according to a tab id. If this field is omitted, returns all views. */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /**
           * The type of view to get. If omitted, returns all views (including background pages and tabs). Valid values:
           * 'tab', 'popup', 'sidebar'.
           */
  var `type`: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.extensionNs.ViewType] = js.undefined
  /** The window to restrict the search to. If omitted, returns all views. */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

