package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.cloud.dialogflow.v2.EntityType.IEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchCreateEntitiesRequest. */
trait IBatchCreateEntitiesRequest extends StObject {
  
  /** BatchCreateEntitiesRequest entities */
  var entities: js.UndefOr[js.Array[IEntity] | Null] = js.undefined
  
  /** BatchCreateEntitiesRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** BatchCreateEntitiesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IBatchCreateEntitiesRequest {
  
  @scala.inline
  def apply(): IBatchCreateEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchCreateEntitiesRequest]
  }
  
  @scala.inline
  implicit class IBatchCreateEntitiesRequestMutableBuilder[Self <: IBatchCreateEntitiesRequest] (val x: Self) extends AnyVal {
    
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
  }
}
