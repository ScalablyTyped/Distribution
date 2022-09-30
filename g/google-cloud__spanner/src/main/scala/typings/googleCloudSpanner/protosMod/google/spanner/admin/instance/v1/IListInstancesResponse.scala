package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListInstancesResponse. */
trait IListInstancesResponse extends StObject {
  
  /** ListInstancesResponse instances */
  var instances: js.UndefOr[js.Array[IInstance] | Null] = js.undefined
  
  /** ListInstancesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object IListInstancesResponse {
  
  inline def apply(): IListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListInstancesResponse]
  }
  
  extension [Self <: IListInstancesResponse](x: Self) {
    
    inline def setInstances(value: js.Array[IInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesNull: Self = StObject.set(x, "instances", null)
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: IInstance*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
