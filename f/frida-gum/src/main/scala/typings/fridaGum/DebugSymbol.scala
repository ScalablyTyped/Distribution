package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugSymbol extends StObject {
  
  /**
    * Address that this symbol is for.
    */
  var address: NativePointer
  
  /**
    * File name owning this symbol, or `null` if unknown.
    */
  var fileName: String | Null
  
  /**
    * Line number in `fileName`, or `null` if unknown.
    */
  var lineNumber: Double | Null
  
  /**
    * Module name owning this symbol, or `null` if unknown.
    */
  var moduleName: String | Null
  
  /**
    * Name of the symbol, or `null` if unknown.
    */
  var name: String | Null
}
object DebugSymbol {
  
  inline def apply(address: NativePointer): DebugSymbol = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], fileName = null, lineNumber = null, moduleName = null, name = null)
    __obj.asInstanceOf[DebugSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebugSymbol] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberNull: Self = StObject.set(x, "lineNumber", null)
    
    inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    inline def setModuleNameNull: Self = StObject.set(x, "moduleName", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
  }
}
