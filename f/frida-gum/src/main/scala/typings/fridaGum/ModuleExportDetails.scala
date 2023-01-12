package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleExportDetails extends StObject {
  
  /**
    * Absolute address.
    */
  var address: NativePointer
  
  /**
    * Exported symbol name.
    */
  var name: String
  
  /**
    * The kind of export.
    */
  var `type`: ModuleExportType
}
object ModuleExportDetails {
  
  inline def apply(address: NativePointer, name: String, `type`: ModuleExportType): ModuleExportDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleExportDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleExportDetails] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ModuleExportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
