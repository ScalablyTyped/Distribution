package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.googleapis.anon.Image
import typings.googleapis.anon.Lat
import typings.googleapis.anon.TotalItems
import typings.googleapis.anon.Url
import typings.googleapis.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPost extends StObject {
  
  /**
    * The author of this Post.
    */
  var author: js.UndefOr[Image | Null] = js.undefined
  
  /**
    * Data about the blog containing this Post.
    */
  var blog: js.UndefOr[`0` | Null] = js.undefined
  
  /**
    * The content of the Post. May contain HTML markup.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The JSON meta-data for the Post.
    */
  var customMetaData: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Etag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The identifier of this Post.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display image for the Post.
    */
  var images: js.UndefOr[js.Array[Url] | Null] = js.undefined
  
  /**
    * The kind of this entity. Always blogger#post.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of labels this Post was tagged with.
    */
  var labels: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The location for geotagged posts.
    */
  var location: js.UndefOr[Lat | Null] = js.undefined
  
  /**
    * RFC 3339 date-time when this Post was published.
    */
  var published: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Comment control and display setting for readers of this post.
    */
  var readerComments: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The container of comments on this Post.
    */
  var replies: js.UndefOr[TotalItems | Null] = js.undefined
  
  /**
    * The API REST URL to fetch this resource from.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the post. Only set for admin-level requests.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title of the Post.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title link URL, similar to atom's related link.
    */
  var titleLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * RFC 3339 date-time when this Post was last trashed.
    */
  var trashed: js.UndefOr[String | Null] = js.undefined
  
  /**
    * RFC 3339 date-time when this Post was last updated.
    */
  var updated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL where this Post is displayed.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaPost {
  
  inline def apply(): SchemaPost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPost]
  }
  
  extension [Self <: SchemaPost](x: Self) {
    
    inline def setAuthor(value: Image): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setBlog(value: `0`): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    inline def setBlogNull: Self = StObject.set(x, "blog", null)
    
    inline def setBlogUndefined: Self = StObject.set(x, "blog", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCustomMetaData(value: String): Self = StObject.set(x, "customMetaData", value.asInstanceOf[js.Any])
    
    inline def setCustomMetaDataNull: Self = StObject.set(x, "customMetaData", null)
    
    inline def setCustomMetaDataUndefined: Self = StObject.set(x, "customMetaData", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImages(value: js.Array[Url]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesNull: Self = StObject.set(x, "images", null)
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: Url*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLocation(value: Lat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPublished(value: String): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedNull: Self = StObject.set(x, "published", null)
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setReaderComments(value: String): Self = StObject.set(x, "readerComments", value.asInstanceOf[js.Any])
    
    inline def setReaderCommentsNull: Self = StObject.set(x, "readerComments", null)
    
    inline def setReaderCommentsUndefined: Self = StObject.set(x, "readerComments", js.undefined)
    
    inline def setReplies(value: TotalItems): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    inline def setRepliesNull: Self = StObject.set(x, "replies", null)
    
    inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleLink(value: String): Self = StObject.set(x, "titleLink", value.asInstanceOf[js.Any])
    
    inline def setTitleLinkNull: Self = StObject.set(x, "titleLink", null)
    
    inline def setTitleLinkUndefined: Self = StObject.set(x, "titleLink", js.undefined)
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTrashed(value: String): Self = StObject.set(x, "trashed", value.asInstanceOf[js.Any])
    
    inline def setTrashedNull: Self = StObject.set(x, "trashed", null)
    
    inline def setTrashedUndefined: Self = StObject.set(x, "trashed", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
