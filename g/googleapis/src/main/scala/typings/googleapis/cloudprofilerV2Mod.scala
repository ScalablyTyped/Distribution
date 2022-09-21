package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v2
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

object cloudprofilerV2Mod {
  
  object cloudprofilerV2 {
    
    @JSImport("googleapis/build/src/apis/cloudprofiler/v2", "cloudprofiler_v2.Cloudprofiler")
    @js.native
    open class Cloudprofiler protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var projects: ResourceProjects = js.native
    }
    
    @JSImport("googleapis/build/src/apis/cloudprofiler/v2", "cloudprofiler_v2.Resource$Projects")
    @js.native
    open class ResourceProjects protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var profiles: ResourceProjectsProfiles = js.native
    }
    
    @JSImport("googleapis/build/src/apis/cloudprofiler/v2", "cloudprofiler_v2.Resource$Projects$Profiles")
    @js.native
    open class ResourceProjectsProfiles protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def create(): GaxiosPromise[SchemaProfile] = js.native
      def create(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
      def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
      def create(params: ParamsResourceProjectsProfilesCreate): GaxiosPromise[SchemaProfile] = js.native
      def create(params: ParamsResourceProjectsProfilesCreate, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
      def create(
        params: ParamsResourceProjectsProfilesCreate,
        options: BodyResponseCallback[Readable | SchemaProfile],
        callback: BodyResponseCallback[Readable | SchemaProfile]
      ): Unit = js.native
      def create(params: ParamsResourceProjectsProfilesCreate, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
      def create(
        params: ParamsResourceProjectsProfilesCreate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaProfile]
      ): Unit = js.native
      /**
        * CreateProfile creates a new profile resource in the online mode. The server ensures that the new profiles are created at a constant rate per deployment, so the creation request may hang for some time until the next profile session is available. The request may fail with ABORTED error if the creation is not available within ~1m, the response will indicate the duration of the backoff the client should take before attempting creating a profile again. The backoff duration is returned in google.rpc.RetryInfo extension on the response status. To a gRPC client, the extension will be return as a binary-serialized proto in the trailing metadata item named "google.rpc.retryinfo-bin".
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/cloudprofiler.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const cloudprofiler = google.cloudprofiler('v2');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/cloud-platform',
        *       'https://www.googleapis.com/auth/monitoring',
        *       'https://www.googleapis.com/auth/monitoring.write',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await cloudprofiler.projects.profiles.create({
        *     // Parent project to create the profile in.
        *     parent: 'projects/my-project',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "deployment": {},
        *       //   "profileType": []
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "deployment": {},
        *   //   "duration": "my_duration",
        *   //   "labels": {},
        *   //   "name": "my_name",
        *   //   "profileBytes": "my_profileBytes",
        *   //   "profileType": "my_profileType"
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
      def create(params: ParamsResourceProjectsProfilesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def create(
        params: ParamsResourceProjectsProfilesCreate,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def createOffline(): GaxiosPromise[SchemaProfile] = js.native
      def createOffline(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
      def createOffline(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
      def createOffline(params: ParamsResourceProjectsProfilesCreateoffline): GaxiosPromise[SchemaProfile] = js.native
      def createOffline(params: ParamsResourceProjectsProfilesCreateoffline, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
      def createOffline(
        params: ParamsResourceProjectsProfilesCreateoffline,
        options: BodyResponseCallback[Readable | SchemaProfile],
        callback: BodyResponseCallback[Readable | SchemaProfile]
      ): Unit = js.native
      def createOffline(params: ParamsResourceProjectsProfilesCreateoffline, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
      def createOffline(
        params: ParamsResourceProjectsProfilesCreateoffline,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaProfile]
      ): Unit = js.native
      /**
        * CreateOfflineProfile creates a new profile resource in the offline mode. The client provides the profile to create along with the profile bytes, the server records it.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/cloudprofiler.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const cloudprofiler = google.cloudprofiler('v2');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/cloud-platform',
        *       'https://www.googleapis.com/auth/monitoring',
        *       'https://www.googleapis.com/auth/monitoring.write',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await cloudprofiler.projects.profiles.createOffline({
        *     // Parent project to create the profile in.
        *     parent: 'projects/my-project',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "deployment": {},
        *       //   "duration": "my_duration",
        *       //   "labels": {},
        *       //   "name": "my_name",
        *       //   "profileBytes": "my_profileBytes",
        *       //   "profileType": "my_profileType"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "deployment": {},
        *   //   "duration": "my_duration",
        *   //   "labels": {},
        *   //   "name": "my_name",
        *   //   "profileBytes": "my_profileBytes",
        *   //   "profileType": "my_profileType"
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
      def createOffline(params: ParamsResourceProjectsProfilesCreateoffline, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def createOffline(
        params: ParamsResourceProjectsProfilesCreateoffline,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def patch(): GaxiosPromise[SchemaProfile] = js.native
      def patch(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
      def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
      def patch(params: ParamsResourceProjectsProfilesPatch): GaxiosPromise[SchemaProfile] = js.native
      def patch(params: ParamsResourceProjectsProfilesPatch, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
      def patch(
        params: ParamsResourceProjectsProfilesPatch,
        options: BodyResponseCallback[Readable | SchemaProfile],
        callback: BodyResponseCallback[Readable | SchemaProfile]
      ): Unit = js.native
      def patch(params: ParamsResourceProjectsProfilesPatch, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
      def patch(
        params: ParamsResourceProjectsProfilesPatch,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaProfile]
      ): Unit = js.native
      /**
        * UpdateProfile updates the profile bytes and labels on the profile resource created in the online mode. Updating the bytes for profiles created in the offline mode is currently not supported: the profile content must be provided at the time of the profile creation.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/cloudprofiler.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const cloudprofiler = google.cloudprofiler('v2');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [
        *       'https://www.googleapis.com/auth/cloud-platform',
        *       'https://www.googleapis.com/auth/monitoring',
        *       'https://www.googleapis.com/auth/monitoring.write',
        *     ],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await cloudprofiler.projects.profiles.patch({
        *     // Output only. Opaque, server-assigned, unique ID for this profile.
        *     name: 'projects/my-project/profiles/my-profile',
        *     // Field mask used to specify the fields to be overwritten. Currently only profile_bytes and labels fields are supported by UpdateProfile, so only those fields can be specified in the mask. When no mask is provided, all fields are overwritten.
        *     updateMask: 'placeholder-value',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "deployment": {},
        *       //   "duration": "my_duration",
        *       //   "labels": {},
        *       //   "name": "my_name",
        *       //   "profileBytes": "my_profileBytes",
        *       //   "profileType": "my_profileType"
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "deployment": {},
        *   //   "duration": "my_duration",
        *   //   "labels": {},
        *   //   "name": "my_name",
        *   //   "profileBytes": "my_profileBytes",
        *   //   "profileType": "my_profileType"
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
      def patch(params: ParamsResourceProjectsProfilesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def patch(
        params: ParamsResourceProjectsProfilesPatch,
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
    
    trait ParamsResourceProjectsProfilesCreate
      extends StObject
         with StandardParameters {
      
      /**
        * Parent project to create the profile in.
        */
      var parent: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaCreateProfileRequest] = js.undefined
    }
    object ParamsResourceProjectsProfilesCreate {
      
      inline def apply(): ParamsResourceProjectsProfilesCreate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsProfilesCreate]
      }
      
      extension [Self <: ParamsResourceProjectsProfilesCreate](x: Self) {
        
        inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
        
        inline def setRequestBody(value: SchemaCreateProfileRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceProjectsProfilesCreateoffline
      extends StObject
         with StandardParameters {
      
      /**
        * Parent project to create the profile in.
        */
      var parent: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaProfile] = js.undefined
    }
    object ParamsResourceProjectsProfilesCreateoffline {
      
      inline def apply(): ParamsResourceProjectsProfilesCreateoffline = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsProfilesCreateoffline]
      }
      
      extension [Self <: ParamsResourceProjectsProfilesCreateoffline](x: Self) {
        
        inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
        
        inline def setRequestBody(value: SchemaProfile): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceProjectsProfilesPatch
      extends StObject
         with StandardParameters {
      
      /**
        * Output only. Opaque, server-assigned, unique ID for this profile.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaProfile] = js.undefined
      
      /**
        * Field mask used to specify the fields to be overwritten. Currently only profile_bytes and labels fields are supported by UpdateProfile, so only those fields can be specified in the mask. When no mask is provided, all fields are overwritten.
        */
      var updateMask: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceProjectsProfilesPatch {
      
      inline def apply(): ParamsResourceProjectsProfilesPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsProfilesPatch]
      }
      
      extension [Self <: ParamsResourceProjectsProfilesPatch](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setRequestBody(value: SchemaProfile): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
        
        inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
      }
    }
    
    trait SchemaCreateProfileRequest extends StObject {
      
      /**
        * Required. Deployment details.
        */
      var deployment: js.UndefOr[SchemaDeployment] = js.undefined
      
      /**
        * Required. One or more profile types that the agent is capable of providing.
        */
      var profileType: js.UndefOr[js.Array[String] | Null] = js.undefined
    }
    object SchemaCreateProfileRequest {
      
      inline def apply(): SchemaCreateProfileRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaCreateProfileRequest]
      }
      
      extension [Self <: SchemaCreateProfileRequest](x: Self) {
        
        inline def setDeployment(value: SchemaDeployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
        
        inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
        
        inline def setProfileType(value: js.Array[String]): Self = StObject.set(x, "profileType", value.asInstanceOf[js.Any])
        
        inline def setProfileTypeNull: Self = StObject.set(x, "profileType", null)
        
        inline def setProfileTypeUndefined: Self = StObject.set(x, "profileType", js.undefined)
        
        inline def setProfileTypeVarargs(value: String*): Self = StObject.set(x, "profileType", js.Array(value*))
      }
    }
    
    trait SchemaDeployment extends StObject {
      
      /**
        * Labels identify the deployment within the user universe and same target. Validation regex for label names: `^[a-z0-9]([a-z0-9-]{0,61\}[a-z0-9])?$`. Value for an individual label must be <= 512 bytes, the total size of all label names and values must be <= 1024 bytes. Label named "language" can be used to record the programming language of the profiled deployment. The standard choices for the value include "java", "go", "python", "ruby", "nodejs", "php", "dotnet". For deployments running on Google Cloud Platform, "zone" or "region" label should be present describing the deployment location. An example of a zone is "us-central1-a", an example of a region is "us-central1" or "us-central".
        */
      var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
      
      /**
        * Project ID is the ID of a cloud project. Validation regex: `^a-z{4,61\}[a-z0-9]$`.
        */
      var projectId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Target is the service name used to group related deployments: * Service name for App Engine Flex / Standard. * Cluster and container name for GKE. * User-specified string for direct Compute Engine profiling (e.g. Java). * Job name for Dataflow. Validation regex: `^[a-z0-9]([-a-z0-9_.]{0,253\}[a-z0-9])?$`.
        */
      var target: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaDeployment {
      
      inline def apply(): SchemaDeployment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaDeployment]
      }
      
      extension [Self <: SchemaDeployment](x: Self) {
        
        inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsNull: Self = StObject.set(x, "labels", null)
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
        
        inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
        
        inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setTargetNull: Self = StObject.set(x, "target", null)
        
        inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      }
    }
    
    trait SchemaProfile extends StObject {
      
      /**
        * Deployment this profile corresponds to.
        */
      var deployment: js.UndefOr[SchemaDeployment] = js.undefined
      
      /**
        * Duration of the profiling session. Input (for the offline mode) or output (for the online mode). The field represents requested profiling duration. It may slightly differ from the effective profiling duration, which is recorded in the profile data, in case the profiling can't be stopped immediately (e.g. in case stopping the profiling is handled asynchronously).
        */
      var duration: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Input only. Labels associated to this specific profile. These labels will get merged with the deployment labels for the final data set. See documentation on deployment labels for validation rules and limits.
        */
      var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
      
      /**
        * Output only. Opaque, server-assigned, unique ID for this profile.
        */
      var name: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Input only. Profile bytes, as a gzip compressed serialized proto, the format is https://github.com/google/pprof/blob/master/proto/profile.proto.
        */
      var profileBytes: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Type of profile. For offline mode, this must be specified when creating the profile. For online mode it is assigned and returned by the server.
        */
      var profileType: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaProfile {
      
      inline def apply(): SchemaProfile = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaProfile]
      }
      
      extension [Self <: SchemaProfile](x: Self) {
        
        inline def setDeployment(value: SchemaDeployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
        
        inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
        
        inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        inline def setDurationNull: Self = StObject.set(x, "duration", null)
        
        inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
        
        inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsNull: Self = StObject.set(x, "labels", null)
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setProfileBytes(value: String): Self = StObject.set(x, "profileBytes", value.asInstanceOf[js.Any])
        
        inline def setProfileBytesNull: Self = StObject.set(x, "profileBytes", null)
        
        inline def setProfileBytesUndefined: Self = StObject.set(x, "profileBytes", js.undefined)
        
        inline def setProfileType(value: String): Self = StObject.set(x, "profileType", value.asInstanceOf[js.Any])
        
        inline def setProfileTypeNull: Self = StObject.set(x, "profileType", null)
        
        inline def setProfileTypeUndefined: Self = StObject.set(x, "profileType", js.undefined)
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
