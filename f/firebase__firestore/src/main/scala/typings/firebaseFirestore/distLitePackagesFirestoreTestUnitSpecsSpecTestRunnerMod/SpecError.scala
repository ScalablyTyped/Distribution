package typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecError extends StObject {
  
  var code: Double
  
  var message: String
}
object SpecError {
  
  inline def apply(code: Double, message: String): SpecError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
