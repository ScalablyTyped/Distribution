package typings.gapiDotClientDotBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadAccessRestriction extends js.Object {
  /** If restricted, whether access is granted for this (user, device, volume). */
  var deviceAllowed: js.UndefOr[Boolean] = js.undefined
  /** If restricted, the number of content download licenses already acquired (including the requesting client, if licensed). */
  var downloadsAcquired: js.UndefOr[Double] = js.undefined
  /** If deviceAllowed, whether access was just acquired with this request. */
  var justAcquired: js.UndefOr[Boolean] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** If restricted, the maximum number of content download licenses for this volume. */
  var maxDownloadDevices: js.UndefOr[Double] = js.undefined
  /** Error/warning message. */
  var message: js.UndefOr[String] = js.undefined
  /** Client nonce for verification. Download access and client-validation only. */
  var nonce: js.UndefOr[String] = js.undefined
  /**
    * Error/warning reason code. Additional codes may be added in the future. 0 OK 100 ACCESS_DENIED_PUBLISHER_LIMIT 101 ACCESS_DENIED_LIMIT 200
    * WARNING_USED_LAST_ACCESS
    */
  var reasonCode: js.UndefOr[String] = js.undefined
  /** Whether this volume has any download access restrictions. */
  var restricted: js.UndefOr[Boolean] = js.undefined
  /** Response signature. */
  var signature: js.UndefOr[String] = js.undefined
  /** Client app identifier for verification. Download access and client-validation only. */
  var source: js.UndefOr[String] = js.undefined
  /** Identifies the volume for which this entry applies. */
  var volumeId: js.UndefOr[String] = js.undefined
}

object DownloadAccessRestriction {
  @scala.inline
  def apply(
    deviceAllowed: js.UndefOr[Boolean] = js.undefined,
    downloadsAcquired: Int | Double = null,
    justAcquired: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    maxDownloadDevices: Int | Double = null,
    message: String = null,
    nonce: String = null,
    reasonCode: String = null,
    restricted: js.UndefOr[Boolean] = js.undefined,
    signature: String = null,
    source: String = null,
    volumeId: String = null
  ): DownloadAccessRestriction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deviceAllowed)) __obj.updateDynamic("deviceAllowed")(deviceAllowed.asInstanceOf[js.Any])
    if (downloadsAcquired != null) __obj.updateDynamic("downloadsAcquired")(downloadsAcquired.asInstanceOf[js.Any])
    if (!js.isUndefined(justAcquired)) __obj.updateDynamic("justAcquired")(justAcquired.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (maxDownloadDevices != null) __obj.updateDynamic("maxDownloadDevices")(maxDownloadDevices.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (!js.isUndefined(restricted)) __obj.updateDynamic("restricted")(restricted.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadAccessRestriction]
  }
}

