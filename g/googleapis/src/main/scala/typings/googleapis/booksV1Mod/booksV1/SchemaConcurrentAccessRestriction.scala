package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConcurrentAccessRestriction extends js.Object {
  /**
    * Whether access is granted for this (user, device, volume).
    */
  var deviceAllowed: js.UndefOr[Boolean] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The maximum number of concurrent access licenses for this volume.
    */
  var maxConcurrentDevices: js.UndefOr[Double] = js.native
  /**
    * Error/warning message.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Client nonce for verification. Download access and client-validation
    * only.
    */
  var nonce: js.UndefOr[String] = js.native
  /**
    * Error/warning reason code.
    */
  var reasonCode: js.UndefOr[String] = js.native
  /**
    * Whether this volume has any concurrent access restrictions.
    */
  var restricted: js.UndefOr[Boolean] = js.native
  /**
    * Response signature.
    */
  var signature: js.UndefOr[String] = js.native
  /**
    * Client app identifier for verification. Download access and
    * client-validation only.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Time in seconds for license auto-expiration.
    */
  var timeWindowSeconds: js.UndefOr[Double] = js.native
  /**
    * Identifies the volume for which this entry applies.
    */
  var volumeId: js.UndefOr[String] = js.native
}

object SchemaConcurrentAccessRestriction {
  @scala.inline
  def apply(
    deviceAllowed: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    maxConcurrentDevices: js.UndefOr[Double] = js.undefined,
    message: String = null,
    nonce: String = null,
    reasonCode: String = null,
    restricted: js.UndefOr[Boolean] = js.undefined,
    signature: String = null,
    source: String = null,
    timeWindowSeconds: js.UndefOr[Double] = js.undefined,
    volumeId: String = null
  ): SchemaConcurrentAccessRestriction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deviceAllowed)) __obj.updateDynamic("deviceAllowed")(deviceAllowed.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConcurrentDevices)) __obj.updateDynamic("maxConcurrentDevices")(maxConcurrentDevices.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (!js.isUndefined(restricted)) __obj.updateDynamic("restricted")(restricted.get.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(timeWindowSeconds)) __obj.updateDynamic("timeWindowSeconds")(timeWindowSeconds.get.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConcurrentAccessRestriction]
  }
}

