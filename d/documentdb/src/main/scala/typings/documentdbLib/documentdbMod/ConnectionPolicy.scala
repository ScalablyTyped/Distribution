package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionPolicy extends js.Object {
  /**
    * Flag to disable SSL verification for the requests.
    *
    * SSL verification is enabled by default. Don't set this when targeting production endpoints.
    *
    * This is intended to be used only when targeting emulator endpoint to avoid failing your requests with SSL related error.
    */
  var DisableSSLVerification: scala.Boolean
  /** Flag to enable/disable automatic redirecting of requests based on read/write operations. */
  var EnableEndpointDiscovery: scala.Boolean
  /** Attachment content (aka media) download mode.  */
  var MediaReadMode: MediaReadMode
  /** Time to wait for response from network peer for attachment content (aka media) operations. Represented in milliseconds. */
  var MediaRequestTimeout: scala.Double
  /** List of azure regions to be used as preferred locations for read requests. */
  var PreferredLocations: js.Array[_]
  /** Request timeout (time to wait for response from network peer). Represented in milliseconds. */
  var RequestTimeout: scala.Double
  /** RetryOptions instance which defines several configurable properties used during retry. */
  var RetryOptions: RetryOptions
}

object ConnectionPolicy {
  @scala.inline
  def apply(
    DisableSSLVerification: scala.Boolean,
    EnableEndpointDiscovery: scala.Boolean,
    MediaReadMode: MediaReadMode,
    MediaRequestTimeout: scala.Double,
    PreferredLocations: js.Array[_],
    RequestTimeout: scala.Double,
    RetryOptions: RetryOptions
  ): ConnectionPolicy = {
    val __obj = js.Dynamic.literal(DisableSSLVerification = DisableSSLVerification, EnableEndpointDiscovery = EnableEndpointDiscovery, MediaReadMode = MediaReadMode, MediaRequestTimeout = MediaRequestTimeout, PreferredLocations = PreferredLocations, RequestTimeout = RequestTimeout, RetryOptions = RetryOptions)
  
    __obj.asInstanceOf[ConnectionPolicy]
  }
}

