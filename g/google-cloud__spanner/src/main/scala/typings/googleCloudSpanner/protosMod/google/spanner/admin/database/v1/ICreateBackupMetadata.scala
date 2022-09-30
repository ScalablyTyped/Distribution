package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateBackupMetadata. */
trait ICreateBackupMetadata extends StObject {
  
  /** CreateBackupMetadata cancelTime */
  var cancelTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** CreateBackupMetadata database */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /** CreateBackupMetadata name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** CreateBackupMetadata progress */
  var progress: js.UndefOr[IOperationProgress | Null] = js.undefined
}
object ICreateBackupMetadata {
  
  inline def apply(): ICreateBackupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateBackupMetadata]
  }
  
  extension [Self <: ICreateBackupMetadata](x: Self) {
    
    inline def setCancelTime(value: ITimestamp): Self = StObject.set(x, "cancelTime", value.asInstanceOf[js.Any])
    
    inline def setCancelTimeNull: Self = StObject.set(x, "cancelTime", null)
    
    inline def setCancelTimeUndefined: Self = StObject.set(x, "cancelTime", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProgress(value: IOperationProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressNull: Self = StObject.set(x, "progress", null)
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
