package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListKnowledgeBasesRequest. */
trait IListKnowledgeBasesRequest extends StObject {
  
  /** ListKnowledgeBasesRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /** ListKnowledgeBasesRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListKnowledgeBasesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IListKnowledgeBasesRequest {
  
  inline def apply(): IListKnowledgeBasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListKnowledgeBasesRequest]
  }
  
  extension [Self <: IListKnowledgeBasesRequest](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
