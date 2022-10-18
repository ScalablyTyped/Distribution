package typings.elasticElasticsearch.libHelpersMod

import typings.elasticElasticsearch.libApiTypesMod.BulkDeleteOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAction
  extends StObject
     with _Action {
  
  var delete: BulkDeleteOperation
}
object DeleteAction {
  
  inline def apply(delete: BulkDeleteOperation): DeleteAction = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAction]
  }
  
  extension [Self <: DeleteAction](x: Self) {
    
    inline def setDelete(value: BulkDeleteOperation): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
