package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User metadata to include when importing a user.
  */
trait UserMetadataRequest extends StObject {
  
  /**
    * The date the user was created, formatted as a UTC string.
    */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date the user last signed in, formatted as a UTC string.
    */
  var lastSignInTime: js.UndefOr[String] = js.undefined
}
object UserMetadataRequest {
  
  @scala.inline
  def apply(): UserMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserMetadataRequest]
  }
  
  @scala.inline
  implicit class UserMetadataRequestMutableBuilder[Self <: UserMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setLastSignInTime(value: String): Self = StObject.set(x, "lastSignInTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSignInTimeUndefined: Self = StObject.set(x, "lastSignInTime", js.undefined)
  }
}
