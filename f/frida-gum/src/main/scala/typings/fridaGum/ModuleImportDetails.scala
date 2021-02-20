package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleImportDetails extends StObject {
  
  /**
    * Absolute address, if available.
    */
  var address: js.UndefOr[NativePointer] = js.native
  
  /**
    * Module name, if available.
    */
  var module: js.UndefOr[String] = js.native
  
  /**
    * Imported symbol name.
    */
  var name: String = js.native
  
  /**
    * Memory location where the import is stored, if available.
    */
  var slot: js.UndefOr[NativePointer] = js.native
  
  /**
    * The kind of import, if available.
    */
  var `type`: js.UndefOr[ModuleImportType] = js.native
}
object ModuleImportDetails {
  
  @scala.inline
  def apply(name: String): ModuleImportDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleImportDetails]
  }
  
  @scala.inline
  implicit class ModuleImportDetailsMutableBuilder[Self <: ModuleImportDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlot(value: NativePointer): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    @scala.inline
    def setType(value: ModuleImportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
