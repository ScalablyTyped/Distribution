package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBlogsGet
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var blogId: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var maxPosts: js.UndefOr[Double] = js.undefined
  
  /**
    *
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceBlogsGet {
  
  inline def apply(): ParamsResourceBlogsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBlogsGet]
  }
  
  extension [Self <: ParamsResourceBlogsGet](x: Self) {
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setMaxPosts(value: Double): Self = StObject.set(x, "maxPosts", value.asInstanceOf[js.Any])
    
    inline def setMaxPostsUndefined: Self = StObject.set(x, "maxPosts", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
