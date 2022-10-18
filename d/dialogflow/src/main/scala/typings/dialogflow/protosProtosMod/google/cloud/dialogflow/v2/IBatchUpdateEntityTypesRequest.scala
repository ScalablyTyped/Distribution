package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.dialogflow.protosProtosMod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchUpdateEntityTypesRequest. */
trait IBatchUpdateEntityTypesRequest extends StObject {
  
  /** BatchUpdateEntityTypesRequest entityTypeBatchInline */
  var entityTypeBatchInline: js.UndefOr[IEntityTypeBatch | Null] = js.undefined
  
  /** BatchUpdateEntityTypesRequest entityTypeBatchUri */
  var entityTypeBatchUri: js.UndefOr[String | Null] = js.undefined
  
  /** BatchUpdateEntityTypesRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** BatchUpdateEntityTypesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /** BatchUpdateEntityTypesRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}
object IBatchUpdateEntityTypesRequest {
  
  inline def apply(): IBatchUpdateEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchUpdateEntityTypesRequest]
  }
  
  extension [Self <: IBatchUpdateEntityTypesRequest](x: Self) {
    
    inline def setEntityTypeBatchInline(value: IEntityTypeBatch): Self = StObject.set(x, "entityTypeBatchInline", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeBatchInlineNull: Self = StObject.set(x, "entityTypeBatchInline", null)
    
    inline def setEntityTypeBatchInlineUndefined: Self = StObject.set(x, "entityTypeBatchInline", js.undefined)
    
    inline def setEntityTypeBatchUri(value: String): Self = StObject.set(x, "entityTypeBatchUri", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeBatchUriNull: Self = StObject.set(x, "entityTypeBatchUri", null)
    
    inline def setEntityTypeBatchUriUndefined: Self = StObject.set(x, "entityTypeBatchUri", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
