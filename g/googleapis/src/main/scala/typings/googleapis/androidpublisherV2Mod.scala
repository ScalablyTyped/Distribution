package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v2
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.googleapisCommon.mod.Compute
import typings.googleapisCommon.mod.GoogleAuth
import typings.googleapisCommon.mod.JWT
import typings.googleapisCommon.mod.OAuth2Client
import typings.googleapisCommon.mod.UserRefreshClient
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidpublisherV2Mod {
  
  object androidpublisherV2 {
    
    @JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Androidpublisher")
    @js.native
    open class Androidpublisher protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var purchases: ResourcePurchases = js.native
    }
    
    @JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Resource$Purchases")
    @js.native
    open class ResourcePurchases protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var products: ResourcePurchasesProducts = js.native
      
      var voidedpurchases: ResourcePurchasesVoidedpurchases = js.native
    }
    
    @JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Resource$Purchases$Products")
    @js.native
    open class ResourcePurchasesProducts protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def get(): GaxiosPromise[SchemaProductPurchase] = js.native
      def get(callback: BodyResponseCallback[SchemaProductPurchase]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProductPurchase] = js.native
      def get(params: ParamsResourcePurchasesProductsGet): GaxiosPromise[SchemaProductPurchase] = js.native
      def get(params: ParamsResourcePurchasesProductsGet, callback: BodyResponseCallback[SchemaProductPurchase]): Unit = js.native
      def get(
        params: ParamsResourcePurchasesProductsGet,
        options: BodyResponseCallback[Readable | SchemaProductPurchase],
        callback: BodyResponseCallback[Readable | SchemaProductPurchase]
      ): Unit = js.native
      def get(params: ParamsResourcePurchasesProductsGet, options: MethodOptions): GaxiosPromise[SchemaProductPurchase] = js.native
      def get(
        params: ParamsResourcePurchasesProductsGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaProductPurchase]
      ): Unit = js.native
      /**
        * androidpublisher.purchases.products.get
        * @desc Checks the purchase and consumption status of an inapp item.
        * @example
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const androidpublisher = google.androidpublisher('v2');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await androidpublisher.purchases.products.get({
        *     // The package name of the application the inapp product was sold in (for example, 'com.some.thing').
        *     packageName: 'placeholder-value',
        *     // The inapp product SKU (for example, 'com.some.thing.inapp1').
        *     productId: 'placeholder-value',
        *     // The token provided to the user's device when the inapp product was purchased.
        *     token: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "consumptionState": 0,
        *   //   "developerPayload": "my_developerPayload",
        *   //   "kind": "my_kind",
        *   //   "orderId": "my_orderId",
        *   //   "purchaseState": 0,
        *   //   "purchaseTimeMillis": "my_purchaseTimeMillis",
        *   //   "purchaseType": 0
        *   // }
        * }
        *
        * main().catch(e => {
        *   console.error(e);
        *   throw e;
        * });
        *
        * @alias androidpublisher.purchases.products.get
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.packageName The package name of the application the inapp product was sold in (for example, 'com.some.thing').
        * @param {string} params.productId The inapp product SKU (for example, 'com.some.thing.inapp1').
        * @param {string} params.token The token provided to the user's device when the inapp product was purchased.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def get(params: ParamsResourcePurchasesProductsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourcePurchasesProductsGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Resource$Purchases$Voidedpurchases")
    @js.native
    open class ResourcePurchasesVoidedpurchases protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def list(): GaxiosPromise[SchemaVoidedPurchasesListResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaVoidedPurchasesListResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVoidedPurchasesListResponse] = js.native
      def list(params: ParamsResourcePurchasesVoidedpurchasesList): GaxiosPromise[SchemaVoidedPurchasesListResponse] = js.native
      def list(
        params: ParamsResourcePurchasesVoidedpurchasesList,
        callback: BodyResponseCallback[SchemaVoidedPurchasesListResponse]
      ): Unit = js.native
      def list(
        params: ParamsResourcePurchasesVoidedpurchasesList,
        options: BodyResponseCallback[Readable | SchemaVoidedPurchasesListResponse],
        callback: BodyResponseCallback[Readable | SchemaVoidedPurchasesListResponse]
      ): Unit = js.native
      def list(params: ParamsResourcePurchasesVoidedpurchasesList, options: MethodOptions): GaxiosPromise[SchemaVoidedPurchasesListResponse] = js.native
      def list(
        params: ParamsResourcePurchasesVoidedpurchasesList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaVoidedPurchasesListResponse]
      ): Unit = js.native
      /**
        * androidpublisher.purchases.voidedpurchases.list
        * @desc Lists the purchases that were canceled, refunded or charged-back.
        * @example
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const androidpublisher = google.androidpublisher('v2');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await androidpublisher.purchases.voidedpurchases.list({
        *     // The time, in milliseconds since the Epoch, of the newest voided purchase that you want to see in the response. The value of this parameter cannot be greater than the current time and is ignored if a pagination token is set. Default value is current time. Note: This filter is applied on the time at which the record is seen as voided by our systems and not the actual voided time returned in the response.
        *     endTime: 'placeholder-value',
        *
        *     maxResults: 'placeholder-value',
        *     // The package name of the application for which voided purchases need to be returned (for example, 'com.some.thing').
        *     packageName: 'placeholder-value',
        *
        *     startIndex: 'placeholder-value',
        *     // The time, in milliseconds since the Epoch, of the oldest voided purchase that you want to see in the response. The value of this parameter cannot be older than 30 days and is ignored if a pagination token is set. Default value is current time minus 30 days. Note: This filter is applied on the time at which the record is seen as voided by our systems and not the actual voided time returned in the response.
        *     startTime: 'placeholder-value',
        *
        *     token: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "pageInfo": {},
        *   //   "tokenPagination": {},
        *   //   "voidedPurchases": []
        *   // }
        * }
        *
        * main().catch(e => {
        *   console.error(e);
        *   throw e;
        * });
        *
        * @alias androidpublisher.purchases.voidedpurchases.list
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string=} params.endTime The time, in milliseconds since the Epoch, of the newest voided purchase that you want to see in the response. The value of this parameter cannot be greater than the current time and is ignored if a pagination token is set. Default value is current time. Note: This filter is applied on the time at which the record is seen as voided by our systems and not the actual voided time returned in the response.
        * @param {integer=} params.maxResults
        * @param {string} params.packageName The package name of the application for which voided purchases need to be returned (for example, 'com.some.thing').
        * @param {integer=} params.startIndex
        * @param {string=} params.startTime The time, in milliseconds since the Epoch, of the oldest voided purchase that you want to see in the response. The value of this parameter cannot be older than 30 days and is ignored if a pagination token is set. Default value is current time minus 30 days. Note: This filter is applied on the time at which the record is seen as voided by our systems and not the actual voided time returned in the response.
        * @param {string=} params.token
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(params: ParamsResourcePurchasesVoidedpurchasesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourcePurchasesVoidedpurchasesList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v2
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v2")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v2): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourcePurchasesProductsGet
      extends StObject
         with StandardParameters {
      
      /**
        * The package name of the application the inapp product was sold in (for example, 'com.some.thing').
        */
      var packageName: js.UndefOr[String] = js.undefined
      
      /**
        * The inapp product SKU (for example, 'com.some.thing.inapp1').
        */
      var productId: js.UndefOr[String] = js.undefined
      
      /**
        * The token provided to the user's device when the inapp product was purchased.
        */
      var token: js.UndefOr[String] = js.undefined
    }
    object ParamsResourcePurchasesProductsGet {
      
      inline def apply(): ParamsResourcePurchasesProductsGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourcePurchasesProductsGet]
      }
      
      extension [Self <: ParamsResourcePurchasesProductsGet](x: Self) {
        
        inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
        
        inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
        
        inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      }
    }
    
    trait ParamsResourcePurchasesVoidedpurchasesList
      extends StObject
         with StandardParameters {
      
      /**
        * The time, in milliseconds since the Epoch, of the newest voided purchase that you want to see in the response. The value of this parameter cannot be greater than the current time and is ignored if a pagination token is set. Default value is current time. Note: This filter is applied on the time at which the record is seen as voided by our systems and not the actual voided time returned in the response.
        */
      var endTime: js.UndefOr[String] = js.undefined
      
      /**
        *
        */
      var maxResults: js.UndefOr[Double] = js.undefined
      
      /**
        * The package name of the application for which voided purchases need to be returned (for example, 'com.some.thing').
        */
      var packageName: js.UndefOr[String] = js.undefined
      
      /**
        *
        */
      var startIndex: js.UndefOr[Double] = js.undefined
      
      /**
        * The time, in milliseconds since the Epoch, of the oldest voided purchase that you want to see in the response. The value of this parameter cannot be older than 30 days and is ignored if a pagination token is set. Default value is current time minus 30 days. Note: This filter is applied on the time at which the record is seen as voided by our systems and not the actual voided time returned in the response.
        */
      var startTime: js.UndefOr[String] = js.undefined
      
      /**
        *
        */
      var token: js.UndefOr[String] = js.undefined
    }
    object ParamsResourcePurchasesVoidedpurchasesList {
      
      inline def apply(): ParamsResourcePurchasesVoidedpurchasesList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourcePurchasesVoidedpurchasesList]
      }
      
      extension [Self <: ParamsResourcePurchasesVoidedpurchasesList](x: Self) {
        
        inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
        
        inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
        
        inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
        
        inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
        
        inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
        
        inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
        
        inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      }
    }
    
    trait SchemaPageInfo extends StObject {
      
      var resultPerPage: js.UndefOr[Double | Null] = js.undefined
      
      var startIndex: js.UndefOr[Double | Null] = js.undefined
      
      var totalResults: js.UndefOr[Double | Null] = js.undefined
    }
    object SchemaPageInfo {
      
      inline def apply(): SchemaPageInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaPageInfo]
      }
      
      extension [Self <: SchemaPageInfo](x: Self) {
        
        inline def setResultPerPage(value: Double): Self = StObject.set(x, "resultPerPage", value.asInstanceOf[js.Any])
        
        inline def setResultPerPageNull: Self = StObject.set(x, "resultPerPage", null)
        
        inline def setResultPerPageUndefined: Self = StObject.set(x, "resultPerPage", js.undefined)
        
        inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        inline def setStartIndexNull: Self = StObject.set(x, "startIndex", null)
        
        inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
        
        inline def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
        
        inline def setTotalResultsNull: Self = StObject.set(x, "totalResults", null)
        
        inline def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
      }
    }
    
    trait SchemaProductPurchase extends StObject {
      
      /**
        * The consumption state of the inapp product. Possible values are:   - Yet to be consumed  - Consumed
        */
      var consumptionState: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * A developer-specified string that contains supplemental information about an order.
        */
      var developerPayload: js.UndefOr[String | Null] = js.undefined
      
      /**
        * This kind represents an inappPurchase object in the androidpublisher service.
        */
      var kind: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The order id associated with the purchase of the inapp product.
        */
      var orderId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The purchase state of the order. Possible values are:   - Purchased  - Canceled  - Pending
        */
      var purchaseState: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The time the product was purchased, in milliseconds since the epoch (Jan 1, 1970).
        */
      var purchaseTimeMillis: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The type of purchase of the inapp product. This field is only set if this purchase was not made using the standard in-app billing flow. Possible values are:   - Test (i.e. purchased from a license testing account)  - Promo (i.e. purchased using a promo code)  - Rewarded (i.e. from watching a video ad instead of paying)
        */
      var purchaseType: js.UndefOr[Double | Null] = js.undefined
    }
    object SchemaProductPurchase {
      
      inline def apply(): SchemaProductPurchase = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaProductPurchase]
      }
      
      extension [Self <: SchemaProductPurchase](x: Self) {
        
        inline def setConsumptionState(value: Double): Self = StObject.set(x, "consumptionState", value.asInstanceOf[js.Any])
        
        inline def setConsumptionStateNull: Self = StObject.set(x, "consumptionState", null)
        
        inline def setConsumptionStateUndefined: Self = StObject.set(x, "consumptionState", js.undefined)
        
        inline def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
        
        inline def setDeveloperPayloadNull: Self = StObject.set(x, "developerPayload", null)
        
        inline def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindNull: Self = StObject.set(x, "kind", null)
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
        
        inline def setOrderIdNull: Self = StObject.set(x, "orderId", null)
        
        inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
        
        inline def setPurchaseState(value: Double): Self = StObject.set(x, "purchaseState", value.asInstanceOf[js.Any])
        
        inline def setPurchaseStateNull: Self = StObject.set(x, "purchaseState", null)
        
        inline def setPurchaseStateUndefined: Self = StObject.set(x, "purchaseState", js.undefined)
        
        inline def setPurchaseTimeMillis(value: String): Self = StObject.set(x, "purchaseTimeMillis", value.asInstanceOf[js.Any])
        
        inline def setPurchaseTimeMillisNull: Self = StObject.set(x, "purchaseTimeMillis", null)
        
        inline def setPurchaseTimeMillisUndefined: Self = StObject.set(x, "purchaseTimeMillis", js.undefined)
        
        inline def setPurchaseType(value: Double): Self = StObject.set(x, "purchaseType", value.asInstanceOf[js.Any])
        
        inline def setPurchaseTypeNull: Self = StObject.set(x, "purchaseType", null)
        
        inline def setPurchaseTypeUndefined: Self = StObject.set(x, "purchaseType", js.undefined)
      }
    }
    
    trait SchemaTokenPagination extends StObject {
      
      var nextPageToken: js.UndefOr[String | Null] = js.undefined
      
      var previousPageToken: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaTokenPagination {
      
      inline def apply(): SchemaTokenPagination = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTokenPagination]
      }
      
      extension [Self <: SchemaTokenPagination](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setPreviousPageToken(value: String): Self = StObject.set(x, "previousPageToken", value.asInstanceOf[js.Any])
        
        inline def setPreviousPageTokenNull: Self = StObject.set(x, "previousPageToken", null)
        
        inline def setPreviousPageTokenUndefined: Self = StObject.set(x, "previousPageToken", js.undefined)
      }
    }
    
    trait SchemaVoidedPurchase extends StObject {
      
      /**
        * This kind represents a voided purchase object in the androidpublisher service.
        */
      var kind: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The time at which the purchase was made, in milliseconds since the epoch (Jan 1, 1970).
        */
      var purchaseTimeMillis: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The token which uniquely identifies a one-time purchase or subscription. To uniquely identify subscription renewals use order_id (available starting from version 3 of the API).
        */
      var purchaseToken: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The time at which the purchase was canceled/refunded/charged-back, in milliseconds since the epoch (Jan 1, 1970).
        */
      var voidedTimeMillis: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaVoidedPurchase {
      
      inline def apply(): SchemaVoidedPurchase = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaVoidedPurchase]
      }
      
      extension [Self <: SchemaVoidedPurchase](x: Self) {
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindNull: Self = StObject.set(x, "kind", null)
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setPurchaseTimeMillis(value: String): Self = StObject.set(x, "purchaseTimeMillis", value.asInstanceOf[js.Any])
        
        inline def setPurchaseTimeMillisNull: Self = StObject.set(x, "purchaseTimeMillis", null)
        
        inline def setPurchaseTimeMillisUndefined: Self = StObject.set(x, "purchaseTimeMillis", js.undefined)
        
        inline def setPurchaseToken(value: String): Self = StObject.set(x, "purchaseToken", value.asInstanceOf[js.Any])
        
        inline def setPurchaseTokenNull: Self = StObject.set(x, "purchaseToken", null)
        
        inline def setPurchaseTokenUndefined: Self = StObject.set(x, "purchaseToken", js.undefined)
        
        inline def setVoidedTimeMillis(value: String): Self = StObject.set(x, "voidedTimeMillis", value.asInstanceOf[js.Any])
        
        inline def setVoidedTimeMillisNull: Self = StObject.set(x, "voidedTimeMillis", null)
        
        inline def setVoidedTimeMillisUndefined: Self = StObject.set(x, "voidedTimeMillis", js.undefined)
      }
    }
    
    trait SchemaVoidedPurchasesListResponse extends StObject {
      
      var pageInfo: js.UndefOr[SchemaPageInfo] = js.undefined
      
      var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.undefined
      
      var voidedPurchases: js.UndefOr[js.Array[SchemaVoidedPurchase]] = js.undefined
    }
    object SchemaVoidedPurchasesListResponse {
      
      inline def apply(): SchemaVoidedPurchasesListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaVoidedPurchasesListResponse]
      }
      
      extension [Self <: SchemaVoidedPurchasesListResponse](x: Self) {
        
        inline def setPageInfo(value: SchemaPageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
        
        inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
        
        inline def setTokenPagination(value: SchemaTokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
        
        inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
        
        inline def setVoidedPurchases(value: js.Array[SchemaVoidedPurchase]): Self = StObject.set(x, "voidedPurchases", value.asInstanceOf[js.Any])
        
        inline def setVoidedPurchasesUndefined: Self = StObject.set(x, "voidedPurchases", js.undefined)
        
        inline def setVoidedPurchasesVarargs(value: SchemaVoidedPurchase*): Self = StObject.set(x, "voidedPurchases", js.Array(value*))
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * Data format for the response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[
            String | OAuth2Client | JWT | Compute | UserRefreshClient | GoogleAuth[JSONClient]
          ] = js.undefined
      
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
        * An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.undefined
      
      /**
        * Deprecated. Please use quotaUser instead.
        */
      var userIp: js.UndefOr[String] = js.undefined
    }
    object StandardParameters {
      
      inline def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      extension [Self <: StandardParameters](x: Self) {
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient | GoogleAuth[JSONClient]): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
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
        
        inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
        
        inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
      }
    }
  }
}
