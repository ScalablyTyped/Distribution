package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadAccessRestriction extends js.Object {
  /** If restricted, whether access is granted for this (user, device, volume). */
  var deviceAllowed: js.UndefOr[scala.Boolean] = js.undefined
  /** If restricted, the number of content download licenses already acquired (including the requesting client, if licensed). */
  var downloadsAcquired: js.UndefOr[scala.Double] = js.undefined
  /** If deviceAllowed, whether access was just acquired with this request. */
  var justAcquired: js.UndefOr[scala.Boolean] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** If restricted, the maximum number of content download licenses for this volume. */
  var maxDownloadDevices: js.UndefOr[scala.Double] = js.undefined
  /** Error/warning message. */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** Client nonce for verification. Download access and client-validation only. */
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Error/warning reason code. Additional codes may be added in the future. 0 OK 100 ACCESS_DENIED_PUBLISHER_LIMIT 101 ACCESS_DENIED_LIMIT 200
    * WARNING_USED_LAST_ACCESS
    */
  var reasonCode: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this volume has any download access restrictions. */
  var restricted: js.UndefOr[scala.Boolean] = js.undefined
  /** Response signature. */
  var signature: js.UndefOr[java.lang.String] = js.undefined
  /** Client app identifier for verification. Download access and client-validation only. */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies the volume for which this entry applies. */
  var volumeId: js.UndefOr[java.lang.String] = js.undefined
}

object DownloadAccessRestriction {
  @scala.inline
  def apply(
    deviceAllowed: js.UndefOr[scala.Boolean] = js.undefined,
    downloadsAcquired: scala.Int | scala.Double = null,
    justAcquired: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    maxDownloadDevices: scala.Int | scala.Double = null,
    message: java.lang.String = null,
    nonce: java.lang.String = null,
    reasonCode: java.lang.String = null,
    restricted: js.UndefOr[scala.Boolean] = js.undefined,
    signature: java.lang.String = null,
    source: java.lang.String = null,
    volumeId: java.lang.String = null
  ): DownloadAccessRestriction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deviceAllowed)) __obj.updateDynamic("deviceAllowed")(deviceAllowed)
    if (downloadsAcquired != null) __obj.updateDynamic("downloadsAcquired")(downloadsAcquired.asInstanceOf[js.Any])
    if (!js.isUndefined(justAcquired)) __obj.updateDynamic("justAcquired")(justAcquired)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (maxDownloadDevices != null) __obj.updateDynamic("maxDownloadDevices")(maxDownloadDevices.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode)
    if (!js.isUndefined(restricted)) __obj.updateDynamic("restricted")(restricted)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (source != null) __obj.updateDynamic("source")(source)
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId)
    __obj.asInstanceOf[DownloadAccessRestriction]
  }
}

