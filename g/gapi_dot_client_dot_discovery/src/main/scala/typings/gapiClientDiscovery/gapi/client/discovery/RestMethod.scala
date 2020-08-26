package typings.gapiClientDiscovery.gapi.client.discovery

import org.scalablytyped.runtime.TopLevel
import typings.gapiClientDiscovery.anon.Accept
import typings.gapiClientDiscovery.anon.ParameterName
import typings.gapiClientDiscovery.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestMethod extends js.Object {
  /** Description of this method. */
  var description: js.UndefOr[String] = js.native
  /** Whether this method requires an ETag to be specified. The ETag is sent as an HTTP If-Match or If-None-Match header. */
  var etagRequired: js.UndefOr[Boolean] = js.native
  /** HTTP method used by this method. */
  var httpMethod: js.UndefOr[String] = js.native
  /** A unique ID for this method. This property can be used to match methods between different versions of Discovery. */
  var id: js.UndefOr[String] = js.native
  /** Media upload parameters. */
  var mediaUpload: js.UndefOr[Accept] = js.native
  /**
    * Ordered list of required parameters, serves as a hint to clients on how to structure their method signatures. The array is ordered such that the
    * "most-significant" parameter appears first.
    */
  var parameterOrder: js.UndefOr[js.Array[String]] = js.native
  /** Details for all parameters in this method. */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: gapi.client.discovery.gapi.client.discovery.JsonSchema}
    */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestMethod with TopLevel[js.Any]
  ] = js.native
  /** The URI path of this REST method. Should be used in conjunction with the basePath property at the api-level. */
  var path: js.UndefOr[String] = js.native
  /** The schema for the request. */
  var request: js.UndefOr[ParameterName] = js.native
  /** The schema for the response. */
  var response: js.UndefOr[`0`] = js.native
  /** OAuth 2.0 scopes applicable to this method. */
  var scopes: js.UndefOr[js.Array[String]] = js.native
  /** Whether this method supports media downloads. */
  var supportsMediaDownload: js.UndefOr[Boolean] = js.native
  /** Whether this method supports media uploads. */
  var supportsMediaUpload: js.UndefOr[Boolean] = js.native
  /** Whether this method supports subscriptions. */
  var supportsSubscription: js.UndefOr[Boolean] = js.native
  /** Indicates that downloads from this method should use the download service URL (i.e. "/download"). Only applies if the method supports media download. */
  var useMediaDownloadService: js.UndefOr[Boolean] = js.native
}

object RestMethod {
  @scala.inline
  def apply(): RestMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestMethod]
  }
  @scala.inline
  implicit class RestMethodOps[Self <: RestMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEtagRequired(value: Boolean): Self = this.set("etagRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtagRequired: Self = this.set("etagRequired", js.undefined)
    @scala.inline
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpMethod: Self = this.set("httpMethod", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMediaUpload(value: Accept): Self = this.set("mediaUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaUpload: Self = this.set("mediaUpload", js.undefined)
    @scala.inline
    def setParameterOrderVarargs(value: String*): Self = this.set("parameterOrder", js.Array(value :_*))
    @scala.inline
    def setParameterOrder(value: js.Array[String]): Self = this.set("parameterOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterOrder: Self = this.set("parameterOrder", js.undefined)
    @scala.inline
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: gapi.client.discovery.gapi.client.discovery.JsonSchema}
      */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestMethod with TopLevel[js.Any]
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setRequest(value: ParameterName): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setResponse(value: `0`): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    @scala.inline
    def setSupportsMediaDownload(value: Boolean): Self = this.set("supportsMediaDownload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsMediaDownload: Self = this.set("supportsMediaDownload", js.undefined)
    @scala.inline
    def setSupportsMediaUpload(value: Boolean): Self = this.set("supportsMediaUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsMediaUpload: Self = this.set("supportsMediaUpload", js.undefined)
    @scala.inline
    def setSupportsSubscription(value: Boolean): Self = this.set("supportsSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsSubscription: Self = this.set("supportsSubscription", js.undefined)
    @scala.inline
    def setUseMediaDownloadService(value: Boolean): Self = this.set("useMediaDownloadService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMediaDownloadService: Self = this.set("useMediaDownloadService", js.undefined)
  }
  
}

