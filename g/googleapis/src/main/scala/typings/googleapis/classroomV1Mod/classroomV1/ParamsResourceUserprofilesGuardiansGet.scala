package typings.googleapis.classroomV1Mod.classroomV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUserprofilesGuardiansGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The `id` field from a `Guardian`.
    */
  var guardianId: js.UndefOr[String] = js.undefined
  
  /**
    * The student whose guardian is being requested. One of the following:  *
    * the numeric identifier for the user * the email address of the user * the
    * string literal `"me"`, indicating the requesting user
    */
  var studentId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUserprofilesGuardiansGet {
  
  inline def apply(): ParamsResourceUserprofilesGuardiansGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUserprofilesGuardiansGet]
  }
  
  extension [Self <: ParamsResourceUserprofilesGuardiansGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setGuardianId(value: String): Self = StObject.set(x, "guardianId", value.asInstanceOf[js.Any])
    
    inline def setGuardianIdUndefined: Self = StObject.set(x, "guardianId", js.undefined)
    
    inline def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
    
    inline def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
  }
}
