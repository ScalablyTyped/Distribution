package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing the common properties of a user enrolled second factor.
  */
trait MultiFactorInfo extends StObject {
  
  /**
    * The optional display name of the enrolled second factor.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The optional date the second factor was enrolled, formatted as a UTC string.
    */
  var enrollmentTime: js.UndefOr[String] = js.undefined
  
  /**
    * The type identifier of the second factor. For SMS second factors, this is `phone`.
    */
  var factorId: String
  
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object
  
  /**
    * The ID of the enrolled second factor. This ID is unique to the user.
    */
  var uid: String
}
object MultiFactorInfo {
  
  inline def apply(factorId: String, toJSON: () => js.Object, uid: String): MultiFactorInfo = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorInfo]
  }
  
  extension [Self <: MultiFactorInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnrollmentTime(value: String): Self = StObject.set(x, "enrollmentTime", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentTimeUndefined: Self = StObject.set(x, "enrollmentTime", js.undefined)
    
    inline def setFactorId(value: String): Self = StObject.set(x, "factorId", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
