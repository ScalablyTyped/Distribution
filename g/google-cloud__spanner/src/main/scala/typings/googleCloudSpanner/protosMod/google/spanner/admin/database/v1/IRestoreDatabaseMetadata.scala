package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RestoreDatabaseMetadata. */
trait IRestoreDatabaseMetadata extends StObject {
  
  /** RestoreDatabaseMetadata backupInfo */
  var backupInfo: js.UndefOr[IBackupInfo | Null] = js.undefined
  
  /** RestoreDatabaseMetadata cancelTime */
  var cancelTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** RestoreDatabaseMetadata name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** RestoreDatabaseMetadata optimizeDatabaseOperationName */
  var optimizeDatabaseOperationName: js.UndefOr[String | Null] = js.undefined
  
  /** RestoreDatabaseMetadata progress */
  var progress: js.UndefOr[IOperationProgress | Null] = js.undefined
  
  /** RestoreDatabaseMetadata sourceType */
  var sourceType: js.UndefOr[
    RestoreSourceType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.RestoreSourceType * / any */ String) | Null
  ] = js.undefined
}
object IRestoreDatabaseMetadata {
  
  inline def apply(): IRestoreDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRestoreDatabaseMetadata]
  }
  
  extension [Self <: IRestoreDatabaseMetadata](x: Self) {
    
    inline def setBackupInfo(value: IBackupInfo): Self = StObject.set(x, "backupInfo", value.asInstanceOf[js.Any])
    
    inline def setBackupInfoNull: Self = StObject.set(x, "backupInfo", null)
    
    inline def setBackupInfoUndefined: Self = StObject.set(x, "backupInfo", js.undefined)
    
    inline def setCancelTime(value: ITimestamp): Self = StObject.set(x, "cancelTime", value.asInstanceOf[js.Any])
    
    inline def setCancelTimeNull: Self = StObject.set(x, "cancelTime", null)
    
    inline def setCancelTimeUndefined: Self = StObject.set(x, "cancelTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptimizeDatabaseOperationName(value: String): Self = StObject.set(x, "optimizeDatabaseOperationName", value.asInstanceOf[js.Any])
    
    inline def setOptimizeDatabaseOperationNameNull: Self = StObject.set(x, "optimizeDatabaseOperationName", null)
    
    inline def setOptimizeDatabaseOperationNameUndefined: Self = StObject.set(x, "optimizeDatabaseOperationName", js.undefined)
    
    inline def setProgress(value: IOperationProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressNull: Self = StObject.set(x, "progress", null)
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setSourceType(
      value: RestoreSourceType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.RestoreSourceType * / any */ String)
    ): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeNull: Self = StObject.set(x, "sourceType", null)
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
  }
}
