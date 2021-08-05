package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateEntityTypeRequest. */
trait IUpdateEntityTypeRequest extends StObject {
  
  /** UpdateEntityTypeRequest entityType */
  var entityType: js.UndefOr[IEntityType | Null] = js.undefined
  
  /** UpdateEntityTypeRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** UpdateEntityTypeRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}
object IUpdateEntityTypeRequest {
  
  inline def apply(): IUpdateEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateEntityTypeRequest]
  }
  
  extension [Self <: IUpdateEntityTypeRequest](x: Self) {
    
    inline def setEntityType(value: IEntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeNull: Self = StObject.set(x, "entityType", null)
    
    inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
