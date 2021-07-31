package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIndexItemRequest extends StObject {
  
  /**
    * Name of connector making this call. &lt;br /&gt;Format:
    * datasources/{source_id}/connectors/{ID}
    */
  var connectorName: js.UndefOr[String] = js.undefined
  
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.undefined
  
  var indexItemOptions: js.UndefOr[SchemaIndexItemOptions] = js.undefined
  
  /**
    * Name of the item.  Format: datasources/{source_id}/items/{item_id}
    */
  var item: js.UndefOr[SchemaItem] = js.undefined
  
  /**
    * Required. The RequestMode for this request.
    */
  var mode: js.UndefOr[String] = js.undefined
}
object SchemaIndexItemRequest {
  
  @scala.inline
  def apply(): SchemaIndexItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndexItemRequest]
  }
  
  @scala.inline
  implicit class SchemaIndexItemRequestMutableBuilder[Self <: SchemaIndexItemRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorName(value: String): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    @scala.inline
    def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    @scala.inline
    def setIndexItemOptions(value: SchemaIndexItemOptions): Self = StObject.set(x, "indexItemOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexItemOptionsUndefined: Self = StObject.set(x, "indexItemOptions", js.undefined)
    
    @scala.inline
    def setItem(value: SchemaItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
