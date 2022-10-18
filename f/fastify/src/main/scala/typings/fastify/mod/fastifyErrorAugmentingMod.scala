package typings.fastify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object fastifyErrorAugmentingMod {
  
  trait FastifyError extends StObject {
    
    var validation: js.UndefOr[js.Array[ValidationResult]] = js.undefined
  }
  object FastifyError {
    
    inline def apply(): FastifyError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifyError]
    }
    
    extension [Self <: FastifyError](x: Self) {
      
      inline def setValidation(value: js.Array[ValidationResult]): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
      
      inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
      
      inline def setValidationVarargs(value: ValidationResult*): Self = StObject.set(x, "validation", js.Array(value*))
    }
  }
}
