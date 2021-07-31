package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.googleapisStrings.v2
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudprofilerV2Mod {
  
  object cloudprofilerV2 {
    
    /**
      * Stackdriver Profiler API
      *
      * Manages continuous profiling information.
      *
      * @example
      * const {google} = require('googleapis');
      * const cloudprofiler = google.cloudprofiler('v2');
      *
      * @namespace cloudprofiler
      * @type {Function}
      * @version v2
      * @variation v2
      * @param {object=} options Options for Cloudprofiler
      */
    @JSImport("googleapis/build/src/apis/cloudprofiler/v2", "cloudprofiler_v2.Cloudprofiler")
    @js.native
    class Cloudprofiler protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var projects: ResourceProjects = js.native
    }
    
    @JSImport("googleapis/build/src/apis/cloudprofiler/v2", "cloudprofiler_v2.Resource$Projects")
    @js.native
    class ResourceProjects protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var profiles: ResourceProjectsProfiles = js.native
    }
    
    @JSImport("googleapis/build/src/apis/cloudprofiler/v2", "cloudprofiler_v2.Resource$Projects$Profiles")
    @js.native
    class ResourceProjectsProfiles protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * cloudprofiler.projects.profiles.create
        * @desc CreateProfile creates a new profile resource in the online mode.
        * The server ensures that the new profiles are created at a constant rate
        * per deployment, so the creation request may hang for some time until the
        * next profile session is available.  The request may fail with ABORTED
        * error if the creation is not available within ~1m, the response will
        * indicate the duration of the backoff the client should take before
        * attempting creating a profile again. The backoff duration is returned in
        * google.rpc.RetryInfo extension on the response status. To a gRPC client,
        * the extension will be return as a binary-serialized proto in the trailing
        * metadata item named "google.rpc.retryinfo-bin".
        * @alias cloudprofiler.projects.profiles.create
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.parent Parent project to create the profile in.
        * @param {().CreateProfileRequest} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def create(): GaxiosPromise[SchemaProfile] = js.native
      def create(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
      def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
      def create(params: ParamsResourceProjectsProfilesCreate): GaxiosPromise[SchemaProfile] = js.native
      def create(params: ParamsResourceProjectsProfilesCreate, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
      def create(
        params: ParamsResourceProjectsProfilesCreate,
        options: BodyResponseCallback[SchemaProfile],
        callback: BodyResponseCallback[SchemaProfile]
      ): Unit = js.native
      def create(params: ParamsResourceProjectsProfilesCreate, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
      def create(
        params: ParamsResourceProjectsProfilesCreate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaProfile]
      ): Unit = js.native
      
      /**
        * cloudprofiler.projects.profiles.createOffline
        * @desc CreateOfflineProfile creates a new profile resource in the offline
        * mode. The client provides the profile to create along with the profile
        * bytes, the server records it.
        * @alias cloudprofiler.projects.profiles.createOffline
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.parent Parent project to create the profile in.
        * @param {().Profile} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def createOffline(): GaxiosPromise[SchemaProfile] = js.native
      def createOffline(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
      def createOffline(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
      def createOffline(params: ParamsResourceProjectsProfilesCreateoffline): GaxiosPromise[SchemaProfile] = js.native
      def createOffline(params: ParamsResourceProjectsProfilesCreateoffline, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
      def createOffline(
        params: ParamsResourceProjectsProfilesCreateoffline,
        options: BodyResponseCallback[SchemaProfile],
        callback: BodyResponseCallback[SchemaProfile]
      ): Unit = js.native
      def createOffline(params: ParamsResourceProjectsProfilesCreateoffline, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
      def createOffline(
        params: ParamsResourceProjectsProfilesCreateoffline,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaProfile]
      ): Unit = js.native
      
      /**
        * cloudprofiler.projects.profiles.patch
        * @desc UpdateProfile updates the profile bytes and labels on the profile
        * resource created in the online mode. Updating the bytes for profiles
        * created in the offline mode is currently not supported: the profile
        * content must be provided at the time of the profile creation.
        * @alias cloudprofiler.projects.profiles.patch
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.name Output only. Opaque, server-assigned, unique ID for this profile.
        * @param {string=} params.updateMask Field mask used to specify the fields to be overwritten. Currently only profile_bytes and labels fields are supported by UpdateProfile, so only those fields can be specified in the mask. When no mask is provided, all fields are overwritten.
        * @param {().Profile} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def patch(): GaxiosPromise[SchemaProfile] = js.native
      def patch(callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
      def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
      def patch(params: ParamsResourceProjectsProfilesPatch): GaxiosPromise[SchemaProfile] = js.native
      def patch(params: ParamsResourceProjectsProfilesPatch, callback: BodyResponseCallback[SchemaProfile]): Unit = js.native
      def patch(
        params: ParamsResourceProjectsProfilesPatch,
        options: BodyResponseCallback[SchemaProfile],
        callback: BodyResponseCallback[SchemaProfile]
      ): Unit = js.native
      def patch(params: ParamsResourceProjectsProfilesPatch, options: MethodOptions): GaxiosPromise[SchemaProfile] = js.native
      def patch(
        params: ParamsResourceProjectsProfilesPatch,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaProfile]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v2
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v2")
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v2): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceProjectsProfilesCreate
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
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
      
      @scala.inline
      def apply(): ParamsResourceProjectsProfilesCreate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsProfilesCreate]
      }
      
      @scala.inline
      implicit class ParamsResourceProjectsProfilesCreateMutableBuilder[Self <: ParamsResourceProjectsProfilesCreate] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaCreateProfileRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceProjectsProfilesCreateoffline
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
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
      
      @scala.inline
      def apply(): ParamsResourceProjectsProfilesCreateoffline = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsProfilesCreateoffline]
      }
      
      @scala.inline
      implicit class ParamsResourceProjectsProfilesCreateofflineMutableBuilder[Self <: ParamsResourceProjectsProfilesCreateoffline] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaProfile): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceProjectsProfilesPatch
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Output only. Opaque, server-assigned, unique ID for this profile.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaProfile] = js.undefined
      
      /**
        * Field mask used to specify the fields to be overwritten. Currently only
        * profile_bytes and labels fields are supported by UpdateProfile, so only
        * those fields can be specified in the mask. When no mask is provided, all
        * fields are overwritten.
        */
      var updateMask: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceProjectsProfilesPatch {
      
      @scala.inline
      def apply(): ParamsResourceProjectsProfilesPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsProfilesPatch]
      }
      
      @scala.inline
      implicit class ParamsResourceProjectsProfilesPatchMutableBuilder[Self <: ParamsResourceProjectsProfilesPatch] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaProfile): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        @scala.inline
        def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
      }
    }
    
    /**
      * CreateProfileRequest describes a profile resource online creation request.
      * The deployment field must be populated. The profile_type specifies the list
      * of profile types supported by the agent. The creation call will hang until
      * a profile of one of these types needs to be collected.
      */
    trait SchemaCreateProfileRequest extends StObject {
      
      /**
        * Deployment details.
        */
      var deployment: js.UndefOr[SchemaDeployment] = js.undefined
      
      /**
        * One or more profile types that the agent is capable of providing.
        */
      var profileType: js.UndefOr[js.Array[String]] = js.undefined
    }
    object SchemaCreateProfileRequest {
      
      @scala.inline
      def apply(): SchemaCreateProfileRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaCreateProfileRequest]
      }
      
      @scala.inline
      implicit class SchemaCreateProfileRequestMutableBuilder[Self <: SchemaCreateProfileRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeployment(value: SchemaDeployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
        
        @scala.inline
        def setProfileType(value: js.Array[String]): Self = StObject.set(x, "profileType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProfileTypeUndefined: Self = StObject.set(x, "profileType", js.undefined)
        
        @scala.inline
        def setProfileTypeVarargs(value: String*): Self = StObject.set(x, "profileType", js.Array(value :_*))
      }
    }
    
    /**
      * Deployment contains the deployment identification information.
      */
    trait SchemaDeployment extends StObject {
      
      /**
        * Labels identify the deployment within the user universe and same target.
        * Validation regex for label names: `^[a-z0-9]([a-z0-9-]{0,61}[a-z0-9])?$`.
        * Value for an individual label must be &lt;= 512 bytes, the total size of
        * all label names and values must be &lt;= 1024 bytes.  Label named
        * &quot;language&quot; can be used to record the programming language of
        * the profiled deployment. The standard choices for the value include
        * &quot;java&quot;, &quot;go&quot;, &quot;python&quot;, &quot;ruby&quot;,
        * &quot;nodejs&quot;, &quot;php&quot;, &quot;dotnet&quot;.  For deployments
        * running on Google Cloud Platform, &quot;zone&quot; or &quot;region&quot;
        * label should be present describing the deployment location. An example of
        * a zone is &quot;us-central1-a&quot;, an example of a region is
        * &quot;us-central1&quot; or &quot;us-central&quot;.
        */
      var labels: js.UndefOr[StringDictionary[String]] = js.undefined
      
      /**
        * Project ID is the ID of a cloud project. Validation regex:
        * `^a-z{4,61}[a-z0-9]$`.
        */
      var projectId: js.UndefOr[String] = js.undefined
      
      /**
        * Target is the service name used to group related deployments: * Service
        * name for GAE Flex / Standard. * Cluster and container name for GKE. *
        * User-specified string for direct GCE profiling (e.g. Java). * Job name
        * for Dataflow. Validation regex: `^[a-z]([-a-z0-9_.]{0,253}[a-z0-9])?$`.
        */
      var target: js.UndefOr[String] = js.undefined
    }
    object SchemaDeployment {
      
      @scala.inline
      def apply(): SchemaDeployment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaDeployment]
      }
      
      @scala.inline
      implicit class SchemaDeploymentMutableBuilder[Self <: SchemaDeployment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        @scala.inline
        def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
        
        @scala.inline
        def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      }
    }
    
    /**
      * Profile resource.
      */
    trait SchemaProfile extends StObject {
      
      /**
        * Deployment this profile corresponds to.
        */
      var deployment: js.UndefOr[SchemaDeployment] = js.undefined
      
      /**
        * Duration of the profiling session. Input (for the offline mode) or output
        * (for the online mode). The field represents requested profiling duration.
        * It may slightly differ from the effective profiling duration, which is
        * recorded in the profile data, in case the profiling can&#39;t be stopped
        * immediately (e.g. in case stopping the profiling is handled
        * asynchronously).
        */
      var duration: js.UndefOr[String] = js.undefined
      
      /**
        * Input only. Labels associated to this specific profile. These labels will
        * get merged with the deployment labels for the final data set.  See
        * documentation on deployment labels for validation rules and limits.
        */
      var labels: js.UndefOr[StringDictionary[String]] = js.undefined
      
      /**
        * Output only. Opaque, server-assigned, unique ID for this profile.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Input only. Profile bytes, as a gzip compressed serialized proto, the
        * format is
        * https://github.com/google/pprof/blob/master/proto/profile.proto.
        */
      var profileBytes: js.UndefOr[String] = js.undefined
      
      /**
        * Type of profile. For offline mode, this must be specified when creating
        * the profile. For online mode it is assigned and returned by the server.
        */
      var profileType: js.UndefOr[String] = js.undefined
    }
    object SchemaProfile {
      
      @scala.inline
      def apply(): SchemaProfile = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaProfile]
      }
      
      @scala.inline
      implicit class SchemaProfileMutableBuilder[Self <: SchemaProfile] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeployment(value: SchemaDeployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
        
        @scala.inline
        def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
        
        @scala.inline
        def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setProfileBytes(value: String): Self = StObject.set(x, "profileBytes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProfileBytesUndefined: Self = StObject.set(x, "profileBytes", js.undefined)
        
        @scala.inline
        def setProfileType(value: String): Self = StObject.set(x, "profileType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProfileTypeUndefined: Self = StObject.set(x, "profileType", js.undefined)
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
      
      @scala.inline
      def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      @scala.inline
      implicit class StandardParametersMutableBuilder[Self <: StandardParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
        
        @scala.inline
        def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        @scala.inline
        def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        @scala.inline
        def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
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
        def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
        
        @scala.inline
        def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      }
    }
  }
}
