package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The multi-factor related user settings for update operations.
  */
@js.native
trait MultiFactorUpdateSettings extends StObject {
  
  /**
    * The updated list of enrolled second factors. The provided list overwrites the user's
    * existing list of second factors.
    * When null is passed, all of the user's existing second factors are removed.
    */
  var enrolledFactors: js.Array[UpdateMultiFactorInfoRequest] | Null = js.native
}
object MultiFactorUpdateSettings {
  
  @scala.inline
  def apply(): MultiFactorUpdateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiFactorUpdateSettings]
  }
  
  @scala.inline
  implicit class MultiFactorUpdateSettingsMutableBuilder[Self <: MultiFactorUpdateSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnrolledFactors(value: js.Array[UpdateMultiFactorInfoRequest]): Self = StObject.set(x, "enrolledFactors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrolledFactorsNull: Self = StObject.set(x, "enrolledFactors", null)
    
    @scala.inline
    def setEnrolledFactorsVarargs(value: UpdateMultiFactorInfoRequest*): Self = StObject.set(x, "enrolledFactors", js.Array(value :_*))
  }
}
