package typings.gapiDotClientDotSafebrowsing.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientInfo extends js.Object {
  /**
    * A client ID that (hopefully) uniquely identifies the client implementation
    * of the Safe Browsing API.
    */
  var clientId: js.UndefOr[String] = js.undefined
  /** The version of the client implementation. */
  var clientVersion: js.UndefOr[String] = js.undefined
}

object ClientInfo {
  @scala.inline
  def apply(clientId: String = null, clientVersion: String = null): ClientInfo = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientVersion != null) __obj.updateDynamic("clientVersion")(clientVersion)
    __obj.asInstanceOf[ClientInfo]
  }
}

