package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateEntityTypeRequest. */
trait ICreateEntityTypeRequest extends StObject {
  
  /** CreateEntityTypeRequest entityType */
  var entityType: js.UndefOr[IEntityType | Null] = js.undefined
  
  /** CreateEntityTypeRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** CreateEntityTypeRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object ICreateEntityTypeRequest {
  
  inline def apply(): ICreateEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateEntityTypeRequest]
  }
  
  extension [Self <: ICreateEntityTypeRequest](x: Self) {
    
    inline def setEntityType(value: IEntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeNull: Self = StObject.set(x, "entityType", null)
    
    inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
