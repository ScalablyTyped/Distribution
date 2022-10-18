package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteOperation
  extends StObject
     with BulkOperationBase {
  
  var dynamic_templates: js.UndefOr[Record[String, String]] = js.undefined
  
  var pipeline: js.UndefOr[String] = js.undefined
  
  var require_alias: js.UndefOr[Boolean] = js.undefined
}
object BulkWriteOperation {
  
  inline def apply(): BulkWriteOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkWriteOperation]
  }
  
  extension [Self <: BulkWriteOperation](x: Self) {
    
    inline def setDynamic_templates(value: Record[String, String]): Self = StObject.set(x, "dynamic_templates", value.asInstanceOf[js.Any])
    
    inline def setDynamic_templatesUndefined: Self = StObject.set(x, "dynamic_templates", js.undefined)
    
    inline def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setRequire_alias(value: Boolean): Self = StObject.set(x, "require_alias", value.asInstanceOf[js.Any])
    
    inline def setRequire_aliasUndefined: Self = StObject.set(x, "require_alias", js.undefined)
  }
}
