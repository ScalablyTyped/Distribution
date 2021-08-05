package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SearchAgentsRequest. */
trait ISearchAgentsRequest extends StObject {
  
  /** SearchAgentsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /** SearchAgentsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /** SearchAgentsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object ISearchAgentsRequest {
  
  inline def apply(): ISearchAgentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISearchAgentsRequest]
  }
  
  extension [Self <: ISearchAgentsRequest](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
