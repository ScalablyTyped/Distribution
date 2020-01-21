package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindFullHashesRequest extends js.Object {
  /**
    * Client metadata associated with callers of higher-level APIs built on top
    * of the client's implementation.
    */
  var apiClient: js.UndefOr[ClientInfo] = js.undefined
  /** The client metadata. */
  var client: js.UndefOr[ClientInfo] = js.undefined
  /** The current client states for each of the client's local threat lists. */
  var clientStates: js.UndefOr[js.Array[String]] = js.undefined
  /** The lists and hashes to be checked. */
  var threatInfo: js.UndefOr[ThreatInfo] = js.undefined
}

object FindFullHashesRequest {
  @scala.inline
  def apply(
    apiClient: ClientInfo = null,
    client: ClientInfo = null,
    clientStates: js.Array[String] = null,
    threatInfo: ThreatInfo = null
  ): FindFullHashesRequest = {
    val __obj = js.Dynamic.literal()
    if (apiClient != null) __obj.updateDynamic("apiClient")(apiClient.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (clientStates != null) __obj.updateDynamic("clientStates")(clientStates.asInstanceOf[js.Any])
    if (threatInfo != null) __obj.updateDynamic("threatInfo")(threatInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindFullHashesRequest]
  }
}

