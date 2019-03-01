package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindThreatMatchesRequest extends js.Object {
  /** The client metadata. */
  var client: js.UndefOr[ClientInfo] = js.undefined
  /** The lists and entries to be checked for matches. */
  var threatInfo: js.UndefOr[ThreatInfo] = js.undefined
}

object FindThreatMatchesRequest {
  @scala.inline
  def apply(client: ClientInfo = null, threatInfo: ThreatInfo = null): FindThreatMatchesRequest = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (threatInfo != null) __obj.updateDynamic("threatInfo")(threatInfo)
    __obj.asInstanceOf[FindThreatMatchesRequest]
  }
}

