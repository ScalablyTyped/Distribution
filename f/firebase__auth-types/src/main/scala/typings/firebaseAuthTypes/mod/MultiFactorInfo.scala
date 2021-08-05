package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiFactorInfo extends StObject {
  
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  var enrollmentTime: String
  
  var factorId: String
  
  var uid: String
}
object MultiFactorInfo {
  
  inline def apply(enrollmentTime: String, factorId: String, uid: String): MultiFactorInfo = {
    val __obj = js.Dynamic.literal(enrollmentTime = enrollmentTime.asInstanceOf[js.Any], factorId = factorId.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorInfo]
  }
  
  extension [Self <: MultiFactorInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnrollmentTime(value: String): Self = StObject.set(x, "enrollmentTime", value.asInstanceOf[js.Any])
    
    inline def setFactorId(value: String): Self = StObject.set(x, "factorId", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
