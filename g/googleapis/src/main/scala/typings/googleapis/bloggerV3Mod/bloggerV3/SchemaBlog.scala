package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleapis.anon.Country
import typings.googleapis.anon.Items
import typings.googleapis.anon.SelfLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBlog extends StObject {
  
  /**
    * The JSON custom meta-data for the Blog
    */
  var customMetaData: js.UndefOr[String] = js.undefined
  
  /**
    * The description of this blog. This is displayed underneath the title.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for this resource.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of this entry. Always blogger#blog
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The locale this Blog is set to.
    */
  var locale: js.UndefOr[Country] = js.undefined
  
  /**
    * The name of this blog. This is displayed as the title.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The container of pages in this blog.
    */
  var pages: js.UndefOr[SelfLink] = js.undefined
  
  /**
    * The container of posts in this blog.
    */
  var posts: js.UndefOr[Items] = js.undefined
  
  /**
    * RFC 3339 date-time when this blog was published.
    */
  var published: js.UndefOr[String] = js.undefined
  
  /**
    * The API REST URL to fetch this resource from.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the blog.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * RFC 3339 date-time when this blog was last updated.
    */
  var updated: js.UndefOr[String] = js.undefined
  
  /**
    * The URL where this blog is published.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaBlog {
  
  inline def apply(): SchemaBlog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlog]
  }
  
  extension [Self <: SchemaBlog](x: Self) {
    
    inline def setCustomMetaData(value: String): Self = StObject.set(x, "customMetaData", value.asInstanceOf[js.Any])
    
    inline def setCustomMetaDataUndefined: Self = StObject.set(x, "customMetaData", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocale(value: Country): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPages(value: SelfLink): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPosts(value: Items): Self = StObject.set(x, "posts", value.asInstanceOf[js.Any])
    
    inline def setPostsUndefined: Self = StObject.set(x, "posts", js.undefined)
    
    inline def setPublished(value: String): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
