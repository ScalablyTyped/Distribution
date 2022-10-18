package typings.elasticElasticsearch.libHelpersMod

import typings.elasticElasticsearch.libApiTypesMod.BulkCreateOperation
import typings.elasticElasticsearch.libApiTypesMod.BulkDeleteOperation
import typings.elasticElasticsearch.libApiTypesMod.BulkIndexOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Action extends StObject
object _Action {
  
  inline def CreateAction(create: BulkCreateOperation): typings.elasticElasticsearch.libHelpersMod.CreateAction = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libHelpersMod.CreateAction]
  }
  
  inline def DeleteAction(delete: BulkDeleteOperation): typings.elasticElasticsearch.libHelpersMod.DeleteAction = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libHelpersMod.DeleteAction]
  }
  
  inline def IndexAction(index: BulkIndexOperation): typings.elasticElasticsearch.libHelpersMod.IndexAction = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libHelpersMod.IndexAction]
  }
}
