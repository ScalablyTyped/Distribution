package typings.gapiDotClientDotBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcurrentAccessRestriction extends js.Object {
  /** Whether access is granted for this (user, device, volume). */
  var deviceAllowed: js.UndefOr[Boolean] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** The maximum number of concurrent access licenses for this volume. */
  var maxConcurrentDevices: js.UndefOr[Double] = js.undefined
  /** Error/warning message. */
  var message: js.UndefOr[String] = js.undefined
  /** Client nonce for verification. Download access and client-validation only. */
  var nonce: js.UndefOr[String] = js.undefined
  /** Error/warning reason code. */
  var reasonCode: js.UndefOr[String] = js.undefined
  /** Whether this volume has any concurrent access restrictions. */
  var restricted: js.UndefOr[Boolean] = js.undefined
  /** Response signature. */
  var signature: js.UndefOr[String] = js.undefined
  /** Client app identifier for verification. Download access and client-validation only. */
  var source: js.UndefOr[String] = js.undefined
  /** Time in seconds for license auto-expiration. */
  var timeWindowSeconds: js.UndefOr[Double] = js.undefined
  /** Identifies the volume for which this entry applies. */
  var volumeId: js.UndefOr[String] = js.undefined
}

object ConcurrentAccessRestriction {
  @scala.inline
  def apply(
    deviceAllowed: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    maxConcurrentDevices: Int | Double = null,
    message: String = null,
    nonce: String = null,
    reasonCode: String = null,
    restricted: js.UndefOr[Boolean] = js.undefined,
    signature: String = null,
    source: String = null,
    timeWindowSeconds: Int | Double = null,
    volumeId: String = null
  ): ConcurrentAccessRestriction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deviceAllowed)) __obj.updateDynamic("deviceAllowed")(deviceAllowed)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (maxConcurrentDevices != null) __obj.updateDynamic("maxConcurrentDevices")(maxConcurrentDevices.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode)
    if (!js.isUndefined(restricted)) __obj.updateDynamic("restricted")(restricted)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeWindowSeconds != null) __obj.updateDynamic("timeWindowSeconds")(timeWindowSeconds.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId)
    __obj.asInstanceOf[ConcurrentAccessRestriction]
  }
}

