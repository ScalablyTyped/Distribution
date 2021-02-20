package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchDeleteEntityTypesRequest. */
@js.native
trait IBatchDeleteEntityTypesRequest extends StObject {
  
  /** BatchDeleteEntityTypesRequest entityTypeNames */
  var entityTypeNames: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** BatchDeleteEntityTypesRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
}
object IBatchDeleteEntityTypesRequest {
  
  @scala.inline
  def apply(): IBatchDeleteEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchDeleteEntityTypesRequest]
  }
  
  @scala.inline
  implicit class IBatchDeleteEntityTypesRequestMutableBuilder[Self <: IBatchDeleteEntityTypesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypeNames(value: js.Array[String]): Self = StObject.set(x, "entityTypeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeNamesNull: Self = StObject.set(x, "entityTypeNames", null)
    
    @scala.inline
    def setEntityTypeNamesUndefined: Self = StObject.set(x, "entityTypeNames", js.undefined)
    
    @scala.inline
    def setEntityTypeNamesVarargs(value: String*): Self = StObject.set(x, "entityTypeNames", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
