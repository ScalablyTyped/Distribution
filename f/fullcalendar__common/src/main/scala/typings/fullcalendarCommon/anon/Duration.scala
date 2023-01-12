package typings.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var duration: typings.fullcalendarCommon.mod.Duration | Null
  
  var typeData: Any
  
  var typeId: Double
}
object Duration {
  
  inline def apply(typeData: Any, typeId: Double): Duration = {
    val __obj = js.Dynamic.literal(typeData = typeData.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any], duration = null)
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: typings.fullcalendarCommon.mod.Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setTypeData(value: Any): Self = StObject.set(x, "typeData", value.asInstanceOf[js.Any])
    
    inline def setTypeId(value: Double): Self = StObject.set(x, "typeId", value.asInstanceOf[js.Any])
  }
}
