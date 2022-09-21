package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePostsPublish
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var blogId: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var postId: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var publishDate: js.UndefOr[String] = js.undefined
}
object ParamsResourcePostsPublish {
  
  inline def apply(): ParamsResourcePostsPublish = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsPublish]
  }
  
  extension [Self <: ParamsResourcePostsPublish](x: Self) {
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setPostId(value: String): Self = StObject.set(x, "postId", value.asInstanceOf[js.Any])
    
    inline def setPostIdUndefined: Self = StObject.set(x, "postId", js.undefined)
    
    inline def setPublishDate(value: String): Self = StObject.set(x, "publishDate", value.asInstanceOf[js.Any])
    
    inline def setPublishDateUndefined: Self = StObject.set(x, "publishDate", js.undefined)
  }
}
