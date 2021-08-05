package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupOption extends StObject {
  
  var backupOption: js.UndefOr[Color] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object BackupOption {
  
  inline def apply(): BackupOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupOption]
  }
  
  extension [Self <: BackupOption](x: Self) {
    
    inline def setBackupOption(value: Color): Self = StObject.set(x, "backupOption", value.asInstanceOf[js.Any])
    
    inline def setBackupOptionUndefined: Self = StObject.set(x, "backupOption", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
