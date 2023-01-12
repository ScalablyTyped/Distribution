package typings.formatjsEcma402Abstract.libTypesNumberMod

import typings.formatjsEcma402Abstract.anon.Recordnarrowshortlongstri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitData extends StObject {
  
  var long: LDMLPluralRuleMap[String]
  
  var narrow: LDMLPluralRuleMap[String]
  
  var perUnit: Recordnarrowshortlongstri
  
  var short: LDMLPluralRuleMap[String]
}
object UnitData {
  
  inline def apply(
    long: LDMLPluralRuleMap[String],
    narrow: LDMLPluralRuleMap[String],
    perUnit: Recordnarrowshortlongstri,
    short: LDMLPluralRuleMap[String]
  ): UnitData = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], perUnit = perUnit.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnitData] (val x: Self) extends AnyVal {
    
    inline def setLong(value: LDMLPluralRuleMap[String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setNarrow(value: LDMLPluralRuleMap[String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setPerUnit(value: Recordnarrowshortlongstri): Self = StObject.set(x, "perUnit", value.asInstanceOf[js.Any])
    
    inline def setShort(value: LDMLPluralRuleMap[String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
