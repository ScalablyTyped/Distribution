package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleSymbolDetails extends StObject {
  
  /**
    * Absolute address.
    */
  var address: NativePointer
  
  /**
    * Whether symbol is globally visible.
    */
  var isGlobal: Boolean
  
  /**
    * Symbol name.
    */
  var name: String
  
  /**
    * Which section this symbol resides in, if available.
    */
  var section: js.UndefOr[ModuleSymbolSectionDetails] = js.undefined
  
  /**
    * Size in bytes, if available.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * The kind of symbol.
    */
  var `type`: ModuleSymbolType
}
object ModuleSymbolDetails {
  
  inline def apply(address: NativePointer, isGlobal: Boolean, name: String, `type`: ModuleSymbolType): ModuleSymbolDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], isGlobal = isGlobal.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSymbolDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleSymbolDetails] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setIsGlobal(value: Boolean): Self = StObject.set(x, "isGlobal", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSection(value: ModuleSymbolSectionDetails): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: ModuleSymbolType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
