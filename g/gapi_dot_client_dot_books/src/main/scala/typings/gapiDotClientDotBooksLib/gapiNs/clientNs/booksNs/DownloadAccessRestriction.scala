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

