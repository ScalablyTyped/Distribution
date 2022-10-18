package typings.googleCloudSpanner

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudCommon.buildSrcServiceObjectMod.GetConfig
import typings.googleCloudSpanner.buildSrcBackupMod.Backup
import typings.googleCloudSpanner.buildSrcBackupMod.CopyBackupCallback
import typings.googleCloudSpanner.buildSrcBackupMod.CopyBackupOptions
import typings.googleCloudSpanner.buildSrcBackupMod.CopyBackupResponse
import typings.googleCloudSpanner.buildSrcCommonMod.LongRunningCallback
import typings.googleCloudSpanner.buildSrcCommonMod.NormalCallback
import typings.googleCloudSpanner.buildSrcCommonMod.PagedOptions
import typings.googleCloudSpanner.buildSrcCommonMod.PagedOptionsWithFilter
import typings.googleCloudSpanner.buildSrcCommonMod.PagedResponse
import typings.googleCloudSpanner.buildSrcCommonMod.RequestCallback
import typings.googleCloudSpanner.buildSrcCommonMod.ResourceCallback
import typings.googleCloudSpanner.buildSrcDatabaseMod.Database
import typings.googleCloudSpanner.buildSrcDatabaseMod.SessionPoolConstructor
import typings.googleCloudSpanner.buildSrcSessionPoolMod.SessionPool
import typings.googleCloudSpanner.buildSrcSessionPoolMod.SessionPoolOptions
import typings.googleCloudSpanner.mod.CreateInstanceRequest
import typings.googleCloudSpanner.mod.RequestConfig
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.googleGax.mod.Operation_
import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.Duplex
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcInstanceMod {
  
  type CreateDatabaseCallback = LongRunningCallback[Database]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify databaseAdmin.spanner.admin.database.v1.ICreateDatabaseRequest * / any */ trait CreateDatabaseOptions extends StObject {
    
    var gaxOptions: js.UndefOr[CallOptions] = js.undefined
    
    var poolCtor: js.UndefOr[SessionPool] = js.undefined
    
    var poolOptions: js.UndefOr[SessionPoolOptions] = js.undefined
    
    var schema: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object CreateDatabaseOptions {
    
    inline def apply(): CreateDatabaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateDatabaseOptions]
    }
    
    extension [Self <: CreateDatabaseOptions](x: Self) {
      
      inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
      
      inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
      
      inline def setPoolCtor(value: SessionPool): Self = StObject.set(x, "poolCtor", value.asInstanceOf[js.Any])
      
      inline def setPoolCtorUndefined: Self = StObject.set(x, "poolCtor", js.undefined)
      
      inline def setPoolOptions(value: SessionPoolOptions): Self = StObject.set(x, "poolOptions", value.asInstanceOf[js.Any])
      
      inline def setPoolOptionsUndefined: Self = StObject.set(x, "poolOptions", js.undefined)
      
      inline def setSchema(value: String | js.Array[String]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSchemaVarargs(value: String*): Self = StObject.set(x, "schema", js.Array(value*))
    }
  }
  
  type CreateDatabaseResponse = js.Tuple3[Database, Operation_, IOperation]
  
  type CreateInstanceCallback = LongRunningCallback[Instance]
  
  type CreateInstanceResponse = js.Tuple3[Instance, Operation_, IOperation]
  
  type DeleteInstanceCallback = NormalCallback[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.protobuf.IEmpty */ Any
  ]
  
  type DeleteInstanceResponse = js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.protobuf.IEmpty */ Any
  ]
  
  type ExistsInstanceCallback = NormalCallback[Boolean]
  
  type ExistsInstanceResponse = js.Array[Boolean]
  
  type GetBackupOperationsCallback = RequestCallback[
    IOperation, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify databaseAdmin.spanner.admin.database.v1.IListBackupOperationsResponse */ Any
  ]
  
  type GetBackupOperationsOptions = PagedOptionsWithFilter
  
  type GetBackupOperationsResponse = PagedResponse[
    IOperation, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify databaseAdmin.spanner.admin.database.v1.IListBackupOperationsResponse */ Any
  ]
  
  type GetBackupsCallback = RequestCallback[
    Backup, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify databaseAdmin.spanner.admin.database.v1.IListBackupsResponse */ Any
  ]
  
  type GetBackupsOptions = PagedOptionsWithFilter
  
  type GetBackupsResponse = PagedResponse[
    Backup, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify databaseAdmin.spanner.admin.database.v1.IListBackupsResponse */ Any
  ]
  
  type GetDatabaseOperationsCallback = RequestCallback[
    IOperation, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify databaseAdmin.spanner.admin.database.v1.IListDatabaseOperationsResponse */ Any
  ]
  
  type GetDatabaseOperationsOptions = PagedOptionsWithFilter
  
  type GetDatabaseOperationsResponse = PagedResponse[
    IOperation, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify databaseAdmin.spanner.admin.database.v1.IListDatabaseOperationsResponse */ Any
  ]
  
  type GetDatabasesCallback = RequestCallback[
    Database, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify databaseAdmin.spanner.admin.database.v1.IListDatabasesResponse */ Any
  ]
  
  type GetDatabasesOptions = PagedOptions
  
  type GetDatabasesResponse = PagedResponse[
    Database, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify databaseAdmin.spanner.admin.database.v1.IListDatabasesResponse */ Any
  ]
  
  type GetInstanceCallback = ResourceCallback[Instance, IInstance]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.googleCloudSpanner.buildSrcInstanceMod.GetInstanceMetadataOptions because var conflicts: gaxOptions. Inlined fieldNames */ trait GetInstanceConfig
    extends StObject
       with GetConfig
       with CreateInstanceRequest {
    
    var fieldNames: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object GetInstanceConfig {
    
    inline def apply(): GetInstanceConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetInstanceConfig]
    }
    
    extension [Self <: GetInstanceConfig](x: Self) {
      
      inline def setFieldNames(value: String | js.Array[String]): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      inline def setFieldNamesVarargs(value: String*): Self = StObject.set(x, "fieldNames", js.Array(value*))
    }
  }
  
  type GetInstanceMetadataCallback = NormalCallback[IInstance]
  
  trait GetInstanceMetadataOptions extends StObject {
    
    var fieldNames: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var gaxOptions: js.UndefOr[CallOptions] = js.undefined
  }
  object GetInstanceMetadataOptions {
    
    inline def apply(): GetInstanceMetadataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetInstanceMetadataOptions]
    }
    
    extension [Self <: GetInstanceMetadataOptions](x: Self) {
      
      inline def setFieldNames(value: String | js.Array[String]): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      inline def setFieldNamesVarargs(value: String*): Self = StObject.set(x, "fieldNames", js.Array(value*))
      
      inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
      
      inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
    }
  }
  
  type GetInstanceMetadataResponse = js.Array[IInstance]
  
  type GetInstanceResponse = js.Tuple2[Instance, IInstance]
  
  type IBackup = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify databaseAdmin.spanner.admin.database.v1.IBackup */ Any
  
  type IDatabase = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify databaseAdmin.spanner.admin.database.v1.IDatabase */ Any
  
  type IInstance = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.spanner.admin.instance.v1.IInstance */ Any
  
  type IOperation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify instanceAdmin.longrunning.IOperation */ Any
  
  /**
    * The {@link Instance} class represents a [Cloud Spanner
    * instance](https://cloud.google.com/spanner/docs/instances).
    *
    * Create an `Instance` object to interact with a Cloud Spanner instance.
    *
    * @class
    *
    * @param {Spanner} spanner {@link Spanner} instance.
    * @param {string} name Name of the instance.
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    * const instance = spanner.instance('my-instance');
    * ```
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify common.GrpcServiceObject * / any */ @js.native
  trait Instance extends StObject {
    
    /**
      * Get a reference to a Backup object.
      *
      * @throws {GoogleError} If any parameter is not provided.
      *
      * @param {string} backupId The name of the backup.
      * @return {Backup} A Backup object.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      * const instance = spanner.instance('my-instance');
      * const backup = instance.backup('my-backup');
      * ```
      */
    def backup(backupId: String): Backup = js.native
    
    /**
      * Get a reference to a Backup object.
      *
      * @throws {GoogleError} If any parameter is not provided.
      *
      * @typedef {object} CopyBackupOptions
      *    * @property {string|null}
      *    *     sourceBackup The full path of the backup to be copied
      *    * @property {string|number|google.protobuf.Timestamp|external:PreciseDate}
      *    *     expireTime The expire time of the backup.
      *    * @property {google.spanner.admin.database.v1.ICopyBackupEncryptionConfig}
      *    *     encryptionConfig An encryption configuration describing the
      *    *     encryption type and key resources in Cloud KMS to be used to encrypt
      *    *     the copy backup.
      *    * @property {object} [gaxOptions] The request configuration options,
      *    *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *    *     for more details.
      *    */
    /**
      * @callback CopyBackupCallback
      * @param {string} sourceBackupId Full path of the source backup to be copied.
      * @param {string} backupId The name of the backup.
      * @param {CopyBackupOptions}
      * @return {Backup} A Backup object.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      * const instance = spanner.instance('my-instance');
      * const backup = instance.copyBackup('my-source-backup','my-backup',{
      *   expireTime: expireTime,
      *   encryptionConfig: {
      *     encryptionType: 'CUSTOMER_MANAGED_ENCRYPTION',
      *     kmsKeyName: 'projects/my-project-id/my-region/keyRings/my-key-ring/cryptoKeys/my-key',
      *   },);
      * ```
      */
    def copyBackup(sourceBackupId: String, backupId: String, options: CopyBackupOptions): js.Promise[CopyBackupResponse] | Unit = js.native
    def copyBackup(sourceBackupId: String, backupId: String, options: CopyBackupOptions, callback: CopyBackupCallback): js.Promise[CopyBackupResponse] | Unit = js.native
    
    /**
      * Config for the new database.
      *
      * @typedef {object} CreateDatabaseRequest
      * @property {SessionPoolOptions} [poolOptions]
      * @property {SessionPoolCtor} [poolCtor]
      */
    /**
      * @typedef {array} CreateDatabaseResponse
      * @property {Database} 0 The new {@link Database}.
      * @property {google.longrunning.Operation} 1 An {@link Operation} object that can be used to check
      *     the status of the request.
      * @property {object} 2 The full API response.
      */
    /**
      * @callback CreateDatabaseCallback
      * @param {?Error} err Request error, if any.
      * @param {Database} database The new {@link Database}.
      * @param {google.longrunning.Operation} operation An {@link Operation} object that can be used to
      *     check the status of the request.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Create a database in this instance.
      *
      * Wrapper around {@link v1.DatabaseAdminClient#createDatabase}.
      *
      * @see {@link v1.DatabaseAdminClient#createDatabase}
      * @see [CreateDatabase API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.database.v1#google.spanner.admin.database.v1.DatabaseAdmin.CreateDatabase)
      *
      * @throws {GoogleError} If a name is not provided.
      *
      * @param {name} name The name of the database to create.
      * @param {CreateDatabaseRequest} [options] Configuration object.
      * @param {CreateDatabaseCallback} [callback] Callback function.
      * @returns {Promise<CreateDatabaseResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      *
      * function callback(err, database, operation, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   operation
      *     .on('error', function(err) {})
      *     .on('complete', function() {
      *       // Database created successfully.
      *     });
      * }
      *
      * instance.createDatabase('new-database-name', callback);
      *
      * //-
      * // Set the schema for the database.
      * //-
      * instance.createDatabase('new-database-name', {
      *   schema:
      *     'CREATE TABLE Singers (' +
      *     '  SingerId STRING(1024) NOT NULL,' +
      *     '  Name STRING(1024),' +
      *     ') PRIMARY KEY(SingerId)'
      * }, callback);
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * instance.createDatabase('new-database-name')
      *   .then(function(data) {
      *     const database = data[0];
      *     const operation = data[1];
      *     return operation.promise();
      *   })
      *   .then(function() {
      *     // Database created successfully.
      *   });
      *
      * ```
      * @example <caption>include:samples/schema.js</caption>
      * region_tag:spanner_create_database
      * Full example:
      */
    def createDatabase(name: String): js.Promise[CreateDatabaseResponse] = js.native
    def createDatabase(name: String, callback: CreateDatabaseCallback): Unit = js.native
    def createDatabase(name: String, options: CreateDatabaseOptions): js.Promise[CreateDatabaseResponse] = js.native
    def createDatabase(name: String, options: CreateDatabaseOptions, callback: CreateDatabaseCallback): Unit = js.native
    
    /**
      * Get a reference to a Database object.
      *
      * @throws {GoogleError} If a name is not provided.
      *
      * @param {string} name The name of the instance.
      * @param {SessionPoolOptions|SessionPoolCtor} [poolOptions] Session pool
      *     configuration options.
      * @param {spannerClient.spanner.v1.ExecuteSqlRequest.IQueryOptions} [queryOptions]
      *     Default query options to use with the database. These options will be
      *     overridden by any query options set in environment variables or that
      *     are specified on a per-query basis.
      * @return {Database} A Database object.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      * ```
      */
    def database(name: String): Database = js.native
    def database(
      name: String,
      poolOptions: Unit,
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.ExecuteSqlRequest.IQueryOptions */ Any
    ): Database = js.native
    def database(name: String, poolOptions: SessionPoolConstructor): Database = js.native
    def database(
      name: String,
      poolOptions: SessionPoolConstructor,
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.ExecuteSqlRequest.IQueryOptions */ Any
    ): Database = js.native
    def database(name: String, poolOptions: SessionPoolOptions): Database = js.native
    def database(
      name: String,
      poolOptions: SessionPoolOptions,
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.ExecuteSqlRequest.IQueryOptions */ Any
    ): Database = js.native
    
    var databases_ : Map[String, Database] = js.native
    
    /**
      * @typedef {array} DeleteInstanceResponse
      * @property {object} 0 The full API response.
      */
    /**
      * @callback DeleteInstanceCallback
      * @param {?Error} err Request error, if any.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Delete the instance.
      *
      * Wrapper around {@link v1.InstanceAdminClient#deleteInstance}.
      *
      * @see {@link v1.InstanceAdminClient#deleteInstance}
      * @see [DeleteInstance API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.instance.v1#google.spanner.admin.instance.v1.InstanceAdmin.DeleteInstance)
      *
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {DeleteInstanceCallback} [callback] Callback function.
      * @returns {Promise<DeleteInstanceResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      *
      * instance.delete(function(err, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Instance was deleted successfully.
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * instance.delete().then(function(data) {
      *   const apiResponse = data[0];
      * });
      * ```
      */
    def delete(): js.Promise[DeleteInstanceResponse] = js.native
    def delete(callback: DeleteInstanceCallback): Unit = js.native
    def delete(gaxOptions: CallOptions): js.Promise[DeleteInstanceResponse] = js.native
    def delete(gaxOptions: CallOptions, callback: DeleteInstanceCallback): Unit = js.native
    
    /**
      * @typedef {array} InstanceExistsResponse
      * @property {boolean} 0 Whether the {@link Instance} exists.
      */
    /**
      * @callback InstanceExistsCallback
      * @param {?Error} err Request error, if any.
      * @param {boolean} exists Whether the {@link Instance} exists.
      */
    /**
      * Check if an instance exists.
      *
      * @method Instance#exists
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {InstanceExistsCallback} [callback] Callback function.
      * @returns {Promise<InstanceExistsResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      *
      * instance.exists(function(err, exists) {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * instance.exists().then(function(data) {
      *   const exists = data[0];
      * });
      * ```
      */
    def exists(): js.Promise[ExistsInstanceResponse] = js.native
    def exists(callback: ExistsInstanceCallback): Unit = js.native
    def exists(gaxOptions: CallOptions): js.Promise[ExistsInstanceResponse] = js.native
    def exists(gaxOptions: CallOptions, callback: ExistsInstanceCallback): Unit = js.native
    
    var formattedName_ : String = js.native
    
    /**
      * @typedef {array} GetInstanceResponse
      * @property {Instance} 0 The {@link Instance}.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback GetInstanceCallback
      * @param {?Error} err Request error, if any.
      * @param {Instance} instance The {@link Instance}.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Get an instance if it exists.
      *
      * You may optionally use this to "get or create" an object by providing an
      * object with `autoCreate` set to `true`. Any extra configuration that is
      * normally required for the `create` method must be contained within this
      * object as well.
      *
      * @param {options} [options] Configuration object.
      * @param {boolean} [options.autoCreate=false] Automatically create the
      *     object if it does not exist.
      * @param {string | string[]} [options.fieldNames] A list of `Instance` field
      *     names to be requested. Eligible values are: `name`, `displayName`,
      *     `endpointUris`, `labels`, `config`, `nodeCount`, `state`.
      * @param {GetInstanceCallback} [callback] Callback function.
      * @returns {Promise<GetInstanceResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      *
      * instance.get(function(err, instance, apiResponse) {
      *   // `instance.metadata` has been populated.
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * instance.get().then(function(data) {
      *   const instance = data[0];
      *   const apiResponse = data[0];
      * });
      * ```
      */
    def get(): js.Promise[GetInstanceResponse] = js.native
    def get(callback: GetInstanceCallback): Unit = js.native
    def get(options: GetInstanceConfig): js.Promise[GetInstanceResponse] = js.native
    def get(options: GetInstanceConfig, callback: GetInstanceCallback): Unit = js.native
    
    /**
      * Query object for listing backup operations.
      *
      * @typedef {object} GetBackupOperationsOptions
      * @property {string} [filter] An expression for filtering the results of the
      *     request. Filter can be configured as outlined in
      *     {@link v1.DatabaseAdminClient#listBackupOperations}.
      * @property {number} [pageSize] Maximum number of results per page.
      * @property {string} [pageToken] A previously-returned page token
      *     representing part of the larger set of results to view.
      * @property {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * @typedef {array} GetBackupOperationsResponse
      * @property {google.longrunning.IOperation[]} 0 Array of {@link IOperation} instances.
      * @property {object} 1 A query object to receive more results.
      * @property {object} 2 The full API response.
      */
    /**
      * @callback GetBackupOperationsCallback
      * @param {?Error} err Request error, if any.
      * @param {google.longrunning.IOperation[]} 0 Array of {@link IOperation} instances.
      * @param {object} nextQuery A query object to receive more results.
      * @param {object} apiResponse The full API response.
      */
    def getBackupOperations(): js.Promise[GetBackupOperationsResponse] = js.native
    def getBackupOperations(callback: GetBackupOperationsCallback): Unit = js.native
    def getBackupOperations(options: GetBackupOperationsOptions): js.Promise[GetBackupOperationsResponse] = js.native
    def getBackupOperations(options: GetBackupOperationsOptions, callback: GetBackupOperationsCallback): Unit = js.native
    
    /**
      * Query object for listing backups.
      *
      * @typedef {object} GetBackupsOptions
      * @property {string} [filter] An expression for filtering the results of the
      *     request. Filter can be configured as outlined in
      *     {@link v1.DatabaseAdminClient#listBackups}.
      * @property {number} [pageSize] Maximum number of results per page.
      * @property {string} [pageToken] A previously-returned page token
      *     representing part of the larger set of results to view.
      * @property {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * @typedef {array} GetBackupsResponse
      * @property {Backup[]} 0 Array of {@link Backup} instances.
      * @property {object} 1 A query object to receive more results.
      * @property {object} 2 The full API response.
      */
    /**
      * @callback GetBackupsCallback
      * @param {?Error} err Request error, if any.
      * @param {Backup[]} 0 Array of {@link Backup} instances.
      * @param {object} nextQuery A query object to receive more results.
      * @param {object} apiResponse The full API response.
      */
    /**
      * List backups on the instance.
      *
      * Both completed and in-progress backups are listed if no filter is supplied.
      *
      * @see {@link #backup}
      *
      * @param {GetBackupsOptions} [options] The query object for listing backups.
      * @param {gax.CallOptions} [options.gaxOptions] The request configuration
      *     options, See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @returns {Promise<GetBackupsResponse>} When resolved, contains a paged list
      *     of backups.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      * const instance = spanner.instance('my-instance');
      * const [backups] = await instance.getBackups();
      *
      * //-
      * // To manually handle pagination, set autoPaginate:false in gaxOptions.
      * //-
      * let pageToken = undefined;
      * do {
      *   const [backups, , response] = await instance.getBackups({
      *     pageSize: 3,
      *     pageToken,
      *     gaxOptions: {autoPaginate: false},
      *   });
      *   backups.forEach(backup => {
      *     // Do something with backup
      *   });
      *   pageToken = response.nextPageToken;
      * } while (pageToken);
      * ```
      */
    def getBackups(): js.Promise[GetBackupsResponse] = js.native
    def getBackups(callback: GetBackupsCallback): Unit = js.native
    def getBackups(options: GetBackupsOptions): js.Promise[GetBackupsResponse] = js.native
    def getBackups(options: GetBackupsOptions, callback: GetBackupsCallback): Unit = js.native
    
    /**
      * Get a list of backups as a readable object stream.
      *
      * Wrapper around {@link v1.DatabaseAdminClient#listBackups}.
      *
      * @see {@link v1.DatabaseAdminClient#listBackups}
      * @see [ListBackups API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.database.v1#google.spanner.admin.database.v1.DatabaseAdmin.ListBackups)
      *
      * @method Spanner#getBackupsStream
      * @param {GetBackupOptions} [options] Query object for listing backups.
      * @returns {ReadableStream} A readable stream that emits {@link Backup}
      *     instances.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      *
      * instance.getBackupsStream()
      *   .on('error', console.error)
      *   .on('data', function(database) {
      *     // `backups` is a `Backup` object.
      *   })
      *   .on('end', function() {
      *     // All backups retrieved.
      *   });
      *
      * //-
      * // If you anticipate many results, you can end a stream early to prevent
      * // unnecessary processing and API requests.
      * //-
      * instance.getBackupsStream()
      *   .on('data', function(database) {
      *     this.end();
      *   });
      * ```
      */
    def getBackupsStream(): ReadableStream = js.native
    def getBackupsStream(options: GetBackupsOptions): ReadableStream = js.native
    
    /**
      * Query object for listing database operations.
      *
      * @typedef {object} GetDatabaseOperationsOptions
      * @property {string} [filter] An expression for filtering the results of the
      *     request. Filter can be configured as outlined in
      *     {@link v1.DatabaseAdminClient#listDatabaseOperations}.
      * @property {number} [pageSize] Maximum number of results per page.
      * @property {string} [pageToken] A previously-returned page token
      *     representing part of the larger set of results to view.
      * @property {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * @typedef {array} GetDatabaseOperationsResponse
      * @property {google.longrunning.IOperation[]} 0 Array of {@link IOperation} instances.
      * @property {object} 1 A query object to receive more results.
      * @property {object} 2 The full API response.
      */
    /**
      * @callback GetDatabaseOperationsCallback
      * @param {?Error} err Request error, if any.
      * @param {google.longrunning.IOperation[]} 0 Array of {@link IOperation} instances.
      * @param {object} nextQuery A query object to receive more results.
      * @param {object} apiResponse The full API response.
      */
    def getDatabaseOperations(): js.Promise[GetDatabaseOperationsResponse] = js.native
    def getDatabaseOperations(callback: GetDatabaseOperationsCallback): Unit = js.native
    def getDatabaseOperations(options: GetDatabaseOperationsOptions): js.Promise[GetDatabaseOperationsResponse] = js.native
    def getDatabaseOperations(options: GetDatabaseOperationsOptions, callback: GetDatabaseOperationsCallback): Unit = js.native
    
    /**
      * Query object for listing databases.
      *
      * @typedef {object} GetDatabasesRequest
      * @property {number} [pageSize] Maximum number of results per page.
      * @property {string} [pageToken] A previously-returned page token
      *     representing part of the larger set of results to view.
      * @property {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * @typedef {array} GetDatabasesResponse
      * @property {Database[]} 0 Array of {@link Database} instances.
      * @property {object} nextQuery A query object to receive more results.
      * @property {object} apiResponse The full API response.
      */
    /**
      * @callback GetDatabasesCallback
      * @param {?Error} err Request error, if any.
      * @param {Database[]} databases Array of {@link Database} instances.
      * @param {object} nextQuery A query object to receive more results.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Get a list of databases.
      *
      * Wrapper around {@link v1.DatabaseAdminClient#listDatabases}.
      *
      * @see {@link v1.DatabaseAdminClient#listDatabases}
      * @see [ListDatabases API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.database.v1#google.spanner.admin.database.v1.DatabaseAdmin.ListDatabases)
      *
      * @param {GetDatabasesOptions} [options] Query object for listing databases.
      * @param {GetDatabasesCallback} [callback] Callback function.
      * @returns {Promise<GetDatabasesResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      *
      * instance.getDatabases(function(err, databases) {
      *   // `databases` is an array of `Database` objects.
      * });
      *
      * //-
      * // To control how many API requests are made and page through the results
      * // manually, set `autoPaginate` to `false`.
      * //-
      * function callback(err, databases, nextQuery, apiResponse) {
      *   if (nextQuery) {
      *     // More results exist.
      *     instance.getDatabases(nextQuery, callback);
      *   }
      * }
      *
      * instance.getDatabases({
      *   gaxOptions: {autoPaginate: false}
      * }, callback);
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * instance.getDatabases().then(function(data) {
      *   const databases = data[0];
      * });
      * ```
      */
    def getDatabases(): js.Promise[GetDatabasesResponse] = js.native
    def getDatabases(callback: GetDatabasesCallback): Unit = js.native
    def getDatabases(options: GetDatabasesOptions): js.Promise[GetDatabasesResponse] = js.native
    def getDatabases(options: GetDatabasesOptions, callback: GetDatabasesCallback): Unit = js.native
    
    /**
      * Get a list of databases as a readable object stream.
      *
      * Wrapper around {@link v1.DatabaseAdminClient#listDatabases}.
      *
      * @see {@link v1.DatabaseAdminClient#listDatabases}
      * @see [ListDatabases API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.database.v1#google.spanner.admin.database.v1.DatabaseAdmin.ListDatabases)
      *
      * @method Spanner#getDatabasesStream
      * @param {GetDatabasesOptions} [options] Query object for listing databases.
      * @returns {ReadableStream} A readable stream that emits {@link Database}
      *     instances.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      *
      * instance.getDatabasesStream()
      *   .on('error', console.error)
      *   .on('data', function(database) {
      *     // `database` is a `Database` object.
      *   })
      *   .on('end', function() {
      *     // All databases retrieved.
      *   });
      *
      * //-
      * // If you anticipate many results, you can end a stream early to prevent
      * // unnecessary processing and API requests.
      * //-
      * instance.getDatabasesStream()
      *   .on('data', function(database) {
      *     this.end();
      *   });
      * ```
      */
    def getDatabasesStream(): ReadableStream = js.native
    def getDatabasesStream(options: GetDatabasesOptions): ReadableStream = js.native
    
    /**
      * @typedef {array} GetInstanceMetadataResponse
      * @property {object} 0 The {@link Instance} metadata.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback GetInstanceMetadataCallback
      * @param {?Error} err Request error, if any.
      * @param {object} metadata The {@link Instance} metadata.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Get the instance's metadata.
      *
      * Wrapper around {@link v1.InstanceAdminClient#getInstance}.
      *
      * @see {@link v1.InstanceAdminClient#getInstance}
      * @see [GetInstance API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.instance.v1#google.spanner.admin.instance.v1.InstanceAdmin.GetInstance)
      *
      * @param {GetInstanceMetadataOptions} [options] Configuration object
      * @param {string | string[]} [options.fieldNames] A list of `Instance` field
      *     names to be requested. Eligible values are: `name`, `displayName`,
      *     `endpointUris`, `labels`, `config`, `nodeCount`, `state`.
      * @param {GetInstanceMetadataCallback} [callback] Callback function.
      * @returns {Promise<GetInstanceMetadataResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      *
      * instance.getMetadata(function(err, metadata, apiResponse) {});
      *
      * //-
      * // Request only `displayName`.
      * //-
      * instance.getMetadata({fieldNames: 'displayName'}, (err, metadata, apiResponse) => {
      *   // metadata will only contain value for `displayName`
      *   const displayName = metadata['displayName'];
      * })
      *
      * //-
      * // Request multiple specific field names.
      * //-
      * instance.getMetadata({fieldNames: ['displayName', 'nodeCount']}, (err, metadata, apiResponse) => {
      *   // metadata will only contain value for `displayName` and 'nodeCount'
      *   const displayName = metadata['displayName'];
      *   const nodeCount = metadata['nodeCount'];
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * instance.getMetadata().then(function(data) {
      *   const metadata = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def getMetadata(): js.Promise[GetInstanceMetadataResponse] = js.native
    def getMetadata(callback: GetInstanceMetadataCallback): Unit = js.native
    def getMetadata(options: GetInstanceMetadataOptions): js.Promise[GetInstanceMetadataResponse] = js.native
    def getMetadata(options: GetInstanceMetadataOptions, callback: GetInstanceMetadataCallback): Unit = js.native
    
    var metadata: js.UndefOr[IInstance] = js.native
    
    def request(config: RequestConfig, callback: ResourceCallback[Operation_, IOperation]): Unit = js.native
    def request[T](config: RequestConfig, callback: RequestCallback[T, Unit]): Unit = js.native
    
    def requestStream(config: RequestConfig): Duplex = js.native
    
    @JSName("request")
    var request_Original: InstanceRequest = js.native
    @JSName("request")
    def request_TR[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
    
    var resourceHeader_ : StringDictionary[String] = js.native
    
    /**
      * Update the metadata for this instance. Note that this method follows PATCH
      * semantics, so previously-configured settings will persist.
      *
      * Wrapper around {@link v1.InstanceAdminClient#updateInstance}.
      *
      * @see {@link v1.InstanceAdminClient#updateInstance}
      * @see [UpdateInstance API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.instance.v1#google.spanner.admin.instance.v1.InstanceAdmin.UpdateInstance)
      *
      * @param {object} metadata The metadata you wish to set.
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {SetInstanceMetadataCallback} [callback] Callback function.
      * @returns {Promise<LongRunningOperationResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      *
      * const metadata = {
      *   displayName: 'My Instance'
      * };
      *
      * instance.setMetadata(metadata, function(err, operation, apiResponse) {
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
      * instance.setMetadata(metadata).then(function(data) {
      *   const operation = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def setMetadata(metadata: IInstance): js.Promise[SetInstanceMetadataResponse] = js.native
    def setMetadata(metadata: IInstance, callback: SetInstanceMetadataCallback): Unit = js.native
    def setMetadata(metadata: IInstance, gaxOptions: CallOptions): js.Promise[SetInstanceMetadataResponse] = js.native
    def setMetadata(metadata: IInstance, gaxOptions: CallOptions, callback: SetInstanceMetadataCallback): Unit = js.native
  }
  
  @js.native
  trait InstanceRequest extends StObject {
    
    def apply(config: RequestConfig, callback: ResourceCallback[Operation_, IOperation]): Unit = js.native
    def apply[T](config: RequestConfig, callback: RequestCallback[T, Unit]): Unit = js.native
  }
  
  type SetInstanceMetadataCallback = ResourceCallback[Operation_, IOperation]
  
  type SetInstanceMetadataResponse = js.Tuple2[Operation_, IOperation]
}
