package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetValidationResultRequest. */
@js.native
trait IGetValidationResultRequest extends StObject {
  
  /** GetValidationResultRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.native
  
  /** GetValidationResultRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
}
object IGetValidationResultRequest {
  
  @scala.inline
  def apply(): IGetValidationResultRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetValidationResultRequest]
  }
  
  @scala.inline
  implicit class IGetValidationResultRequestMutableBuilder[Self <: IGetValidationResultRequest] (val x: Self) extends AnyVal {
    
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
