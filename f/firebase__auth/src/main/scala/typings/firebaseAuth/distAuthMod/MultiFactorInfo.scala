package typings.firebaseAuth.distAuthMod

import typings.firebaseAuth.firebaseAuthStrings.phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiFactorInfo extends StObject {
  
  /** The user friendly name of the current second factor. */
  val displayName: js.UndefOr[String | Null] = js.undefined
  
  /** The enrollment date of the second factor formatted as a UTC string. */
  val enrollmentTime: String
  
  /** The identifier of the second factor. */
  val factorId: phone
  
  /** The multi-factor enrollment ID. */
  val uid: String
}
object MultiFactorInfo {
  
  inline def apply(enrollmentTime: String, uid: String): MultiFactorInfo = {
    val __obj = js.Dynamic.literal(enrollmentTime = enrollmentTime.asInstanceOf[js.Any], factorId = "phone", uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiFactorInfo] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnrollmentTime(value: String): Self = StObject.set(x, "enrollmentTime", value.asInstanceOf[js.Any])
    
    inline def setFactorId(value: phone): Self = StObject.set(x, "factorId", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
