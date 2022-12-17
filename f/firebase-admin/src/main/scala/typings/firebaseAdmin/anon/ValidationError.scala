package typings.firebaseAdmin.anon

import typings.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.StatusErrorResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationError extends StObject {
  
  val published: js.UndefOr[Boolean] = js.undefined
  
  val validationError: js.UndefOr[StatusErrorResponse] = js.undefined
}
object ValidationError {
  
  inline def apply(): ValidationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationError]
  }
  
  extension [Self <: ValidationError](x: Self) {
    
    inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setValidationError(value: StatusErrorResponse): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
  }
}
