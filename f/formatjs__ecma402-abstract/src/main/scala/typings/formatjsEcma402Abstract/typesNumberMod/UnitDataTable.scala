package typings.formatjsEcma402Abstract.typesNumberMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitDataTable extends StObject {
  
  var compound: Record[String, CompoundUnitData]
  
  var simple: Record[String, UnitData]
}
object UnitDataTable {
  
  @scala.inline
  def apply(compound: Record[String, CompoundUnitData], simple: Record[String, UnitData]): UnitDataTable = {
    val __obj = js.Dynamic.literal(compound = compound.asInstanceOf[js.Any], simple = simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitDataTable]
  }
  
  @scala.inline
  implicit class UnitDataTableMutableBuilder[Self <: UnitDataTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompound(value: Record[String, CompoundUnitData]): Self = StObject.set(x, "compound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimple(value: Record[String, UnitData]): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
  }
}
