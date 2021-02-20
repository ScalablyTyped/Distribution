package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListContextsResponse. */
@js.native
trait IListContextsResponse extends StObject {
  
  /** ListContextsResponse contexts */
  var contexts: js.UndefOr[js.Array[IContext] | Null] = js.native
  
  /** ListContextsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.native
}
object IListContextsResponse {
  
  @scala.inline
  def apply(): IListContextsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListContextsResponse]
  }
  
  @scala.inline
  implicit class IListContextsResponseMutableBuilder[Self <: IListContextsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContexts(value: js.Array[IContext]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsNull: Self = StObject.set(x, "contexts", null)
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: IContext*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
