package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.IEntity
import typings.dialogflow.mod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchUpdateEntitiesRequest. */
trait IBatchUpdateEntitiesRequest extends StObject {
  
  /** BatchUpdateEntitiesRequest entities */
  var entities: js.UndefOr[js.Array[IEntity] | Null] = js.undefined
  
  /** BatchUpdateEntitiesRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** BatchUpdateEntitiesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /** BatchUpdateEntitiesRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}
object IBatchUpdateEntitiesRequest {
  
  @scala.inline
  def apply(): IBatchUpdateEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchUpdateEntitiesRequest]
  }
  
  @scala.inline
  implicit class IBatchUpdateEntitiesRequestMutableBuilder[Self <: IBatchUpdateEntitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[IEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesNull: Self = StObject.set(x, "entities", null)
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: IEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
