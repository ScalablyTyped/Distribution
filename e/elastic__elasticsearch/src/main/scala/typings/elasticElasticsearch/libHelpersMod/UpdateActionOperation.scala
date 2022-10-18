package typings.elasticElasticsearch.libHelpersMod

import typings.elasticElasticsearch.libApiTypesMod.BulkUpdateOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateActionOperation extends StObject {
  
  var update: BulkUpdateOperation
}
object UpdateActionOperation {
  
  inline def apply(update: BulkUpdateOperation): UpdateActionOperation = {
    val __obj = js.Dynamic.literal(update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateActionOperation]
  }
  
  extension [Self <: UpdateActionOperation](x: Self) {
    
    inline def setUpdate(value: BulkUpdateOperation): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
