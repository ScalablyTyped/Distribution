package typings.formatjsEcma402Abstract.numberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompoundUnitData extends StObject {
  
  var long: String
  
  var narrow: String
  
  var short: String
}
object CompoundUnitData {
  
  inline def apply(long: String, narrow: String, short: String): CompoundUnitData = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompoundUnitData]
  }
  
  extension [Self <: CompoundUnitData](x: Self) {
    
    inline def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setNarrow(value: String): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
