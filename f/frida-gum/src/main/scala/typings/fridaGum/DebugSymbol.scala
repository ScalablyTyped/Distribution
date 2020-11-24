package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugSymbol extends js.Object {
  
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
  implicit class DebugSymbolOps[Self <: DebugSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: NativePointer): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameNull: Self = this.set("fileName", null)
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumberNull: Self = this.set("lineNumber", null)
    
    @scala.inline
    def setModuleName(value: String): Self = this.set("moduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleNameNull: Self = this.set("moduleName", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
  }
}
