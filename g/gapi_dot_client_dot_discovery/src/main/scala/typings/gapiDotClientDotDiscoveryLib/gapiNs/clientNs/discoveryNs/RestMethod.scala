package typings
package gapiDotClientDotDiscoveryLib.gapiNs.clientNs.discoveryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestMethod extends js.Object {
  /** Description of this method. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this method requires an ETag to be specified. The ETag is sent as an HTTP If-Match or If-None-Match header. */
  var etagRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** HTTP method used by this method. */
  var httpMethod: js.UndefOr[java.lang.String] = js.undefined
  /** A unique ID for this method. This property can be used to match methods between different versions of Discovery. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Media upload parameters. */
  var mediaUpload: js.UndefOr[gapiDotClientDotDiscoveryLib.Anon_Protocols] = js.undefined
  /**
    * Ordered list of required parameters, serves as a hint to clients on how to structure their method signatures. The array is ordered such that the
    * "most-significant" parameter appears first.
    */
  var parameterOrder: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Details for all parameters in this method. */
  var parameters: js.UndefOr[stdLib.Record[java.lang.String, JsonSchema]] = js.undefined
  /** The URI path of this REST method. Should be used in conjunction with the basePath property at the api-level. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** The schema for the request. */
  var request: js.UndefOr[gapiDotClientDotDiscoveryLib.Anon_Ref] = js.undefined
  /** The schema for the response. */
  var response: js.UndefOr[gapiDotClientDotDiscoveryLib.Anon_RefString] = js.undefined
  /** OAuth 2.0 scopes applicable to this method. */
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether this method supports media downloads. */
  var supportsMediaDownload: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether this method supports media uploads. */
  var supportsMediaUpload: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether this method supports subscriptions. */
  var supportsSubscription: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates that downloads from this method should use the download service URL (i.e. "/download"). Only applies if the method supports media download. */
  var useMediaDownloadService: js.UndefOr[scala.Boolean] = js.undefined
}

