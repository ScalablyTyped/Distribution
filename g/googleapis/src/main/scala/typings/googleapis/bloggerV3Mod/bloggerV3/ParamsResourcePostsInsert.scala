package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePostsInsert
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
  var isDraft: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPost] = js.undefined
}
object ParamsResourcePostsInsert {
  
  inline def apply(): ParamsResourcePostsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsInsert]
  }
  
  extension [Self <: ParamsResourcePostsInsert](x: Self) {
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setFetchBody(value: Boolean): Self = StObject.set(x, "fetchBody", value.asInstanceOf[js.Any])
    
    inline def setFetchBodyUndefined: Self = StObject.set(x, "fetchBody", js.undefined)
    
    inline def setFetchImages(value: Boolean): Self = StObject.set(x, "fetchImages", value.asInstanceOf[js.Any])
    
    inline def setFetchImagesUndefined: Self = StObject.set(x, "fetchImages", js.undefined)
    
    inline def setIsDraft(value: Boolean): Self = StObject.set(x, "isDraft", value.asInstanceOf[js.Any])
    
    inline def setIsDraftUndefined: Self = StObject.set(x, "isDraft", js.undefined)
    
    inline def setRequestBody(value: SchemaPost): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
