package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListSessionEntityTypesResponse. */
@js.native
trait IListSessionEntityTypesResponse extends StObject {
  
  /** ListSessionEntityTypesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.native
  
  /** ListSessionEntityTypesResponse sessionEntityTypes */
  var sessionEntityTypes: js.UndefOr[js.Array[ISessionEntityType] | Null] = js.native
}
object IListSessionEntityTypesResponse {
  
  @scala.inline
  def apply(): IListSessionEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListSessionEntityTypesResponse]
  }
  
  @scala.inline
  implicit class IListSessionEntityTypesResponseMutableBuilder[Self <: IListSessionEntityTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSessionEntityTypes(value: js.Array[ISessionEntityType]): Self = StObject.set(x, "sessionEntityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionEntityTypesNull: Self = StObject.set(x, "sessionEntityTypes", null)
    
    @scala.inline
    def setSessionEntityTypesUndefined: Self = StObject.set(x, "sessionEntityTypes", js.undefined)
    
    @scala.inline
    def setSessionEntityTypesVarargs(value: ISessionEntityType*): Self = StObject.set(x, "sessionEntityTypes", js.Array(value :_*))
  }
}
