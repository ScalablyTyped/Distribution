package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionPolicy extends StObject {
  
  /**
    * Flag to disable SSL verification for the requests.
    *
    * SSL verification is enabled by default. Don't set this when targeting production endpoints.
    *
    * This is intended to be used only when targeting emulator endpoint to avoid failing your requests with SSL related error.
    */
  var DisableSSLVerification: Boolean = js.native
  
  /** Flag to enable/disable automatic redirecting of requests based on read/write operations. */
  var EnableEndpointDiscovery: Boolean = js.native
  
  /** Attachment content (aka media) download mode.  */
  var MediaReadMode: typings.documentdb.mod.MediaReadMode = js.native
  
  /** Time to wait for response from network peer for attachment content (aka media) operations. Represented in milliseconds. */
  var MediaRequestTimeout: Double = js.native
  
  /** List of azure regions to be used as preferred locations for read requests. */
  var PreferredLocations: js.Array[_] = js.native
  
  /** Request timeout (time to wait for response from network peer). Represented in milliseconds. */
  var RequestTimeout: Double = js.native
  
  /** RetryOptions instance which defines several configurable properties used during retry. */
  var RetryOptions: typings.documentdb.mod.RetryOptions = js.native
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
  
  @scala.inline
  implicit class ConnectionPolicyMutableBuilder[Self <: ConnectionPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableSSLVerification(value: Boolean): Self = StObject.set(x, "DisableSSLVerification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableEndpointDiscovery(value: Boolean): Self = StObject.set(x, "EnableEndpointDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaReadMode(value: MediaReadMode): Self = StObject.set(x, "MediaReadMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaRequestTimeout(value: Double): Self = StObject.set(x, "MediaRequestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredLocations(value: js.Array[_]): Self = StObject.set(x, "PreferredLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredLocationsVarargs(value: js.Any*): Self = StObject.set(x, "PreferredLocations", js.Array(value :_*))
    
    @scala.inline
    def setRequestTimeout(value: Double): Self = StObject.set(x, "RequestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryOptions(value: RetryOptions): Self = StObject.set(x, "RetryOptions", value.asInstanceOf[js.Any])
  }
}
