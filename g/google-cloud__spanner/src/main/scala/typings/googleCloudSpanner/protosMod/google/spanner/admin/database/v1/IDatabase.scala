package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.Database.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Database. */
trait IDatabase extends StObject {
  
  /** Database createTime */
  var createTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** Database databaseDialect */
  var databaseDialect: js.UndefOr[
    DatabaseDialect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.DatabaseDialect * / any */ String) | Null
  ] = js.undefined
  
  /** Database defaultLeader */
  var defaultLeader: js.UndefOr[String | Null] = js.undefined
  
  /** Database earliestVersionTime */
  var earliestVersionTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** Database encryptionConfig */
  var encryptionConfig: js.UndefOr[IEncryptionConfig | Null] = js.undefined
  
  /** Database encryptionInfo */
  var encryptionInfo: js.UndefOr[js.Array[IEncryptionInfo] | Null] = js.undefined
  
  /** Database name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Database restoreInfo */
  var restoreInfo: js.UndefOr[IRestoreInfo | Null] = js.undefined
  
  /** Database state */
  var state: js.UndefOr[
    State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.Database.State * / any */ String) | Null
  ] = js.undefined
  
  /** Database versionRetentionPeriod */
  var versionRetentionPeriod: js.UndefOr[String | Null] = js.undefined
}
object IDatabase {
  
  inline def apply(): IDatabase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatabase]
  }
  
  extension [Self <: IDatabase](x: Self) {
    
    inline def setCreateTime(value: ITimestamp): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDatabaseDialect(
      value: DatabaseDialect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.DatabaseDialect * / any */ String)
    ): Self = StObject.set(x, "databaseDialect", value.asInstanceOf[js.Any])
    
    inline def setDatabaseDialectNull: Self = StObject.set(x, "databaseDialect", null)
    
    inline def setDatabaseDialectUndefined: Self = StObject.set(x, "databaseDialect", js.undefined)
    
    inline def setDefaultLeader(value: String): Self = StObject.set(x, "defaultLeader", value.asInstanceOf[js.Any])
    
    inline def setDefaultLeaderNull: Self = StObject.set(x, "defaultLeader", null)
    
    inline def setDefaultLeaderUndefined: Self = StObject.set(x, "defaultLeader", js.undefined)
    
    inline def setEarliestVersionTime(value: ITimestamp): Self = StObject.set(x, "earliestVersionTime", value.asInstanceOf[js.Any])
    
    inline def setEarliestVersionTimeNull: Self = StObject.set(x, "earliestVersionTime", null)
    
    inline def setEarliestVersionTimeUndefined: Self = StObject.set(x, "earliestVersionTime", js.undefined)
    
    inline def setEncryptionConfig(value: IEncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigNull: Self = StObject.set(x, "encryptionConfig", null)
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setEncryptionInfo(value: js.Array[IEncryptionInfo]): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInfoNull: Self = StObject.set(x, "encryptionInfo", null)
    
    inline def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
    
    inline def setEncryptionInfoVarargs(value: IEncryptionInfo*): Self = StObject.set(x, "encryptionInfo", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRestoreInfo(value: IRestoreInfo): Self = StObject.set(x, "restoreInfo", value.asInstanceOf[js.Any])
    
    inline def setRestoreInfoNull: Self = StObject.set(x, "restoreInfo", null)
    
    inline def setRestoreInfoUndefined: Self = StObject.set(x, "restoreInfo", js.undefined)
    
    inline def setState(
      value: State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.Database.State * / any */ String)
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVersionRetentionPeriod(value: String): Self = StObject.set(x, "versionRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setVersionRetentionPeriodNull: Self = StObject.set(x, "versionRetentionPeriod", null)
    
    inline def setVersionRetentionPeriodUndefined: Self = StObject.set(x, "versionRetentionPeriod", js.undefined)
  }
}
