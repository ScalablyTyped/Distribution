package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRolloutsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The `Rollout` objects.
    */
  var rollouts: js.UndefOr[js.Array[SchemaRollout]] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListRolloutsResponse {
  
  inline def apply(): SchemaListRolloutsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRolloutsResponse]
  }
  
  extension [Self <: SchemaListRolloutsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRollouts(value: js.Array[SchemaRollout]): Self = StObject.set(x, "rollouts", value.asInstanceOf[js.Any])
    
    inline def setRolloutsUndefined: Self = StObject.set(x, "rollouts", js.undefined)
    
    inline def setRolloutsVarargs(value: SchemaRollout*): Self = StObject.set(x, "rollouts", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
