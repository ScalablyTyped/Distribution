package typings.gapiClientAdmin.gapi.client.admin

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  /** The address where notifications are delivered for this channel. */
  var address: js.UndefOr[String] = js.undefined
  /** Date and time of notification channel expiration, expressed as a Unix timestamp, in milliseconds. Optional. */
  var expiration: js.UndefOr[String] = js.undefined
  /** A UUID or similar unique string that identifies this channel. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies this as a notification channel used to watch for changes to a resource. Value: the fixed string "api#channel". */
  var kind: js.UndefOr[String] = js.undefined
  /** Additional parameters controlling delivery channel behavior. Optional. */
  var params: js.UndefOr[Record[String, String]] = js.undefined
  /** A Boolean value to indicate whether payload is wanted. Optional. */
  var payload: js.UndefOr[Boolean] = js.undefined
  /** An opaque ID that identifies the resource being watched on this channel. Stable across different API versions. */
  var resourceId: js.UndefOr[String] = js.undefined
  /** A version-specific identifier for the watched resource. */
  var resourceUri: js.UndefOr[String] = js.undefined
  /** An arbitrary string delivered to the target address with each notification delivered over this channel. Optional. */
  var token: js.UndefOr[String] = js.undefined
  /** The type of delivery mechanism used for this channel. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Channel {
  @scala.inline
  def apply(
    address: String = null,
    expiration: String = null,
    id: String = null,
    kind: String = null,
    params: Record[String, String] = null,
    payload: js.UndefOr[Boolean] = js.undefined,
    resourceId: String = null,
    resourceUri: String = null,
    token: String = null,
    `type`: String = null
  ): Channel = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(payload)) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (resourceUri != null) __obj.updateDynamic("resourceUri")(resourceUri.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}

