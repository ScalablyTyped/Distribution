package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesModifyDataStreamAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: js.Array[IndicesModifyDataStreamAction]
}
object Actions {
  
  inline def apply(actions: js.Array[IndicesModifyDataStreamAction]): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  extension [Self <: Actions](x: Self) {
    
    inline def setActions(value: js.Array[IndicesModifyDataStreamAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: IndicesModifyDataStreamAction*): Self = StObject.set(x, "actions", js.Array(value*))
  }
}
