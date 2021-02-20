package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListIntentsResponse. */
@js.native
trait IListIntentsResponse extends StObject {
  
  /** ListIntentsResponse intents */
  var intents: js.UndefOr[js.Array[IIntent] | Null] = js.native
  
  /** ListIntentsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.native
}
object IListIntentsResponse {
  
  @scala.inline
  def apply(): IListIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListIntentsResponse]
  }
  
  @scala.inline
  implicit class IListIntentsResponseMutableBuilder[Self <: IListIntentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntents(value: js.Array[IIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsNull: Self = StObject.set(x, "intents", null)
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: IIntent*): Self = StObject.set(x, "intents", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
