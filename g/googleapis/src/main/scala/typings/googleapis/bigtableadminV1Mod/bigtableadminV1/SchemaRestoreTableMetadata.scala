package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata type for the long-running operation returned by RestoreTable.
  */
trait SchemaRestoreTableMetadata extends StObject {
  
  var backupInfo: js.UndefOr[SchemaBackupInfo] = js.undefined
  
  /**
    * Name of the table being created and restored to.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If exists, the name of the long-running operation that will be used to track the post-restore optimization process to optimize the performance of the restored table. The metadata type of the long-running operation is OptimizeRestoreTableMetadata. The response type is Empty. This long-running operation may be automatically created by the system if applicable after the RestoreTable long-running operation completes successfully. This operation may not be created if the table is already optimized or the restore was not successful.
    */
  var optimizeTableOperationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The progress of the RestoreTable operation.
    */
  var progress: js.UndefOr[SchemaOperationProgress] = js.undefined
  
  /**
    * The type of the restore source.
    */
  var sourceType: js.UndefOr[String | Null] = js.undefined
}
object SchemaRestoreTableMetadata {
  
  inline def apply(): SchemaRestoreTableMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestoreTableMetadata]
  }
  
  extension [Self <: SchemaRestoreTableMetadata](x: Self) {
    
    inline def setBackupInfo(value: SchemaBackupInfo): Self = StObject.set(x, "backupInfo", value.asInstanceOf[js.Any])
    
    inline def setBackupInfoUndefined: Self = StObject.set(x, "backupInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptimizeTableOperationName(value: String): Self = StObject.set(x, "optimizeTableOperationName", value.asInstanceOf[js.Any])
    
    inline def setOptimizeTableOperationNameNull: Self = StObject.set(x, "optimizeTableOperationName", null)
    
    inline def setOptimizeTableOperationNameUndefined: Self = StObject.set(x, "optimizeTableOperationName", js.undefined)
    
    inline def setProgress(value: SchemaOperationProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeNull: Self = StObject.set(x, "sourceType", null)
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
  }
}
