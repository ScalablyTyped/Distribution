package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourcePolicyInstanceSchedulePolicySchedule extends StObject {
  
  /**
    * Specifies the frequency for the operation, using the unix-cron format.
    */
  var schedule: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourcePolicyInstanceSchedulePolicySchedule {
  
  inline def apply(): SchemaResourcePolicyInstanceSchedulePolicySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyInstanceSchedulePolicySchedule]
  }
  
  extension [Self <: SchemaResourcePolicyInstanceSchedulePolicySchedule](x: Self) {
    
    inline def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleNull: Self = StObject.set(x, "schedule", null)
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
