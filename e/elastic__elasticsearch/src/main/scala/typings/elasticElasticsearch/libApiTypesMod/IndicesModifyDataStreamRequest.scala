package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesModifyDataStreamRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var actions: js.Array[IndicesModifyDataStreamAction]
}
object IndicesModifyDataStreamRequest {
  
  inline def apply(actions: js.Array[IndicesModifyDataStreamAction]): IndicesModifyDataStreamRequest = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesModifyDataStreamRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesModifyDataStreamRequest] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[IndicesModifyDataStreamAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: IndicesModifyDataStreamAction*): Self = StObject.set(x, "actions", js.Array(value*))
  }
}
