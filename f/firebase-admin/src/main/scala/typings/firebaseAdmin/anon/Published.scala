package typings.firebaseAdmin.anon

import typings.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.StatusErrorResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Published extends StObject {
  
  val published: js.UndefOr[Boolean] = js.undefined
  
  val validationError: js.UndefOr[StatusErrorResponse] = js.undefined
}
object Published {
  
  inline def apply(): Published = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Published]
  }
  
  extension [Self <: Published](x: Self) {
    
    inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setValidationError(value: StatusErrorResponse): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
  }
}
