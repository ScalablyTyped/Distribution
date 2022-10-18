package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherScheduleContainer extends StObject {
  
  var cron: js.UndefOr[WatcherCronExpression] = js.undefined
  
  var daily: js.UndefOr[WatcherDailySchedule] = js.undefined
  
  var hourly: js.UndefOr[WatcherHourlySchedule] = js.undefined
  
  var interval: js.UndefOr[Duration] = js.undefined
  
  var monthly: js.UndefOr[WatcherTimeOfMonth | js.Array[WatcherTimeOfMonth]] = js.undefined
  
  var weekly: js.UndefOr[WatcherTimeOfWeek | js.Array[WatcherTimeOfWeek]] = js.undefined
  
  var yearly: js.UndefOr[WatcherTimeOfYear | js.Array[WatcherTimeOfYear]] = js.undefined
}
object WatcherScheduleContainer {
  
  inline def apply(): WatcherScheduleContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherScheduleContainer]
  }
  
  extension [Self <: WatcherScheduleContainer](x: Self) {
    
    inline def setCron(value: WatcherCronExpression): Self = StObject.set(x, "cron", value.asInstanceOf[js.Any])
    
    inline def setCronUndefined: Self = StObject.set(x, "cron", js.undefined)
    
    inline def setDaily(value: WatcherDailySchedule): Self = StObject.set(x, "daily", value.asInstanceOf[js.Any])
    
    inline def setDailyUndefined: Self = StObject.set(x, "daily", js.undefined)
    
    inline def setHourly(value: WatcherHourlySchedule): Self = StObject.set(x, "hourly", value.asInstanceOf[js.Any])
    
    inline def setHourlyUndefined: Self = StObject.set(x, "hourly", js.undefined)
    
    inline def setInterval(value: Duration): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setMonthly(value: WatcherTimeOfMonth | js.Array[WatcherTimeOfMonth]): Self = StObject.set(x, "monthly", value.asInstanceOf[js.Any])
    
    inline def setMonthlyUndefined: Self = StObject.set(x, "monthly", js.undefined)
    
    inline def setMonthlyVarargs(value: WatcherTimeOfMonth*): Self = StObject.set(x, "monthly", js.Array(value*))
    
    inline def setWeekly(value: WatcherTimeOfWeek | js.Array[WatcherTimeOfWeek]): Self = StObject.set(x, "weekly", value.asInstanceOf[js.Any])
    
    inline def setWeeklyUndefined: Self = StObject.set(x, "weekly", js.undefined)
    
    inline def setWeeklyVarargs(value: WatcherTimeOfWeek*): Self = StObject.set(x, "weekly", js.Array(value*))
    
    inline def setYearly(value: WatcherTimeOfYear | js.Array[WatcherTimeOfYear]): Self = StObject.set(x, "yearly", value.asInstanceOf[js.Any])
    
    inline def setYearlyUndefined: Self = StObject.set(x, "yearly", js.undefined)
    
    inline def setYearlyVarargs(value: WatcherTimeOfYear*): Self = StObject.set(x, "yearly", js.Array(value*))
  }
}
