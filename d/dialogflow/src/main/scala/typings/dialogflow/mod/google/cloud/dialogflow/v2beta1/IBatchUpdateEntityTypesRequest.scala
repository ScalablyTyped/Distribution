package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchUpdateEntityTypesRequest. */
@js.native
trait IBatchUpdateEntityTypesRequest extends StObject {
  
  /** BatchUpdateEntityTypesRequest entityTypeBatchInline */
  var entityTypeBatchInline: js.UndefOr[IEntityTypeBatch | Null] = js.native
  
  /** BatchUpdateEntityTypesRequest entityTypeBatchUri */
  var entityTypeBatchUri: js.UndefOr[String | Null] = js.native
  
  /** BatchUpdateEntityTypesRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.native
  
  /** BatchUpdateEntityTypesRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
  
  /** BatchUpdateEntityTypesRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.native
}
object IBatchUpdateEntityTypesRequest {
  
  @scala.inline
  def apply(): IBatchUpdateEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchUpdateEntityTypesRequest]
  }
  
  @scala.inline
  implicit class IBatchUpdateEntityTypesRequestMutableBuilder[Self <: IBatchUpdateEntityTypesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypeBatchInline(value: IEntityTypeBatch): Self = StObject.set(x, "entityTypeBatchInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeBatchInlineNull: Self = StObject.set(x, "entityTypeBatchInline", null)
    
    @scala.inline
    def setEntityTypeBatchInlineUndefined: Self = StObject.set(x, "entityTypeBatchInline", js.undefined)
    
    @scala.inline
    def setEntityTypeBatchUri(value: String): Self = StObject.set(x, "entityTypeBatchUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeBatchUriNull: Self = StObject.set(x, "entityTypeBatchUri", null)
    
    @scala.inline
    def setEntityTypeBatchUriUndefined: Self = StObject.set(x, "entityTypeBatchUri", js.undefined)
    
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
