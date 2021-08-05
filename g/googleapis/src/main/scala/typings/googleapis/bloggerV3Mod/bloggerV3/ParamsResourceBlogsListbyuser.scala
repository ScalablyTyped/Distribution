package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBlogsListbyuser
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Whether the response is a list of blogs with per-user information instead
    * of just blogs.
    */
  var fetchUserInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * User access types for blogs to include in the results, e.g. AUTHOR will
    * return blogs where the user has author level access. If no roles are
    * specified, defaults to ADMIN and AUTHOR roles.
    */
  var role: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Blog statuses to include in the result (default: Live blogs only). Note
    * that ADMIN access is required to view deleted blogs.
    */
  var status: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * ID of the user whose blogs are to be fetched. Either the word 'self'
    * (sans quote marks) or the user's profile identifier.
    */
  var userId: js.UndefOr[String] = js.undefined
  
  /**
    * Access level with which to view the blogs. Note that some fields require
    * elevated access.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceBlogsListbyuser {
  
  inline def apply(): ParamsResourceBlogsListbyuser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBlogsListbyuser]
  }
  
  extension [Self <: ParamsResourceBlogsListbyuser](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFetchUserInfo(value: Boolean): Self = StObject.set(x, "fetchUserInfo", value.asInstanceOf[js.Any])
    
    inline def setFetchUserInfoUndefined: Self = StObject.set(x, "fetchUserInfo", js.undefined)
    
    inline def setRole(value: js.Array[String]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRoleVarargs(value: String*): Self = StObject.set(x, "role", js.Array(value :_*))
    
    inline def setStatus(value: js.Array[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusVarargs(value: String*): Self = StObject.set(x, "status", js.Array(value :_*))
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
