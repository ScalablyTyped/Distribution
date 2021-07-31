package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleapis.anon.Image
import typings.googleapis.anon.ItemsSelfLink
import typings.googleapis.anon.Lat
import typings.googleapis.anon.Url
import typings.googleapis.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPost extends StObject {
  
  /**
    * The author of this Post.
    */
  var author: js.UndefOr[Image] = js.undefined
  
  /**
    * Data about the blog containing this Post.
    */
  var blog: js.UndefOr[`0`] = js.undefined
  
  /**
    * The content of the Post. May contain HTML markup.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The JSON meta-data for the Post.
    */
  var customMetaData: js.UndefOr[String] = js.undefined
  
  /**
    * Etag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of this Post.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Display image for the Post.
    */
  var images: js.UndefOr[js.Array[Url]] = js.undefined
  
  /**
    * The kind of this entity. Always blogger#post
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The list of labels this Post was tagged with.
    */
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The location for geotagged posts.
    */
  var location: js.UndefOr[Lat] = js.undefined
  
  /**
    * RFC 3339 date-time when this Post was published.
    */
  var published: js.UndefOr[String] = js.undefined
  
  /**
    * Comment control and display setting for readers of this post.
    */
  var readerComments: js.UndefOr[String] = js.undefined
  
  /**
    * The container of comments on this Post.
    */
  var replies: js.UndefOr[ItemsSelfLink] = js.undefined
  
  /**
    * The API REST URL to fetch this resource from.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the post. Only set for admin-level requests
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the Post.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The title link URL, similar to atom&#39;s related link.
    */
  var titleLink: js.UndefOr[String] = js.undefined
  
  /**
    * RFC 3339 date-time when this Post was last updated.
    */
  var updated: js.UndefOr[String] = js.undefined
  
  /**
    * The URL where this Post is displayed.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaPost {
  
  @scala.inline
  def apply(): SchemaPost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPost]
  }
  
  @scala.inline
  implicit class SchemaPostMutableBuilder[Self <: SchemaPost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Image): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setBlog(value: `0`): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogUndefined: Self = StObject.set(x, "blog", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setCustomMetaData(value: String): Self = StObject.set(x, "customMetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMetaDataUndefined: Self = StObject.set(x, "customMetaData", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImages(value: js.Array[Url]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: Url*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: Lat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPublished(value: String): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    @scala.inline
    def setReaderComments(value: String): Self = StObject.set(x, "readerComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReaderCommentsUndefined: Self = StObject.set(x, "readerComments", js.undefined)
    
    @scala.inline
    def setReplies(value: ItemsSelfLink): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLink(value: String): Self = StObject.set(x, "titleLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLinkUndefined: Self = StObject.set(x, "titleLink", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
