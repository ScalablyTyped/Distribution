package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to return full hashes matched by the provided hash prefixes.
  */
@js.native
trait Schema$FindFullHashesRequest extends js.Object {
  /**
    * Client metadata associated with callers of higher-level APIs built on top
    * of the client&#39;s implementation.
    */
  var apiClient: js.UndefOr[Schema$ClientInfo] = js.native
  /**
    * The client metadata.
    */
  var client: js.UndefOr[Schema$ClientInfo] = js.native
  /**
    * The current client states for each of the client&#39;s local threat
    * lists.
    */
  var clientStates: js.UndefOr[js.Array[String]] = js.native
  /**
    * The lists and hashes to be checked.
    */
  var threatInfo: js.UndefOr[Schema$ThreatInfo] = js.native
}

object Schema$FindFullHashesRequest {
  @scala.inline
  def apply(
    apiClient: Schema$ClientInfo = null,
    client: Schema$ClientInfo = null,
    clientStates: js.Array[String] = null,
    threatInfo: Schema$ThreatInfo = null
  ): Schema$FindFullHashesRequest = {
    val __obj = js.Dynamic.literal()
    if (apiClient != null) __obj.updateDynamic("apiClient")(apiClient.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (clientStates != null) __obj.updateDynamic("clientStates")(clientStates.asInstanceOf[js.Any])
    if (threatInfo != null) __obj.updateDynamic("threatInfo")(threatInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FindFullHashesRequest]
  }
}

