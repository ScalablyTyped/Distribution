package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleSymbolDetails extends StObject {
  
  /**
    * Absolute address.
    */
  var address: NativePointer = js.native
  
  /**
    * Whether symbol is globally visible.
    */
  var isGlobal: Boolean = js.native
  
  /**
    * Symbol name.
    */
  var name: String = js.native
  
  /**
    * Which section this symbol resides in, if available.
    */
  var section: js.UndefOr[ModuleSymbolSectionDetails] = js.native
  
  /**
    * Size in bytes, if available.
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * The kind of symbol.
    */
  var `type`: ModuleSymbolType = js.native
}
object ModuleSymbolDetails {
  
  @scala.inline
  def apply(address: NativePointer, isGlobal: Boolean, name: String, `type`: ModuleSymbolType): ModuleSymbolDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], isGlobal = isGlobal.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSymbolDetails]
  }
  
  @scala.inline
  implicit class ModuleSymbolDetailsMutableBuilder[Self <: ModuleSymbolDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGlobal(value: Boolean): Self = StObject.set(x, "isGlobal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: ModuleSymbolSectionDetails): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: ModuleSymbolType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
