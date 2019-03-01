package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object proxyNs {
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
