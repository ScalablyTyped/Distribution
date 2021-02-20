package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The multi-factor related user settings.
  */
@js.native
trait MultiFactorSettings extends StObject {
  
  /**
    * List of second factors enrolled with the current user.
    * Currently only phone second factors are supported.
    */
  var enrolledFactors: js.Array[MultiFactorInfo] = js.native
  
  /**
    * @return A JSON-serializable representation of this multi-factor object.
    */
  def toJSON(): js.Object = js.native
}
object MultiFactorSettings {
  
  @scala.inline
  def apply(enrolledFactors: js.Array[MultiFactorInfo], toJSON: () => js.Object): MultiFactorSettings = {
    val __obj = js.Dynamic.literal(enrolledFactors = enrolledFactors.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[MultiFactorSettings]
  }
  
  @scala.inline
  implicit class MultiFactorSettingsMutableBuilder[Self <: MultiFactorSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnrolledFactors(value: js.Array[MultiFactorInfo]): Self = StObject.set(x, "enrolledFactors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrolledFactorsVarargs(value: MultiFactorInfo*): Self = StObject.set(x, "enrolledFactors", js.Array(value :_*))
    
    @scala.inline
    def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
