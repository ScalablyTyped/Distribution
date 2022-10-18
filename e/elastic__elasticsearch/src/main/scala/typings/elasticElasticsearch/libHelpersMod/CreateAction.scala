package typings.elasticElasticsearch.libHelpersMod

import typings.elasticElasticsearch.libApiTypesMod.BulkCreateOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAction
  extends StObject
     with _Action {
  
  var create: BulkCreateOperation
}
object CreateAction {
  
  inline def apply(create: BulkCreateOperation): CreateAction = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAction]
  }
  
  extension [Self <: CreateAction](x: Self) {
    
    inline def setCreate(value: BulkCreateOperation): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
  }
}
