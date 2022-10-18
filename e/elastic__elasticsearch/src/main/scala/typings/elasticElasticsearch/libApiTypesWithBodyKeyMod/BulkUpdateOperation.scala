package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkUpdateOperation
  extends StObject
     with BulkOperationBase {
  
  var require_alias: js.UndefOr[Boolean] = js.undefined
  
  var retry_on_conflict: js.UndefOr[integer] = js.undefined
}
object BulkUpdateOperation {
  
  inline def apply(): BulkUpdateOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkUpdateOperation]
  }
  
  extension [Self <: BulkUpdateOperation](x: Self) {
    
    inline def setRequire_alias(value: Boolean): Self = StObject.set(x, "require_alias", value.asInstanceOf[js.Any])
    
    inline def setRequire_aliasUndefined: Self = StObject.set(x, "require_alias", js.undefined)
    
    inline def setRetry_on_conflict(value: integer): Self = StObject.set(x, "retry_on_conflict", value.asInstanceOf[js.Any])
    
    inline def setRetry_on_conflictUndefined: Self = StObject.set(x, "retry_on_conflict", js.undefined)
  }
}
