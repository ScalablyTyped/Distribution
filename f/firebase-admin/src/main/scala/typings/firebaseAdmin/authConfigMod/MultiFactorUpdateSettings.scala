package typings.firebaseAdmin.authConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiFactorUpdateSettings extends StObject {
  
  /**
    * The updated list of enrolled second factors. The provided list overwrites the user's
    * existing list of second factors.
    * When null is passed, all of the user's existing second factors are removed.
    */
  var enrolledFactors: js.Array[UpdateMultiFactorInfoRequest] | Null
}
object MultiFactorUpdateSettings {
  
  inline def apply(): MultiFactorUpdateSettings = {
    val __obj = js.Dynamic.literal(enrolledFactors = null)
    __obj.asInstanceOf[MultiFactorUpdateSettings]
  }
  
  extension [Self <: MultiFactorUpdateSettings](x: Self) {
    
    inline def setEnrolledFactors(value: js.Array[UpdateMultiFactorInfoRequest]): Self = StObject.set(x, "enrolledFactors", value.asInstanceOf[js.Any])
    
    inline def setEnrolledFactorsNull: Self = StObject.set(x, "enrolledFactors", null)
    
    inline def setEnrolledFactorsVarargs(value: UpdateMultiFactorInfoRequest*): Self = StObject.set(x, "enrolledFactors", js.Array(value*))
  }
}
