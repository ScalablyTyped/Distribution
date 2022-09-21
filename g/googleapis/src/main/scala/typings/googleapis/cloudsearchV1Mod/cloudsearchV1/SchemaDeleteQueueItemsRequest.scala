package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteQueueItemsRequest extends StObject {
  
  /**
    * The name of connector making this call. Format: datasources/{source_id\}/connectors/{ID\}
    */
  var connectorName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.undefined
  
  /**
    * The name of a queue to delete items from.
    */
  var queue: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeleteQueueItemsRequest {
  
  inline def apply(): SchemaDeleteQueueItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteQueueItemsRequest]
  }
  
  extension [Self <: SchemaDeleteQueueItemsRequest](x: Self) {
    
    inline def setConnectorName(value: String): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    inline def setConnectorNameNull: Self = StObject.set(x, "connectorName", null)
    
    inline def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    inline def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueNull: Self = StObject.set(x, "queue", null)
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
  }
}
