package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A time window of (start_time, end_time].
  */
@js.native
trait SchemaTimeWindow extends StObject {
  
  /**
    * End time of the time window (inclusive). Current timestamp if not
    * specified.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Start time of the time window (exclusive).
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaTimeWindow {
  
  @scala.inline
  def apply(): SchemaTimeWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeWindow]
  }
  
  @scala.inline
  implicit class SchemaTimeWindowMutableBuilder[Self <: SchemaTimeWindow] (val x: Self) extends AnyVal {
    
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
