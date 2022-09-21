package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBlogsListbyuser
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var fetchUserInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    */
  var role: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Default value of status is LIVE.
    */
  var status: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    *
    */
  var userId: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceBlogsListbyuser {
  
  inline def apply(): ParamsResourceBlogsListbyuser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBlogsListbyuser]
  }
  
  extension [Self <: ParamsResourceBlogsListbyuser](x: Self) {
    
    inline def setFetchUserInfo(value: Boolean): Self = StObject.set(x, "fetchUserInfo", value.asInstanceOf[js.Any])
    
    inline def setFetchUserInfoUndefined: Self = StObject.set(x, "fetchUserInfo", js.undefined)
    
    inline def setRole(value: js.Array[String]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRoleVarargs(value: String*): Self = StObject.set(x, "role", js.Array(value*))
    
    inline def setStatus(value: js.Array[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusVarargs(value: String*): Self = StObject.set(x, "status", js.Array(value*))
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
