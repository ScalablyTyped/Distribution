package typings.googleCloudSpanner

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleCloudSpanner.anon.ParamTypes
import typings.googleCloudSpanner.anon.PickanytransactionTag
import typings.googleCloudSpanner.anon.TypeofSpanner
import typings.googleCloudSpanner.buildSrcCommonGrpcServiceMod.GrpcService
import typings.googleCloudSpanner.buildSrcCommonMod.NormalCallback
import typings.googleCloudSpanner.buildSrcCommonMod.PagedCallback
import typings.googleCloudSpanner.buildSrcCommonMod.PagedOptions
import typings.googleCloudSpanner.buildSrcCommonMod.PagedOptionsWithFilter
import typings.googleCloudSpanner.buildSrcCommonMod.PagedResponse
import typings.googleCloudSpanner.buildSrcDatabaseMod.Database
import typings.googleCloudSpanner.buildSrcInstanceMod.CreateInstanceCallback
import typings.googleCloudSpanner.buildSrcInstanceMod.CreateInstanceResponse
import typings.googleCloudSpanner.buildSrcInstanceMod.Instance
import typings.googleCloudSpanner.buildSrcSessionPoolMod.SessionPoolOptions
import typings.googleCloudSpanner.buildSrcTransactionMod.ExecuteSqlRequest
import typings.googleCloudSpanner.buildSrcTransactionMod.ReadRequest
import typings.googleCloudSpanner.buildSrcTransactionMod.TimestampBounds
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.googleGax.buildSrcGrpcMod.GrpcClientOptions
import typings.googleGax.mod.grpc.ChannelCredentials
import typings.node.NodeJS.ReadableStream
import typings.stackTrace.mod.StackFrame
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@google-cloud/spanner", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/spanner", "default.Spanner")
    @js.native
    def Spanner: TypeofSpanner & (Instantiable1[/* options */ js.UndefOr[SpannerOptions], typings.googleCloudSpanner.mod.Spanner]) = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@google-cloud/spanner", "default.Spanner")
    @js.native
    open class SpannerCls () extends Spanner {
      def this(options: SpannerOptions) = this()
    }
    
    inline def Spanner_=(x: TypeofSpanner & (Instantiable1[/* options */ js.UndefOr[SpannerOptions], Spanner])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Spanner")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@google-cloud/spanner", "PartitionedDml")
  @js.native
  open class PartitionedDml protected ()
    extends typings.googleCloudSpanner.buildSrcTransactionMod.PartitionedDml {
    def this(session: typings.googleCloudSpanner.buildSrcSessionMod.Session) = this()
    def this(
      session: typings.googleCloudSpanner.buildSrcSessionMod.Session,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.TransactionOptions.PartitionedDml */ Any
    ) = this()
  }
  
  @JSImport("@google-cloud/spanner", "Session")
  @js.native
  open class Session protected ()
    extends typings.googleCloudSpanner.buildSrcSessionMod.Session {
    def this(database: Database) = this()
    def this(database: Database, name: String) = this()
  }
  /* static members */
  object Session {
    
    @JSImport("@google-cloud/spanner", "Session")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Format the session name to include the parent database's name.
      *
      * @private
      *
      * @param {string} databaseName The parent database's name.
      * @param {string} name The instance name.
      * @returns {string}
      *
      * @example
      * ```
      * Session.formatName_('my-database', 'my-session');
      * // 'projects/grape-spaceship-123/instances/my-instance/' +
      * // 'databases/my-database/sessions/my-session'
      * ```
      */
    inline def formatName_(databaseName: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(databaseName.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("@google-cloud/spanner", "SessionPool")
  @js.native
  open class SessionPool protected ()
    extends typings.googleCloudSpanner.buildSrcSessionPoolMod.SessionPool {
    /**
      * @constructor
      * @param {Database} database The DB instance.
      * @param {SessionPoolOptions} [options] Configuration options.
      */
    def this(database: Database) = this()
    def this(database: Database, options: SessionPoolOptions) = this()
  }
  /* static members */
  object SessionPool {
    
    @JSImport("@google-cloud/spanner", "SessionPool")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Formats stack trace objects into Node-like stack trace.
      *
      * @param {object[]} trace The trace object.
      * @return {string}
      */
    inline def formatTrace(frames: js.Array[StackFrame]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTrace")(frames.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("@google-cloud/spanner", "Snapshot")
  @js.native
  open class Snapshot protected ()
    extends typings.googleCloudSpanner.buildSrcTransactionMod.Snapshot {
    /**
      * The transaction ID.
      *
      * @name Snapshot#id
      * @type {?(string|Buffer)}
      */
    /**
      * Whether or not the transaction has ended. If true, make no further
      * requests, and discard the transaction.
      *
      * @name Snapshot#ended
      * @type {boolean}
      */
    /**
      * The raw transaction response object. It is populated after
      * {@link Snapshot#begin} is called.
      *
      * @name Snapshot#metadata
      * @type {?TransactionResponse}
      */
    /**
      * **Snapshot only**
      * The timestamp at which all reads are performed.
      *
      * @name Snapshot#readTimestamp
      * @type {?external:PreciseDate}
      */
    /**
      * **Snapshot only**
      * The protobuf version of {@link Snapshot#readTimestamp}. This is useful if
      * you require microsecond precision.
      *
      * @name Snapshot#readTimestampProto
      * @type {?google.protobuf.Timestamp}
      */
    /**
      * @constructor
      *
      * @param {Session} session The parent Session object.
      * @param {TimestampBounds} [options] Snapshot timestamp bounds.
      * @param {QueryOptions} [queryOptions] Default query options to use when none
      *        are specified for a query.
      */
    def this(session: typings.googleCloudSpanner.buildSrcSessionMod.Session) = this()
    def this(session: typings.googleCloudSpanner.buildSrcSessionMod.Session, options: TimestampBounds) = this()
    def this(
      session: typings.googleCloudSpanner.buildSrcSessionMod.Session,
      options: Unit,
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IQueryOptions */ Any
    ) = this()
    def this(
      session: typings.googleCloudSpanner.buildSrcSessionMod.Session,
      options: TimestampBounds,
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IQueryOptions */ Any
    ) = this()
  }
  /* static members */
  object Snapshot {
    
    @JSImport("@google-cloud/spanner", "Snapshot")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Transforms convenience options `keys` and `ranges` into a KeySet object.
      *
      * @private
      * @static
      *
      * @param {ReadRequest} request The read request.
      * @returns {object}
      */
    inline def encodeKeySet(request: ReadRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeKeySet")(request.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * Encodes convenience options `param` and `types` into the proto formatted.
      *
      * @private
      * @static
      *
      * @param {ExecuteSqlRequest} request The SQL request.
      * @returns {object}
      */
    inline def encodeParams(request: ExecuteSqlRequest): ParamTypes = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeParams")(request.asInstanceOf[js.Any]).asInstanceOf[ParamTypes]
    
    /**
      * Formats timestamp options into proto format.
      *
      * @private
      * @static
      *
      * @param {TimestampBounds} options The user supplied options.
      * @returns {object}
      */
    inline def encodeTimestampBounds(options: TimestampBounds): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeTimestampBounds")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  /**
    * Create a Table object to interact with a table in a Cloud Spanner
    * database.
    *
    * @class
    *
    * @param {Database} database {@link Database} instance.
    * @param {string} name Name of the table.
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    *
    * const instance = spanner.instance('my-instance');
    * const database = instance.database('my-database');
    * const table = database.table('my-table');
    * ```
    */
  @JSImport("@google-cloud/spanner", "Table")
  @js.native
  open class Table protected ()
    extends typings.googleCloudSpanner.buildSrcTableMod.Table {
    def this(database: Database, name: String) = this()
  }
  
  @JSImport("@google-cloud/spanner", "Transaction")
  @js.native
  open class Transaction protected ()
    extends typings.googleCloudSpanner.buildSrcTransactionMod.Transaction {
    /**
      * Timestamp at which the transaction was committed. Will be populated once
      * {@link Transaction#commit} is called.
      *
      * @name Transaction#commitTimestamp
      * @type {?external:PreciseDate}
      */
    /**
      * The protobuf version of {@link Transaction#commitTimestamp}. This is useful
      * if you require microsecond precision.
      *
      * @name Transaction#commitTimestampProto
      * @type {?google.protobuf.Timestamp}
      */
    /**
      * Execute a DML statement and get the affected row count.
      *
      * @name Transaction#runUpdate
      *
      * @see {@link Transaction#run}
      *
      * @param {string|object} query A DML statement or
      *     [`ExecuteSqlRequest`](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.ExecuteSqlRequest)
      *     object.
      * @param {object} [query.params] A map of parameter name to values.
      * @param {object} [query.types] A map of parameter types.
      * @param {RunUpdateCallback} [callback] Callback function.
      * @returns {Promise<RunUpdateResponse>}
      *
      * @example
      * ```
      * const query = 'UPDATE Account SET Balance = 1000 WHERE Key = 1';
      *
      * transaction.runUpdate(query, (err, rowCount) => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      * });
      * ```
      */
    def this(session: typings.googleCloudSpanner.buildSrcSessionMod.Session) = this()
    def this(
      session: typings.googleCloudSpanner.buildSrcSessionMod.Session,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.TransactionOptions.ReadWrite */ Any
    ) = this()
    def this(
      session: typings.googleCloudSpanner.buildSrcSessionMod.Session,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.TransactionOptions.ReadWrite */ Any,
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IQueryOptions */ Any
    ) = this()
    def this(
      session: typings.googleCloudSpanner.buildSrcSessionMod.Session,
      options: Unit,
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IQueryOptions */ Any
    ) = this()
    def this(
      session: typings.googleCloudSpanner.buildSrcSessionMod.Session,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.TransactionOptions.ReadWrite */ Any,
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IQueryOptions */ Any,
      requestOptions: PickanytransactionTag
    ) = this()
    def this(
      session: typings.googleCloudSpanner.buildSrcSessionMod.Session,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.TransactionOptions.ReadWrite */ Any,
      queryOptions: Unit,
      requestOptions: PickanytransactionTag
    ) = this()
    def this(
      session: typings.googleCloudSpanner.buildSrcSessionMod.Session,
      options: Unit,
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IQueryOptions */ Any,
      requestOptions: PickanytransactionTag
    ) = this()
    def this(
      session: typings.googleCloudSpanner.buildSrcSessionMod.Session,
      options: Unit,
      queryOptions: Unit,
      requestOptions: PickanytransactionTag
    ) = this()
  }
  /* static members */
  object Transaction {
    
    @JSImport("@google-cloud/spanner", "Transaction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decorates an error returned by a commit with additional information for
      * specific known errors.
      * @param err the error to check and decorate with additional information if possible
      * @param mutations the mutations included in the commit request
      * @private
      */
    @JSImport("@google-cloud/spanner", "Transaction.decorateCommitError")
    @js.native
    def decorateCommitError: Any = js.native
    inline def decorateCommitError_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorateCommitError")(x.asInstanceOf[js.Any])
    
    /**
      * Decorates an error returned by a commit with additional information if the
      * error was returned because the application tried to insert an array of
      * objects into a JSON column. An array of objects will by default be encoded
      * as ARRAY<JSON>, but can also be interpreted as JSON. An application must
      * specify a top-level array of objects that should be inserted into a JSON
      * column as a string instead of as an array of objects.
      * @param err the error returned by the commit RPC
      * @param mutations the mutations included in the commit request
      * @private
      */
    @JSImport("@google-cloud/spanner", "Transaction.decoratePossibleJsonMismatchError")
    @js.native
    def decoratePossibleJsonMismatchError: Any = js.native
    inline def decoratePossibleJsonMismatchError_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decoratePossibleJsonMismatchError")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/spanner", "Transaction.extractKnownMetadata")
    @js.native
    def extractKnownMetadata: Any = js.native
    inline def extractKnownMetadata_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extractKnownMetadata")(x.asInstanceOf[js.Any])
    
    /**
      * Takes a list of rows and returns all unique column names.
      *
      * @private
      *
      * @param {object[]} rows The rows.
      * @returns {string[]}
      */
    inline def getUniqueKeys(rows: js.Array[js.Object]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUniqueKeys")(rows.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  trait CreateInstanceRequest extends StObject {
    
    var config: js.UndefOr[String] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var gaxOptions: js.UndefOr[CallOptions] = js.undefined
    
    var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
    
    var nodes: js.UndefOr[Double] = js.undefined
    
    var processingUnits: js.UndefOr[Double] = js.undefined
  }
  object CreateInstanceRequest {
    
    inline def apply(): CreateInstanceRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateInstanceRequest]
    }
    
    extension [Self <: CreateInstanceRequest](x: Self) {
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
      
      inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
      
      inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsNull: Self = StObject.set(x, "labels", null)
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setNodes(value: Double): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setProcessingUnits(value: Double): Self = StObject.set(x, "processingUnits", value.asInstanceOf[js.Any])
      
      inline def setProcessingUnitsUndefined: Self = StObject.set(x, "processingUnits", js.undefined)
    }
  }
  
  type EnumKey[E /* <: StringDictionary[Any] */] = /* keyof E */ String
  
  type GetInstanceConfigCallback = NormalCallback[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IInstanceConfig */ Any
  ]
  
  trait GetInstanceConfigOptions extends StObject {
    
    var gaxOptions: js.UndefOr[CallOptions] = js.undefined
  }
  object GetInstanceConfigOptions {
    
    inline def apply(): GetInstanceConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetInstanceConfigOptions]
    }
    
    extension [Self <: GetInstanceConfigOptions](x: Self) {
      
      inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
      
      inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
    }
  }
  
  type GetInstanceConfigResponse = js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IInstanceConfig */ Any
  ]
  
  type GetInstanceConfigsCallback = PagedCallback[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IInstanceConfig */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IListInstanceConfigsResponse */ Any
  ]
  
  type GetInstanceConfigsOptions = PagedOptions
  
  type GetInstanceConfigsResponse = PagedResponse[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IInstanceConfig */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IListInstanceConfigsResponse */ Any
  ]
  
  type GetInstancesCallback = PagedCallback[
    Instance, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IListInstancesResponse */ Any
  ]
  
  type GetInstancesOptions = PagedOptionsWithFilter
  
  type GetInstancesResponse = PagedResponse[
    Instance, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IListInstancesResponse */ Any
  ]
  
  type IOperation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.longrunning.IOperation */ Any
  
  trait RequestConfig extends StObject {
    
    var client: String
    
    var gaxOpts: js.UndefOr[CallOptions] = js.undefined
    
    var headers: StringDictionary[String]
    
    var method: String
    
    var reqOpts: Any
  }
  object RequestConfig {
    
    inline def apply(client: String, headers: StringDictionary[String], method: String, reqOpts: Any): RequestConfig = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], reqOpts = reqOpts.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestConfig]
    }
    
    extension [Self <: RequestConfig](x: Self) {
      
      inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setGaxOpts(value: CallOptions): Self = StObject.set(x, "gaxOpts", value.asInstanceOf[js.Any])
      
      inline def setGaxOptsUndefined: Self = StObject.set(x, "gaxOpts", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setReqOpts(value: Any): Self = StObject.set(x, "reqOpts", value.asInstanceOf[js.Any])
    }
  }
  
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
  @js.native
  trait Spanner extends GrpcService {
    
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
    def instance(name: String): Instance = js.native
    
    var instances_ : Map[String, Instance] = js.native
    
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
  }
  
  trait SpannerOptions
    extends StObject
       with GrpcClientOptions {
    
    var apiEndpoint: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var servicePath: js.UndefOr[String] = js.undefined
    
    var sslCreds: js.UndefOr[ChannelCredentials] = js.undefined
  }
  object SpannerOptions {
    
    inline def apply(): SpannerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpannerOptions]
    }
    
    extension [Self <: SpannerOptions](x: Self) {
      
      inline def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      inline def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
      
      inline def setServicePathUndefined: Self = StObject.set(x, "servicePath", js.undefined)
      
      inline def setSslCreds(value: ChannelCredentials): Self = StObject.set(x, "sslCreds", value.asInstanceOf[js.Any])
      
      inline def setSslCredsUndefined: Self = StObject.set(x, "sslCreds", js.undefined)
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: P extends U? @google-cloud/spanner.@google-cloud/spanner.EnumKey<E> | null | undefined : T[P]}
    }}}
    */
  @js.native
  trait TranslateEnumKeys[T, U /* <: /* keyof T */ String */, E /* <: StringDictionary[Any] */] extends StObject
}
