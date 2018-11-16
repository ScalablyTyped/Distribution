package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object proxyNs {
  /** The type of proxy to use. */
  type _ProxyConfigProxyType = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.none | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.autoDetect | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.system | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.manual | firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.autoConfig
  type _ProxyOnRequestEvent[T] = firefoxDashWebextDashBrowserLib.WebExtEventBase[
    js.Function3[
      /* callback */ T, 
      /* filter */ firefoxDashWebextDashBrowserLib.browserNs.webRequestNs.RequestFilter, 
      /* extraInfoSpec */ js.UndefOr[
        js.Array[
          firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.requestHeaders
        ]
      ], 
      scala.Unit
    ], 
    T
  ]
}
