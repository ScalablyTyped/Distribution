package typings.gapiClientDiscovery.gapi.client.discovery

import typings.gapiClientDiscovery.AnonAccept
import typings.gapiClientDiscovery.AnonParameterName
import typings.gapiClientDiscovery.AnonRefString
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestMethod extends js.Object {
  /** Description of this method. */
  var description: js.UndefOr[String] = js.undefined
  /** Whether this method requires an ETag to be specified. The ETag is sent as an HTTP If-Match or If-None-Match header. */
  var etagRequired: js.UndefOr[Boolean] = js.undefined
  /** HTTP method used by this method. */
  var httpMethod: js.UndefOr[String] = js.undefined
  /** A unique ID for this method. This property can be used to match methods between different versions of Discovery. */
  var id: js.UndefOr[String] = js.undefined
  /** Media upload parameters. */
  var mediaUpload: js.UndefOr[AnonAccept] = js.undefined
  /**
    * Ordered list of required parameters, serves as a hint to clients on how to structure their method signatures. The array is ordered such that the
    * "most-significant" parameter appears first.
    */
  var parameterOrder: js.UndefOr[js.Array[String]] = js.undefined
  /** Details for all parameters in this method. */
  var parameters: js.UndefOr[Record[String, JsonSchema]] = js.undefined
  /** The URI path of this REST method. Should be used in conjunction with the basePath property at the api-level. */
  var path: js.UndefOr[String] = js.undefined
  /** The schema for the request. */
  var request: js.UndefOr[AnonParameterName] = js.undefined
  /** The schema for the response. */
  var response: js.UndefOr[AnonRefString] = js.undefined
  /** OAuth 2.0 scopes applicable to this method. */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
  /** Whether this method supports media downloads. */
  var supportsMediaDownload: js.UndefOr[Boolean] = js.undefined
  /** Whether this method supports media uploads. */
  var supportsMediaUpload: js.UndefOr[Boolean] = js.undefined
  /** Whether this method supports subscriptions. */
  var supportsSubscription: js.UndefOr[Boolean] = js.undefined
  /** Indicates that downloads from this method should use the download service URL (i.e. "/download"). Only applies if the method supports media download. */
  var useMediaDownloadService: js.UndefOr[Boolean] = js.undefined
}

object RestMethod {
  @scala.inline
  def apply(
    description: String = null,
    etagRequired: js.UndefOr[Boolean] = js.undefined,
    httpMethod: String = null,
    id: String = null,
    mediaUpload: AnonAccept = null,
    parameterOrder: js.Array[String] = null,
    parameters: Record[String, JsonSchema] = null,
    path: String = null,
    request: AnonParameterName = null,
    response: AnonRefString = null,
    scopes: js.Array[String] = null,
    supportsMediaDownload: js.UndefOr[Boolean] = js.undefined,
    supportsMediaUpload: js.UndefOr[Boolean] = js.undefined,
    supportsSubscription: js.UndefOr[Boolean] = js.undefined,
    useMediaDownloadService: js.UndefOr[Boolean] = js.undefined
  ): RestMethod = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(etagRequired)) __obj.updateDynamic("etagRequired")(etagRequired.asInstanceOf[js.Any])
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mediaUpload != null) __obj.updateDynamic("mediaUpload")(mediaUpload.asInstanceOf[js.Any])
    if (parameterOrder != null) __obj.updateDynamic("parameterOrder")(parameterOrder.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsMediaDownload)) __obj.updateDynamic("supportsMediaDownload")(supportsMediaDownload.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsMediaUpload)) __obj.updateDynamic("supportsMediaUpload")(supportsMediaUpload.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsSubscription)) __obj.updateDynamic("supportsSubscription")(supportsSubscription.asInstanceOf[js.Any])
    if (!js.isUndefined(useMediaDownloadService)) __obj.updateDynamic("useMediaDownloadService")(useMediaDownloadService.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestMethod]
  }
}

