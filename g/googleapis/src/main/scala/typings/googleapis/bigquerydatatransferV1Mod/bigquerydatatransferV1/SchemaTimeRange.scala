package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A specification for a time range, this will request transfer runs with
  * run_time between start_time (inclusive) and end_time (exclusive).
  */
trait SchemaTimeRange extends StObject {
  
  /**
    * End time of the range of transfer runs. For example,
    * `&quot;2017-05-30T00:00:00+00:00&quot;`. The end_time must not be in the
    * future. Creates transfer runs where run_time is in the range betwen
    * start_time (inclusive) and end_time (exlusive).
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Start time of the range of transfer runs. For example,
    * `&quot;2017-05-25T00:00:00+00:00&quot;`. The start_time must be strictly
    * less than the end_time. Creates transfer runs where run_time is in the
    * range betwen start_time (inclusive) and end_time (exlusive).
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object SchemaTimeRange {
  
  inline def apply(): SchemaTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeRange]
  }
  
  extension [Self <: SchemaTimeRange](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
