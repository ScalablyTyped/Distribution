package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  /** The address where notifications are delivered for this channel. */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /** Date and time of notification channel expiration, expressed as a Unix timestamp, in milliseconds. Optional. */
  var expiration: js.UndefOr[java.lang.String] = js.undefined
  /** A UUID or similar unique string that identifies this channel. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies this as a notification channel used to watch for changes to a resource. Value: the fixed string "api#channel". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Additional parameters controlling delivery channel behavior. Optional. */
  var params: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** A Boolean value to indicate whether payload is wanted. Optional. */
  var payload: js.UndefOr[scala.Boolean] = js.undefined
  /** An opaque ID that identifies the resource being watched on this channel. Stable across different API versions. */
  var resourceId: js.UndefOr[java.lang.String] = js.undefined
  /** A version-specific identifier for the watched resource. */
  var resourceUri: js.UndefOr[java.lang.String] = js.undefined
  /** An arbitrary string delivered to the target address with each notification delivered over this channel. Optional. */
  var token: js.UndefOr[java.lang.String] = js.undefined
  /** The type of delivery mechanism used for this channel. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Channel {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    expiration: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    params: stdLib.Record[java.lang.String, java.lang.String] = null,
    payload: js.UndefOr[scala.Boolean] = js.undefined,
    resourceId: java.lang.String = null,
    resourceUri: java.lang.String = null,
    token: java.lang.String = null,
    `type`: java.lang.String = null
  ): Channel = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (expiration != null) __obj.updateDynamic("expiration")(expiration)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (params != null) __obj.updateDynamic("params")(params)
    if (!js.isUndefined(payload)) __obj.updateDynamic("payload")(payload)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (resourceUri != null) __obj.updateDynamic("resourceUri")(resourceUri)
    if (token != null) __obj.updateDynamic("token")(token)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Channel]
  }
}

