package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an OperationProgress. */
trait IOperationProgress extends StObject {
  
  /** OperationProgress endTime */
  var endTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** OperationProgress progressPercent */
  var progressPercent: js.UndefOr[Double | Null] = js.undefined
  
  /** OperationProgress startTime */
  var startTime: js.UndefOr[ITimestamp | Null] = js.undefined
}
object IOperationProgress {
  
  inline def apply(): IOperationProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOperationProgress]
  }
  
  extension [Self <: IOperationProgress](x: Self) {
    
    inline def setEndTime(value: ITimestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentNull: Self = StObject.set(x, "progressPercent", null)
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    inline def setStartTime(value: ITimestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
