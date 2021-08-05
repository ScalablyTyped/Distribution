package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The multi-factor related user settings.
  */
trait MultiFactorSettings extends StObject {
  
  /**
    * List of second factors enrolled with the current user.
    * Currently only phone second factors are supported.
    */
  var enrolledFactors: js.Array[MultiFactorInfo]
  
  /**
    * @return A JSON-serializable representation of this multi-factor object.
    */
  def toJSON(): js.Object
}
object MultiFactorSettings {
  
  inline def apply(enrolledFactors: js.Array[MultiFactorInfo], toJSON: () => js.Object): MultiFactorSettings = {
    val __obj = js.Dynamic.literal(enrolledFactors = enrolledFactors.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[MultiFactorSettings]
  }
  
  extension [Self <: MultiFactorSettings](x: Self) {
    
    inline def setEnrolledFactors(value: js.Array[MultiFactorInfo]): Self = StObject.set(x, "enrolledFactors", value.asInstanceOf[js.Any])
    
    inline def setEnrolledFactorsVarargs(value: MultiFactorInfo*): Self = StObject.set(x, "enrolledFactors", js.Array(value :_*))
    
    inline def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
