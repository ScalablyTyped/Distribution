package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcurrentAccessRestriction extends js.Object {
  /** Whether access is granted for this (user, device, volume). */
  var deviceAllowed: js.UndefOr[scala.Boolean] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of concurrent access licenses for this volume. */
  var maxConcurrentDevices: js.UndefOr[scala.Double] = js.undefined
  /** Error/warning message. */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** Client nonce for verification. Download access and client-validation only. */
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  /** Error/warning reason code. */
  var reasonCode: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this volume has any concurrent access restrictions. */
  var restricted: js.UndefOr[scala.Boolean] = js.undefined
  /** Response signature. */
  var signature: js.UndefOr[java.lang.String] = js.undefined
  /** Client app identifier for verification. Download access and client-validation only. */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /** Time in seconds for license auto-expiration. */
  var timeWindowSeconds: js.UndefOr[scala.Double] = js.undefined
  /** Identifies the volume for which this entry applies. */
  var volumeId: js.UndefOr[java.lang.String] = js.undefined
}

