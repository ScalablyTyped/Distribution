package typings.firefoxDashWebextDashBrowser.browserNs

import typings.firefoxDashWebextDashBrowser.Anon_BinaryValue
import typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.cipher
import typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.requestHeaders
import typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.responseHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webRequestNs {
  /**
    * An array of HTTP headers. Each header is represented as a dictionary containing the keys `name` and either
    * `value` or `binaryValue`.
    */
  type HttpHeaders = js.Array[Anon_BinaryValue]
  type OnBeforeRedirectOptions = responseHeaders
  type OnCompletedOptions = responseHeaders
  type OnResponseStartedOptions = responseHeaders
  type OnSendHeadersOptions = requestHeaders
  type TransportWeaknessReasons = cipher
}
