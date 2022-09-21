package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceInfo extends StObject {
  
  /**
    * Required. Unique Id for the resource.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specific details for the resource.
    */
  var resource: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Overall health status. Overall status is derived based on the status of each sub level resources.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of Info for the sub level resources.
    */
  var sub: js.UndefOr[js.Array[SchemaResourceInfo]] = js.undefined
  
  /**
    * The timestamp to collect the info. It is suggested to be set by the topmost level resource only.
    */
  var time: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourceInfo {
  
  inline def apply(): SchemaResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceInfo]
  }
  
  extension [Self <: SchemaResourceInfo](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setResource(value: StringDictionary[Any]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSub(value: js.Array[SchemaResourceInfo]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
    
    inline def setSubVarargs(value: SchemaResourceInfo*): Self = StObject.set(x, "sub", js.Array(value*))
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
