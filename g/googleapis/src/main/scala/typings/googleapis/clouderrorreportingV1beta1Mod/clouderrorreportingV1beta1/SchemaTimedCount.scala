package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The number of errors in a given time period. All numbers are approximate
  * since the error events are sampled before counting them.
  */
@js.native
trait SchemaTimedCount extends StObject {
  
  /**
    * Approximate number of occurrences in the given time period.
    */
  var count: js.UndefOr[String] = js.native
  
  /**
    * End of the time period to which `count` refers (excluded).
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Start of the time period to which `count` refers (included).
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaTimedCount {
  
  @scala.inline
  def apply(): SchemaTimedCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimedCount]
  }
  
  @scala.inline
  implicit class SchemaTimedCountMutableBuilder[Self <: SchemaTimedCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
