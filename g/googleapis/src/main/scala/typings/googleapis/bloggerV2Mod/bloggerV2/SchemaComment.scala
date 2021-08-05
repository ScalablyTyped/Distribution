package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.googleapis.anon.Image
import typings.googleapis.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComment extends StObject {
  
  /**
    * The author of this Comment.
    */
  var author: js.UndefOr[Image] = js.undefined
  
  /**
    * Data about the blog containing this comment.
    */
  var blog: js.UndefOr[`0`] = js.undefined
  
  /**
    * The actual content of the comment. May include HTML markup.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for this resource.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Data about the comment this is in reply to.
    */
  var inReplyTo: js.UndefOr[`0`] = js.undefined
  
  /**
    * The kind of this entry. Always blogger#comment
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Data about the post containing this comment.
    */
  var post: js.UndefOr[`0`] = js.undefined
  
  /**
    * RFC 3339 date-time when this comment was published.
    */
  var published: js.UndefOr[String] = js.undefined
  
  /**
    * The API REST URL to fetch this resource from.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * RFC 3339 date-time when this comment was last updated.
    */
  var updated: js.UndefOr[String] = js.undefined
}
object SchemaComment {
  
  inline def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  
  extension [Self <: SchemaComment](x: Self) {
    
    inline def setAuthor(value: Image): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setBlog(value: `0`): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    inline def setBlogUndefined: Self = StObject.set(x, "blog", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInReplyTo(value: `0`): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
    
    inline def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPost(value: `0`): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setPublished(value: String): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
