package typings.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeData extends StObject {
  
  var duration: typings.fullcalendarCommon.mod.Duration
  
  var typeData: Any
  
  var typeId: Double
}
object TypeData {
  
  inline def apply(duration: typings.fullcalendarCommon.mod.Duration, typeData: Any, typeId: Double): TypeData = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], typeData = typeData.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeData]
  }
  
  extension [Self <: TypeData](x: Self) {
    
    inline def setDuration(value: typings.fullcalendarCommon.mod.Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setTypeData(value: Any): Self = StObject.set(x, "typeData", value.asInstanceOf[js.Any])
    
    inline def setTypeId(value: Double): Self = StObject.set(x, "typeId", value.asInstanceOf[js.Any])
  }
}
