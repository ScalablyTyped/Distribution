package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateBackupRequest. */
trait IUpdateBackupRequest extends StObject {
  
  /** UpdateBackupRequest backup */
  var backup: js.UndefOr[IBackup | Null] = js.undefined
  
  /** UpdateBackupRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}
object IUpdateBackupRequest {
  
  inline def apply(): IUpdateBackupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateBackupRequest]
  }
  
  extension [Self <: IUpdateBackupRequest](x: Self) {
    
    inline def setBackup(value: IBackup): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setBackupNull: Self = StObject.set(x, "backup", null)
    
    inline def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    inline def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
