package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePostsGetbypath
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var blogId: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var maxComments: js.UndefOr[Double] = js.undefined
  
  /**
    *
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourcePostsGetbypath {
  
  inline def apply(): ParamsResourcePostsGetbypath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsGetbypath]
  }
  
  extension [Self <: ParamsResourcePostsGetbypath](x: Self) {
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setMaxComments(value: Double): Self = StObject.set(x, "maxComments", value.asInstanceOf[js.Any])
    
    inline def setMaxCommentsUndefined: Self = StObject.set(x, "maxComments", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
