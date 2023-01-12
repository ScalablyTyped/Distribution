package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiFactorCreateSettings extends StObject {
  
  /**
    * The created user's list of enrolled second factors.
    */
  var enrolledFactors: js.Array[CreateMultiFactorInfoRequest]
}
object MultiFactorCreateSettings {
  
  inline def apply(enrolledFactors: js.Array[CreateMultiFactorInfoRequest]): MultiFactorCreateSettings = {
    val __obj = js.Dynamic.literal(enrolledFactors = enrolledFactors.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorCreateSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiFactorCreateSettings] (val x: Self) extends AnyVal {
    
    inline def setEnrolledFactors(value: js.Array[CreateMultiFactorInfoRequest]): Self = StObject.set(x, "enrolledFactors", value.asInstanceOf[js.Any])
    
    inline def setEnrolledFactorsVarargs(value: CreateMultiFactorInfoRequest*): Self = StObject.set(x, "enrolledFactors", js.Array(value*))
  }
}
