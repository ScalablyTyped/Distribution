package typings.formatjsEcma402Abstract.libTypesNumberMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitDataTable extends StObject {
  
  var compound: Record[String, CompoundUnitData]
  
  var simple: Record[String, UnitData]
}
object UnitDataTable {
  
  inline def apply(compound: Record[String, CompoundUnitData], simple: Record[String, UnitData]): UnitDataTable = {
    val __obj = js.Dynamic.literal(compound = compound.asInstanceOf[js.Any], simple = simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitDataTable]
  }
  
  extension [Self <: UnitDataTable](x: Self) {
    
    inline def setCompound(value: Record[String, CompoundUnitData]): Self = StObject.set(x, "compound", value.asInstanceOf[js.Any])
    
    inline def setSimple(value: Record[String, UnitData]): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
  }
}
