package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePagesUpdate
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var blogId: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var pageId: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var publish: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPage] = js.undefined
  
  /**
    *
    */
  var revert: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourcePagesUpdate {
  
  inline def apply(): ParamsResourcePagesUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePagesUpdate]
  }
  
  extension [Self <: ParamsResourcePagesUpdate](x: Self) {
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
    
    inline def setPageIdUndefined: Self = StObject.set(x, "pageId", js.undefined)
    
    inline def setPublish(value: Boolean): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
    
    inline def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
    
    inline def setRequestBody(value: SchemaPage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRevert(value: Boolean): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
    
    inline def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
  }
}
