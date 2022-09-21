package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIndexItemRequest extends StObject {
  
  /**
    * The name of connector making this call. Format: datasources/{source_id\}/connectors/{ID\}
    */
  var connectorName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.undefined
  
  var indexItemOptions: js.UndefOr[SchemaIndexItemOptions] = js.undefined
  
  /**
    * The name of the item. Format: datasources/{source_id\}/items/{item_id\}
    */
  var item: js.UndefOr[SchemaItem] = js.undefined
  
  /**
    * Required. The RequestMode for this request.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
}
object SchemaIndexItemRequest {
  
  inline def apply(): SchemaIndexItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndexItemRequest]
  }
  
  extension [Self <: SchemaIndexItemRequest](x: Self) {
    
    inline def setConnectorName(value: String): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    inline def setConnectorNameNull: Self = StObject.set(x, "connectorName", null)
    
    inline def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    inline def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    inline def setIndexItemOptions(value: SchemaIndexItemOptions): Self = StObject.set(x, "indexItemOptions", value.asInstanceOf[js.Any])
    
    inline def setIndexItemOptionsUndefined: Self = StObject.set(x, "indexItemOptions", js.undefined)
    
    inline def setItem(value: SchemaItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
