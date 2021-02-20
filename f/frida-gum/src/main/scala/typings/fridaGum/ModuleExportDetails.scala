package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleExportDetails extends StObject {
  
  /**
    * Absolute address.
    */
  var address: NativePointer = js.native
  
  /**
    * Exported symbol name.
    */
  var name: String = js.native
  
  /**
    * The kind of export.
    */
  var `type`: ModuleExportType = js.native
}
object ModuleExportDetails {
  
  @scala.inline
  def apply(address: NativePointer, name: String, `type`: ModuleExportType): ModuleExportDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleExportDetails]
  }
  
  @scala.inline
  implicit class ModuleExportDetailsMutableBuilder[Self <: ModuleExportDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ModuleExportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
