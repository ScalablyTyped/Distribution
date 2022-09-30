package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.Backup.State
import typings.long.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Backup. */
trait IBackup extends StObject {
  
  /** Backup createTime */
  var createTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** Backup database */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /** Backup databaseDialect */
  var databaseDialect: js.UndefOr[
    DatabaseDialect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.DatabaseDialect * / any */ String) | Null
  ] = js.undefined
  
  /** Backup encryptionInfo */
  var encryptionInfo: js.UndefOr[IEncryptionInfo | Null] = js.undefined
  
  /** Backup expireTime */
  var expireTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** Backup maxExpireTime */
  var maxExpireTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** Backup name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Backup referencingBackups */
  var referencingBackups: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** Backup referencingDatabases */
  var referencingDatabases: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** Backup sizeBytes */
  var sizeBytes: js.UndefOr[Double | ^ | String | Null] = js.undefined
  
  /** Backup state */
  var state: js.UndefOr[
    State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.Backup.State * / any */ String) | Null
  ] = js.undefined
  
  /** Backup versionTime */
  var versionTime: js.UndefOr[ITimestamp | Null] = js.undefined
}
object IBackup {
  
  inline def apply(): IBackup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBackup]
  }
  
  extension [Self <: IBackup](x: Self) {
    
    inline def setCreateTime(value: ITimestamp): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseDialect(
      value: DatabaseDialect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.DatabaseDialect * / any */ String)
    ): Self = StObject.set(x, "databaseDialect", value.asInstanceOf[js.Any])
    
    inline def setDatabaseDialectNull: Self = StObject.set(x, "databaseDialect", null)
    
    inline def setDatabaseDialectUndefined: Self = StObject.set(x, "databaseDialect", js.undefined)
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setEncryptionInfo(value: IEncryptionInfo): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInfoNull: Self = StObject.set(x, "encryptionInfo", null)
    
    inline def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
    
    inline def setExpireTime(value: ITimestamp): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setMaxExpireTime(value: ITimestamp): Self = StObject.set(x, "maxExpireTime", value.asInstanceOf[js.Any])
    
    inline def setMaxExpireTimeNull: Self = StObject.set(x, "maxExpireTime", null)
    
    inline def setMaxExpireTimeUndefined: Self = StObject.set(x, "maxExpireTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReferencingBackups(value: js.Array[String]): Self = StObject.set(x, "referencingBackups", value.asInstanceOf[js.Any])
    
    inline def setReferencingBackupsNull: Self = StObject.set(x, "referencingBackups", null)
    
    inline def setReferencingBackupsUndefined: Self = StObject.set(x, "referencingBackups", js.undefined)
    
    inline def setReferencingBackupsVarargs(value: String*): Self = StObject.set(x, "referencingBackups", js.Array(value*))
    
    inline def setReferencingDatabases(value: js.Array[String]): Self = StObject.set(x, "referencingDatabases", value.asInstanceOf[js.Any])
    
    inline def setReferencingDatabasesNull: Self = StObject.set(x, "referencingDatabases", null)
    
    inline def setReferencingDatabasesUndefined: Self = StObject.set(x, "referencingDatabases", js.undefined)
    
    inline def setReferencingDatabasesVarargs(value: String*): Self = StObject.set(x, "referencingDatabases", js.Array(value*))
    
    inline def setSizeBytes(value: Double | ^ | String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesNull: Self = StObject.set(x, "sizeBytes", null)
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
    
    inline def setState(
      value: State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.Backup.State * / any */ String)
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVersionTime(value: ITimestamp): Self = StObject.set(x, "versionTime", value.asInstanceOf[js.Any])
    
    inline def setVersionTimeNull: Self = StObject.set(x, "versionTime", null)
    
    inline def setVersionTimeUndefined: Self = StObject.set(x, "versionTime", js.undefined)
  }
}
