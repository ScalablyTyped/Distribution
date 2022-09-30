package typings.googleCloudSpanner

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPreciseDate.mod.PreciseDate
import typings.googleCloudSpanner.commonMod.IOperation
import typings.googleCloudSpanner.commonMod.LongRunningCallback
import typings.googleCloudSpanner.commonMod.NormalCallback
import typings.googleCloudSpanner.commonMod.RequestCallback
import typings.googleCloudSpanner.commonMod.ResourceCallback
import typings.googleCloudSpanner.instanceMod.Instance
import typings.googleCloudSpanner.mod.EnumKey
import typings.googleCloudSpanner.mod.RequestConfig
import typings.googleCloudSpanner.protosMod.google.protobuf.IEmpty
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.Backup.State
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseDialect
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IBackup
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.ICopyBackupMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.ICopyBackupRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.ICreateBackupEncryptionConfig
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.ICreateBackupMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IEncryptionInfo
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.grpcMod.Metadata
import typings.googleGax.mod.Operation_
import typings.long.mod.^
import typings.protobufjs.mod.common.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backupMod {
  
  /**
    * The {@link Backup} class represents a Cloud Spanner backup.
    *
    * Create a `Backup` object to interact with or create a Cloud Spanner backup or copy a backup.
    *
    * @class
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    * const instance = spanner.instance('my-instance');
    * const backup = instance.backup('my-backup');
    * ```
    *
    * ```
    * * @example
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    * const instance = spanner.instance('my-instance');
    * const sourceBackup = instance.backup('my-source-backup');
    * const copyBackup = instance.copyBackup('my-copy-backup', 'my-source-backup');
    * ```
    */
  @JSImport("@google-cloud/spanner/build/src/backup", "Backup")
  @js.native
  open class Backup protected () extends StObject {
    def this(instance: Instance, name: String) = this()
    def this(instance: Instance, name: String, sourceName: String) = this()
    
    def create(options: CopyBackupOptions): js.Promise[CopyBackupResponse | CreateBackupResponse] = js.native
    def create(options: CopyBackupOptions, callback: CopyBackupCallback | CreateBackupCallback): Unit = js.native
    /**
      * @typedef {object} CreateBackupOptions
      * @property {string} databasePath The database path.
      * @property {string|number|google.protobuf.Timestamp|external:PreciseDate}
      *     expireTime The expire time of the backup.
      * @property {string|number|google.protobuf.Timestamp|external:PreciseDate}
      *     versionTime Take a backup of the state of the database at this time.
      * @property {google.spanner.admin.database.v1.ICreateBackupEncryptionConfig}
      *     encryptionConfig An encryption configuration describing the
      *     encryption type and key resources in Cloud KMS to be used to encrypt
      *     the backup.
      * @property {object} [gaxOptions] The request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * @typedef {array} CreateBackupResponse
      * @property {Backup} 0 The new {@link Backup}.
      * @property {google.longrunning.Operation} 1 An {@link Operation} object that can be used to check
      *     the status of the request.
      * @property {object} 2 The full API response.
      */
    /**
      * @callback CreateBackupCallback
      * @param {?Error} err Request error, if any.
      * @param {Backup} backup The new {@link Backup}.
      * @param {google.longrunning.Operation} operation An {@link Operation} object that can be used to
      *     check the status of the request.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Create a backup.
      *
      * @method Backup#create
      * @param {CreateBackupOptions} options Parameters for creating a backup.
      * @param {CallOptions} [options.gaxOptions] The request configuration
      *     options, See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {CreateBackupCallback} [callback] Callback function.
      * @returns {Promise<CreateBackupResponse>} When resolved, the backup
      *     operation will have started, but will not have necessarily completed.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      * const instance = spanner.instance('my-instance');
      * const oneDay = 1000 * 60 * 60 * 24;
      * const expireTime = Date.now() + oneDay;
      * const versionTime = Date.now() - oneDay;
      * const backup = instance.backup('my-backup');
      * const [, backupOperation] = await backup.create({
      *   databasePath: 'projects/my-project/instances/my-instance/databases/my-database',
      *   expireTime: expireTime,
      *   versionTime: versionTime,
      *   encryptionConfig: {
      *     encryptionType: 'CUSTOMER_MANAGED_ENCRYPTION',
      *     kmsKeyName: 'projects/my-project-id/my-region/keyRings/my-key-ring/cryptoKeys/my-key',
      *   },
      * });
      * // Await completion of the backup operation.
      * await backupOperation.promise();
      * ```
      */
    def create(options: CreateBackupOptions): js.Promise[CopyBackupResponse | CreateBackupResponse] = js.native
    def create(options: CreateBackupOptions, callback: CopyBackupCallback | CreateBackupCallback): Unit = js.native
    
    /**
      * Deletes a backup.
      *
      * @method Backup#delete
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {DeleteBackupCallback} [callback] Callback function.
      * @returns {Promise<void>} When resolved, the backup will have been deleted.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      * const instance = spanner.instance('my-instance');
      * const backup = instance.backup('my-backup');
      * await backup.delete();
      * ```
      */
    def delete(): js.Promise[IEmpty] = js.native
    def delete(callback: DeleteCallback): Unit = js.native
    def delete(gaxOptions: CallOptions): js.Promise[IEmpty] = js.native
    def delete(gaxOptions: CallOptions, callback: DeleteCallback): Unit = js.native
    
    /**
      * Checks whether the backup exists.
      *
      * @see {@link #getMetadata}
      *
      * @method Backup#exists
      * @returns {Promise<boolean>} When resolved, contains true if the backup
      *     exists and false if it does not exist.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      * const instance = spanner.instance('my-instance');
      * const backup = instance.backup('my-backup');
      * const alreadyExists = await backup.exists();
      * console.log(`Does backup exist? ${alreadyExists}`);
      * ```
      */
    def exists(): js.Promise[Boolean] = js.native
    def exists(callback: ExistsCallback): Unit = js.native
    
    var formattedName_ : String = js.native
    
    /**
      * Retrieves the expiry time of the backup.
      *
      * @see {@link #updateExpireTime}
      * @see {@link #getMetadata}
      *
      * @method Backup#getExpireTime
      * @returns {Promise<external:PreciseDate>} When resolved, contains the
      *     current expire time of the backup if it exists.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      * const instance = spanner.instance('my-instance');
      * const backup = instance.backup('my-backup');
      * const expireTime = await backup.getExpireTime();
      * console.log(`Backup expires on ${expireTime.toISOString()}`);
      * ```
      */
    def getExpireTime(): js.Promise[js.UndefOr[PreciseDate]] = js.native
    def getExpireTime(callback: GetExpireTimeCallback): Unit = js.native
    
    /**
      * @typedef {array} GetMetadataResponse
      * @property {object} 0 The {@link Backup} metadata.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback GetMetadataCallback
      * @param {?Error} err Request error, if any.
      * @param {object} metadata The {@link Backup} metadata.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Retrieves backup's metadata.
      *
      * @see {@link #getState}
      * @see {@link #getExpireTime}
      *
      * @method Backup#getMetadata
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {GetMetadataCallback} [callback] Callback function.
      * @returns {Promise<GetMetadataResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      * const instance = spanner.instance('my-instance');
      * const backup = instance.backup('my-backup');
      * const [backupInfo] = await backup.getMetadata();
      * console.log(`${backupInfo.name}: size=${backupInfo.sizeBytes}`);
      * ```
      */
    def getMetadata(): js.Promise[GetMetadataResponse] = js.native
    def getMetadata(callback: GetMetadataCallback): Unit = js.native
    def getMetadata(gaxOptions: CallOptions): js.Promise[GetMetadataResponse] = js.native
    def getMetadata(gaxOptions: CallOptions, callback: GetMetadataCallback): Unit = js.native
    
    /**
      * Retrieves the state of the backup.
      *
      * The backup state indicates if the backup has completed.
      *
      * @see {@link #getMetadata}
      *
      * @method Backup#getState
      * @param {GetStateCallback} [callback] Callback function.
      * @returns {Promise<EnumKey<typeof, databaseAdmin.spanner.admin.database.v1.Backup.State> | undefined>}
      *     When resolved, contains the current state of the backup if it exists.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      * const instance = spanner.instance('my-instance');
      * const backup = instance.backup('my-backup');
      * const state = await backup.getState();
      * const backupCompleted = (state === 'READY');
      * ```
      */
    def getState(): js.Promise[
        js.UndefOr[
          (EnumKey[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
          ]) | Null
        ]
      ] = js.native
    def getState(callback: GetStateCallback): Unit = js.native
    
    var id: String = js.native
    
    var instanceFormattedName_ : String = js.native
    
    var metadata: js.UndefOr[IBackup] = js.native
    
    def request(config: RequestConfig, callback: ResourceCallback[Operation_, IOperation]): Unit = js.native
    def request[T](config: RequestConfig, callback: RequestCallback[T, Unit]): Unit = js.native
    @JSName("request")
    var request_Original: BackupRequest = js.native
    
    var resourceHeader_ : StringDictionary[String] = js.native
    
    var sourceName: js.UndefOr[String] = js.native
    
    /**
      * @callback UpdateExpireTimeCallback
      * @param {?Error} err Request error, if any.
      * @param {google.spanner.admin.database.v1.IBackup} backup The updated
      *     backup.
      */
    /**
      * Sets the expiry time of a backup.
      *
      * @see {@link #getExpireTime}
      *
      * @method Backup#updateExpireTime
      * @param {string|number|google.protobuf.Timestamp|external:PreciseDate}
      *     expireTime The expiry time to update with.
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {UpdateExpireTimeCallback} [callback] Callback function.
      * @returns {Promise<google.spanner.admin.database.v1.IBackup>} When resolved,
      *     the backup's expire time will have been updated.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      * const instance = spanner.instance('my-instance');
      * const backup = instance.backup('my-backup');
      * const oneDay = 1000 * 60 * 60 * 24;
      * const newExpireTime = Spanner.timestamp(Date.now() + oneDay);
      * await backup.updateExpireTime(newExpireTime);
      * ```
      */
    def updateExpireTime(expireTime: String): js.Promise[IBackup] = js.native
    def updateExpireTime(expireTime: String, callback: UpdateExpireTimeCallback): Unit = js.native
    def updateExpireTime(expireTime: String, gaxOptions: CallOptions): js.Promise[IBackup] = js.native
    def updateExpireTime(expireTime: String, gaxOptions: CallOptions, callback: UpdateExpireTimeCallback): Unit = js.native
    def updateExpireTime(expireTime: Double): js.Promise[IBackup] = js.native
    def updateExpireTime(expireTime: Double, callback: UpdateExpireTimeCallback): Unit = js.native
    def updateExpireTime(expireTime: Double, gaxOptions: CallOptions): js.Promise[IBackup] = js.native
    def updateExpireTime(expireTime: Double, gaxOptions: CallOptions, callback: UpdateExpireTimeCallback): Unit = js.native
    def updateExpireTime(expireTime: PreciseDate): js.Promise[IBackup] = js.native
    def updateExpireTime(expireTime: PreciseDate, callback: UpdateExpireTimeCallback): Unit = js.native
    def updateExpireTime(expireTime: PreciseDate, gaxOptions: CallOptions): js.Promise[IBackup] = js.native
    def updateExpireTime(expireTime: PreciseDate, gaxOptions: CallOptions, callback: UpdateExpireTimeCallback): Unit = js.native
    def updateExpireTime(expireTime: ITimestamp): js.Promise[IBackup] = js.native
    def updateExpireTime(expireTime: ITimestamp, callback: UpdateExpireTimeCallback): Unit = js.native
    def updateExpireTime(expireTime: ITimestamp, gaxOptions: CallOptions): js.Promise[IBackup] = js.native
    def updateExpireTime(expireTime: ITimestamp, gaxOptions: CallOptions, callback: UpdateExpireTimeCallback): Unit = js.native
  }
  object Backup {
    
    @JSImport("@google-cloud/spanner/build/src/backup", "Backup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Format the backup name to include the instance name.
      *
      * @private
      *
      * @param {string} instanceName The formatted instance name.
      * @param {string} name The table name.
      * @returns {string}
      *
      * @example
      * ```
      * Backup.formatName_(
      *   'projects/grape-spaceship-123/instances/my-instance',
      *   'my-backup'
      * );
      * // 'projects/grape-spaceship-123/instances/my-instance/backups/my-backup'
      * ```
      */
    /* static member */
    inline def formatName(instanceName: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(instanceName.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @js.native
  trait BackupRequest extends StObject {
    
    def apply(config: RequestConfig, callback: ResourceCallback[Operation_, IOperation]): Unit = js.native
    def apply[T](config: RequestConfig, callback: RequestCallback[T, Unit]): Unit = js.native
  }
  
  type CopyBackupCallback = LongRunningCallback[Backup]
  
  @js.native
  trait CopyBackupGaxOperation extends Operation_ {
    
    @JSName("metadata")
    var metadata_CopyBackupGaxOperation: Metadata & ICopyBackupMetadata = js.native
  }
  
  trait CopyBackupOptions
    extends StObject
       with ICopyBackupRequest {
    
    var gaxOptions: js.UndefOr[CallOptions] = js.undefined
  }
  object CopyBackupOptions {
    
    inline def apply(): CopyBackupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyBackupOptions]
    }
    
    extension [Self <: CopyBackupOptions](x: Self) {
      
      inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
      
      inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
    }
  }
  
  type CopyBackupResponse = js.Tuple3[Backup, CopyBackupGaxOperation, IOperation]
  
  type CreateBackupCallback = LongRunningCallback[Backup]
  
  @js.native
  trait CreateBackupGaxOperation extends Operation_ {
    
    @JSName("metadata")
    var metadata_CreateBackupGaxOperation: Metadata & ICreateBackupMetadata = js.native
  }
  
  trait CreateBackupOptions extends StObject {
    
    var databasePath: String
    
    var encryptionConfig: js.UndefOr[ICreateBackupEncryptionConfig] = js.undefined
    
    var expireTime: String | Double | ITimestamp | PreciseDate
    
    var gaxOptions: js.UndefOr[CallOptions] = js.undefined
    
    var versionTime: js.UndefOr[String | Double | ITimestamp | PreciseDate] = js.undefined
  }
  object CreateBackupOptions {
    
    inline def apply(databasePath: String, expireTime: String | Double | ITimestamp | PreciseDate): CreateBackupOptions = {
      val __obj = js.Dynamic.literal(databasePath = databasePath.asInstanceOf[js.Any], expireTime = expireTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateBackupOptions]
    }
    
    extension [Self <: CreateBackupOptions](x: Self) {
      
      inline def setDatabasePath(value: String): Self = StObject.set(x, "databasePath", value.asInstanceOf[js.Any])
      
      inline def setEncryptionConfig(value: ICreateBackupEncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
      
      inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
      
      inline def setExpireTime(value: String | Double | ITimestamp | PreciseDate): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
      
      inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
      
      inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
      
      inline def setVersionTime(value: String | Double | ITimestamp | PreciseDate): Self = StObject.set(x, "versionTime", value.asInstanceOf[js.Any])
      
      inline def setVersionTimeUndefined: Self = StObject.set(x, "versionTime", js.undefined)
    }
  }
  
  type CreateBackupResponse = js.Tuple3[Backup, CreateBackupGaxOperation, IOperation]
  
  type DeleteCallback = RequestCallback[IEmpty, Unit]
  
  type ExistsCallback = NormalCallback[Boolean]
  
  type GetExpireTimeCallback = NormalCallback[PreciseDate]
  
  type GetMetadataCallback = RequestCallback[IBackupTranslatedEnum, Unit]
  
  type GetMetadataResponse = js.Array[IBackupTranslatedEnum]
  
  type GetStateCallback = NormalCallback[
    EnumKey[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
    ]
  ]
  
  /**
    * IBackup structure with backup state enum translated to string form.
    */
  /* Inlined @google-cloud/spanner.@google-cloud/spanner.TranslateEnumKeys<@google-cloud/spanner.@google-cloud/spanner/build/protos/protos.google.spanner.admin.database.v1.IBackup, 'state', / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State * / any> */
  trait IBackupTranslatedEnum extends StObject {
    
    var createTime: js.UndefOr[
        typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
        ])
      ] = js.undefined
    
    var database: js.UndefOr[
        String | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
        ])
      ] = js.undefined
    
    var databaseDialect: js.UndefOr[
        DatabaseDialect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.DatabaseDialect * / any */ String) | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
        ])
      ] = js.undefined
    
    var encryptionInfo: js.UndefOr[
        IEncryptionInfo | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
        ])
      ] = js.undefined
    
    var expireTime: js.UndefOr[
        typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
        ])
      ] = js.undefined
    
    var maxExpireTime: js.UndefOr[
        typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
        ])
      ] = js.undefined
    
    var name: js.UndefOr[
        String | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
        ])
      ] = js.undefined
    
    var referencingBackups: js.UndefOr[
        js.Array[String] | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
        ])
      ] = js.undefined
    
    var referencingDatabases: js.UndefOr[
        js.Array[String] | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
        ])
      ] = js.undefined
    
    var sizeBytes: js.UndefOr[
        Double | ^ | String | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
        ])
      ] = js.undefined
    
    var state: js.UndefOr[
        State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.Backup.State * / any */ String) | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
        ])
      ] = js.undefined
    
    var versionTime: js.UndefOr[
        typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
        ])
      ] = js.undefined
  }
  object IBackupTranslatedEnum {
    
    inline def apply(): IBackupTranslatedEnum = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBackupTranslatedEnum]
    }
    
    extension [Self <: IBackupTranslatedEnum](x: Self) {
      
      inline def setCreateTime(
        value: typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
            ])
      ): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
      
      inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
      
      inline def setDatabase(
        value: String | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
            ])
      ): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseDialect(
        value: DatabaseDialect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.DatabaseDialect * / any */ String) | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
            ])
      ): Self = StObject.set(x, "databaseDialect", value.asInstanceOf[js.Any])
      
      inline def setDatabaseDialectNull: Self = StObject.set(x, "databaseDialect", null)
      
      inline def setDatabaseDialectUndefined: Self = StObject.set(x, "databaseDialect", js.undefined)
      
      inline def setDatabaseNull: Self = StObject.set(x, "database", null)
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setEncryptionInfo(
        value: IEncryptionInfo | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
            ])
      ): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
      
      inline def setEncryptionInfoNull: Self = StObject.set(x, "encryptionInfo", null)
      
      inline def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
      
      inline def setExpireTime(
        value: typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
            ])
      ): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
      
      inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
      
      inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
      
      inline def setMaxExpireTime(
        value: typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
            ])
      ): Self = StObject.set(x, "maxExpireTime", value.asInstanceOf[js.Any])
      
      inline def setMaxExpireTimeNull: Self = StObject.set(x, "maxExpireTime", null)
      
      inline def setMaxExpireTimeUndefined: Self = StObject.set(x, "maxExpireTime", js.undefined)
      
      inline def setName(
        value: String | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
            ])
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReferencingBackups(
        value: js.Array[String] | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
            ])
      ): Self = StObject.set(x, "referencingBackups", value.asInstanceOf[js.Any])
      
      inline def setReferencingBackupsNull: Self = StObject.set(x, "referencingBackups", null)
      
      inline def setReferencingBackupsUndefined: Self = StObject.set(x, "referencingBackups", js.undefined)
      
      inline def setReferencingBackupsVarargs(value: String*): Self = StObject.set(x, "referencingBackups", js.Array(value*))
      
      inline def setReferencingDatabases(
        value: js.Array[String] | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
            ])
      ): Self = StObject.set(x, "referencingDatabases", value.asInstanceOf[js.Any])
      
      inline def setReferencingDatabasesNull: Self = StObject.set(x, "referencingDatabases", null)
      
      inline def setReferencingDatabasesUndefined: Self = StObject.set(x, "referencingDatabases", js.undefined)
      
      inline def setReferencingDatabasesVarargs(value: String*): Self = StObject.set(x, "referencingDatabases", js.Array(value*))
      
      inline def setSizeBytes(
        value: Double | ^ | String | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
            ])
      ): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
      
      inline def setSizeBytesNull: Self = StObject.set(x, "sizeBytes", null)
      
      inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
      
      inline def setState(
        value: State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.Backup.State * / any */ String) | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
            ])
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateNull: Self = StObject.set(x, "state", null)
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setVersionTime(
        value: typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Backup.State */ Any
            ])
      ): Self = StObject.set(x, "versionTime", value.asInstanceOf[js.Any])
      
      inline def setVersionTimeNull: Self = StObject.set(x, "versionTime", null)
      
      inline def setVersionTimeUndefined: Self = StObject.set(x, "versionTime", js.undefined)
    }
  }
  
  type UpdateExpireTimeCallback = RequestCallback[IBackup, Unit]
}
