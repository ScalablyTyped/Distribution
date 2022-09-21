package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePostsPatch
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var blogId: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var fetchBody: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    */
  var fetchImages: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    */
  var maxComments: js.UndefOr[Double] = js.undefined
  
  /**
    *
    */
  var postId: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var publish: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPost] = js.undefined
  
  /**
    *
    */
  var revert: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourcePostsPatch {
  
  inline def apply(): ParamsResourcePostsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsPatch]
  }
  
  extension [Self <: ParamsResourcePostsPatch](x: Self) {
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setFetchBody(value: Boolean): Self = StObject.set(x, "fetchBody", value.asInstanceOf[js.Any])
    
    inline def setFetchBodyUndefined: Self = StObject.set(x, "fetchBody", js.undefined)
    
    inline def setFetchImages(value: Boolean): Self = StObject.set(x, "fetchImages", value.asInstanceOf[js.Any])
    
    inline def setFetchImagesUndefined: Self = StObject.set(x, "fetchImages", js.undefined)
    
    inline def setMaxComments(value: Double): Self = StObject.set(x, "maxComments", value.asInstanceOf[js.Any])
    
    inline def setMaxCommentsUndefined: Self = StObject.set(x, "maxComments", js.undefined)
    
    inline def setPostId(value: String): Self = StObject.set(x, "postId", value.asInstanceOf[js.Any])
    
    inline def setPostIdUndefined: Self = StObject.set(x, "postId", js.undefined)
    
    inline def setPublish(value: Boolean): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
    
    inline def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
    
    inline def setRequestBody(value: SchemaPost): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRevert(value: Boolean): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
    
    inline def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
  }
}
