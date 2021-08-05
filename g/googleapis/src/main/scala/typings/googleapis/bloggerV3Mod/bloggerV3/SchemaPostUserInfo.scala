package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPostUserInfo extends StObject {
  
  /**
    * The kind of this entity. Always blogger#postUserInfo
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The Post resource.
    */
  var post: js.UndefOr[SchemaPost] = js.undefined
  
  /**
    * Information about a User for the Post.
    */
  var post_user_info: js.UndefOr[SchemaPostPerUserInfo] = js.undefined
}
object SchemaPostUserInfo {
  
  inline def apply(): SchemaPostUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostUserInfo]
  }
  
  extension [Self <: SchemaPostUserInfo](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPost(value: SchemaPost): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setPost_user_info(value: SchemaPostPerUserInfo): Self = StObject.set(x, "post_user_info", value.asInstanceOf[js.Any])
    
    inline def setPost_user_infoUndefined: Self = StObject.set(x, "post_user_info", js.undefined)
  }
}
