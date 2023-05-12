package typings.googleCloudSpanner

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.buildSrcCommonMod.LongRunningCallback
import typings.googleCloudSpanner.buildSrcCommonMod.NormalCallback
import typings.googleCloudSpanner.buildSrcCommonMod.RequestCallback
import typings.googleCloudSpanner.buildSrcCommonMod.ResourceCallback
import typings.googleCloudSpanner.mod.GetInstanceConfigCallback
import typings.googleCloudSpanner.mod.GetInstanceConfigOptions
import typings.googleCloudSpanner.mod.GetInstanceConfigResponse
import typings.googleCloudSpanner.mod.RequestConfig
import typings.googleCloudSpanner.mod.Spanner
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcInstanceConfigMod {
  
  /**
    * The {@link InstanceConfig} class represents a possible configuration for a
    * Cloud Spanner instance.
    *
    * Create an `InstanceConfig` object to interact with a Cloud Spanner instance
    * config.
    *
    * @class
    *
    * @param {Spanner} spanner {@link Spanner} instance.
    * @param {string} name Name of the instance config.
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    * const instance = spanner.instanceConfig('my-instance-config');
    * ```
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify common.GrpcServiceObject * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify common.GrpcServiceObject * / any */ @JSImport("@google-cloud/spanner/build/src/instance-config", "InstanceConfig")
  @js.native
  open class InstanceConfig protected () extends StObject {
    def this(spanner: Spanner, name: String) = this()
    
    /**
      * @typedef {array} DeleteInstanceConfigResponse
      * @property {object} 0 The full API response.
      */
    /**
      * @callback DeleteInstanceConfigCallback
      * @param {?Error} err Request error, if any.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Delete the instance config. This function can only be called for deleting
      * user managed instance configs.
      *
      * Wrapper around {@link v1.InstanceAdminClient#deleteInstanceConfig}.
      *
      * @see {@link v1.InstanceAdminClient#deleteInstanceConfig}
      * @see [DeleteInstanceConfig API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.instance.v1#google.spanner.admin.instance.v1.InstanceAdmin.DeleteInstanceConfig)
      *
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {DeleteInstanceConfigCallback} [callback] Callback function.
      * @returns {Promise<DeleteInstanceConfigResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instanceConfig = spanner.instanceConfig('custom-my-instance-config');
      *
      * instanceConfig.delete(function(err, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Instance config was deleted successfully.
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * instanceConfig.delete().then(function(data) {
      *   const apiResponse = data[0];
      * });
      * ```
      */
    def delete(): js.Promise[DeleteInstanceConfigResponse] = js.native
    def delete(callback: DeleteInstanceConfigCallback): Unit = js.native
    def delete(config: DeleteInstanceConfigRequest): js.Promise[DeleteInstanceConfigResponse] = js.native
    def delete(config: DeleteInstanceConfigRequest, callback: DeleteInstanceConfigCallback): Unit = js.native
    
    /**
      * @typedef {array} ExistsInstanceConfigResponse
      * @property {boolean} 0 Whether the {@link InstanceConfig} exists.
      */
    /**
      * @callback ExistsInstanceConfigCallback
      * @param {?Error} err Request error, if any.
      * @param {boolean} exists Whether the {@link InstanceConfig} exists.
      */
    /**
      * Check if an instance config exists.
      *
      * @method InstanceConfig#exists
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {ExistsInstanceConfigCallback} [callback] Callback function.
      * @returns {Promise<ExistsInstanceConfigResponse>} When resolved, contains
      *     true if the instance config exists and false if it does not exist.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instanceConfig = spanner.instanceConfig('custom-my-instance-config');
      *
      * const exists = await instanceConfig.exists();
      * console.log(`Does instance config exist? ${exists}`);
      * ```
      */
    def exists(): js.Promise[ExistsInstanceConfigResponse] = js.native
    def exists(callback: ExistsInstanceConfigCallback): Unit = js.native
    
    var formattedName_ : String = js.native
    
    /**
      * Gets the metadata from the backend for this InstanceConfig.
      */
    /**
      * @typedef {array} GetInstanceConfigResponse
      * @property {object[]} 0 The metadata of the instance config.
      * @property {string} 0.name The unique identifier for the instance config.
      * @property {string} 0.displayName The name of the instance config as it
      *     appears in UIs.
      * @property {google.spanner.admin.instance.v1.IReplicaInfo[]} 0.replicas The replicas used by
      *     this instance config.
      * @property {string[]} 0.leaderOptions The possible leader options for this instance config.
      */
    /**
      * @callback GetInstanceConfigCallback
      * @param {?Error} err Request error, if any.
      * @param {object} instanceConfig The metadata of the instance config.
      * @param {string} instanceConfig.name The unique identifier for the instance
      *     config.
      * @param {string} instanceConfig.displayName The name of the instance config
      *     as it appears in UIs.
      * @param {google.spanner.admin.instance.v1.IReplicaInfo[]} instanceConfig.replicas The replicas used by
      *     this instance config.
      * @param {string[]} 0.leaderOptions The possible leader options for this instance config.
      */
    /**
      * Gets the metadata from the backend for this InstanceConfig.
      *
      * Wrapper around {@link v1.InstanceAdminClient#getInstanceConfig}.
      *
      * @see {@link v1.InstanceAdminClient#getInstanceConfig}
      * @see [GetInstanceConfig API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.instance.v1#google.spanner.admin.instance.v1.InstanceAdmin.GetInstanceConfig)
      *
      * @param {GetInstanceConfigCallback} [callback] Callback function.
      * @returns {Promise<GetInstanceConfigResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instanceConfig = spanner.instanceConfig('custom-my-instance-config');
      *
      * instanceConfig.get(function(err, instanceConfig) {
      *   // `instanceConfig` is an instance configuration descriptor.
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * instanceConfig.get().then(function(data) {
      *   const instanceConfig = data[0];
      * });
      * ```
      */
    def get(): js.Promise[GetInstanceConfigResponse] = js.native
    def get(callback: GetInstanceConfigCallback): Unit = js.native
    def get(options: GetInstanceConfigOptions): js.Promise[GetInstanceConfigResponse] = js.native
    def get(options: GetInstanceConfigOptions, callback: GetInstanceConfigCallback): Unit = js.native
    
    var metadata: js.UndefOr[IInstanceConfig] = js.native
    
    def request(config: RequestConfig, callback: ResourceCallback[Operation_, IOperation]): Unit = js.native
    def request[T](config: RequestConfig, callback: RequestCallback[T, Unit]): Unit = js.native
    @JSName("request")
    var request_Original: InstanceConfigRequest = js.native
    @JSName("request")
    def request_TR[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
    
    var resourceHeader_ : StringDictionary[String] = js.native
    
    /**
      * Update the metadata for this instance config. Note that this method follows
      * PATCH semantics, so previously-configured settings will persist.
      * This function can only be called for deleting user managed instance
      * configs.
      *
      * Wrapper around {@link v1.InstanceAdminClient#updateInstanceConfig}.
      *
      * @see {@link v1.InstanceAdminClient#updateInstanceConfig}
      * @see [UpdateInstanceConfig API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.instance.v1#google.spanner.admin.instance.v1.InstanceAdmin.UpdateInstanceConfig)
      *
      * @param {object} metadata The metadata you wish to set.
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {SetInstanceConfigMetadataCallback} [callback] Callback function.
      * @returns {Promise<LongRunningOperationResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instanceConfig = spanner.instanceConfig('custom-my-instance-config');
      *
      * const metadata = {
      *   instanceConfig: {
      *     displayName: 'My Instance Config'
      *   }
      * };
      *
      * instanceConfig.setMetadata(metadata, function(err, operation, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   operation
      *     .on('error', function(err) {})
      *     .on('complete', function() {
      *       // Metadata updated successfully.
      *     });
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * instanceConfig.setMetadata(metadata).then(function(data) {
      *   const operation = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def setMetadata(config: SetInstanceConfigMetadataRequest): js.Promise[SetInstanceConfigMetadataResponse] = js.native
    def setMetadata(config: SetInstanceConfigMetadataRequest, callback: SetInstanceConfigMetadataCallback): Unit = js.native
  }
  object InstanceConfig {
    
    @JSImport("@google-cloud/spanner/build/src/instance-config", "InstanceConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Format the instance config name to include the project ID.
      *
      * @private
      *
      * @param {string} projectId The project ID.
      * @param {string} name The instance config name.
      * @returns {string}
      *
      * @example
      * ```
      * InstanceConfig.formatName_('grape-spaceship-123', 'my-instance-config');
      * // 'projects/grape-spaceship-123/instanceConfigs/my-instance-config'
      * ```
      */
    /* static member */
    inline def formatName(projectId: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  type CreateInstanceConfigCallback = LongRunningCallback[InstanceConfig]
  
  type CreateInstanceConfigResponse = js.Tuple3[InstanceConfig, Operation_, IOperation]
  
  type DeleteInstanceConfigCallback = NormalCallback[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.protobuf.IEmpty */ Any
  ]
  
  trait DeleteInstanceConfigRequest extends StObject {
    
    var etag: js.UndefOr[String] = js.undefined
    
    var gaxOpts: js.UndefOr[CallOptions] = js.undefined
    
    var validateOnly: js.UndefOr[Boolean] = js.undefined
  }
  object DeleteInstanceConfigRequest {
    
    inline def apply(): DeleteInstanceConfigRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteInstanceConfigRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteInstanceConfigRequest] (val x: Self) extends AnyVal {
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      inline def setGaxOpts(value: CallOptions): Self = StObject.set(x, "gaxOpts", value.asInstanceOf[js.Any])
      
      inline def setGaxOptsUndefined: Self = StObject.set(x, "gaxOpts", js.undefined)
      
      inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
      
      inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
    }
  }
  
  type DeleteInstanceConfigResponse = js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.protobuf.IEmpty */ Any
  ]
  
  type ExistsInstanceConfigCallback = NormalCallback[Boolean]
  
  type ExistsInstanceConfigResponse = Boolean
  
  type IInstanceConfig = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IInstanceConfig */ Any
  
  type IOperation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.longrunning.IOperation */ Any
  
  @js.native
  trait InstanceConfigRequest extends StObject {
    
    def apply(config: RequestConfig, callback: ResourceCallback[Operation_, IOperation]): Unit = js.native
    def apply[T](config: RequestConfig, callback: RequestCallback[T, Unit]): Unit = js.native
  }
  
  type SetInstanceConfigMetadataCallback = ResourceCallback[Operation_, IOperation]
  
  trait SetInstanceConfigMetadataRequest extends StObject {
    
    var gaxOpts: js.UndefOr[CallOptions] = js.undefined
    
    var instanceConfig: IInstanceConfig
    
    var validateOnly: js.UndefOr[Boolean] = js.undefined
  }
  object SetInstanceConfigMetadataRequest {
    
    inline def apply(instanceConfig: IInstanceConfig): SetInstanceConfigMetadataRequest = {
      val __obj = js.Dynamic.literal(instanceConfig = instanceConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetInstanceConfigMetadataRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetInstanceConfigMetadataRequest] (val x: Self) extends AnyVal {
      
      inline def setGaxOpts(value: CallOptions): Self = StObject.set(x, "gaxOpts", value.asInstanceOf[js.Any])
      
      inline def setGaxOptsUndefined: Self = StObject.set(x, "gaxOpts", js.undefined)
      
      inline def setInstanceConfig(value: IInstanceConfig): Self = StObject.set(x, "instanceConfig", value.asInstanceOf[js.Any])
      
      inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
      
      inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
    }
  }
  
  type SetInstanceConfigMetadataResponse = js.Tuple2[Operation_, IOperation]
}
