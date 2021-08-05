package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleImportDetails extends StObject {
  
  /**
    * Absolute address, if available.
    */
  var address: js.UndefOr[NativePointer] = js.undefined
  
  /**
    * Module name, if available.
    */
  var module: js.UndefOr[String] = js.undefined
  
  /**
    * Imported symbol name.
    */
  var name: String
  
  /**
    * Memory location where the import is stored, if available.
    */
  var slot: js.UndefOr[NativePointer] = js.undefined
  
  /**
    * The kind of import, if available.
    */
  var `type`: js.UndefOr[ModuleImportType] = js.undefined
}
object ModuleImportDetails {
  
  inline def apply(name: String): ModuleImportDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleImportDetails]
  }
  
  extension [Self <: ModuleImportDetails](x: Self) {
    
    inline def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSlot(value: NativePointer): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setType(value: ModuleImportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
