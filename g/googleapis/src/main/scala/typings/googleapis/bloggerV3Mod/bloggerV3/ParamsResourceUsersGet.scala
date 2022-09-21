package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersGet
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersGet {
  
  inline def apply(): ParamsResourceUsersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersGet]
  }
  
  extension [Self <: ParamsResourceUsersGet](x: Self) {
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
