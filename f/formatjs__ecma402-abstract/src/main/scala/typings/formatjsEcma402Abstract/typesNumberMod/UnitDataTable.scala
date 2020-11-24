package typings.formatjsEcma402Abstract.typesNumberMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnitDataTable extends js.Object {
  
  var compound: Record[String, CompoundUnitData] = js.native
  
  var simple: Record[String, UnitData] = js.native
}
object UnitDataTable {
  
  @scala.inline
  def apply(compound: Record[String, CompoundUnitData], simple: Record[String, UnitData]): UnitDataTable = {
    val __obj = js.Dynamic.literal(compound = compound.asInstanceOf[js.Any], simple = simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitDataTable]
  }
  
  @scala.inline
  implicit class UnitDataTableOps[Self <: UnitDataTable] (val x: Self) extends AnyVal {
    
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
    def setCompound(value: Record[String, CompoundUnitData]): Self = this.set("compound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimple(value: Record[String, UnitData]): Self = this.set("simple", value.asInstanceOf[js.Any])
  }
}
