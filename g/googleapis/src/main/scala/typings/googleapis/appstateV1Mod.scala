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

object appstateV1Mod {
  
  object appstateV1 {
    
    /**
      * Google App State API
      *
      * The Google App State API.
      *
      * @example
      * const {google} = require('googleapis');
      * const appstate = google.appstate('v1');
      *
      * @namespace appstate
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Appstate
      */
    @JSImport("googleapis/build/src/apis/appstate/v1", "appstate_v1.Appstate")
    @js.native
    class Appstate protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var states: ResourceStates = js.native
    }
    
    @JSImport("googleapis/build/src/apis/appstate/v1", "appstate_v1.Resource$States")
    @js.native
    class ResourceStates protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      /**
        * appstate.states.clear
        * @desc Clears (sets to empty) the data for the passed key if and only if
        * the passed version matches the currently stored version. This method
        * results in a conflict error on version mismatch.
        * @alias appstate.states.clear
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string=} params.currentDataVersion The version of the data to be cleared. Version strings are returned by the server.
        * @param {integer} params.stateKey The key for the data to be retrieved.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def clear(): GaxiosPromise[SchemaWriteResult] = js.native
      def clear(callback: BodyResponseCallback[SchemaWriteResult]): Unit = js.native
      def clear(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWriteResult] = js.native
      def clear(params: ParamsResourceStatesClear): GaxiosPromise[SchemaWriteResult] = js.native
      def clear(params: ParamsResourceStatesClear, callback: BodyResponseCallback[SchemaWriteResult]): Unit = js.native
      def clear(
        params: ParamsResourceStatesClear,
        options: BodyResponseCallback[SchemaWriteResult],
        callback: BodyResponseCallback[SchemaWriteResult]
      ): Unit = js.native
      def clear(params: ParamsResourceStatesClear, options: MethodOptions): GaxiosPromise[SchemaWriteResult] = js.native
      def clear(
        params: ParamsResourceStatesClear,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaWriteResult]
      ): Unit = js.native
      
      var context: APIRequestContext = js.native
      
      /**
        * appstate.states.delete
        * @desc Deletes a key and the data associated with it. The key is removed
        * and no longer counts against the key quota. Note that since this method
        * is not safe in the face of concurrent modifications, it should only be
        * used for development and testing purposes. Invoking this method in
        * shipping code can result in data loss and data corruption.
        * @alias appstate.states.delete
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {integer} params.stateKey The key for the data to be retrieved.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def delete(): GaxiosPromise[Unit] = js.native
      def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
      def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
      def delete(params: ParamsResourceStatesDelete): GaxiosPromise[Unit] = js.native
      def delete(params: ParamsResourceStatesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
      def delete(
        params: ParamsResourceStatesDelete,
        options: BodyResponseCallback[Unit],
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
      def delete(params: ParamsResourceStatesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
      def delete(params: ParamsResourceStatesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
      
      /**
        * appstate.states.get
        * @desc Retrieves the data corresponding to the passed key. If the key does
        * not exist on the server, an HTTP 404 will be returned.
        * @alias appstate.states.get
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {integer} params.stateKey The key for the data to be retrieved.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def get(): GaxiosPromise[SchemaGetResponse] = js.native
      def get(callback: BodyResponseCallback[SchemaGetResponse]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetResponse] = js.native
      def get(params: ParamsResourceStatesGet): GaxiosPromise[SchemaGetResponse] = js.native
      def get(params: ParamsResourceStatesGet, callback: BodyResponseCallback[SchemaGetResponse]): Unit = js.native
      def get(
        params: ParamsResourceStatesGet,
        options: BodyResponseCallback[SchemaGetResponse],
        callback: BodyResponseCallback[SchemaGetResponse]
      ): Unit = js.native
      def get(params: ParamsResourceStatesGet, options: MethodOptions): GaxiosPromise[SchemaGetResponse] = js.native
      def get(
        params: ParamsResourceStatesGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGetResponse]
      ): Unit = js.native
      
      /**
        * appstate.states.list
        * @desc Lists all the states keys, and optionally the state data.
        * @alias appstate.states.list
        * @memberOf! ()
        *
        * @param {object=} params Parameters for request
        * @param {boolean=} params.includeData Whether to include the full data in addition to the version number
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[SchemaListResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaListResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListResponse] = js.native
      def list(params: ParamsResourceStatesList): GaxiosPromise[SchemaListResponse] = js.native
      def list(params: ParamsResourceStatesList, callback: BodyResponseCallback[SchemaListResponse]): Unit = js.native
      def list(
        params: ParamsResourceStatesList,
        options: BodyResponseCallback[SchemaListResponse],
        callback: BodyResponseCallback[SchemaListResponse]
      ): Unit = js.native
      def list(params: ParamsResourceStatesList, options: MethodOptions): GaxiosPromise[SchemaListResponse] = js.native
      def list(
        params: ParamsResourceStatesList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaListResponse]
      ): Unit = js.native
      
      /**
        * appstate.states.update
        * @desc Update the data associated with the input key if and only if the
        * passed version matches the currently stored version. This method is safe
        * in the face of concurrent writes. Maximum per-key size is 128KB.
        * @alias appstate.states.update
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string=} params.currentStateVersion The version of the app state your application is attempting to update. If this does not match the current version, this method will return a conflict error. If there is no data stored on the server for this key, the update will succeed irrespective of the value of this parameter.
        * @param {integer} params.stateKey The key for the data to be retrieved.
        * @param {().UpdateRequest} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def update(): GaxiosPromise[SchemaWriteResult] = js.native
      def update(callback: BodyResponseCallback[SchemaWriteResult]): Unit = js.native
      def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWriteResult] = js.native
      def update(params: ParamsResourceStatesUpdate): GaxiosPromise[SchemaWriteResult] = js.native
      def update(params: ParamsResourceStatesUpdate, callback: BodyResponseCallback[SchemaWriteResult]): Unit = js.native
      def update(
        params: ParamsResourceStatesUpdate,
        options: BodyResponseCallback[SchemaWriteResult],
        callback: BodyResponseCallback[SchemaWriteResult]
      ): Unit = js.native
      def update(params: ParamsResourceStatesUpdate, options: MethodOptions): GaxiosPromise[SchemaWriteResult] = js.native
      def update(
        params: ParamsResourceStatesUpdate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaWriteResult]
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
    
    trait ParamsResourceStatesClear
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * The version of the data to be cleared. Version strings are returned by
        * the server.
        */
      var currentDataVersion: js.UndefOr[String] = js.undefined
      
