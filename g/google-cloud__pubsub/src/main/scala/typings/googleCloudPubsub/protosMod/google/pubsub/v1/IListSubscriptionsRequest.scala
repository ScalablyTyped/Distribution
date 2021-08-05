package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListSubscriptionsRequest. */
trait IListSubscriptionsRequest extends StObject {
  
  /** ListSubscriptionsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /** ListSubscriptionsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListSubscriptionsRequest project */
  var project: js.UndefOr[String | Null] = js.undefined
}
object IListSubscriptionsRequest {
  
  inline def apply(): IListSubscriptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListSubscriptionsRequest]
  }
  
  extension [Self <: IListSubscriptionsRequest](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
