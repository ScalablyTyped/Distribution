package typings.firebaseAuth.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MFA Info as returned by the API
  */
trait BaseMfaEnrollment extends StObject {
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var enrolledAt: Double
  
  var mfaEnrollmentId: String
}
object BaseMfaEnrollment {
  
  inline def apply(enrolledAt: Double, mfaEnrollmentId: String): BaseMfaEnrollment = {
    val __obj = js.Dynamic.literal(enrolledAt = enrolledAt.asInstanceOf[js.Any], mfaEnrollmentId = mfaEnrollmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMfaEnrollment]
  }
  
  extension [Self <: BaseMfaEnrollment](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnrolledAt(value: Double): Self = StObject.set(x, "enrolledAt", value.asInstanceOf[js.Any])
    
    inline def setMfaEnrollmentId(value: String): Self = StObject.set(x, "mfaEnrollmentId", value.asInstanceOf[js.Any])
  }
}
