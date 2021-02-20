package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugSymbol extends StObject {
  
  /**
    * Address that this symbol is for.
    */
  var address: NativePointer = js.native
  
  /**
    * File name owning this symbol, or `null` if unknown.
    */
  var fileName: String | Null = js.native
  
  /**
    * Line number in `fileName`, or `null` if unknown.
    */
  var lineNumber: Double | Null = js.native
  
  /**
    * Module name owning this symbol, or `null` if unknown.
    */
  var moduleName: String | Null = js.native
  
  /**
    * Name of the symbol, or `null` if unknown.
    */
  var name: String | Null = js.native
}
object DebugSymbol {
  
  @scala.inline
  def apply(address: NativePointer): DebugSymbol = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugSymbol]
  }
  
  @scala.inline
  implicit class DebugSymbolMutableBuilder[Self <: DebugSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumberNull: Self = StObject.set(x, "lineNumber", null)
    
    @scala.inline
    def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleNameNull: Self = StObject.set(x, "moduleName", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
  }
}
