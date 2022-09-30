package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CopyBackupMetadata. */
trait ICopyBackupMetadata extends StObject {
  
  /** CopyBackupMetadata cancelTime */
  var cancelTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** CopyBackupMetadata name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** CopyBackupMetadata progress */
  var progress: js.UndefOr[IOperationProgress | Null] = js.undefined
  
  /** CopyBackupMetadata sourceBackup */
  var sourceBackup: js.UndefOr[String | Null] = js.undefined
}
object ICopyBackupMetadata {
  
  inline def apply(): ICopyBackupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICopyBackupMetadata]
  }
  
  extension [Self <: ICopyBackupMetadata](x: Self) {
    
    inline def setCancelTime(value: ITimestamp): Self = StObject.set(x, "cancelTime", value.asInstanceOf[js.Any])
    
    inline def setCancelTimeNull: Self = StObject.set(x, "cancelTime", null)
    
    inline def setCancelTimeUndefined: Self = StObject.set(x, "cancelTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProgress(value: IOperationProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressNull: Self = StObject.set(x, "progress", null)
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setSourceBackup(value: String): Self = StObject.set(x, "sourceBackup", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupNull: Self = StObject.set(x, "sourceBackup", null)
    
    inline def setSourceBackupUndefined: Self = StObject.set(x, "sourceBackup", js.undefined)
  }
}
