package typings.googleCloudSpanner

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleCloudSpanner.protosMod.google.iam.v1.IGetIamPolicyRequest
import typings.googleCloudSpanner.protosMod.google.iam.v1.IPolicy
import typings.googleCloudSpanner.protosMod.google.iam.v1.ISetIamPolicyRequest
import typings.googleCloudSpanner.protosMod.google.iam.v1.ITestIamPermissionsRequest
import typings.googleCloudSpanner.protosMod.google.iam.v1.ITestIamPermissionsResponse
import typings.googleCloudSpanner.protosMod.google.longrunning.IOperation
import typings.googleCloudSpanner.protosMod.google.protobuf.IEmpty
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.CreateInstanceMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ICreateInstanceMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.ICreateInstanceRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IDeleteInstanceRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IGetInstanceConfigRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IGetInstanceRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IInstance
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IInstanceConfig
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IListInstanceConfigsRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IListInstanceConfigsResponse
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IListInstancesRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IListInstancesResponse
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IUpdateInstanceMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.IUpdateInstanceRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.UpdateInstanceMetadata
import typings.googleGax.clientInterfaceMod.Callback
import typings.googleGax.clientInterfaceMod.ClientOptions
import typings.googleGax.clientInterfaceMod.Descriptors
import typings.googleGax.clientInterfaceMod.LROperation
import typings.googleGax.clientInterfaceMod.PaginationCallback
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.mod.GoogleAuth
import typings.googleGax.mod.OperationsClient
import typings.googleGax.mod.PathTemplate
import typings.node.streamMod.Transform
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceAdminClientMod {
  
  @JSImport("@google-cloud/spanner/build/src/v1/instance_admin_client", "InstanceAdminClient")
  @js.native
  /**
    * Construct an instance of InstanceAdminClient.
    *
    * @param {object} [options] - The configuration object.
    * The options accepted by the constructor are described in detail
    * in [this document](https://github.com/googleapis/gax-nodejs/blob/main/client-libraries.md#creating-the-client-instance).
    * The common options are:
    * @param {object} [options.credentials] - Credentials object.
    * @param {string} [options.credentials.client_email]
    * @param {string} [options.credentials.private_key]
    * @param {string} [options.email] - Account email address. Required when
    *     using a .pem or .p12 keyFilename.
    * @param {string} [options.keyFilename] - Full path to the a .json, .pem, or
    *     .p12 key downloaded from the Google Developers Console. If you provide
    *     a path to a JSON file, the projectId option below is not necessary.
    *     NOTE: .pem and .p12 require you to specify options.email as well.
    * @param {number} [options.port] - The port on which to connect to
    *     the remote host.
    * @param {string} [options.projectId] - The project ID from the Google
    *     Developer's Console, e.g. 'grape-spaceship-123'. We will also check
    *     the environment variable GCLOUD_PROJECT for your project ID. If your
    *     app is running in an environment which supports
    *     {@link https://developers.google.com/identity/protocols/application-default-credentials Application Default Credentials},
    *     your project ID will be detected automatically.
    * @param {string} [options.apiEndpoint] - The domain name of the
    *     API remote host.
    * @param {gax.ClientConfig} [options.clientConfig] - Client configuration override.
    *     Follows the structure of {@link gapicConfig}.
    * @param {boolean | "rest"} [options.fallback] - Use HTTP fallback mode.
    *     Pass "rest" to use HTTP/1.1 REST API instead of gRPC.
    *     For more information, please check the
    *     {@link https://github.com/googleapis/gax-nodejs/blob/main/client-libraries.md#http11-rest-api-mode documentation}.
    */
  open class InstanceAdminClient () extends StObject {
    def this(opts: ClientOptions) = this()
    
    /* private */ var _defaults: Any = js.native
    
    /* private */ var _gaxGrpc: Any = js.native
    
    /* private */ var _gaxModule: Any = js.native
    
    /* private */ var _opts: Any = js.native
    
    /* private */ var _protos: Any = js.native
    
    /* private */ var _providedCustomServicePath: Any = js.native
    
    /* private */ var _terminated: Any = js.native
    
    var auth: GoogleAuth[JSONClient] = js.native
    
    /**
      * Check the status of the long running operation returned by `createInstance()`.
      * @param {String} name
      *   The operation name that will be passed.
      * @returns {Promise} - The promise which resolves to an object.
      *   The decoded operation object has result and metadata field to get information from.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/instance_admin.create_instance.js</caption>
      * region_tag:spanner_v1_generated_InstanceAdmin_CreateInstance_async
      */
    def checkCreateInstanceProgress(name: String): js.Promise[LROperation[Instance, CreateInstanceMetadata]] = js.native
    
    /**
      * Check the status of the long running operation returned by `updateInstance()`.
      * @param {String} name
      *   The operation name that will be passed.
      * @returns {Promise} - The promise which resolves to an object.
      *   The decoded operation object has result and metadata field to get information from.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/instance_admin.update_instance.js</caption>
      * region_tag:spanner_v1_generated_InstanceAdmin_UpdateInstance_async
      */
    def checkUpdateInstanceProgress(name: String): js.Promise[LROperation[Instance, UpdateInstanceMetadata]] = js.native
    
    /**
      * Terminate the gRPC channel and close the client.
      *
      * The client will no longer be usable and all future behavior is undefined.
      * @returns {Promise} A promise that resolves when the client is closed.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Creates an instance and begins preparing it to begin serving. The
      * returned {@link google.longrunning.Operation|long-running operation}
      * can be used to track the progress of preparing the new
      * instance. The instance name is assigned by the caller. If the
      * named instance already exists, `CreateInstance` returns
      * `ALREADY_EXISTS`.
      *
      * Immediately upon completion of this request:
      *
      *   * The instance is readable via the API, with all requested attributes
      *     but no allocated resources. Its state is `CREATING`.
      *
      * Until completion of the returned operation:
      *
      *   * Cancelling the operation renders the instance immediately unreadable
      *     via the API.
      *   * The instance can be deleted.
      *   * All other attempts to modify the instance are rejected.
      *
      * Upon completion of the returned operation:
      *
      *   * Billing for all successfully-allocated resources begins (some types
      *     may have lower than the requested levels).
      *   * Databases can be created in the instance.
      *   * The instance's allocated resource levels are readable via the API.
      *   * The instance's state becomes `READY`.
      *
      * The returned {@link google.longrunning.Operation|long-running operation} will
      * have a name of the format `<instance_name>/operations/<operation_id>` and
      * can be used to track creation of the instance.  The
      * {@link google.longrunning.Operation.metadata|metadata} field type is
      * {@link google.spanner.admin.instance.v1.CreateInstanceMetadata|CreateInstanceMetadata}.
      * The {@link google.longrunning.Operation.response|response} field type is
      * {@link google.spanner.admin.instance.v1.Instance|Instance}, if successful.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the project in which to create the instance. Values
      *   are of the form `projects/<project>`.
      * @param {string} request.instanceId
      *   Required. The ID of the instance to create.  Valid identifiers are of the
      *   form `{@link -a-z0-9|a-z}*[a-z0-9]` and must be between 2 and 64 characters in
      *   length.
      * @param {google.spanner.admin.instance.v1.Instance} request.instance
      *   Required. The instance to create.  The name may be omitted, but if
      *   specified must be `<parent>/instances/<instance_id>`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      *   a long running operation. Its `promise()` method returns a promise
      *   you can `await` for.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/instance_admin.create_instance.js</caption>
      * region_tag:spanner_v1_generated_InstanceAdmin_CreateInstance_async
      */
    def createInstance(): js.Promise[
        js.Tuple3[
          LROperation[IInstance, ICreateInstanceMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createInstance(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IInstance, ICreateInstanceMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createInstance(request: ICreateInstanceRequest): js.Promise[
        js.Tuple3[
          LROperation[IInstance, ICreateInstanceMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createInstance(
      request: ICreateInstanceRequest,
      callback: Callback[
          LROperation[IInstance, ICreateInstanceMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def createInstance(request: ICreateInstanceRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IInstance, ICreateInstanceMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createInstance(
      request: ICreateInstanceRequest,
      options: CallOptions,
      callback: Callback[
          LROperation[IInstance, ICreateInstanceMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Deletes an instance.
      *
      * Immediately upon completion of the request:
      *
      *   * Billing ceases for all of the instance's reserved resources.
      *
      * Soon afterward:
      *
      *   * The instance and *all of its databases* immediately and
      *     irrevocably disappear from the API. All data in the databases
      *     is permanently deleted.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. The name of the instance to be deleted. Values are of the form
      *   `projects/<project>/instances/<instance>`
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Empty]{@link google.protobuf.Empty}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/instance_admin.delete_instance.js</caption>
      * region_tag:spanner_v1_generated_InstanceAdmin_DeleteInstance_async
      */
    def deleteInstance(): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteInstanceRequest], js.UndefOr[js.Object]]] = js.native
    def deleteInstance(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteInstanceRequest], js.UndefOr[js.Object]]] = js.native
    def deleteInstance(request: IDeleteInstanceRequest): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteInstanceRequest], js.UndefOr[js.Object]]] = js.native
    def deleteInstance(
      request: IDeleteInstanceRequest,
      callback: Callback[IEmpty, js.UndefOr[IDeleteInstanceRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def deleteInstance(request: IDeleteInstanceRequest, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteInstanceRequest], js.UndefOr[js.Object]]] = js.native
    def deleteInstance(
      request: IDeleteInstanceRequest,
      options: CallOptions,
      callback: Callback[IEmpty, js.UndefOr[IDeleteInstanceRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    var descriptors: Descriptors = js.native
    
    /**
      * Gets the access control policy for an instance resource. Returns an empty
      * policy if an instance exists but does not have a policy set.
      *
      * Authorization requires `spanner.instances.getIamPolicy` on
      * {@link google.iam.v1.GetIamPolicyRequest.resource|resource}.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.resource
      *   REQUIRED: The resource for which the policy is being requested.
      *   See the operation documentation for the appropriate value for this field.
      * @param {google.iam.v1.GetPolicyOptions} request.options
      *   OPTIONAL: A `GetPolicyOptions` object for specifying options to
      *   `GetIamPolicy`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Policy]{@link google.iam.v1.Policy}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/instance_admin.get_iam_policy.js</caption>
      * region_tag:spanner_v1_generated_InstanceAdmin_GetIamPolicy_async
      */
    def getIamPolicy(): js.Promise[js.Tuple3[IPolicy, js.UndefOr[IGetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def getIamPolicy(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IPolicy, js.UndefOr[IGetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def getIamPolicy(request: IGetIamPolicyRequest): js.Promise[js.Tuple3[IPolicy, js.UndefOr[IGetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def getIamPolicy(
      request: IGetIamPolicyRequest,
      callback: Callback[IPolicy, js.UndefOr[IGetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def getIamPolicy(request: IGetIamPolicyRequest, options: CallOptions): js.Promise[js.Tuple3[IPolicy, js.UndefOr[IGetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def getIamPolicy(
      request: IGetIamPolicyRequest,
      options: CallOptions,
      callback: Callback[IPolicy, js.UndefOr[IGetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Gets information about a particular instance.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. The name of the requested instance. Values are of the form
      *   `projects/<project>/instances/<instance>`.
      * @param {google.protobuf.FieldMask} request.fieldMask
      *   If field_mask is present, specifies the subset of {@link google.spanner.admin.instance.v1.Instance|Instance} fields that
      *   should be returned.
      *   If absent, all {@link google.spanner.admin.instance.v1.Instance|Instance} fields are returned.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Instance]{@link google.spanner.admin.instance.v1.Instance}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/instance_admin.get_instance.js</caption>
      * region_tag:spanner_v1_generated_InstanceAdmin_GetInstance_async
      */
    def getInstance(): js.Promise[js.Tuple3[IInstance, js.UndefOr[IGetInstanceRequest], js.UndefOr[js.Object]]] = js.native
    def getInstance(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IInstance, js.UndefOr[IGetInstanceRequest], js.UndefOr[js.Object]]] = js.native
    def getInstance(request: IGetInstanceRequest): js.Promise[js.Tuple3[IInstance, js.UndefOr[IGetInstanceRequest], js.UndefOr[js.Object]]] = js.native
    def getInstance(
      request: IGetInstanceRequest,
      callback: Callback[IInstance, js.UndefOr[IGetInstanceRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def getInstance(request: IGetInstanceRequest, options: CallOptions): js.Promise[js.Tuple3[IInstance, js.UndefOr[IGetInstanceRequest], js.UndefOr[js.Object]]] = js.native
    def getInstance(
      request: IGetInstanceRequest,
      options: CallOptions,
      callback: Callback[IInstance, js.UndefOr[IGetInstanceRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Gets information about a particular instance configuration.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. The name of the requested instance configuration. Values are of
      *   the form `projects/<project>/instanceConfigs/<config>`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [InstanceConfig]{@link google.spanner.admin.instance.v1.InstanceConfig}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/instance_admin.get_instance_config.js</caption>
      * region_tag:spanner_v1_generated_InstanceAdmin_GetInstanceConfig_async
      */
    def getInstanceConfig(): js.Promise[
        js.Tuple3[IInstanceConfig, js.UndefOr[IGetInstanceConfigRequest], js.UndefOr[js.Object]]
      ] = js.native
    def getInstanceConfig(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[IInstanceConfig, js.UndefOr[IGetInstanceConfigRequest], js.UndefOr[js.Object]]
      ] = js.native
    def getInstanceConfig(request: IGetInstanceConfigRequest): js.Promise[
        js.Tuple3[IInstanceConfig, js.UndefOr[IGetInstanceConfigRequest], js.UndefOr[js.Object]]
      ] = js.native
    def getInstanceConfig(
      request: IGetInstanceConfigRequest,
      callback: Callback[
          IInstanceConfig, 
          js.UndefOr[IGetInstanceConfigRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def getInstanceConfig(request: IGetInstanceConfigRequest, options: CallOptions): js.Promise[
        js.Tuple3[IInstanceConfig, js.UndefOr[IGetInstanceConfigRequest], js.UndefOr[js.Object]]
      ] = js.native
    def getInstanceConfig(
      request: IGetInstanceConfigRequest,
      options: CallOptions,
      callback: Callback[
          IInstanceConfig, 
          js.UndefOr[IGetInstanceConfigRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    def getProjectId(): js.Promise[String] = js.native
    def getProjectId(callback: Callback[String, Unit, Unit]): Unit = js.native
    
    /**
      * Initialize the client.
      * Performs asynchronous operations (such as authentication) and prepares the client.
      * This function will be called automatically when any class method is called for the
      * first time, but if you need to initialize it before calling an actual method,
      * feel free to call initialize() directly.
      *
      * You can await on this method if you want to make sure the client is initialized.
      *
      * @returns {Promise} A promise that resolves to an authenticated service stub.
      */
    def initialize(): js.Promise[StringDictionary[js.Function]] = js.native
    
    var innerApiCalls: StringDictionary[js.Function] = js.native
    
    var instanceAdminStub: js.UndefOr[js.Promise[StringDictionary[js.Function]]] = js.native
    
    /**
      * Return a fully-qualified instanceConfig resource name string.
      *
      * @param {string} project
      * @param {string} instance_config
      * @returns {string} Resource name string.
      */
    def instanceConfigPath(project: String, instanceConfig: String): String = js.native
    
    /**
      * Return a fully-qualified instance resource name string.
      *
      * @param {string} project
      * @param {string} instance
      * @returns {string} Resource name string.
      */
    def instancePath(project: String, instance: String): String = js.native
    
    /**
      * Lists the supported instance configurations for a given project.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the project for which a list of supported instance
      *   configurations is requested. Values are of the form
      *   `projects/<project>`.
      * @param {number} request.pageSize
      *   Number of instance configurations to be returned in the response. If 0 or
      *   less, defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.instance.v1.ListInstanceConfigsResponse.next_page_token|next_page_token}
      *   from a previous {@link google.spanner.admin.instance.v1.ListInstanceConfigsResponse|ListInstanceConfigsResponse}.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [InstanceConfig]{@link google.spanner.admin.instance.v1.InstanceConfig}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listInstanceConfigsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listInstanceConfigs(): js.Promise[
        js.Tuple3[
          js.Array[IInstanceConfig], 
          IListInstanceConfigsRequest | Null, 
          IListInstanceConfigsResponse
        ]
      ] = js.native
    def listInstanceConfigs(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          js.Array[IInstanceConfig], 
          IListInstanceConfigsRequest | Null, 
          IListInstanceConfigsResponse
        ]
      ] = js.native
    def listInstanceConfigs(request: IListInstanceConfigsRequest): js.Promise[
        js.Tuple3[
          js.Array[IInstanceConfig], 
          IListInstanceConfigsRequest | Null, 
          IListInstanceConfigsResponse
        ]
      ] = js.native
    def listInstanceConfigs(
      request: IListInstanceConfigsRequest,
      callback: PaginationCallback[
          IListInstanceConfigsRequest, 
          js.UndefOr[IListInstanceConfigsResponse | Null], 
          IInstanceConfig
        ]
    ): Unit = js.native
    def listInstanceConfigs(request: IListInstanceConfigsRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          js.Array[IInstanceConfig], 
          IListInstanceConfigsRequest | Null, 
          IListInstanceConfigsResponse
        ]
      ] = js.native
    def listInstanceConfigs(
      request: IListInstanceConfigsRequest,
      options: CallOptions,
      callback: PaginationCallback[
          IListInstanceConfigsRequest, 
          js.UndefOr[IListInstanceConfigsResponse | Null], 
          IInstanceConfig
        ]
    ): Unit = js.native
    
    /**
      * Equivalent to `listInstanceConfigs`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the project for which a list of supported instance
      *   configurations is requested. Values are of the form
      *   `projects/<project>`.
      * @param {number} request.pageSize
      *   Number of instance configurations to be returned in the response. If 0 or
      *   less, defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.instance.v1.ListInstanceConfigsResponse.next_page_token|next_page_token}
      *   from a previous {@link google.spanner.admin.instance.v1.ListInstanceConfigsResponse|ListInstanceConfigsResponse}.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [InstanceConfig]{@link google.spanner.admin.instance.v1.InstanceConfig}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/instance_admin.list_instance_configs.js</caption>
      * region_tag:spanner_v1_generated_InstanceAdmin_ListInstanceConfigs_async
      */
    def listInstanceConfigsAsync(): AsyncIterable[IInstanceConfig] = js.native
    def listInstanceConfigsAsync(request: Unit, options: CallOptions): AsyncIterable[IInstanceConfig] = js.native
    def listInstanceConfigsAsync(request: IListInstanceConfigsRequest): AsyncIterable[IInstanceConfig] = js.native
    def listInstanceConfigsAsync(request: IListInstanceConfigsRequest, options: CallOptions): AsyncIterable[IInstanceConfig] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the project for which a list of supported instance
      *   configurations is requested. Values are of the form
      *   `projects/<project>`.
      * @param {number} request.pageSize
      *   Number of instance configurations to be returned in the response. If 0 or
      *   less, defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.instance.v1.ListInstanceConfigsResponse.next_page_token|next_page_token}
      *   from a previous {@link google.spanner.admin.instance.v1.ListInstanceConfigsResponse|ListInstanceConfigsResponse}.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [InstanceConfig]{@link google.spanner.admin.instance.v1.InstanceConfig} on 'data' event.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listInstanceConfigsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listInstanceConfigsStream(): Transform = js.native
    def listInstanceConfigsStream(request: Unit, options: CallOptions): Transform = js.native
    def listInstanceConfigsStream(request: IListInstanceConfigsRequest): Transform = js.native
    def listInstanceConfigsStream(request: IListInstanceConfigsRequest, options: CallOptions): Transform = js.native
    
    /**
      * Lists all instances in the given project.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the project for which a list of instances is
      *   requested. Values are of the form `projects/<project>`.
      * @param {number} request.pageSize
      *   Number of instances to be returned in the response. If 0 or less, defaults
      *   to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.instance.v1.ListInstancesResponse.next_page_token|next_page_token} from a
      *   previous {@link google.spanner.admin.instance.v1.ListInstancesResponse|ListInstancesResponse}.
      * @param {string} request.filter
      *   An expression for filtering the results of the request. Filter rules are
      *   case insensitive. The fields eligible for filtering are:
      *
      *     * `name`
      *     * `display_name`
      *     * `labels.key` where key is the name of a label
      *
      *   Some examples of using filters are:
      *
      *     * `name:*` --> The instance has a name.
      *     * `name:Howl` --> The instance's name contains the string "howl".
      *     * `name:HOWL` --> Equivalent to above.
      *     * `NAME:howl` --> Equivalent to above.
      *     * `labels.env:*` --> The instance has the label "env".
      *     * `labels.env:dev` --> The instance has the label "env" and the value of
      *                          the label contains the string "dev".
      *     * `name:howl labels.env:dev` --> The instance's name contains "howl" and
      *                                    it has the label "env" with its value
      *                                    containing "dev".
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [Instance]{@link google.spanner.admin.instance.v1.Instance}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listInstancesAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listInstances(): js.Promise[
        js.Tuple3[js.Array[IInstance], IListInstancesRequest | Null, IListInstancesResponse]
      ] = js.native
    def listInstances(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[IInstance], IListInstancesRequest | Null, IListInstancesResponse]
      ] = js.native
    def listInstances(request: IListInstancesRequest): js.Promise[
        js.Tuple3[js.Array[IInstance], IListInstancesRequest | Null, IListInstancesResponse]
      ] = js.native
    def listInstances(
      request: IListInstancesRequest,
      callback: PaginationCallback[IListInstancesRequest, js.UndefOr[IListInstancesResponse | Null], IInstance]
    ): Unit = js.native
    def listInstances(request: IListInstancesRequest, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[IInstance], IListInstancesRequest | Null, IListInstancesResponse]
      ] = js.native
    def listInstances(
      request: IListInstancesRequest,
      options: CallOptions,
      callback: PaginationCallback[IListInstancesRequest, js.UndefOr[IListInstancesResponse | Null], IInstance]
    ): Unit = js.native
    
    /**
      * Equivalent to `listInstances`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the project for which a list of instances is
      *   requested. Values are of the form `projects/<project>`.
      * @param {number} request.pageSize
      *   Number of instances to be returned in the response. If 0 or less, defaults
      *   to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.instance.v1.ListInstancesResponse.next_page_token|next_page_token} from a
      *   previous {@link google.spanner.admin.instance.v1.ListInstancesResponse|ListInstancesResponse}.
      * @param {string} request.filter
      *   An expression for filtering the results of the request. Filter rules are
      *   case insensitive. The fields eligible for filtering are:
      *
      *     * `name`
      *     * `display_name`
      *     * `labels.key` where key is the name of a label
      *
      *   Some examples of using filters are:
      *
      *     * `name:*` --> The instance has a name.
      *     * `name:Howl` --> The instance's name contains the string "howl".
      *     * `name:HOWL` --> Equivalent to above.
      *     * `NAME:howl` --> Equivalent to above.
      *     * `labels.env:*` --> The instance has the label "env".
      *     * `labels.env:dev` --> The instance has the label "env" and the value of
      *                          the label contains the string "dev".
      *     * `name:howl labels.env:dev` --> The instance's name contains "howl" and
      *                                    it has the label "env" with its value
      *                                    containing "dev".
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [Instance]{@link google.spanner.admin.instance.v1.Instance}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/instance_admin.list_instances.js</caption>
      * region_tag:spanner_v1_generated_InstanceAdmin_ListInstances_async
      */
    def listInstancesAsync(): AsyncIterable[IInstance] = js.native
    def listInstancesAsync(request: Unit, options: CallOptions): AsyncIterable[IInstance] = js.native
    def listInstancesAsync(request: IListInstancesRequest): AsyncIterable[IInstance] = js.native
    def listInstancesAsync(request: IListInstancesRequest, options: CallOptions): AsyncIterable[IInstance] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the project for which a list of instances is
      *   requested. Values are of the form `projects/<project>`.
      * @param {number} request.pageSize
      *   Number of instances to be returned in the response. If 0 or less, defaults
      *   to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.instance.v1.ListInstancesResponse.next_page_token|next_page_token} from a
      *   previous {@link google.spanner.admin.instance.v1.ListInstancesResponse|ListInstancesResponse}.
      * @param {string} request.filter
      *   An expression for filtering the results of the request. Filter rules are
      *   case insensitive. The fields eligible for filtering are:
      *
      *     * `name`
      *     * `display_name`
      *     * `labels.key` where key is the name of a label
      *
      *   Some examples of using filters are:
      *
      *     * `name:*` --> The instance has a name.
      *     * `name:Howl` --> The instance's name contains the string "howl".
      *     * `name:HOWL` --> Equivalent to above.
      *     * `NAME:howl` --> Equivalent to above.
      *     * `labels.env:*` --> The instance has the label "env".
      *     * `labels.env:dev` --> The instance has the label "env" and the value of
      *                          the label contains the string "dev".
      *     * `name:howl labels.env:dev` --> The instance's name contains "howl" and
      *                                    it has the label "env" with its value
      *                                    containing "dev".
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [Instance]{@link google.spanner.admin.instance.v1.Instance} on 'data' event.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listInstancesAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listInstancesStream(): Transform = js.native
    def listInstancesStream(request: Unit, options: CallOptions): Transform = js.native
    def listInstancesStream(request: IListInstancesRequest): Transform = js.native
    def listInstancesStream(request: IListInstancesRequest, options: CallOptions): Transform = js.native
    
    /**
      * Parse the instance_config from InstanceConfig resource.
      *
      * @param {string} instanceConfigName
      *   A fully-qualified path representing InstanceConfig resource.
      * @returns {string} A string representing the instance_config.
      */
    def matchInstanceConfigFromInstanceConfigName(instanceConfigName: String): String | Double = js.native
    
    /**
      * Parse the instance from Instance resource.
      *
      * @param {string} instanceName
      *   A fully-qualified path representing Instance resource.
      * @returns {string} A string representing the instance.
      */
    def matchInstanceFromInstanceName(instanceName: String): String | Double = js.native
    
    /**
      * Parse the project from InstanceConfig resource.
      *
      * @param {string} instanceConfigName
      *   A fully-qualified path representing InstanceConfig resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromInstanceConfigName(instanceConfigName: String): String | Double = js.native
    
    /**
      * Parse the project from Instance resource.
      *
      * @param {string} instanceName
      *   A fully-qualified path representing Instance resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromInstanceName(instanceName: String): String | Double = js.native
    
    /**
      * Parse the project from Project resource.
      *
      * @param {string} projectName
      *   A fully-qualified path representing Project resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromProjectName(projectName: String): String | Double = js.native
    
    var operationsClient: OperationsClient = js.native
    
    var pathTemplates: StringDictionary[PathTemplate] = js.native
    
    /**
      * Return a fully-qualified project resource name string.
      *
      * @param {string} project
      * @returns {string} Resource name string.
      */
    def projectPath(project: String): String = js.native
    
    /**
      * Sets the access control policy on an instance resource. Replaces any
      * existing policy.
      *
      * Authorization requires `spanner.instances.setIamPolicy` on
      * {@link google.iam.v1.SetIamPolicyRequest.resource|resource}.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.resource
      *   REQUIRED: The resource for which the policy is being specified.
      *   See the operation documentation for the appropriate value for this field.
      * @param {google.iam.v1.Policy} request.policy
      *   REQUIRED: The complete policy to be applied to the `resource`. The size of
      *   the policy is limited to a few 10s of KB. An empty policy is a
      *   valid policy but certain Cloud Platform services (such as Projects)
      *   might reject them.
      * @param {google.protobuf.FieldMask} request.updateMask
      *   OPTIONAL: A FieldMask specifying which fields of the policy to modify. Only
      *   the fields in the mask will be modified. If no mask is provided, the
      *   following default mask is used:
      *
      *   `paths: "bindings, etag"`
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Policy]{@link google.iam.v1.Policy}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/instance_admin.set_iam_policy.js</caption>
      * region_tag:spanner_v1_generated_InstanceAdmin_SetIamPolicy_async
      */
    def setIamPolicy(): js.Promise[js.Tuple3[IPolicy, js.UndefOr[ISetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def setIamPolicy(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IPolicy, js.UndefOr[ISetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def setIamPolicy(request: ISetIamPolicyRequest): js.Promise[js.Tuple3[IPolicy, js.UndefOr[ISetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def setIamPolicy(
      request: ISetIamPolicyRequest,
      callback: Callback[IPolicy, js.UndefOr[ISetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def setIamPolicy(request: ISetIamPolicyRequest, options: CallOptions): js.Promise[js.Tuple3[IPolicy, js.UndefOr[ISetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def setIamPolicy(
      request: ISetIamPolicyRequest,
      options: CallOptions,
      callback: Callback[IPolicy, js.UndefOr[ISetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Returns permissions that the caller has on the specified instance resource.
      *
      * Attempting this RPC on a non-existent Cloud Spanner instance resource will
      * result in a NOT_FOUND error if the user has `spanner.instances.list`
      * permission on the containing Google Cloud Project. Otherwise returns an
      * empty set of permissions.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.resource
      *   REQUIRED: The resource for which the policy detail is being requested.
      *   See the operation documentation for the appropriate value for this field.
      * @param {string[]} request.permissions
      *   The set of permissions to check for the `resource`. Permissions with
      *   wildcards (such as '*' or 'storage.*') are not allowed. For more
      *   information see
      *   [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/instance_admin.test_iam_permissions.js</caption>
      * region_tag:spanner_v1_generated_InstanceAdmin_TestIamPermissions_async
      */
    def testIamPermissions(): js.Promise[
        js.Tuple3[
          ITestIamPermissionsResponse, 
          js.UndefOr[ITestIamPermissionsRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def testIamPermissions(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          ITestIamPermissionsResponse, 
          js.UndefOr[ITestIamPermissionsRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def testIamPermissions(request: ITestIamPermissionsRequest): js.Promise[
        js.Tuple3[
          ITestIamPermissionsResponse, 
          js.UndefOr[ITestIamPermissionsRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def testIamPermissions(
      request: ITestIamPermissionsRequest,
      callback: Callback[
          ITestIamPermissionsResponse, 
          js.UndefOr[ITestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def testIamPermissions(request: ITestIamPermissionsRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          ITestIamPermissionsResponse, 
          js.UndefOr[ITestIamPermissionsRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def testIamPermissions(
      request: ITestIamPermissionsRequest,
      options: CallOptions,
      callback: Callback[
          ITestIamPermissionsResponse, 
          js.UndefOr[ITestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Updates an instance, and begins allocating or releasing resources
      * as requested. The returned [long-running
      * operation][google.longrunning.Operation] can be used to track the
      * progress of updating the instance. If the named instance does not
      * exist, returns `NOT_FOUND`.
      *
      * Immediately upon completion of this request:
      *
      *   * For resource types for which a decrease in the instance's allocation
      *     has been requested, billing is based on the newly-requested level.
      *
      * Until completion of the returned operation:
      *
      *   * Cancelling the operation sets its metadata's
      *     {@link google.spanner.admin.instance.v1.UpdateInstanceMetadata.cancel_time|cancel_time}, and begins
      *     restoring resources to their pre-request values. The operation
      *     is guaranteed to succeed at undoing all resource changes,
      *     after which point it terminates with a `CANCELLED` status.
      *   * All other attempts to modify the instance are rejected.
      *   * Reading the instance via the API continues to give the pre-request
      *     resource levels.
      *
      * Upon completion of the returned operation:
      *
      *   * Billing begins for all successfully-allocated resources (some types
      *     may have lower than the requested levels).
      *   * All newly-reserved resources are available for serving the instance's
      *     tables.
      *   * The instance's new resource levels are readable via the API.
      *
      * The returned {@link google.longrunning.Operation|long-running operation} will
      * have a name of the format `<instance_name>/operations/<operation_id>` and
      * can be used to track the instance modification.  The
      * {@link google.longrunning.Operation.metadata|metadata} field type is
      * {@link google.spanner.admin.instance.v1.UpdateInstanceMetadata|UpdateInstanceMetadata}.
      * The {@link google.longrunning.Operation.response|response} field type is
      * {@link google.spanner.admin.instance.v1.Instance|Instance}, if successful.
      *
      * Authorization requires `spanner.instances.update` permission on
      * the resource {@link google.spanner.admin.instance.v1.Instance.name|name}.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {google.spanner.admin.instance.v1.Instance} request.instance
      *   Required. The instance to update, which must always include the instance
      *   name.  Otherwise, only fields mentioned in {@link google.spanner.admin.instance.v1.UpdateInstanceRequest.field_mask|field_mask} need be included.
      * @param {google.protobuf.FieldMask} request.fieldMask
      *   Required. A mask specifying which fields in {@link google.spanner.admin.instance.v1.Instance|Instance} should be updated.
      *   The field mask must always be specified; this prevents any future fields in
      *   {@link google.spanner.admin.instance.v1.Instance|Instance} from being erased accidentally by clients that do not know
      *   about them.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      *   a long running operation. Its `promise()` method returns a promise
      *   you can `await` for.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/instance_admin.update_instance.js</caption>
      * region_tag:spanner_v1_generated_InstanceAdmin_UpdateInstance_async
      */
    def updateInstance(): js.Promise[
        js.Tuple3[
          LROperation[IInstance, IUpdateInstanceMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateInstance(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IInstance, IUpdateInstanceMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateInstance(request: IUpdateInstanceRequest): js.Promise[
        js.Tuple3[
          LROperation[IInstance, IUpdateInstanceMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateInstance(
      request: IUpdateInstanceRequest,
      callback: Callback[
          LROperation[IInstance, IUpdateInstanceMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def updateInstance(request: IUpdateInstanceRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IInstance, IUpdateInstanceMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateInstance(
      request: IUpdateInstanceRequest,
      options: CallOptions,
      callback: Callback[
          LROperation[IInstance, IUpdateInstanceMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    def warn(code: String, message: String): Unit = js.native
    def warn(code: String, message: String, warnType: String): Unit = js.native
  }
}
