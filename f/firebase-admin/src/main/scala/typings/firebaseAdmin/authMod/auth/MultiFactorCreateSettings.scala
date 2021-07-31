package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The multi-factor related user settings for create operations.
  */
trait MultiFactorCreateSettings extends StObject {
  
  /**
    * The created user's list of enrolled second factors.
    */
  var enrolledFactors: js.Array[CreateMultiFactorInfoRequest]
}
object MultiFactorCreateSettings {
  
  @scala.inline
  def apply(enrolledFactors: js.Array[CreateMultiFactorInfoRequest]): MultiFactorCreateSettings = {
    val __obj = js.Dynamic.literal(enrolledFactors = enrolledFactors.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorCreateSettings]
  }
  
  @scala.inline
  implicit class MultiFactorCreateSettingsMutableBuilder[Self <: MultiFactorCreateSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnrolledFactors(value: js.Array[CreateMultiFactorInfoRequest]): Self = StObject.set(x, "enrolledFactors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrolledFactorsVarargs(value: CreateMultiFactorInfoRequest*): Self = StObject.set(x, "enrolledFactors", js.Array(value :_*))
  }
}
