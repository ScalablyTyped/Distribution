package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegistrationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The `registration_id` of the `Registration` to be deleted.
    */
  var registrationId: js.UndefOr[String] = js.undefined
}
object ParamsResourceRegistrationsDelete {
  
  @scala.inline
  def apply(): ParamsResourceRegistrationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegistrationsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceRegistrationsDeleteMutableBuilder[Self <: ParamsResourceRegistrationsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRegistrationId(value: String): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationIdUndefined: Self = StObject.set(x, "registrationId", js.undefined)
  }
}
