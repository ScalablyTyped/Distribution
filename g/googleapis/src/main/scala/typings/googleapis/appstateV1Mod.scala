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
import scala.scalajs.js.`|`
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
      def clear(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWriteResult] = js.native
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
      def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
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
      def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetResponse] = js.native
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
      def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListResponse] = js.native
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
      def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWriteResult] = js.native
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
    
    @js.native
    trait Options extends GlobalOptions {
      
      var version: v1 = js.native
    }
    object Options {
      
      @scala.inline
      def apply(version: v1): Options = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ParamsResourceStatesClear extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The version of the data to be cleared. Version strings are returned by
        * the server.
        */
      var currentDataVersion: js.UndefOr[String] = js.native
      
      /**
        * The key for the data to be retrieved.
        */
      var stateKey: js.UndefOr[Double] = js.native
    }
    object ParamsResourceStatesClear {
      
      @scala.inline
      def apply(): ParamsResourceStatesClear = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceStatesClear]
      }
      
      @scala.inline
      implicit class ParamsResourceStatesClearMutableBuilder[Self <: ParamsResourceStatesClear] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setCurrentDataVersion(value: String): Self = StObject.set(x, "currentDataVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrentDataVersionUndefined: Self = StObject.set(x, "currentDataVersion", js.undefined)
        
        @scala.inline
        def setStateKey(value: Double): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateKeyUndefined: Self = StObject.set(x, "stateKey", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceStatesDelete extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The key for the data to be retrieved.
        */
      var stateKey: js.UndefOr[Double] = js.native
    }
    object ParamsResourceStatesDelete {
      
      @scala.inline
      def apply(): ParamsResourceStatesDelete = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceStatesDelete]
      }
      
      @scala.inline
      implicit class ParamsResourceStatesDeleteMutableBuilder[Self <: ParamsResourceStatesDelete] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setStateKey(value: Double): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateKeyUndefined: Self = StObject.set(x, "stateKey", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceStatesGet extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The key for the data to be retrieved.
        */
      var stateKey: js.UndefOr[Double] = js.native
    }
    object ParamsResourceStatesGet {
      
      @scala.inline
      def apply(): ParamsResourceStatesGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceStatesGet]
      }
      
      @scala.inline
      implicit class ParamsResourceStatesGetMutableBuilder[Self <: ParamsResourceStatesGet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setStateKey(value: Double): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateKeyUndefined: Self = StObject.set(x, "stateKey", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceStatesList extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Whether to include the full data in addition to the version number
        */
      var includeData: js.UndefOr[Boolean] = js.native
    }
    object ParamsResourceStatesList {
      
      @scala.inline
      def apply(): ParamsResourceStatesList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceStatesList]
      }
      
      @scala.inline
      implicit class ParamsResourceStatesListMutableBuilder[Self <: ParamsResourceStatesList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setIncludeData(value: Boolean): Self = StObject.set(x, "includeData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeDataUndefined: Self = StObject.set(x, "includeData", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceStatesUpdate extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The version of the app state your application is attempting to update. If
        * this does not match the current version, this method will return a
        * conflict error. If there is no data stored on the server for this key,
        * the update will succeed irrespective of the value of this parameter.
        */
      var currentStateVersion: js.UndefOr[String] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaUpdateRequest] = js.native
      
      /**
        * The key for the data to be retrieved.
        */
      var stateKey: js.UndefOr[Double] = js.native
    }
    object ParamsResourceStatesUpdate {
      
      @scala.inline
      def apply(): ParamsResourceStatesUpdate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceStatesUpdate]
      }
      
      @scala.inline
      implicit class ParamsResourceStatesUpdateMutableBuilder[Self <: ParamsResourceStatesUpdate] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setCurrentStateVersion(value: String): Self = StObject.set(x, "currentStateVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrentStateVersionUndefined: Self = StObject.set(x, "currentStateVersion", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaUpdateRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        @scala.inline
        def setStateKey(value: Double): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateKeyUndefined: Self = StObject.set(x, "stateKey", js.undefined)
      }
    }
    
    /**
      * This is a JSON template for an app state resource.
      */
    @js.native
    trait SchemaGetResponse extends StObject {
      
      /**
        * The current app state version.
        */
      var currentStateVersion: js.UndefOr[String] = js.native
      
      /**
        * The requested data.
        */
      var data: js.UndefOr[String] = js.native
      
      /**
        * Uniquely identifies the type of this resource. Value is always the fixed
        * string appstate#getResponse.
        */
      var kind: js.UndefOr[String] = js.native
      
      /**
        * The key for the data.
        */
      var stateKey: js.UndefOr[Double] = js.native
    }
    object SchemaGetResponse {
      
      @scala.inline
      def apply(): SchemaGetResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGetResponse]
      }
      
      @scala.inline
      implicit class SchemaGetResponseMutableBuilder[Self <: SchemaGetResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrentStateVersion(value: String): Self = StObject.set(x, "currentStateVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrentStateVersionUndefined: Self = StObject.set(x, "currentStateVersion", js.undefined)
        
        @scala.inline
        def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setStateKey(value: Double): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateKeyUndefined: Self = StObject.set(x, "stateKey", js.undefined)
      }
    }
    
    /**
      * This is a JSON template to convert a list-response for app state.
      */
    @js.native
    trait SchemaListResponse extends StObject {
      
      /**
        * The app state data.
        */
      var items: js.UndefOr[js.Array[SchemaGetResponse]] = js.native
      
      /**
        * Uniquely identifies the type of this resource. Value is always the fixed
        * string appstate#listResponse.
        */
      var kind: js.UndefOr[String] = js.native
      
      /**
        * The maximum number of keys allowed for this user.
        */
      var maximumKeyCount: js.UndefOr[Double] = js.native
    }
    object SchemaListResponse {
      
      @scala.inline
      def apply(): SchemaListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaListResponse]
      }
      
      @scala.inline
      implicit class SchemaListResponseMutableBuilder[Self <: SchemaListResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setItems(value: js.Array[SchemaGetResponse]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: SchemaGetResponse*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setMaximumKeyCount(value: Double): Self = StObject.set(x, "maximumKeyCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaximumKeyCountUndefined: Self = StObject.set(x, "maximumKeyCount", js.undefined)
      }
    }
    
    /**
      * This is a JSON template for a requests which update app state
      */
    @js.native
    trait SchemaUpdateRequest extends StObject {
      
      /**
        * The new app state data that your application is trying to update with.
        */
      var data: js.UndefOr[String] = js.native
      
      /**
        * Uniquely identifies the type of this resource. Value is always the fixed
        * string appstate#updateRequest.
        */
      var kind: js.UndefOr[String] = js.native
    }
    object SchemaUpdateRequest {
      
      @scala.inline
      def apply(): SchemaUpdateRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaUpdateRequest]
      }
      
      @scala.inline
      implicit class SchemaUpdateRequestMutableBuilder[Self <: SchemaUpdateRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    /**
      * This is a JSON template for an app state write result.
      */
    @js.native
    trait SchemaWriteResult extends StObject {
      
      /**
        * The version of the data for this key on the server.
        */
      var currentStateVersion: js.UndefOr[String] = js.native
      
      /**
        * Uniquely identifies the type of this resource. Value is always the fixed
        * string appstate#writeResult.
        */
      var kind: js.UndefOr[String] = js.native
      
      /**
        * The written key.
        */
      var stateKey: js.UndefOr[Double] = js.native
    }
    object SchemaWriteResult {
      
      @scala.inline
      def apply(): SchemaWriteResult = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaWriteResult]
      }
      
      @scala.inline
      implicit class SchemaWriteResultMutableBuilder[Self <: SchemaWriteResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrentStateVersion(value: String): Self = StObject.set(x, "currentStateVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrentStateVersionUndefined: Self = StObject.set(x, "currentStateVersion", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setStateKey(value: Double): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateKeyUndefined: Self = StObject.set(x, "stateKey", js.undefined)
      }
    }
    
    @js.native
    trait StandardParameters extends StObject {
      
      /**
        * Data format for the response.
        */
      var alt: js.UndefOr[String] = js.native
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.native
      
      /**
        * API key. Your API key identifies your project and provides you with API
        * access, quota, and reports. Required unless you provide an OAuth 2.0
        * token.
        */
      var key: js.UndefOr[String] = js.native
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.native
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.native
      
      /**
        * An opaque string that represents a user for quota purposes. Must not
        * exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.native
      
      /**
        * Deprecated. Please use quotaUser instead.
        */
      var userIp: js.UndefOr[String] = js.native
    }
    object StandardParameters {
      
      @scala.inline
      def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      @scala.inline
      implicit class StandardParametersMutableBuilder[Self <: StandardParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        @scala.inline
        def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        @scala.inline
        def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        @scala.inline
        def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
      }
    }
  }
}
