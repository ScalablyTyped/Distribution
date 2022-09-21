package typings.googleapis.bloggerV2Mod.bloggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBlogsList
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceBlogsList {
  
  inline def apply(): ParamsResourceBlogsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBlogsList]
  }
  
  extension [Self <: ParamsResourceBlogsList](x: Self) {
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
