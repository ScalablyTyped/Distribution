package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webRequestNs {
  /**
    * An array of HTTP headers. Each header is represented as a dictionary containing the keys `name` and either
    * `value` or `binaryValue`.
    */
  type HttpHeaders = js.Array[firefoxDashWebextDashBrowserLib.Anon_BinaryValue]
  type OnBeforeRedirectOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.responseHeaders
  type OnCompletedOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.responseHeaders
  type OnResponseStartedOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.responseHeaders
  type OnSendHeadersOptions = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.requestHeaders
  type TransportWeaknessReasons = firefoxDashWebextDashBrowserLib.firefoxDashWebextDashBrowserLibStrings.cipher
}
