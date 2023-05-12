package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalizeEnrollmentTime extends StObject {
  
  var finalizeEnrollmentTime: Double
  
  var hashingAlgorithm: String
  
  var periodSec: Double
  
  var sessionInfo: String
  
  var sharedSecretKey: String
  
  var verificationCodeLength: Double
}
object FinalizeEnrollmentTime {
  
  inline def apply(
    finalizeEnrollmentTime: Double,
    hashingAlgorithm: String,
    periodSec: Double,
    sessionInfo: String,
    sharedSecretKey: String,
    verificationCodeLength: Double
  ): FinalizeEnrollmentTime = {
    val __obj = js.Dynamic.literal(finalizeEnrollmentTime = finalizeEnrollmentTime.asInstanceOf[js.Any], hashingAlgorithm = hashingAlgorithm.asInstanceOf[js.Any], periodSec = periodSec.asInstanceOf[js.Any], sessionInfo = sessionInfo.asInstanceOf[js.Any], sharedSecretKey = sharedSecretKey.asInstanceOf[js.Any], verificationCodeLength = verificationCodeLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalizeEnrollmentTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FinalizeEnrollmentTime] (val x: Self) extends AnyVal {
    
    inline def setFinalizeEnrollmentTime(value: Double): Self = StObject.set(x, "finalizeEnrollmentTime", value.asInstanceOf[js.Any])
    
    inline def setHashingAlgorithm(value: String): Self = StObject.set(x, "hashingAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setPeriodSec(value: Double): Self = StObject.set(x, "periodSec", value.asInstanceOf[js.Any])
    
    inline def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    inline def setSharedSecretKey(value: String): Self = StObject.set(x, "sharedSecretKey", value.asInstanceOf[js.Any])
    
    inline def setVerificationCodeLength(value: Double): Self = StObject.set(x, "verificationCodeLength", value.asInstanceOf[js.Any])
  }
}
