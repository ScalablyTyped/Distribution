package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetValidationResultRequest. */
trait IGetValidationResultRequest extends StObject {
  
  /** GetValidationResultRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** GetValidationResultRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IGetValidationResultRequest {
  
  inline def apply(): IGetValidationResultRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetValidationResultRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGetValidationResultRequest] (val x: Self) extends AnyVal {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
