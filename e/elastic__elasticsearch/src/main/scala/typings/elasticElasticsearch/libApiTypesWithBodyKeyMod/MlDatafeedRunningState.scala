package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDatafeedRunningState extends StObject {
  
  var real_time_configured: Boolean
  
  var real_time_running: Boolean
  
  var search_interval: js.UndefOr[MlRunningStateSearchInterval] = js.undefined
}
object MlDatafeedRunningState {
  
  inline def apply(real_time_configured: Boolean, real_time_running: Boolean): MlDatafeedRunningState = {
    val __obj = js.Dynamic.literal(real_time_configured = real_time_configured.asInstanceOf[js.Any], real_time_running = real_time_running.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDatafeedRunningState]
  }
  
  extension [Self <: MlDatafeedRunningState](x: Self) {
    
    inline def setReal_time_configured(value: Boolean): Self = StObject.set(x, "real_time_configured", value.asInstanceOf[js.Any])
    
    inline def setReal_time_running(value: Boolean): Self = StObject.set(x, "real_time_running", value.asInstanceOf[js.Any])
    
    inline def setSearch_interval(value: MlRunningStateSearchInterval): Self = StObject.set(x, "search_interval", value.asInstanceOf[js.Any])
    
    inline def setSearch_intervalUndefined: Self = StObject.set(x, "search_interval", js.undefined)
  }
}
