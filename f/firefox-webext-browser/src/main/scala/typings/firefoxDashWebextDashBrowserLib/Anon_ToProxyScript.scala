package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ToProxyScript extends js.Object {
  /**
    * Whether the TLS channel ID will be passed into onMessageExternal for processes that are listening for the
    * connection event.
    * @deprecated Unsupported on Firefox at this time.
    */
  var includeTlsChannelId: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, the message will be directed to the extension's proxy sandbox. */
  var toProxyScript: js.UndefOr[scala.Boolean] = js.undefined
}

