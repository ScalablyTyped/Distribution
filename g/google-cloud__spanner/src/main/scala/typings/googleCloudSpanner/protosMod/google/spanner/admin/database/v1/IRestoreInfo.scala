package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RestoreInfo. */
trait IRestoreInfo extends StObject {
  
  /** RestoreInfo backupInfo */
  var backupInfo: js.UndefOr[IBackupInfo | Null] = js.undefined
  
  /** RestoreInfo sourceType */
  var sourceType: js.UndefOr[
    RestoreSourceType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.RestoreSourceType * / any */ String) | Null
  ] = js.undefined
}
object IRestoreInfo {
  
  inline def apply(): IRestoreInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRestoreInfo]
  }
  
  extension [Self <: IRestoreInfo](x: Self) {
    
    inline def setBackupInfo(value: IBackupInfo): Self = StObject.set(x, "backupInfo", value.asInstanceOf[js.Any])
    
    inline def setBackupInfoNull: Self = StObject.set(x, "backupInfo", null)
    
    inline def setBackupInfoUndefined: Self = StObject.set(x, "backupInfo", js.undefined)
    
    inline def setSourceType(
      value: RestoreSourceType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.RestoreSourceType * / any */ String)
    ): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeNull: Self = StObject.set(x, "sourceType", null)
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
  }
}
