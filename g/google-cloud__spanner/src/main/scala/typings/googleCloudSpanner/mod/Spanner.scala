package typings.googleCloudSpanner.mod

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleCloudPreciseDate.mod.PreciseDate
import typings.googleCloudSpanner.anon.Endpoint
import typings.googleCloudSpanner.buildSrcCodecMod.PGJsonb
import typings.googleCloudSpanner.buildSrcCommonGrpcServiceMod.GrpcService
import typings.googleCloudSpanner.buildSrcInstanceConfigMod.CreateInstanceConfigCallback
import typings.googleCloudSpanner.buildSrcInstanceConfigMod.CreateInstanceConfigResponse
import typings.googleCloudSpanner.buildSrcInstanceMod.CreateInstanceCallback
import typings.googleCloudSpanner.buildSrcInstanceMod.CreateInstanceResponse
import typings.node.NodeJS.ReadableStream
import typings.protobufjs.mod.common.ITimestamp
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Cloud Spanner](https://cloud.google.com/spanner) is a highly scalable,
  * transactional, managed, NewSQL database service. Cloud Spanner solves the
  * need for a horizontally-scaling database with consistent global transaction
  * and SQL semantics. With Cloud Spanner you don't need to choose between
  * consistency and horizontal scaling — you get both.
  *
  * @class
  *
  * @see [Cloud Spanner Documentation](https://cloud.google.com/spanner/docs)
  * @see [Cloud Spanner Concepts](https://cloud.google.com/spanner/docs/concepts)
  *
  * @example Install the client library with <a
  * href="https://www.npmjs.com/">npm</a>:
  * ```
  * npm install --save @google-cloud/spanner
  * ```
  *
  * @example Create a client that uses <a
  * href="https://cloud.google.com/docs/authentication/production#providing_credentials_to_your_application">Application
  * Default Credentials (ADC)</a>:
  * ```
  * const client = new Spanner();
  * ```
  *
  * @example Create a client with <a
  * href="https://cloud.google.com/docs/authentication/production#obtaining_and_providing_service_account_credentials_manually">explicit
  * credentials</a>:
  * ```
  * const client = new Spanner({ projectId:
  * 'your-project-id', keyFilename: '/path/to/keyfile.json'
  * });
  * ```
  *
  * @example <caption>include:samples/quickstart.js</caption>
  * region_tag:spanner_quickstart
  * Full quickstart example:
  *
  * @param {ClientConfig} [options] Configuration options.
  */
@JSImport("@google-cloud/spanner", "Spanner")
@js.native
open class Spanner () extends GrpcService {
  def this(options: SpannerOptions) = this()
  
  var auth: GoogleAuth[JSONClient] = js.native
  
  var clients_ : Map[String, js.Object] = js.native
  
  /** Closes this Spanner client and cleans up all resources used by it. */
  def close(): Unit = js.native
  
  /**
    * Config for the new instance.
    *
    * @typedef {object} CreateInstanceRequest
    * @property {string} config The name of the instance's configuration.
    * @property {number} [nodes=1] The number of nodes allocated to this instance.
    *     Defaults to 1.
    * @property {Object.<string, string>} [labels] Labels are a flexible and
    *     lightweight mechanism for organizing cloud resources into groups that
    *     reflect a customer's organizational needs and deployment strategies.
    *     Cloud Labels can be used to filter collections of resources. They can
    *     be used to control how resource metrics are aggregated. And they can
    *     be used as arguments to policy management rules (e.g. route,
    *     firewall, load balancing, etc.).
    * @property {string} [displayName] The descriptive name for this instance
    *     as it appears in UIs. Must be unique per project and between 4 and 30
    *     characters in length.
    *     Defaults to the instance unique identifier '<instance>' of the full
    *     instance name of the form 'projects/<project>/instances/<instance>'.
    */
  /**
    * @typedef {array} CreateInstanceResponse
    * @property {Instance} 0 The new {@link Instance}.
    * @property {google.longrunning.Operation} 1 An operation object that can be used to check
    *     the status of the request.
    * @property {google.longrunning.IOperation} 2 The full API response.
    */
  /**
    * @callback CreateInstanceCallback
    * @param {?Error} err Request error, if any.
    * @param {Instance} instance The new {@link Instance}.
    * @param {google.longrunning.Operation} operation An operation object that can be used to
    *     check the status of the request.
    * @param {google.longrunning.IOperation} apiResponse The full API response.
    */
  /**
    * Create an instance.
    *
    * Wrapper around {@link v1.InstanceAdminClient#createInstance}.
    *
    * @see {@link v1.InstanceAdminClient#createInstance}
    * @see [CreateInstance API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.instance.v1#google.spanner.admin.instance.v1.InstanceAdmin.CreateInstance)
    *
    * @throws {GoogleError} If a name is not provided.
    * @throws {GoogleError} If a configuration object is not provided.
    *
    * @param {string} name The name of the instance to be created.
    * @param {CreateInstanceRequest} config Configuration object.
    * @param {CreateInstanceCallback} [callback] Callback function.
    * @returns {Promise<CreateInstanceResponse>}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    *
    * const config = {
    *   config: 'regional-us-central1',
    *   nodes: 1
    * };
    *
    * function callback(err, instance, operation, apiResponse) {
    *   if (err) {
    *     // Error handling omitted.
    *   }
    *
    *   operation
    *     .on('error', function(err) {})
    *     .on('complete', function() {
    *       // Instance created successfully.
    *     });
    * }
    *
    * spanner.createInstance('new-instance-name', config, callback);
    *
    * //-
    * // If the callback is omitted, we'll return a Promise.
    * //-
    * spanner.createInstance('new-instance-name', config)
    *   .then(function(data) {
    *     const instance = data[0];
    *     const operation = data[1];
    *     return operation.promise();
    *   })
    *   .then(function() {
    *     // Instance created successfully.
    *   });
    * ```
    */
  def createInstance(name: String, config: CreateInstanceRequest): js.Promise[CreateInstanceResponse] = js.native
  def createInstance(name: String, config: CreateInstanceRequest, callback: CreateInstanceCallback): Unit = js.native
  
  /**
    * Config for the new instance config.
    *
    * @typedef {object} CreateInstanceConfigRequest
    * @property {string} [displayName] The name of this instance configuration as
    *     it appears in the user interface.
    * @property {google.spanner.admin.instance.v1.IReplicaInfo[]} [replicas] The
    *     geographic placement of nodes in this instance configuration and their
    *     replication properties.
    * @property {string} [baseConfig] Base configuration name,
    *     e.g. projects/<project_name>/instanceConfigs/nam3 based on which this
    *     configuration is created.
    * @property {Object.<string, string>} [labels] Cloud Labels are a flexible
    *     and lightweight mechanism for organizing cloud resources into groups
    *     that reflect a customer's organizational needs and deployment
    *     strategies. Cloud Labels can be used to filter collections of
    *     resources. They can be used to control how resource metrics are
    *     aggregated. And they can be used as arguments to policy management
    *     rules (e.g. route, firewall, load balancing, etc.).
    * @property {string} [etag] etag is used for optimistic concurrency control
    *     as a way to help prevent simultaneous updates of a instance config from
    *     overwriting each other.
    * @property {boolean} [validateOnly] An option to validate, but not actually
    *     execute, a request, and provide the same response.
    */
  /**
    * @typedef {array} CreateInstanceConfigResponse
    * @property {InstanceConfig} 0 The new {@link google.spanner.admin.instance.v1.InstanceConfig}.
    * @property {google.longrunning.Operation} 1 An operation object that can be
    *     used to check the status of the request.
    * @property {google.longrunning.IOperation} 2 The full API response.
    */
  /**
    * @callback CreateInstanceConfigCallback
    * @param {?Error} err Request error, if any.
    * @param {InstanceConfig} instanceConfig The new {@link google.spanner.admin.instance.v1.InstanceConfig}.
    * @param {google.longrunning.Operation} operation An operation object that
    *     can be used to check the status of the request.
    * @param {google.longrunning.IOperation} apiResponse The full API response.
    */
  /**
    * Create an instance config.
    *
    * Wrapper around {@link v1.InstanceAdminClient#createInstanceConfig}.
    *
    * @see {@link v1.InstanceAdminClient#createInstanceConfig}
    * @see [CreateInstanceConfig API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.instance.v1#google.spanner.admin.instance.v1.InstanceAdmin.CreateInstanceConfig)
    *
    * @throws {GoogleError} If a name is not provided.
    * @throws {GoogleError} If a configuration object is not provided.
    * @throws {GoogleError} If a base config is not provided in the configuration
    *                       object.
    *
    * @param {string} name The name of the instance config to be created.
    * @param {CreateInstanceConfigRequest} config Configuration object.
    * @param {CreateInstanceConfigCallback} [callback] Callback function.
    * @returns {Promise<CreateInstanceConfigResponse>}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    *
    * const [baseInstanceConfig] =
    *     await spanner.getInstanceConfig(baseInstanceConfigId);
    * const config = {
    *   baseConfig: baseInstanceConfig.name,
    *   replicas: baseInstanceConfig.replicas.concat(baseInstanceConfig.optionalReplicas[0])
    * };
    *
    * function callback(err, instance, operation, apiResponse) {
    *   if (err) {
    *     // Error handling omitted.
    *   }
    *
    *   operation
    *     .on('error', function(err) {})
    *     .on('complete', function() {
    *       // Instance created successfully.
    *     });
    * }
    *
    * spanner.createInstanceConfig('custom-new-instance-config', config, callback);
    *
    * //-
    * // If the callback is omitted, we'll return a Promise.
    * //-
    * spanner.createInstanceConfig('custom-new-instance-config', config)
    *   .then(function(data) {
    *     const instanceConfig = data[0];
    *     const operation = data[1];
    *     return operation.promise();
    *   })
    *   .then(function() {
    *     // Instance config created successfully.
    *   });
    * ```
    */
  def createInstanceConfig(name: String, config: CreateInstanceConfigRequest): js.Promise[CreateInstanceConfigResponse] = js.native
  def createInstanceConfig(name: String, config: CreateInstanceConfigRequest, callback: CreateInstanceConfigCallback): Unit = js.native
  
  /**
    * Gets the instance configuration with the specified name.
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
    * Get a specific instance config.
    *
    * Wrapper around {@link v1.InstanceAdminClient#getInstanceConfig}.
    *
    * @see {@link v1.InstanceAdminClient#getInstanceConfig}
    * @see [GetInstanceConfig API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.instance.v1#google.spanner.admin.instance.v1.InstanceAdmin.GetInstanceConfig)
    *
    * @param {string} [name] The name of the instance config to get.
    * @param {GetInstanceConfigCallback} [callback] Callback function.
    * @returns {Promise<GetInstanceConfigResponse>}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    *
    * spanner.getInstanceConfig('nam6', function(err, instanceConfig) {
    *   // `instanceConfig` is an instance configuration descriptor.
    * });
    *
    * //-
    * // If the callback is omitted, we'll return a Promise.
    * //-
    * spanner.getInstanceConfig().then(function(data) {
    *   const instanceConfig = data[0];
    * });
    * ```
    */
  def getInstanceConfig(name: String): js.Promise[GetInstanceConfigResponse] = js.native
  def getInstanceConfig(name: String, callback: GetInstanceConfigCallback): Unit = js.native
  def getInstanceConfig(name: String, options: GetInstanceConfigOptions): js.Promise[GetInstanceConfigResponse] = js.native
  def getInstanceConfig(name: String, options: GetInstanceConfigOptions, callback: GetInstanceConfigCallback): Unit = js.native
  
  /**
    * Query object for listing instance config operations.
    *
    * @typedef {object} GetInstanceConfigOperationsOptions
    * @property {string} [filter] An expression for filtering the results of the
    *     request. Filter can be configured as outlined in
    *     {@link v1.DatabaseAdminClient#listInstanceConfigOperations}.
    * @property {number} [pageSize] Maximum number of results per page.
    * @property {string} [pageToken] A previously-returned page token
    *     representing part of the larger set of results to view.
    * @property {object} [gaxOptions] Request configuration options,
    *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
    *     for more details.
    */
  /**
    * @typedef {array} GetInstanceConfigOperationsResponse
    * @property {google.longrunning.IOperation[]} 0 Array of {@link IOperation} instances.
    * @property {object} 1 A query object to receive more results.
    * @property {object} 2 The full API response.
    */
  /**
    * @callback GetInstanceConfigOperationsCallback
    * @param {?Error} err Request error, if any.
    * @param {google.longrunning.IOperation[]} 0 Array of {@link IOperation} instances.
    * @param {object} nextQuery A query object to receive more results.
    * @param {object} apiResponse The full API response.
    */
  /**
    * List pending and completed instance config operations.
    *
    * @see {@link #listOperations}
    *
    * @param {GetInstanceConfigOperationsOptions} [options] The query object for
    *     listing InstanceConfig operations.
    * @param {gax.CallOptions} [options.gaxOptions] The request configuration
    *     options, See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
    *     for more details.
    * @returns {Promise<GetInstanceConfigOperationsResponse>} When resolved,
    *     contains a paged list of InstanceConfig operations.
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    * const [operations] = await spanner.getInstanceConfigOperations();
    *
    * //-
    * // To manually handle pagination, set autoPaginate:false in gaxOptions.
    * //-
    * let pageToken = undefined;
    * do {
    *   const [operations, , response] = await spanner.getInstanceConfigOperations({
    *     pageSize: 3,
    *     pageToken,
    *     gaxOptions: {autoPaginate: false},
    *   });
    *   operations.forEach(operation => {
    *     // Do something with operation
    *   });
    *   pageToken = response.nextPageToken;
    * } while (pageToken);
    * ```
    */
  def getInstanceConfigOperations(): js.Promise[GetInstanceConfigOperationsResponse] = js.native
  def getInstanceConfigOperations(callback: GetInstanceConfigOperationsCallback): Unit = js.native
  def getInstanceConfigOperations(options: GetInstanceConfigOperationsOptions): js.Promise[GetInstanceConfigOperationsResponse] = js.native
  def getInstanceConfigOperations(options: GetInstanceConfigOperationsOptions, callback: GetInstanceConfigOperationsCallback): Unit = js.native
  
  /**
    * Lists the supported instance configurations for a given project.
    *
    * @typedef {object} GetInstanceConfigsOptions
    * @property {number} [pageSize] Maximum number of results per page.
    * @property {string} [pageToken] A previously-returned page token
    *     representing part of the larger set of results to view.
    * @property {object} [gaxOptions] Request configuration options,
    *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
    *     for more details.
    */
  /**
    * @typedef {array} GetInstanceConfigsResponse
    * @property {object[]} 0 List of all available instance configs.
    * @property {string} 0.name The unique identifier for the instance config.
    * @property {string} 0.displayName The name of the instance config as it
    *     appears in UIs.
    * @property {google.spanner.admin.instance.v1.IReplicaInfo[]} 0.replicas The replicas used by
    *     this instance config.
    * @property {string[]} 0.leaderOptions The possible leader options for this instance config.
    * @property {object} 1 A query object to receive more results.
    * @property {object} 2 The full API response.
    */
  /**
    * @callback GetInstanceConfigsCallback
    * @param {?Error} err Request error, if any.
    * @param {object[]} instanceConfigs List of all available instance configs.
    * @param {string} instanceConfigs.name The unique identifier for the instance
    *     config.
    * @param {string} instanceConfigs.displayName The name of the instance config
    *     as it appears in UIs.
    * @param {google.spanner.admin.instance.v1.IReplicaInfo[]} instanceConfigs.replicas The replicas used by
    *     this instance config.
    * @param {string[]} instanceConfigs.leaderOptions The possible leader options for this instance config.
    * @param {object} nextQuery A query object to receive more results.
    * @param {object} apiResponse The full API response.
    */
  /**
    * Get a list of instance configs.
    *
    * Wrapper around {@link v1.InstanceAdminClient#listInstanceConfigs}.
    *
    * @see {@link v1.InstanceAdminClient#listInstanceConfigs}
    * @see [ListInstanceConfigs API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.instance.v1#google.spanner.admin.instance.v1.InstanceAdmin.ListInstanceConfigs)
    *
    * @param {GetInstanceConfigsOptions} [options] Query object for listing instance
    *     configs.
    * @param {GetInstanceConfigsCallback} [callback] Callback function.
    * @returns {Promise<GetInstanceConfigsResponse>}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    *
    * spanner.getInstanceConfigs(function(err, instanceConfigs) {
    *   // `instanceConfigs` is an array of instance configuration descriptors.
    * });
    *
    * //-
    * // To control how many API requests are made and page through the results
    * // manually, set `autoPaginate` to `false`.
    * //-
    * function callback(err, instanceConfigs, nextQuery, apiResponse) {
    *   if (nextQuery) {
    *     // More results exist.
    *     spanner.getInstanceConfigs(nextQuery, callback);
    *   }
    * }
    *
    * spanner.getInstanceConfigs({
    *   gaxOptions: {
    *     autoPaginate: false,
    *   }
    * }, callback);
    *
    * //-
    * // If the callback is omitted, we'll return a Promise.
    * //-
    * spanner.getInstanceConfigs().then(function(data) {
    *   const instanceConfigs = data[0];
    * });
    * ```
    */
  def getInstanceConfigs(): js.Promise[GetInstanceConfigsResponse] = js.native
  def getInstanceConfigs(callback: GetInstanceConfigsCallback): Unit = js.native
  def getInstanceConfigs(query: GetInstanceConfigsOptions): js.Promise[GetInstanceConfigsResponse] = js.native
  def getInstanceConfigs(query: GetInstanceConfigsOptions, callback: GetInstanceConfigsCallback): Unit = js.native
  
  /**
    * Get a list of instance configs as a readable object stream.
    *
    * Wrapper around {@link v1.InstanceAdminClient#listInstanceConfigsStream}.
    *
    * @see {@link v1.InstanceAdminClient#listInstanceConfigsStream}
    * @see [ListInstanceConfigs API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.instance.v1#google.spanner.admin.instance.v1.InstanceAdmin.ListInstanceConfigs)
    *
    * @method Spanner#getInstanceConfigsStream
    * @param {GetInstanceConfigsOptions} [options] Query object for listing instance
    *     configs.
    * @returns {ReadableStream} A readable stream that emits instance configs.
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    *
    * spanner.getInstanceConfigsStream()
    *   .on('error', console.error)
    *   .on('data', function(instanceConfig) {})
    *   .on('end', function() {
    *     // All instances retrieved.
    *   });
    *
    * //-
    * // If you anticipate many results, you can end a stream early to prevent
    * // unnecessary processing and API requests.
    * //-
    * spanner.getInstanceConfigsStream()
    *   .on('data', function(instanceConfig) {
    *     this.end();
    *   });
    * ```
    */
  def getInstanceConfigsStream(): ReadableStream = js.native
  def getInstanceConfigsStream(options: GetInstanceConfigsOptions): ReadableStream = js.native
  
  /**
    * Query object for listing instances.
    *
    * @typedef {object} GetInstancesOptions
    * @property {object} [gaxOptions] Request configuration options,
    *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
    *     for more details.
    * @property {string} [filter] An expression for filtering the results of the
    *     request. Filter rules are case insensitive. The fields eligible for
    *     filtering are:
    *     - **`name`**
    *     - **`display_name`**
    *     - **`labels.key`** where key is the name of a label
    *
    *     Some examples of using filters are:
    *     - **`name:*`** The instance has a name.
    *     - **`name:Howl`** The instance's name is howl.
    *     - **`labels.env:*`** The instance has the label env.
    *     - **`labels.env:dev`** The instance's label env has the value dev.
    *     - **`name:howl labels.env:dev`** The instance's name is howl and it has
    *       the label env with value dev.
    * @property {number} [pageSize] Maximum number of results per page.
    * @property {string} [pageToken] A previously-returned page token
    *     representing part of the larger set of results to view.
    */
  /**
    * @typedef {array} GetInstancesResponse
    * @property {Instance[]} 0 Array of {@link Instance} instances.
    * @property {object} 1 A query object to receive more results.
    * @property {object} 2 The full API response.
    */
  /**
    * @callback GetInstancesCallback
    * @param {?Error} err Request error, if any.
    * @param {Instance[]} instances Array of {@link Instance} instances.
    * @param {string} nextQuery A query object to receive more results.
    * @param {object} apiResponse The full API response.
    */
  /**
    * Get a list of instances.
    *
    * Wrapper around {@link v1.InstanceAdminClient#listInstances}.
    *
    * @see {@link v1.InstanceAdminClient#listInstances}
    * @see [ListInstances API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.instance.v1#google.spanner.admin.instance.v1.InstanceAdmin.ListInstances)
    *
    * @param {GetInstancesOptions} [options] Query object for listing instances.
    * @param {GetInstancesCallback} [callback] Callback function.
    * @returns {Promise<GetInstancesResponse>}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    *
    * spanner.getInstances(function(err, instances) {
    *   // `instances` is an array of `Instance` objects.
    * });
    *
    * //-
    * // To control how many API requests are made and page through the results
    * // manually, set `autoPaginate` to `false`.
    * //-
    * function callback(err, instances, nextQuery, apiResponse) {
    *   if (nextQuery) {
    *     // More results exist.
    *     spanner.getInstances(nextQuery, callback);
    *   }
    * }
    *
    * spanner.getInstances({
    *   gaxOptions: {
    *     autoPaginate: false,
    *   }
    * }, callback);
    *
    * //-
    * // If the callback is omitted, we'll return a Promise.
    * //-
    * spanner.getInstances().then(function(data) {
    *   const instances = data[0];
    * });
    * ```
    */
  def getInstances(): js.Promise[GetInstancesResponse] = js.native
  def getInstances(callback: GetInstancesCallback): Unit = js.native
  def getInstances(options: GetInstancesOptions): js.Promise[GetInstancesResponse] = js.native
  def getInstances(query: GetInstancesOptions, callback: GetInstancesCallback): Unit = js.native
  
  /**
    * Get a list of {@link Instance} objects as a readable object stream.
    *
    * Wrapper around {@link v1.InstanceAdminClient#listInstances}.
    *
    * @see {@link v1.InstanceAdminClient#listInstances}
    * @see [ListInstances API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.instance.v1#google.spanner.admin.instance.v1.InstanceAdmin.ListInstances)
    *
    * @method Spanner#getInstancesStream
    * @param {GetInstancesOptions} [options] Query object for listing instances.
    * @returns {ReadableStream} A readable stream that emits {@link Instance}
    *     instances.
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    *
    * spanner.getInstancesStream()
    *   .on('error', console.error)
    *   .on('data', function(instance) {
    *     // `instance` is an `Instance` object.
    *   })
    *   .on('end', function() {
    *     // All instances retrieved.
    *   });
    *
    * //-
    * // If you anticipate many results, you can end a stream early to prevent
    * // unnecessary processing and API requests.
    * //-
    * spanner.getInstancesStream()
    *   .on('data', function(instance) {
    *     this.end();
    *   });
    * ```
    */
  def getInstancesStream(): ReadableStream = js.native
  def getInstancesStream(options: GetInstancesOptions): ReadableStream = js.native
  
  /**
    * Get a reference to an Instance object.
    *
    * @throws {GoogleError} If a name is not provided.
    *
    * @param {string} name The name of the instance.
    * @returns {Instance} An Instance object.
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    * const instance = spanner.instance('my-instance');
    * ```
    */
  def instance(name: String): typings.googleCloudSpanner.buildSrcInstanceMod.Instance = js.native
  
  /**
    * Get a reference to an InstanceConfig object.
    *
    * @throws {GoogleError} If a name is not provided.
    *
    * @param {string} name The name of the instance config.
    * @returns {InstanceConfig} An InstanceConfig object.
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    * const instanceConfig = spanner.instanceConfig('my-instance-config');
    * ```
    */
  def instanceConfig(name: String): typings.googleCloudSpanner.buildSrcInstanceConfigMod.InstanceConfig = js.native
  
  var instanceConfigs_ : Map[String, typings.googleCloudSpanner.buildSrcInstanceConfigMod.InstanceConfig] = js.native
  
  var instances_ : Map[String, typings.googleCloudSpanner.buildSrcInstanceMod.Instance] = js.native
  
  var options: GoogleAuthOptions[JSONClient] = js.native
  
  /**
    * Prepare a gapic request. This will cache the GAX client and replace
    * {{projectId}} placeholders, if necessary.
    *
    * @private
    *
    * @param {object} config Request config
    * @param {function} callback Callback function
    */
  def prepareGapicRequest_(config: Any, callback: Any): Unit = js.native
  
  var projectFormattedName_ : String = js.native
  
  var projectIdReplaced_ : Boolean = js.native
  
  /**
    * Funnel all API requests through this method to be sure we have a project
    * ID.
    *
    * @param {object} config Configuration object.
    * @param {object} config.gaxOpts GAX options.
    * @param {function} config.method The gax method to call.
    * @param {object} config.reqOpts Request options.
    * @param {function} [callback] Callback function.
    * @returns {Promise}
    */
  def request(config: Any): Any = js.native
  def request(config: Any, callback: Any): Any = js.native
  
  /**
    * Funnel all streaming API requests through this method to be sure we have a
    * project ID.
    *
    * @param {object} config Configuration object.
    * @param {object} config.gaxOpts GAX options.
    * @param {function} config.method The gax method to call.
    * @param {object} config.reqOpts Request options.
    * @param {function} [callback] Callback function.
    * @returns {Stream}
    */
  def requestStream(config: Any): Any = js.native
  
  var resourceHeader_ : StringDictionary[String] = js.native
  
  var routeToLeaderEnabled: Boolean = js.native
}
object Spanner {
  
  @JSImport("@google-cloud/spanner", "Spanner")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Placeholder used to auto populate a column with the commit timestamp.
    * This can only be used for timestamp columns that have set the option
    * "(allow_commit_timestamp=true)" in the schema.
    *
    * @type {string}
    */
  /* static member */
  @JSImport("@google-cloud/spanner", "Spanner.COMMIT_TIMESTAMP")
  @js.native
  def COMMIT_TIMESTAMP: String = js.native
  inline def COMMIT_TIMESTAMP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMMIT_TIMESTAMP")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@google-cloud/spanner", "Spanner.GOOGLE_STANDARD_SQL")
  @js.native
  def GOOGLE_STANDARD_SQL: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.admin.database.v1.DatabaseDialect */ Any = js.native
  inline def GOOGLE_STANDARD_SQL_=(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.admin.database.v1.DatabaseDialect */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GOOGLE_STANDARD_SQL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@google-cloud/spanner", "Spanner.POSTGRESQL")
  @js.native
  def POSTGRESQL: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.admin.database.v1.DatabaseDialect */ Any = js.native
  inline def POSTGRESQL_=(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.admin.database.v1.DatabaseDialect */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSTGRESQL")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def date(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[Any]
  inline def date(dateString: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(dateString.asInstanceOf[js.Any]).asInstanceOf[Any]
  /* static member */
  inline def date(year: Double, month: Double, date: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Helper function to get a Cloud Spanner Float64 object.
    *
    * @param {string|number} value The float as a number or string.
    * @returns {Float}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const float = Spanner.float(10);
    * ```
    */
  /* static member */
  inline def float(value: Any): typings.googleCloudSpanner.buildSrcCodecMod.Float = ^.asInstanceOf[js.Dynamic].applyDynamic("float")(value.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.buildSrcCodecMod.Float]
  
  /**
    * Gets the configured Spanner emulator host from an environment variable.
    */
  /* static member */
  inline def getSpannerEmulatorHost(): js.UndefOr[Endpoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpannerEmulatorHost")().asInstanceOf[js.UndefOr[Endpoint]]
  
  /**
    * Helper function to get a Cloud Spanner Int64 object.
    *
    * @param {string|number} value The int as a number or string.
    * @returns {Int}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const int = Spanner.int(10);
    * ```
    */
  /* static member */
  inline def int(value: Any): typings.googleCloudSpanner.buildSrcCodecMod.Int = ^.asInstanceOf[js.Dynamic].applyDynamic("int")(value.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.buildSrcCodecMod.Int]
  
  /**
    * Helper function to get a Cloud Spanner Numeric object.
    *
    * @param {string} value The numeric value as a string.
    * @returns {Numeric}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const numeric = Spanner.numeric("3.141592653");
    * ```
    */
  /* static member */
  inline def numeric(value: Any): typings.googleCloudSpanner.buildSrcCodecMod.Numeric = ^.asInstanceOf[js.Dynamic].applyDynamic("numeric")(value.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.buildSrcCodecMod.Numeric]
  
  /**
    * Helper function to get a Cloud Spanner pgJsonb object.
    *
    * @param {object|string} value The pgJsonb value as a string or object.
    * @returns {PGJsonb}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const pgJsonb1 = Spanner.pgJsonb({rating: 6});
    * const pgJsonb2 = Spanner.pgJsonb(`[
    *         {
    *           "name": null,
    *           "open": true
    *         }]`)
    * ```
    */
  /* static member */
  inline def pgJsonb(value: Any): PGJsonb = ^.asInstanceOf[js.Dynamic].applyDynamic("pgJsonb")(value.asInstanceOf[js.Any]).asInstanceOf[PGJsonb]
  
  /**
    * Helper function to get a Cloud Spanner pgNumeric object.
    *
    * @param {string} value The pgNumeric value as a string.
    * @returns {PGNumeric}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const pgNumeric = Spanner.pgNumeric("3.141592653");
    * ```
    */
  /* static member */
  inline def pgNumeric(value: Any): typings.googleCloudSpanner.buildSrcCodecMod.PGNumeric = ^.asInstanceOf[js.Dynamic].applyDynamic("pgNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.buildSrcCodecMod.PGNumeric]
  
  /**
    * Helper function to get a Cloud Spanner Struct object.
    *
    * @param {object} value The struct as a JSON object.
    * @returns {Struct}
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const struct = Spanner.struct({
    *   user: 'bob',
    *   age: 32
    * });
    * ```
    */
  /* static member */
  inline def struct(): typings.googleCloudSpanner.buildSrcCodecMod.Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("struct")().asInstanceOf[typings.googleCloudSpanner.buildSrcCodecMod.Struct]
  inline def struct(value: Any): typings.googleCloudSpanner.buildSrcCodecMod.Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("struct")(value.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.buildSrcCodecMod.Struct]
  
  /**
    * Date object with nanosecond precision. Supports all standard Date arguments
    * in addition to several custom types.
    * @external PreciseDate
    * @see {@link https://github.com/googleapis/nodejs-precise-date|PreciseDate}
    */
  /**
    * Helper function to get a Cloud Spanner Timestamp object.
    *
    * String timestamps should have a canonical format of
    * `YYYY-[M]M-[D]D[( |T)[H]H:[M]M:[S]S[.DDDDDDDDD]]Z`
    *
    * **Timestamp values must be expressed in Zulu time and cannot include a UTC
    * offset.**
    *
    * @see https://cloud.google.com/spanner/docs/data-types#timestamp-type
    *
    * @param {string|number|google.protobuf.Timestamp|external:PreciseDate}
    *     [timestamp] Either a RFC 3339 timestamp formatted string or a
    *     {@link google.protobuf.Timestamp} object. If a PreciseDate is given, it
    *     will return that timestamp as is.
    * @returns {external:PreciseDate}
    *
    * @example
    * ```
    * const timestamp = Spanner.timestamp('2019-02-08T10:34:29.481145231Z');
    *
    * ```
    * @example With a `google.protobuf.Timestamp` object
    * ```
    * const [seconds, nanos] = process.hrtime();
    * const timestamp = Spanner.timestamp({seconds, nanos});
    * ```
    *
    * @example With a Date timestamp
    * ```
    * const timestamp = Spanner.timestamp(Date.now());
    * ```
    */
  /* static member */
  inline def timestamp(): PreciseDate = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")().asInstanceOf[PreciseDate]
  inline def timestamp(value: String): PreciseDate = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(value.asInstanceOf[js.Any]).asInstanceOf[PreciseDate]
  inline def timestamp(value: Double): PreciseDate = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(value.asInstanceOf[js.Any]).asInstanceOf[PreciseDate]
  inline def timestamp(value: PreciseDate): PreciseDate = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(value.asInstanceOf[js.Any]).asInstanceOf[PreciseDate]
  inline def timestamp(value: ITimestamp): PreciseDate = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(value.asInstanceOf[js.Any]).asInstanceOf[PreciseDate]
}
