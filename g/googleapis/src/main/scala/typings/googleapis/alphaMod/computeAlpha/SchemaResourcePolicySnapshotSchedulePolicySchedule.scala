package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourcePolicySnapshotSchedulePolicySchedule extends StObject {
  
  var dailySchedule: js.UndefOr[SchemaResourcePolicyDailyCycle] = js.undefined
  
  var hourlySchedule: js.UndefOr[SchemaResourcePolicyHourlyCycle] = js.undefined
  
  var weeklySchedule: js.UndefOr[SchemaResourcePolicyWeeklyCycle] = js.undefined
}
object SchemaResourcePolicySnapshotSchedulePolicySchedule {
  
  inline def apply(): SchemaResourcePolicySnapshotSchedulePolicySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicySnapshotSchedulePolicySchedule]
  }
  
  extension [Self <: SchemaResourcePolicySnapshotSchedulePolicySchedule](x: Self) {
    
    inline def setDailySchedule(value: SchemaResourcePolicyDailyCycle): Self = StObject.set(x, "dailySchedule", value.asInstanceOf[js.Any])
    
    inline def setDailyScheduleUndefined: Self = StObject.set(x, "dailySchedule", js.undefined)
    
    inline def setHourlySchedule(value: SchemaResourcePolicyHourlyCycle): Self = StObject.set(x, "hourlySchedule", value.asInstanceOf[js.Any])
    
    inline def setHourlyScheduleUndefined: Self = StObject.set(x, "hourlySchedule", js.undefined)
    
    inline def setWeeklySchedule(value: SchemaResourcePolicyWeeklyCycle): Self = StObject.set(x, "weeklySchedule", value.asInstanceOf[js.Any])
    
    inline def setWeeklyScheduleUndefined: Self = StObject.set(x, "weeklySchedule", js.undefined)
  }
}
