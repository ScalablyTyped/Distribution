package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acceleratedmobilepageurlV1Mod {
  
  object acceleratedmobilepageurlV1 {
    
    /**
      * Accelerated Mobile Pages (AMP) URL API
      *
      * Retrieves the list of AMP URLs (and equivalent AMP Cache URLs) for a given
      * list of public URL(s).
      *
      * @example
      * const {google} = require('googleapis');
      * const acceleratedmobilepageurl = google.acceleratedmobilepageurl('v1');
      *
      * @namespace acceleratedmobilepageurl
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Acceleratedmobilepageurl
      */
    @JSImport("googleapis/build/src/apis/acceleratedmobilepageurl/v1", "acceleratedmobilepageurl_v1.Acceleratedmobilepageurl")
    @js.native
    class Acceleratedmobilepageurl protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var ampUrls: ResourceAmpurls = js.native
      
      var context: APIRequestContext = js.native
    }
    
    @JSImport("googleapis/build/src/apis/acceleratedmobilepageurl/v1", "acceleratedmobilepageurl_v1.Resource$Ampurls")
    @js.native
    class ResourceAmpurls protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      /**
        * acceleratedmobilepageurl.ampUrls.batchGet
        * @desc Returns AMP URL(s) and equivalent [AMP Cache
        * URL(s)](/amp/cache/overview#amp-cache-url-format).
        * @alias acceleratedmobilepageurl.ampUrls.batchGet
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {().BatchGetAmpUrlsRequest} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def batchGet(): GaxiosPromise[SchemaBatchGetAmpUrlsResponse] = js.native
      def batchGet(callback: BodyResponseCallback[SchemaBatchGetAmpUrlsResponse]): Unit = js.native
      def batchGet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchGetAmpUrlsResponse] = js.native
      def batchGet(params: ParamsResourceAmpurlsBatchget): GaxiosPromise[SchemaBatchGetAmpUrlsResponse] = js.native
      def batchGet(
        params: ParamsResourceAmpurlsBatchget,
        callback: BodyResponseCallback[SchemaBatchGetAmpUrlsResponse]
      ): Unit = js.native
      def batchGet(
        params: ParamsResourceAmpurlsBatchget,
        options: BodyResponseCallback[SchemaBatchGetAmpUrlsResponse],
        callback: BodyResponseCallback[SchemaBatchGetAmpUrlsResponse]
      ): Unit = js.native
      def batchGet(params: ParamsResourceAmpurlsBatchget, options: MethodOptions): GaxiosPromise[SchemaBatchGetAmpUrlsResponse] = js.native
      def batchGet(
        params: ParamsResourceAmpurlsBatchget,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaBatchGetAmpUrlsResponse]
      ): Unit = js.native
      
      var context: APIRequestContext = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceAmpurlsBatchget
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaBatchGetAmpUrlsRequest] = js.undefined
    }
    object ParamsResourceAmpurlsBatchget {
      
      inline def apply(): ParamsResourceAmpurlsBatchget = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceAmpurlsBatchget]
      }
      
      extension [Self <: ParamsResourceAmpurlsBatchget](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setRequestBody(value: SchemaBatchGetAmpUrlsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    /**
      * AMP URL response for a requested URL.
      */
    trait SchemaAmpUrl extends StObject {
      
      /**
        * The AMP URL pointing to the publisher&#39;s web server.
        */
      var ampUrl: js.UndefOr[String] = js.undefined
      
      /**
        * The [AMP Cache URL](/amp/cache/overview#amp-cache-url-format) pointing to
        * the cached document in the Google AMP Cache.
        */
      var cdnAmpUrl: js.UndefOr[String] = js.undefined
      
      /**
        * The original non-AMP URL.
        */
      var originalUrl: js.UndefOr[String] = js.undefined
    }
    object SchemaAmpUrl {
      
      inline def apply(): SchemaAmpUrl = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAmpUrl]
      }
      
      extension [Self <: SchemaAmpUrl](x: Self) {
        
        inline def setAmpUrl(value: String): Self = StObject.set(x, "ampUrl", value.asInstanceOf[js.Any])
        
        inline def setAmpUrlUndefined: Self = StObject.set(x, "ampUrl", js.undefined)
        
        inline def setCdnAmpUrl(value: String): Self = StObject.set(x, "cdnAmpUrl", value.asInstanceOf[js.Any])
        
        inline def setCdnAmpUrlUndefined: Self = StObject.set(x, "cdnAmpUrl", js.undefined)
        
        inline def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
        
        inline def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
      }
    }
    
    /**
      * AMP URL Error resource for a requested URL that couldn&#39;t be found.
      */
    trait SchemaAmpUrlError extends StObject {
      
      /**
        * The error code of an API call.
        */
      var errorCode: js.UndefOr[String] = js.undefined
      
      /**
        * An optional descriptive error message.
        */
      var errorMessage: js.UndefOr[String] = js.undefined
      
      /**
        * The original non-AMP URL.
        */
      var originalUrl: js.UndefOr[String] = js.undefined
    }
    object SchemaAmpUrlError {
      
      inline def apply(): SchemaAmpUrlError = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAmpUrlError]
      }
      
      extension [Self <: SchemaAmpUrlError](x: Self) {
        
        inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
        
        inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
        
        inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
        
        inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
        
        inline def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
        
        inline def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
      }
    }
    
    /**
      * AMP URL request for a batch of URLs.
      */
    trait SchemaBatchGetAmpUrlsRequest extends StObject {
      
      /**
        * The lookup_strategy being requested.
        */
      var lookupStrategy: js.UndefOr[String] = js.undefined
      
      /**
        * List of URLs to look up for the paired AMP URLs. The URLs are
        * case-sensitive. Up to 50 URLs per lookup (see [Usage
        * Limits](/amp/cache/reference/limits)).
        */
      var urls: js.UndefOr[js.Array[String]] = js.undefined
    }
    object SchemaBatchGetAmpUrlsRequest {
      
      inline def apply(): SchemaBatchGetAmpUrlsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaBatchGetAmpUrlsRequest]
      }
      
      extension [Self <: SchemaBatchGetAmpUrlsRequest](x: Self) {
        
        inline def setLookupStrategy(value: String): Self = StObject.set(x, "lookupStrategy", value.asInstanceOf[js.Any])
        
        inline def setLookupStrategyUndefined: Self = StObject.set(x, "lookupStrategy", js.undefined)
        
        inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
        
        inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
        
        inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
      }
    }
    
    /**
      * Batch AMP URL response.
      */
    trait SchemaBatchGetAmpUrlsResponse extends StObject {
      
      /**
        * For each URL in BatchAmpUrlsRequest, the URL response. The response might
        * not be in the same order as URLs in the batch request. If
        * BatchAmpUrlsRequest contains duplicate URLs, AmpUrl is generated only
        * once.
        */
      var ampUrls: js.UndefOr[js.Array[SchemaAmpUrl]] = js.undefined
      
      /**
        * The errors for requested URLs that have no AMP URL.
        */
      var urlErrors: js.UndefOr[js.Array[SchemaAmpUrlError]] = js.undefined
    }
    object SchemaBatchGetAmpUrlsResponse {
      
      inline def apply(): SchemaBatchGetAmpUrlsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaBatchGetAmpUrlsResponse]
      }
      
      extension [Self <: SchemaBatchGetAmpUrlsResponse](x: Self) {
        
        inline def setAmpUrls(value: js.Array[SchemaAmpUrl]): Self = StObject.set(x, "ampUrls", value.asInstanceOf[js.Any])
        
        inline def setAmpUrlsUndefined: Self = StObject.set(x, "ampUrls", js.undefined)
        
        inline def setAmpUrlsVarargs(value: SchemaAmpUrl*): Self = StObject.set(x, "ampUrls", js.Array(value :_*))
        
        inline def setUrlErrors(value: js.Array[SchemaAmpUrlError]): Self = StObject.set(x, "urlErrors", value.asInstanceOf[js.Any])
        
        inline def setUrlErrorsUndefined: Self = StObject.set(x, "urlErrors", js.undefined)
        
        inline def setUrlErrorsVarargs(value: SchemaAmpUrlError*): Self = StObject.set(x, "urlErrors", js.Array(value :_*))
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * V1 error format.
        */
      @JSName("$.xgafv")
      var $Dotxgafv: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth access token.
        */
      var access_token: js.UndefOr[String] = js.undefined
      
      /**
        * Data format for response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * JSONP
        */
      var callback: js.UndefOr[String] = js.undefined
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.undefined
      
      /**
        * API key. Your API key identifies your project and provides you with API
        * access, quota, and reports. Required unless you provide an OAuth 2.0
        * token.
        */
      var key: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.undefined
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Available to use for quota purposes for server-side applications. Can be
        * any arbitrary string assigned to a user, but should not exceed 40
        * characters.
        */
      var quotaUser: js.UndefOr[String] = js.undefined
      
      /**
        * Legacy upload protocol for media (e.g. "media", "multipart").
        */
      var uploadType: js.UndefOr[String] = js.undefined
      
      /**
        * Upload protocol for media (e.g. "raw", "multipart").
        */
      var upload_protocol: js.UndefOr[String] = js.undefined
    }
    object StandardParameters {
      
      inline def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      extension [Self <: StandardParameters](x: Self) {
        
        inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
        
        inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
        
        inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
        
        inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
        
        inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
        
        inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      }
    }
  }
}
