package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.googleapisCommon.mod.BaseExternalAccountClient
import typings.googleapisCommon.mod.Compute
import typings.googleapisCommon.mod.GoogleAuth
import typings.googleapisCommon.mod.JWT
import typings.googleapisCommon.mod.OAuth2Client
import typings.googleapisCommon.mod.UserRefreshClient
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adexperiencereportV1Mod {
  
  object adexperiencereportV1 {
    
    @JSImport("googleapis/build/src/apis/adexperiencereport/v1", "adexperiencereport_v1.Adexperiencereport")
    @js.native
    open class Adexperiencereport protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var sites: ResourceSites = js.native
      
      var violatingSites: ResourceViolatingsites = js.native
    }
    
    @JSImport("googleapis/build/src/apis/adexperiencereport/v1", "adexperiencereport_v1.Resource$Sites")
    @js.native
    open class ResourceSites protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def get(): GaxiosPromise[SchemaSiteSummaryResponse] = js.native
      def get(callback: BodyResponseCallback[SchemaSiteSummaryResponse]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSiteSummaryResponse] = js.native
      def get(params: ParamsResourceSitesGet): GaxiosPromise[SchemaSiteSummaryResponse] = js.native
      def get(params: ParamsResourceSitesGet, callback: BodyResponseCallback[SchemaSiteSummaryResponse]): Unit = js.native
      def get(
        params: ParamsResourceSitesGet,
        options: BodyResponseCallback[Readable | SchemaSiteSummaryResponse],
        callback: BodyResponseCallback[Readable | SchemaSiteSummaryResponse]
      ): Unit = js.native
      def get(params: ParamsResourceSitesGet, options: MethodOptions): GaxiosPromise[SchemaSiteSummaryResponse] = js.native
      def get(
        params: ParamsResourceSitesGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSiteSummaryResponse]
      ): Unit = js.native
      /**
        * Gets a site's Ad Experience Report summary.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/adexperiencereport.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const adexperiencereport = google.adexperiencereport('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await adexperiencereport.sites.get({
        *     // Required. The name of the site whose summary to get, e.g. `sites/http%3A%2F%2Fwww.google.com%2F`. Format: `sites/{site\}`
        *     name: 'sites/my-site',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "desktopSummary": {},
        *   //   "mobileSummary": {},
        *   //   "reviewedSite": "my_reviewedSite"
        *   // }
        * }
        *
        * main().catch(e => {
        *   console.error(e);
        *   throw e;
        * });
        *
        * ```
        *
        * @param params - Parameters for request
        * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param callback - Optional callback that handles the response.
        * @returns A promise if used with async/await, or void if used with a callback.
        */
      def get(params: ParamsResourceSitesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceSitesGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/adexperiencereport/v1", "adexperiencereport_v1.Resource$Violatingsites")
    @js.native
    open class ResourceViolatingsites protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def list(): GaxiosPromise[SchemaViolatingSitesResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaViolatingSitesResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaViolatingSitesResponse] = js.native
      def list(params: ParamsResourceViolatingsitesList): GaxiosPromise[SchemaViolatingSitesResponse] = js.native
      def list(
        params: ParamsResourceViolatingsitesList,
        callback: BodyResponseCallback[SchemaViolatingSitesResponse]
      ): Unit = js.native
      def list(
        params: ParamsResourceViolatingsitesList,
        options: BodyResponseCallback[Readable | SchemaViolatingSitesResponse],
        callback: BodyResponseCallback[Readable | SchemaViolatingSitesResponse]
      ): Unit = js.native
      def list(params: ParamsResourceViolatingsitesList, options: MethodOptions): GaxiosPromise[SchemaViolatingSitesResponse] = js.native
      def list(
        params: ParamsResourceViolatingsitesList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaViolatingSitesResponse]
      ): Unit = js.native
      /**
        * Lists sites that are failing in the Ad Experience Report on at least one platform.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/adexperiencereport.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const adexperiencereport = google.adexperiencereport('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await adexperiencereport.violatingSites.list({});
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "violatingSites": []
        *   // }
        * }
        *
        * main().catch(e => {
        *   console.error(e);
        *   throw e;
        * });
        *
        * ```
        *
        * @param params - Parameters for request
        * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param callback - Optional callback that handles the response.
        * @returns A promise if used with async/await, or void if used with a callback.
        */
      def list(params: ParamsResourceViolatingsitesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceViolatingsitesList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
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
    
    trait ParamsResourceSitesGet
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The name of the site whose summary to get, e.g. `sites/http%3A%2F%2Fwww.google.com%2F`. Format: `sites/{site\}`
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceSitesGet {
      
      inline def apply(): ParamsResourceSitesGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceSitesGet]
      }
      
      extension [Self <: ParamsResourceSitesGet](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    type ParamsResourceViolatingsitesList = StandardParameters
    
    trait SchemaPlatformSummary extends StObject {
      
      /**
        * The site's Ad Experience Report status on this platform.
        */
      var betterAdsStatus: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The time at which [enforcement](https://support.google.com/webtools/answer/7308033) against the site began or will begin on this platform. Not set when the filter_status is OFF.
        */
      var enforcementTime: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The site's [enforcement status](https://support.google.com/webtools/answer/7308033) on this platform.
        */
      var filterStatus: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The time at which the site's status last changed on this platform.
        */
      var lastChangeTime: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The site's regions on this platform. No longer populated, because there is no longer any semantic difference between sites in different regions.
        */
      var region: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      /**
        * A link to the full Ad Experience Report for the site on this platform.. Not set in ViolatingSitesResponse. Note that you must complete the [Search Console verification process](https://support.google.com/webmasters/answer/9008080) for the site before you can access the full report.
        */
      var reportUrl: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Whether the site is currently under review on this platform.
        */
      var underReview: js.UndefOr[Boolean | Null] = js.undefined
    }
    object SchemaPlatformSummary {
      
      inline def apply(): SchemaPlatformSummary = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaPlatformSummary]
      }
      
      extension [Self <: SchemaPlatformSummary](x: Self) {
        
        inline def setBetterAdsStatus(value: String): Self = StObject.set(x, "betterAdsStatus", value.asInstanceOf[js.Any])
        
        inline def setBetterAdsStatusNull: Self = StObject.set(x, "betterAdsStatus", null)
        
        inline def setBetterAdsStatusUndefined: Self = StObject.set(x, "betterAdsStatus", js.undefined)
        
        inline def setEnforcementTime(value: String): Self = StObject.set(x, "enforcementTime", value.asInstanceOf[js.Any])
        
        inline def setEnforcementTimeNull: Self = StObject.set(x, "enforcementTime", null)
        
        inline def setEnforcementTimeUndefined: Self = StObject.set(x, "enforcementTime", js.undefined)
        
        inline def setFilterStatus(value: String): Self = StObject.set(x, "filterStatus", value.asInstanceOf[js.Any])
        
        inline def setFilterStatusNull: Self = StObject.set(x, "filterStatus", null)
        
        inline def setFilterStatusUndefined: Self = StObject.set(x, "filterStatus", js.undefined)
        
        inline def setLastChangeTime(value: String): Self = StObject.set(x, "lastChangeTime", value.asInstanceOf[js.Any])
        
        inline def setLastChangeTimeNull: Self = StObject.set(x, "lastChangeTime", null)
        
        inline def setLastChangeTimeUndefined: Self = StObject.set(x, "lastChangeTime", js.undefined)
        
        inline def setRegion(value: js.Array[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setRegionNull: Self = StObject.set(x, "region", null)
        
        inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
        
        inline def setRegionVarargs(value: String*): Self = StObject.set(x, "region", js.Array(value*))
        
        inline def setReportUrl(value: String): Self = StObject.set(x, "reportUrl", value.asInstanceOf[js.Any])
        
        inline def setReportUrlNull: Self = StObject.set(x, "reportUrl", null)
        
        inline def setReportUrlUndefined: Self = StObject.set(x, "reportUrl", js.undefined)
        
        inline def setUnderReview(value: Boolean): Self = StObject.set(x, "underReview", value.asInstanceOf[js.Any])
        
        inline def setUnderReviewNull: Self = StObject.set(x, "underReview", null)
        
        inline def setUnderReviewUndefined: Self = StObject.set(x, "underReview", js.undefined)
      }
    }
    
    trait SchemaSiteSummaryResponse extends StObject {
      
      /**
        * The site's Ad Experience Report summary on desktop.
        */
      var desktopSummary: js.UndefOr[SchemaPlatformSummary] = js.undefined
      
      /**
        * The site's Ad Experience Report summary on mobile.
        */
      var mobileSummary: js.UndefOr[SchemaPlatformSummary] = js.undefined
      
      /**
        * The name of the reviewed site, e.g. `google.com`.
        */
      var reviewedSite: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaSiteSummaryResponse {
      
      inline def apply(): SchemaSiteSummaryResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSiteSummaryResponse]
      }
      
      extension [Self <: SchemaSiteSummaryResponse](x: Self) {
        
        inline def setDesktopSummary(value: SchemaPlatformSummary): Self = StObject.set(x, "desktopSummary", value.asInstanceOf[js.Any])
        
        inline def setDesktopSummaryUndefined: Self = StObject.set(x, "desktopSummary", js.undefined)
        
        inline def setMobileSummary(value: SchemaPlatformSummary): Self = StObject.set(x, "mobileSummary", value.asInstanceOf[js.Any])
        
        inline def setMobileSummaryUndefined: Self = StObject.set(x, "mobileSummary", js.undefined)
        
        inline def setReviewedSite(value: String): Self = StObject.set(x, "reviewedSite", value.asInstanceOf[js.Any])
        
        inline def setReviewedSiteNull: Self = StObject.set(x, "reviewedSite", null)
        
        inline def setReviewedSiteUndefined: Self = StObject.set(x, "reviewedSite", js.undefined)
      }
    }
    
    trait SchemaViolatingSitesResponse extends StObject {
      
      /**
        * The list of violating sites.
        */
      var violatingSites: js.UndefOr[js.Array[SchemaSiteSummaryResponse]] = js.undefined
    }
    object SchemaViolatingSitesResponse {
      
      inline def apply(): SchemaViolatingSitesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaViolatingSitesResponse]
      }
      
      extension [Self <: SchemaViolatingSitesResponse](x: Self) {
        
        inline def setViolatingSites(value: js.Array[SchemaSiteSummaryResponse]): Self = StObject.set(x, "violatingSites", value.asInstanceOf[js.Any])
        
        inline def setViolatingSitesUndefined: Self = StObject.set(x, "violatingSites", js.undefined)
        
        inline def setViolatingSitesVarargs(value: SchemaSiteSummaryResponse*): Self = StObject.set(x, "violatingSites", js.Array(value*))
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
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[
            String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
          ] = js.undefined
      
      /**
        * JSONP
        */
      var callback: js.UndefOr[String] = js.undefined
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.undefined
      
      /**
        * API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
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
        * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
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
        
        inline def setAuth(
          value: String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
        ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
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
