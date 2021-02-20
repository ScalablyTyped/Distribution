package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateEntityTypeRequest. */
@js.native
trait IUpdateEntityTypeRequest extends StObject {
  
  /** UpdateEntityTypeRequest entityType */
  var entityType: js.UndefOr[IEntityType | Null] = js.native
  
  /** UpdateEntityTypeRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.native
  
  /** UpdateEntityTypeRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.native
}
object IUpdateEntityTypeRequest {
  
  @scala.inline
  def apply(): IUpdateEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateEntityTypeRequest]
  }
  
  @scala.inline
  implicit class IUpdateEntityTypeRequestMutableBuilder[Self <: IUpdateEntityTypeRequest] (val x: Self) extends AnyVal {
    
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
    def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
