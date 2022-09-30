package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreKeyRange extends StObject {
  
  val lower: Any
  
  val lowerOpen: js.UndefOr[Boolean] = js.undefined
  
  val `type`: DBCoreRangeType
  
  val upper: Any
  
  val upperOpen: js.UndefOr[Boolean] = js.undefined
}
object DBCoreKeyRange {
  
  inline def apply(lower: Any, `type`: DBCoreRangeType, upper: Any): DBCoreKeyRange = {
    val __obj = js.Dynamic.literal(lower = lower.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreKeyRange]
  }
  
  extension [Self <: DBCoreKeyRange](x: Self) {
    
    inline def setLower(value: Any): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    
    inline def setLowerOpen(value: Boolean): Self = StObject.set(x, "lowerOpen", value.asInstanceOf[js.Any])
    
    inline def setLowerOpenUndefined: Self = StObject.set(x, "lowerOpen", js.undefined)
    
    inline def setType(value: DBCoreRangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpper(value: Any): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
    
    inline def setUpperOpen(value: Boolean): Self = StObject.set(x, "upperOpen", value.asInstanceOf[js.Any])
    
    inline def setUpperOpenUndefined: Self = StObject.set(x, "upperOpen", js.undefined)
  }
}
