package typings.documentdb.documentdbMod

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
  var DisableSSLVerification: Boolean
  /** Flag to enable/disable automatic redirecting of requests based on read/write operations. */
  var EnableEndpointDiscovery: Boolean
  /** Attachment content (aka media) download mode.  */
  var MediaReadMode: typings.documentdb.documentdbMod.MediaReadMode
  /** Time to wait for response from network peer for attachment content (aka media) operations. Represented in milliseconds. */
  var MediaRequestTimeout: Double
  /** List of azure regions to be used as preferred locations for read requests. */
  var PreferredLocations: js.Array[_]
  /** Request timeout (time to wait for response from network peer). Represented in milliseconds. */
  var RequestTimeout: Double
  /** RetryOptions instance which defines several configurable properties used during retry. */
  var RetryOptions: typings.documentdb.documentdbMod.RetryOptions
}

object ConnectionPolicy {
  @scala.inline
  def apply(
    DisableSSLVerification: Boolean,
    EnableEndpointDiscovery: Boolean,
    MediaReadMode: MediaReadMode,
    MediaRequestTimeout: Double,
    PreferredLocations: js.Array[_],
    RequestTimeout: Double,
    RetryOptions: RetryOptions
  ): ConnectionPolicy = {
    val __obj = js.Dynamic.literal(DisableSSLVerification = DisableSSLVerification.asInstanceOf[js.Any], EnableEndpointDiscovery = EnableEndpointDiscovery.asInstanceOf[js.Any], MediaReadMode = MediaReadMode.asInstanceOf[js.Any], MediaRequestTimeout = MediaRequestTimeout.asInstanceOf[js.Any], PreferredLocations = PreferredLocations.asInstanceOf[js.Any], RequestTimeout = RequestTimeout.asInstanceOf[js.Any], RetryOptions = RetryOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionPolicy]
  }
}

