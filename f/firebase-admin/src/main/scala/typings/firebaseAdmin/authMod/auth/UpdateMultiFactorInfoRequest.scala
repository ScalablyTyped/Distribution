package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing common properties of a user enrolled second factor
  * for an `UpdateRequest`.
  */
@js.native
trait UpdateMultiFactorInfoRequest extends StObject {
  
  /**
    * The optional display name for an enrolled second factor.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The optional date the second factor was enrolled, formatted as a UTC string.
    */
  var enrollmentTime: js.UndefOr[String] = js.native
  
  /**
    * The type identifier of the second factor. For SMS second factors, this is `phone`.
    */
  var factorId: String = js.native
  
  /**
    * The ID of the enrolled second factor. This ID is unique to the user. When not provided,
    * a new one is provisioned by the Auth server.
    */
  var uid: js.UndefOr[String] = js.native
}
object UpdateMultiFactorInfoRequest {
  
  @scala.inline
  def apply(factorId: String): UpdateMultiFactorInfoRequest = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMultiFactorInfoRequest]
  }
  
  @scala.inline
  implicit class UpdateMultiFactorInfoRequestMutableBuilder[Self <: UpdateMultiFactorInfoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEnrollmentTime(value: String): Self = StObject.set(x, "enrollmentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrollmentTimeUndefined: Self = StObject.set(x, "enrollmentTime", js.undefined)
    
    @scala.inline
    def setFactorId(value: String): Self = StObject.set(x, "factorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
