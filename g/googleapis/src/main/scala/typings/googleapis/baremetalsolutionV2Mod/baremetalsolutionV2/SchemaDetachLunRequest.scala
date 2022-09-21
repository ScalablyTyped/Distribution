package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDetachLunRequest extends StObject {
  
  /**
    * Required. Name of the Lun to detach.
    */
  var lun: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, performs lun unmapping without instance reboot.
    */
  var skipReboot: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDetachLunRequest {
  
  inline def apply(): SchemaDetachLunRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetachLunRequest]
  }
  
  extension [Self <: SchemaDetachLunRequest](x: Self) {
    
    inline def setLun(value: String): Self = StObject.set(x, "lun", value.asInstanceOf[js.Any])
    
    inline def setLunNull: Self = StObject.set(x, "lun", null)
    
    inline def setLunUndefined: Self = StObject.set(x, "lun", js.undefined)
    
    inline def setSkipReboot(value: Boolean): Self = StObject.set(x, "skipReboot", value.asInstanceOf[js.Any])
    
    inline def setSkipRebootNull: Self = StObject.set(x, "skipReboot", null)
    
    inline def setSkipRebootUndefined: Self = StObject.set(x, "skipReboot", js.undefined)
  }
}
