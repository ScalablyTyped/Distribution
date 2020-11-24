package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleSymbolDetails extends js.Object {
  
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
  implicit class ModuleSymbolDetailsOps[Self <: ModuleSymbolDetails] (val x: Self) extends AnyVal {
    
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
    def setIsGlobal(value: Boolean): Self = this.set("isGlobal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ModuleSymbolType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: ModuleSymbolSectionDetails): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
