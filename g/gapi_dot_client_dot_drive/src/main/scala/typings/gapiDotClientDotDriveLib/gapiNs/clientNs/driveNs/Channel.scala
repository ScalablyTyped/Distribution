package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

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

