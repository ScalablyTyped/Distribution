package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListInstanceConfigsResponse. */
trait IListInstanceConfigsResponse extends StObject {
  
  /** ListInstanceConfigsResponse instanceConfigs */
  var instanceConfigs: js.UndefOr[js.Array[IInstanceConfig] | Null] = js.undefined
  
  /** ListInstanceConfigsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object IListInstanceConfigsResponse {
  
  inline def apply(): IListInstanceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListInstanceConfigsResponse]
  }
  
  extension [Self <: IListInstanceConfigsResponse](x: Self) {
    
    inline def setInstanceConfigs(value: js.Array[IInstanceConfig]): Self = StObject.set(x, "instanceConfigs", value.asInstanceOf[js.Any])
    
    inline def setInstanceConfigsNull: Self = StObject.set(x, "instanceConfigs", null)
    
    inline def setInstanceConfigsUndefined: Self = StObject.set(x, "instanceConfigs", js.undefined)
    
    inline def setInstanceConfigsVarargs(value: IInstanceConfig*): Self = StObject.set(x, "instanceConfigs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
