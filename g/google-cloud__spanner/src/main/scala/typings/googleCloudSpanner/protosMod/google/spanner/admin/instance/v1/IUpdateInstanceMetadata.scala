package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateInstanceMetadata. */
trait IUpdateInstanceMetadata extends StObject {
  
  /** UpdateInstanceMetadata cancelTime */
  var cancelTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** UpdateInstanceMetadata endTime */
  var endTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** UpdateInstanceMetadata instance */
  var instance: js.UndefOr[IInstance | Null] = js.undefined
  
  /** UpdateInstanceMetadata startTime */
  var startTime: js.UndefOr[ITimestamp | Null] = js.undefined
}
object IUpdateInstanceMetadata {
  
  inline def apply(): IUpdateInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateInstanceMetadata]
  }
  
  extension [Self <: IUpdateInstanceMetadata](x: Self) {
    
    inline def setCancelTime(value: ITimestamp): Self = StObject.set(x, "cancelTime", value.asInstanceOf[js.Any])
    
    inline def setCancelTimeNull: Self = StObject.set(x, "cancelTime", null)
    
    inline def setCancelTimeUndefined: Self = StObject.set(x, "cancelTime", js.undefined)
    
    inline def setEndTime(value: ITimestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setInstance(value: IInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setStartTime(value: ITimestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