      /**
        * The key for the data to be retrieved.
        */
      var stateKey: js.UndefOr[Double] = js.undefined
    }
    object ParamsResourceStatesClear {
      
      inline def apply(): ParamsResourceStatesClear = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceStatesClear]
      }
      
      extension [Self <: ParamsResourceStatesClear](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setCurrentDataVersion(value: String): Self = StObject.set(x, "currentDataVersion", value.asInstanceOf[js.Any])
        
        inline def setCurrentDataVersionUndefined: Self = StObject.set(x, "currentDataVersion", js.undefined)
        
        inline def setStateKey(value: Double): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
        
        inline def setStateKeyUndefined: Self = StObject.set(x, "stateKey", js.undefined)
      }
    }
    
    trait ParamsResourceStatesDelete
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * The key for the data to be retrieved.
        */
      var stateKey: js.UndefOr[Double] = js.undefined
    }
    object ParamsResourceStatesDelete {
      
      inline def apply(): ParamsResourceStatesDelete = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceStatesDelete]
      }
      
      extension [Self <: ParamsResourceStatesDelete](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setStateKey(value: Double): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
        
        inline def setStateKeyUndefined: Self = StObject.set(x, "stateKey", js.undefined)
      }
    }
    
    trait ParamsResourceStatesGet
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * The key for the data to be retrieved.
        */
      var stateKey: js.UndefOr[Double] = js.undefined
    }
    object ParamsResourceStatesGet {
      
      inline def apply(): ParamsResourceStatesGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceStatesGet]
      }
      
      extension [Self <: ParamsResourceStatesGet](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setStateKey(value: Double): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
        
        inline def setStateKeyUndefined: Self = StObject.set(x, "stateKey", js.undefined)
      }
    }
    
    trait ParamsResourceStatesList
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Whether to include the full data in addition to the version number
        */
      var includeData: js.UndefOr[Boolean] = js.undefined
    }
    object ParamsResourceStatesList {
      
      inline def apply(): ParamsResourceStatesList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceStatesList]
      }
      
      extension [Self <: ParamsResourceStatesList](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setIncludeData(value: Boolean): Self = StObject.set(x, "includeData", value.asInstanceOf[js.Any])
        
        inline def setIncludeDataUndefined: Self = StObject.set(x, "includeData", js.undefined)
      }
    }
    
    trait ParamsResourceStatesUpdate
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * The version of the app state your application is attempting to update. If
        * this does not match the current version, this method will return a
        * conflict error. If there is no data stored on the server for this key,
        * the update will succeed irrespective of the value of this parameter.
        */
      var currentStateVersion: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaUpdateRequest] = js.undefined
      
      /**
        * The key for the data to be retrieved.
        */
      var stateKey: js.UndefOr[Double] = js.undefined
    }
    object ParamsResourceStatesUpdate {
      
      inline def apply(): ParamsResourceStatesUpdate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceStatesUpdate]
      }
      
      extension [Self <: ParamsResourceStatesUpdate](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setCurrentStateVersion(value: String): Self = StObject.set(x, "currentStateVersion", value.asInstanceOf[js.Any])
        
        inline def setCurrentStateVersionUndefined: Self = StObject.set(x, "currentStateVersion", js.undefined)
        
        inline def setRequestBody(value: SchemaUpdateRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        inline def setStateKey(value: Double): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
        
        inline def setStateKeyUndefined: Self = StObject.set(x, "stateKey", js.undefined)
      }
    }
    
    /**
      * This is a JSON template for an app state resource.
      */
    trait SchemaGetResponse extends StObject {
      
      /**
        * The current app state version.
        */
      var currentStateVersion: js.UndefOr[String] = js.undefined
      
      /**
        * The requested data.
        */
      var data: js.UndefOr[String] = js.undefined
      
      /**
        * Uniquely identifies the type of this resource. Value is always the fixed
        * string appstate#getResponse.
        */
      var kind: js.UndefOr[String] = js.undefined
      
      /**
        * The key for the data.
        */
      var stateKey: js.UndefOr[Double] = js.undefined
    }
    object SchemaGetResponse {
      
      inline def apply(): SchemaGetResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGetResponse]
      }
      
      extension [Self <: SchemaGetResponse](x: Self) {
        
        inline def setCurrentStateVersion(value: String): Self = StObject.set(x, "currentStateVersion", value.asInstanceOf[js.Any])
        
        inline def setCurrentStateVersionUndefined: Self = StObject.set(x, "currentStateVersion", js.undefined)
        
        inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setStateKey(value: Double): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
        
        inline def setStateKeyUndefined: Self = StObject.set(x, "stateKey", js.undefined)
      }
    }
    
    /**
      * This is a JSON template to convert a list-response for app state.
      */
    trait SchemaListResponse extends StObject {
      
      /**
        * The app state data.
        */
      var items: js.UndefOr[js.Array[SchemaGetResponse]] = js.undefined
      
      /**
        * Uniquely identifies the type of this resource. Value is always the fixed
        * string appstate#listResponse.
        */
      var kind: js.UndefOr[String] = js.undefined
      
      /**
        * The maximum number of keys allowed for this user.
        */
      var maximumKeyCount: js.UndefOr[Double] = js.undefined
    }
    object SchemaListResponse {
      
      inline def apply(): SchemaListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaListResponse]
      }
      
      extension [Self <: SchemaListResponse](x: Self) {
        
        inline def setItems(value: js.Array[SchemaGetResponse]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: SchemaGetResponse*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMaximumKeyCount(value: Double): Self = StObject.set(x, "maximumKeyCount", value.asInstanceOf[js.Any])
        
        inline def setMaximumKeyCountUndefined: Self = StObject.set(x, "maximumKeyCount", js.undefined)
      }
    }
    
    /**
      * This is a JSON template for a requests which update app state
      */
    trait SchemaUpdateRequest extends StObject {
      
      /**
        * The new app state data that your application is trying to update with.
        */
      var data: js.UndefOr[String] = js.undefined
      
      /**
        * Uniquely identifies the type of this resource. Value is always the fixed
        * string appstate#updateRequest.
        */
      var kind: js.UndefOr[String] = js.undefined
    }
    object SchemaUpdateRequest {
      
      inline def apply(): SchemaUpdateRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaUpdateRequest]
      }
      
      extension [Self <: SchemaUpdateRequest](x: Self) {
        
        inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    /**
      * This is a JSON template for an app state write result.
      */
    trait SchemaWriteResult extends StObject {
      
      /**
        * The version of the data for this key on the server.
        */
      var currentStateVersion: js.UndefOr[String] = js.undefined
      
      /**
        * Uniquely identifies the type of this resource. Value is always the fixed
        * string appstate#writeResult.
        */
      var kind: js.UndefOr[String] = js.undefined
      
      /**
        * The written key.
        */
      var stateKey: js.UndefOr[Double] = js.undefined
    }
    object SchemaWriteResult {
      
      inline def apply(): SchemaWriteResult = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaWriteResult]
      }
      
      extension [Self <: SchemaWriteResult](x: Self) {
        
        inline def setCurrentStateVersion(value: String): Self = StObject.set(x, "currentStateVersion", value.asInstanceOf[js.Any])
        
        inline def setCurrentStateVersionUndefined: Self = StObject.set(x, "currentStateVersion", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setStateKey(value: Double): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
        
        inline def setStateKeyUndefined: Self = StObject.set(x, "stateKey", js.undefined)
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * Data format for the response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
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
        * An opaque string that represents a user for quota purposes. Must not
        * exceed 40 characters.
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
