package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDeliveryPipelinesResponse extends StObject {
  
  /**
    * The `DeliveryPipeline` objects.
    */
  var deliveryPipelines: js.UndefOr[js.Array[SchemaDeliveryPipeline]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListDeliveryPipelinesResponse {
  
  inline def apply(): SchemaListDeliveryPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeliveryPipelinesResponse]
  }
  
  extension [Self <: SchemaListDeliveryPipelinesResponse](x: Self) {
    
    inline def setDeliveryPipelines(value: js.Array[SchemaDeliveryPipeline]): Self = StObject.set(x, "deliveryPipelines", value.asInstanceOf[js.Any])
    
    inline def setDeliveryPipelinesUndefined: Self = StObject.set(x, "deliveryPipelines", js.undefined)
    
    inline def setDeliveryPipelinesVarargs(value: SchemaDeliveryPipeline*): Self = StObject.set(x, "deliveryPipelines", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
