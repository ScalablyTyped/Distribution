package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkOperationContainer extends StObject {
  
  var create: js.UndefOr[BulkCreateOperation] = js.undefined
  
  var delete: js.UndefOr[BulkDeleteOperation] = js.undefined
  
  var index: js.UndefOr[BulkIndexOperation] = js.undefined
  
  var update: js.UndefOr[BulkUpdateOperation] = js.undefined
}
object BulkOperationContainer {
  
  inline def apply(): BulkOperationContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkOperationContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulkOperationContainer] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: BulkCreateOperation): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDelete(value: BulkDeleteOperation): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setIndex(value: BulkIndexOperation): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setUpdate(value: BulkUpdateOperation): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
