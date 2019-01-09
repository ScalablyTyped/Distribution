package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PopulateWindowTypes extends js.Object {
  /**
    * If true, the `windows.Window` returned will have a `tabs` property that contains a list of the `tabs.Tab`
    * objects. The `Tab` objects only contain the `url`, `title` and `favIconUrl` properties if the extension's
    * manifest file includes the `"tabs"` permission.
    */
  var populate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set, the `windows.Window` returned will be filtered based on its type. If unset the default filter is set
    * to `['app', 'normal', 'panel', 'popup']`, with `'app'` and `'panel'` window types limited to the extension's
    * own windows.
    * @deprecated If set, the `windows.Window` returned will be filtered based on its type. If unset the default
    *     filter is set to `['app', 'normal', 'panel', 'popup']`, with `'app'` and `'panel'` window types limited
    *     to the extension's own windows.
    */
  var windowTypes: js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.browserNs.windowsNs.WindowType]] = js.undefined
}

