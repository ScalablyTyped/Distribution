package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateEntityTypeRequest. */
@js.native
trait ICreateEntityTypeRequest extends StObject {
  
  /** CreateEntityTypeRequest entityType */
  var entityType: js.UndefOr[IEntityType | Null] = js.native
  
  /** CreateEntityTypeRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.native
  
  /** CreateEntityTypeRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
}
object ICreateEntityTypeRequest {
  
  @scala.inline
  def apply(): ICreateEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateEntityTypeRequest]
  }
  
  @scala.inline
  implicit class ICreateEntityTypeRequestMutableBuilder[Self <: ICreateEntityTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityType(value: IEntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeNull: Self = StObject.set(x, "entityType", null)
    
    @scala.inline
    def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
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
