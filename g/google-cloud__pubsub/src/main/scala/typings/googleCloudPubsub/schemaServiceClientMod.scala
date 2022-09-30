package typings.googleCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleCloudPubsub.anon.Typeoffallback
import typings.googleCloudPubsub.anon.Typeofgax
import typings.googleCloudPubsub.protosMod.google.protobuf.IEmpty
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ICreateSchemaRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IDeleteSchemaRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IGetSchemaRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListSchemasRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IListSchemasResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ISchema
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IValidateMessageRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IValidateMessageResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IValidateSchemaRequest
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IValidateSchemaResponse
import typings.googleGax.clientInterfaceMod.Callback
import typings.googleGax.clientInterfaceMod.ClientOptions
import typings.googleGax.clientInterfaceMod.Descriptors
import typings.googleGax.clientInterfaceMod.PaginationCallback
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.mod.GoogleAuth
import typings.googleGax.mod.IamProtos.google.iam.v1.GetIamPolicyRequest
import typings.googleGax.mod.IamProtos.google.iam.v1.Policy
import typings.googleGax.mod.IamProtos.google.iam.v1.SetIamPolicyRequest
import typings.googleGax.mod.IamProtos.google.iam.v1.TestIamPermissionsRequest
import typings.googleGax.mod.IamProtos.google.iam.v1.TestIamPermissionsResponse
import typings.googleGax.mod.PathTemplate
import typings.googleGax.srcIamServiceMod.IamClient
import typings.node.streamMod.Transform
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaServiceClientMod {
  
  @JSImport("@google-cloud/pubsub/build/src/v1/schema_service_client", "SchemaServiceClient")
  @js.native
  /**
    * Construct an instance of SchemaServiceClient.
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
    * @param {gax} [gaxInstance]: loaded instance of `google-gax`. Useful if you
    *     need to avoid loading the default gRPC version and want to use the fallback
    *     HTTP implementation. Load only fallback version and pass it to the constructor:
    *     ```
    *     const gax = require('google-gax/build/src/fallback'); // avoids loading google-gax with gRPC
    *     const client = new SchemaServiceClient({fallback: 'rest'}, gax);
    *     ```
    */
  open class SchemaServiceClient () extends StObject {
    def this(opts: ClientOptions) = this()
    def this(opts: Unit, gaxInstance: Typeoffallback) = this()
    def this(opts: Unit, gaxInstance: Typeofgax) = this()
    def this(opts: ClientOptions, gaxInstance: Typeoffallback) = this()
    def this(opts: ClientOptions, gaxInstance: Typeofgax) = this()
    
    /* private */ var _defaults: Any = js.native
    
    /* private */ var _gaxGrpc: Any = js.native
    
    /* private */ var _gaxModule: Any = js.native
    
    /* private */ var _opts: Any = js.native
    
    /* private */ var _protos: Any = js.native
    
    /* private */ var _providedCustomServicePath: Any = js.native
    
    /* private */ var _terminated: Any = js.native
    
    var auth: GoogleAuth[JSONClient] = js.native
    
    /**
      * Terminate the gRPC channel and close the client.
      *
      * The client will no longer be usable and all future behavior is undefined.
      * @returns {Promise} A promise that resolves when the client is closed.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Creates a schema.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the project in which to create the schema.
      *   Format is `projects/{project-id}`.
      * @param {google.pubsub.v1.Schema} request.schema
      *   Required. The schema object to create.
      *
      *   This schema's `name` parameter is ignored. The schema object returned
      *   by CreateSchema will have a `name` made using the given `parent` and
      *   `schema_id`.
      * @param {string} request.schemaId
      *   The ID to use for the schema, which will become the final component of
      *   the schema's resource name.
      *
      *   See https://cloud.google.com/pubsub/docs/admin#resource_names for resource
      *   name constraints.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Schema]{@link google.pubsub.v1.Schema}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def createSchema(): js.Promise[js.Tuple3[ISchema, js.UndefOr[ICreateSchemaRequest], js.UndefOr[js.Object]]] = js.native
    def createSchema(request: Unit, options: CallOptions): js.Promise[js.Tuple3[ISchema, js.UndefOr[ICreateSchemaRequest], js.UndefOr[js.Object]]] = js.native
    def createSchema(request: ICreateSchemaRequest): js.Promise[js.Tuple3[ISchema, js.UndefOr[ICreateSchemaRequest], js.UndefOr[js.Object]]] = js.native
    def createSchema(
      request: ICreateSchemaRequest,
      callback: Callback[ISchema, js.UndefOr[ICreateSchemaRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def createSchema(request: ICreateSchemaRequest, options: CallOptions): js.Promise[js.Tuple3[ISchema, js.UndefOr[ICreateSchemaRequest], js.UndefOr[js.Object]]] = js.native
    def createSchema(
      request: ICreateSchemaRequest,
      options: CallOptions,
      callback: Callback[ISchema, js.UndefOr[ICreateSchemaRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Deletes a schema.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. Name of the schema to delete.
      *   Format is `projects/{project}/schemas/{schema}`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Empty]{@link google.protobuf.Empty}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def deleteSchema(): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSchemaRequest], js.UndefOr[js.Object]]] = js.native
    def deleteSchema(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSchemaRequest], js.UndefOr[js.Object]]] = js.native
    def deleteSchema(request: IDeleteSchemaRequest): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSchemaRequest], js.UndefOr[js.Object]]] = js.native
    def deleteSchema(
      request: IDeleteSchemaRequest,
      callback: Callback[IEmpty, js.UndefOr[IDeleteSchemaRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def deleteSchema(request: IDeleteSchemaRequest, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSchemaRequest], js.UndefOr[js.Object]]] = js.native
    def deleteSchema(
      request: IDeleteSchemaRequest,
      options: CallOptions,
      callback: Callback[IEmpty, js.UndefOr[IDeleteSchemaRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    var descriptors: Descriptors = js.native
    
    /**
      * Gets the access control policy for a resource. Returns an empty policy
      * if the resource exists and does not have a policy set.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.resource
      *   REQUIRED: The resource for which the policy is being requested.
      *   See the operation documentation for the appropriate value for this field.
      * @param {Object} [request.options]
      *   OPTIONAL: A `GetPolicyOptions` object for specifying options to
      *   `GetIamPolicy`. This field is only used by Cloud IAM.
      *
      *   This object should have the same structure as [GetPolicyOptions]{@link google.iam.v1.GetPolicyOptions}
      * @param {Object} [options]
      *   Optional parameters. You can override the default settings for this call, e.g, timeout,
      *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html} for the details.
      * @param {function(?Error, ?Object)} [callback]
      *   The function which will be called with the result of the API call.
      *
      *   The second parameter to the callback is an object representing [Policy]{@link google.iam.v1.Policy}.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Policy]{@link google.iam.v1.Policy}.
      *   The promise has a method named "cancel" which cancels the ongoing API call.
      */
    def getIamPolicy(request: GetIamPolicyRequest): js.Promise[Policy] = js.native
    def getIamPolicy(
      request: GetIamPolicyRequest,
      options: Unit,
      callback: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def getIamPolicy(
      request: GetIamPolicyRequest,
      options: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def getIamPolicy(
      request: GetIamPolicyRequest,
      options: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]],
      callback: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def getIamPolicy(request: GetIamPolicyRequest, options: CallOptions): js.Promise[Policy] = js.native
    def getIamPolicy(
      request: GetIamPolicyRequest,
      options: CallOptions,
      callback: Callback[Policy, js.UndefOr[GetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    
    def getProjectId(): js.Promise[String] = js.native
    def getProjectId(callback: Callback[String, Unit, Unit]): Unit = js.native
    
    /**
      * Gets a schema.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. The name of the schema to get.
      *   Format is `projects/{project}/schemas/{schema}`.
      * @param {google.pubsub.v1.SchemaView} request.view
      *   The set of fields to return in the response. If not set, returns a Schema
      *   with `name` and `type`, but not `definition`. Set to `FULL` to retrieve all
      *   fields.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Schema]{@link google.pubsub.v1.Schema}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def getSchema(): js.Promise[js.Tuple3[ISchema, js.UndefOr[IGetSchemaRequest], js.UndefOr[js.Object]]] = js.native
    def getSchema(request: Unit, options: CallOptions): js.Promise[js.Tuple3[ISchema, js.UndefOr[IGetSchemaRequest], js.UndefOr[js.Object]]] = js.native
    def getSchema(request: IGetSchemaRequest): js.Promise[js.Tuple3[ISchema, js.UndefOr[IGetSchemaRequest], js.UndefOr[js.Object]]] = js.native
    def getSchema(
      request: IGetSchemaRequest,
      callback: Callback[ISchema, js.UndefOr[IGetSchemaRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def getSchema(request: IGetSchemaRequest, options: CallOptions): js.Promise[js.Tuple3[ISchema, js.UndefOr[IGetSchemaRequest], js.UndefOr[js.Object]]] = js.native
    def getSchema(
      request: IGetSchemaRequest,
      options: CallOptions,
      callback: Callback[ISchema, js.UndefOr[IGetSchemaRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    var iamClient: IamClient = js.native
    
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
    
    /**
      * Lists schemas in a project.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the project in which to list schemas.
      *   Format is `projects/{project-id}`.
      * @param {google.pubsub.v1.SchemaView} request.view
      *   The set of Schema fields to return in the response. If not set, returns
      *   Schemas with `name` and `type`, but not `definition`. Set to `FULL` to
      *   retrieve all fields.
      * @param {number} request.pageSize
      *   Maximum number of schemas to return.
      * @param {string} request.pageToken
      *   The value returned by the last `ListSchemasResponse`; indicates that
      *   this is a continuation of a prior `ListSchemas` call, and that the
      *   system should return the next page of data.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [Schema]{@link google.pubsub.v1.Schema}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listSchemasAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listSchemas(): js.Promise[js.Tuple3[js.Array[ISchema], IListSchemasRequest | Null, IListSchemasResponse]] = js.native
    def listSchemas(request: Unit, options: CallOptions): js.Promise[js.Tuple3[js.Array[ISchema], IListSchemasRequest | Null, IListSchemasResponse]] = js.native
    def listSchemas(request: IListSchemasRequest): js.Promise[js.Tuple3[js.Array[ISchema], IListSchemasRequest | Null, IListSchemasResponse]] = js.native
    def listSchemas(
      request: IListSchemasRequest,
      callback: PaginationCallback[IListSchemasRequest, js.UndefOr[IListSchemasResponse | Null], ISchema]
    ): Unit = js.native
    def listSchemas(request: IListSchemasRequest, options: CallOptions): js.Promise[js.Tuple3[js.Array[ISchema], IListSchemasRequest | Null, IListSchemasResponse]] = js.native
    def listSchemas(
      request: IListSchemasRequest,
      options: CallOptions,
      callback: PaginationCallback[IListSchemasRequest, js.UndefOr[IListSchemasResponse | Null], ISchema]
    ): Unit = js.native
    
    /**
      * Equivalent to `listSchemas`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the project in which to list schemas.
      *   Format is `projects/{project-id}`.
      * @param {google.pubsub.v1.SchemaView} request.view
      *   The set of Schema fields to return in the response. If not set, returns
      *   Schemas with `name` and `type`, but not `definition`. Set to `FULL` to
      *   retrieve all fields.
      * @param {number} request.pageSize
      *   Maximum number of schemas to return.
      * @param {string} request.pageToken
      *   The value returned by the last `ListSchemasResponse`; indicates that
      *   this is a continuation of a prior `ListSchemas` call, and that the
      *   system should return the next page of data.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [Schema]{@link google.pubsub.v1.Schema}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listSchemasAsync(): AsyncIterable[ISchema] = js.native
    def listSchemasAsync(request: Unit, options: CallOptions): AsyncIterable[ISchema] = js.native
    def listSchemasAsync(request: IListSchemasRequest): AsyncIterable[ISchema] = js.native
    def listSchemasAsync(request: IListSchemasRequest, options: CallOptions): AsyncIterable[ISchema] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the project in which to list schemas.
      *   Format is `projects/{project-id}`.
      * @param {google.pubsub.v1.SchemaView} request.view
      *   The set of Schema fields to return in the response. If not set, returns
      *   Schemas with `name` and `type`, but not `definition`. Set to `FULL` to
      *   retrieve all fields.
      * @param {number} request.pageSize
      *   Maximum number of schemas to return.
      * @param {string} request.pageToken
      *   The value returned by the last `ListSchemasResponse`; indicates that
      *   this is a continuation of a prior `ListSchemas` call, and that the
      *   system should return the next page of data.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [Schema]{@link google.pubsub.v1.Schema} on 'data' event.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listSchemasAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listSchemasStream(): Transform = js.native
    def listSchemasStream(request: Unit, options: CallOptions): Transform = js.native
    def listSchemasStream(request: IListSchemasRequest): Transform = js.native
    def listSchemasStream(request: IListSchemasRequest, options: CallOptions): Transform = js.native
    
    /**
      * Parse the project from Project resource.
      *
      * @param {string} projectName
      *   A fully-qualified path representing Project resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromProjectName(projectName: String): String | Double = js.native
    
    /**
      * Parse the project from ProjectTopic resource.
      *
      * @param {string} projectTopicName
      *   A fully-qualified path representing project_topic resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromProjectTopicName(projectTopicName: String): String | Double = js.native
    
    /**
      * Parse the project from Schema resource.
      *
      * @param {string} schemaName
      *   A fully-qualified path representing Schema resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromSchemaName(schemaName: String): String | Double = js.native
    
    /**
      * Parse the project from Snapshot resource.
      *
      * @param {string} snapshotName
      *   A fully-qualified path representing Snapshot resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromSnapshotName(snapshotName: String): String | Double = js.native
    
    /**
      * Parse the project from Subscription resource.
      *
      * @param {string} subscriptionName
      *   A fully-qualified path representing Subscription resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromSubscriptionName(subscriptionName: String): String | Double = js.native
    
    /**
      * Parse the schema from Schema resource.
      *
      * @param {string} schemaName
      *   A fully-qualified path representing Schema resource.
      * @returns {string} A string representing the schema.
      */
    def matchSchemaFromSchemaName(schemaName: String): String | Double = js.native
    
    /**
      * Parse the snapshot from Snapshot resource.
      *
      * @param {string} snapshotName
      *   A fully-qualified path representing Snapshot resource.
      * @returns {string} A string representing the snapshot.
      */
    def matchSnapshotFromSnapshotName(snapshotName: String): String | Double = js.native
    
    /**
      * Parse the subscription from Subscription resource.
      *
      * @param {string} subscriptionName
      *   A fully-qualified path representing Subscription resource.
      * @returns {string} A string representing the subscription.
      */
    def matchSubscriptionFromSubscriptionName(subscriptionName: String): String | Double = js.native
    
    /**
      * Parse the topic from ProjectTopic resource.
      *
      * @param {string} projectTopicName
      *   A fully-qualified path representing project_topic resource.
      * @returns {string} A string representing the topic.
      */
    def matchTopicFromProjectTopicName(projectTopicName: String): String | Double = js.native
    
    var pathTemplates: StringDictionary[PathTemplate] = js.native
    
    /**
      * Return a fully-qualified project resource name string.
      *
      * @param {string} project
      * @returns {string} Resource name string.
      */
    def projectPath(project: String): String = js.native
    
    /**
      * Return a fully-qualified projectTopic resource name string.
      *
      * @param {string} project
      * @param {string} topic
      * @returns {string} Resource name string.
      */
    def projectTopicPath(project: String, topic: String): String = js.native
    
    /**
      * Return a fully-qualified schema resource name string.
      *
      * @param {string} project
      * @param {string} schema
      * @returns {string} Resource name string.
      */
    def schemaPath(project: String, schema: String): String = js.native
    
    var schemaServiceStub: js.UndefOr[js.Promise[StringDictionary[js.Function]]] = js.native
    
    /**
      * Returns permissions that a caller has on the specified resource. If the
      * resource does not exist, this will return an empty set of
      * permissions, not a NOT_FOUND error.
      *
      * Note: This operation is designed to be used for building
      * permission-aware UIs and command-line tools, not for authorization
      * checking. This operation may "fail open" without warning.
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
      * @param {Object} [options]
      *   Optional parameters. You can override the default settings for this call, e.g, timeout,
      *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html} for the details.
      * @param {function(?Error, ?Object)} [callback]
      *   The function which will be called with the result of the API call.
      *
      *   The second parameter to the callback is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
      *   The promise has a method named "cancel" which cancels the ongoing API call.
      */
    def setIamPolicy(request: SetIamPolicyRequest): js.Promise[Policy] = js.native
    def setIamPolicy(
      request: SetIamPolicyRequest,
      options: Unit,
      callback: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def setIamPolicy(
      request: SetIamPolicyRequest,
      options: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def setIamPolicy(
      request: SetIamPolicyRequest,
      options: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]],
      callback: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    def setIamPolicy(request: SetIamPolicyRequest, options: CallOptions): js.Promise[Policy] = js.native
    def setIamPolicy(
      request: SetIamPolicyRequest,
      options: CallOptions,
      callback: Callback[Policy, js.UndefOr[SetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[Policy] = js.native
    
    /**
      * Return a fully-qualified snapshot resource name string.
      *
      * @param {string} project
      * @param {string} snapshot
      * @returns {string} Resource name string.
      */
    def snapshotPath(project: String, snapshot: String): String = js.native
    
    /**
      * Return a fully-qualified subscription resource name string.
      *
      * @param {string} project
      * @param {string} subscription
      * @returns {string} Resource name string.
      */
    def subscriptionPath(project: String, subscription: String): String = js.native
    
    /**
      * Returns permissions that a caller has on the specified resource. If the
      * resource does not exist, this will return an empty set of
      * permissions, not a NOT_FOUND error.
      *
      * Note: This operation is designed to be used for building
      * permission-aware UIs and command-line tools, not for authorization
      * checking. This operation may "fail open" without warning.
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
      * @param {Object} [options]
      *   Optional parameters. You can override the default settings for this call, e.g, timeout,
      *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html} for the details.
      * @param {function(?Error, ?Object)} [callback]
      *   The function which will be called with the result of the API call.
      *
      *   The second parameter to the callback is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
      *   The promise has a method named "cancel" which cancels the ongoing API call.
      *
      */
    def testIamPermissions(request: TestIamPermissionsRequest): js.Promise[TestIamPermissionsResponse] = js.native
    def testIamPermissions(
      request: TestIamPermissionsRequest,
      options: Unit,
      callback: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[TestIamPermissionsResponse] = js.native
    def testIamPermissions(
      request: TestIamPermissionsRequest,
      options: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[TestIamPermissionsResponse] = js.native
    def testIamPermissions(
      request: TestIamPermissionsRequest,
      options: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ],
      callback: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[TestIamPermissionsResponse] = js.native
    def testIamPermissions(request: TestIamPermissionsRequest, options: CallOptions): js.Promise[TestIamPermissionsResponse] = js.native
    def testIamPermissions(
      request: TestIamPermissionsRequest,
      options: CallOptions,
      callback: Callback[
          TestIamPermissionsResponse, 
          js.UndefOr[TestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[TestIamPermissionsResponse] = js.native
    
    /**
      * Validates a message against a schema.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the project in which to validate schemas.
      *   Format is `projects/{project-id}`.
      * @param {string} request.name
      *   Name of the schema against which to validate.
      *
      *   Format is `projects/{project}/schemas/{schema}`.
      * @param {google.pubsub.v1.Schema} request.schema
      *   Ad-hoc schema against which to validate
      * @param {Buffer} request.message
      *   Message to validate against the provided `schema_spec`.
      * @param {google.pubsub.v1.Encoding} request.encoding
      *   The encoding expected for messages
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [ValidateMessageResponse]{@link google.pubsub.v1.ValidateMessageResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def validateMessage(): js.Promise[
        js.Tuple3[IValidateMessageResponse, js.UndefOr[IValidateMessageRequest], js.UndefOr[js.Object]]
      ] = js.native
    def validateMessage(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[IValidateMessageResponse, js.UndefOr[IValidateMessageRequest], js.UndefOr[js.Object]]
      ] = js.native
    def validateMessage(request: IValidateMessageRequest): js.Promise[
        js.Tuple3[IValidateMessageResponse, js.UndefOr[IValidateMessageRequest], js.UndefOr[js.Object]]
      ] = js.native
    def validateMessage(
      request: IValidateMessageRequest,
      callback: Callback[
          IValidateMessageResponse, 
          js.UndefOr[IValidateMessageRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def validateMessage(request: IValidateMessageRequest, options: CallOptions): js.Promise[
        js.Tuple3[IValidateMessageResponse, js.UndefOr[IValidateMessageRequest], js.UndefOr[js.Object]]
      ] = js.native
    def validateMessage(
      request: IValidateMessageRequest,
      options: CallOptions,
      callback: Callback[
          IValidateMessageResponse, 
          js.UndefOr[IValidateMessageRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Validates a schema.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the project in which to validate schemas.
      *   Format is `projects/{project-id}`.
      * @param {google.pubsub.v1.Schema} request.schema
      *   Required. The schema object to validate.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [ValidateSchemaResponse]{@link google.pubsub.v1.ValidateSchemaResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def validateSchema(): js.Promise[
        js.Tuple3[IValidateSchemaResponse, js.UndefOr[IValidateSchemaRequest], js.UndefOr[js.Object]]
      ] = js.native
    def validateSchema(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[IValidateSchemaResponse, js.UndefOr[IValidateSchemaRequest], js.UndefOr[js.Object]]
      ] = js.native
    def validateSchema(request: IValidateSchemaRequest): js.Promise[
        js.Tuple3[IValidateSchemaResponse, js.UndefOr[IValidateSchemaRequest], js.UndefOr[js.Object]]
      ] = js.native
    def validateSchema(
      request: IValidateSchemaRequest,
      callback: Callback[
          IValidateSchemaResponse, 
          js.UndefOr[IValidateSchemaRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def validateSchema(request: IValidateSchemaRequest, options: CallOptions): js.Promise[
        js.Tuple3[IValidateSchemaResponse, js.UndefOr[IValidateSchemaRequest], js.UndefOr[js.Object]]
      ] = js.native
    def validateSchema(
      request: IValidateSchemaRequest,
      options: CallOptions,
      callback: Callback[
          IValidateSchemaResponse, 
          js.UndefOr[IValidateSchemaRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    def warn(code: String, message: String): Unit = js.native
    def warn(code: String, message: String, warnType: String): Unit = js.native
  }
}
