package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metadata for the Operation returned by UpdateInstance.
  */
trait SchemaUpdateInstanceMetadata extends StObject {
  
  /**
    * The time at which the operation failed or was completed successfully.
    */
  var finishTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The request that prompted the initiation of this UpdateInstance operation.
    */
  var originalRequest: js.UndefOr[SchemaPartialUpdateInstanceRequest] = js.undefined
  
  /**
    * The time at which the original request was received.
    */
  var requestTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateInstanceMetadata {
  
  inline def apply(): SchemaUpdateInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateInstanceMetadata]
  }
  
  extension [Self <: SchemaUpdateInstanceMetadata](x: Self) {
    
    inline def setFinishTime(value: String): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    inline def setFinishTimeNull: Self = StObject.set(x, "finishTime", null)
    
    inline def setFinishTimeUndefined: Self = StObject.set(x, "finishTime", js.undefined)
    
    inline def setOriginalRequest(value: SchemaPartialUpdateInstanceRequest): Self = StObject.set(x, "originalRequest", value.asInstanceOf[js.Any])
    
    inline def setOriginalRequestUndefined: Self = StObject.set(x, "originalRequest", js.undefined)
    
    inline def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeNull: Self = StObject.set(x, "requestTime", null)
    
    inline def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
  }
}
