package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchUpdateEntityTypesResponse. */
@js.native
trait IBatchUpdateEntityTypesResponse extends StObject {
  
  /** BatchUpdateEntityTypesResponse entityTypes */
  var entityTypes: js.UndefOr[js.Array[IEntityType] | Null] = js.native
}
object IBatchUpdateEntityTypesResponse {
  
  @scala.inline
  def apply(): IBatchUpdateEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchUpdateEntityTypesResponse]
  }
  
  @scala.inline
  implicit class IBatchUpdateEntityTypesResponseMutableBuilder[Self <: IBatchUpdateEntityTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypes(value: js.Array[IEntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesNull: Self = StObject.set(x, "entityTypes", null)
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: IEntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
  }
}
