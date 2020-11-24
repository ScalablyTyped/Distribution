package typings.giphyApi.mod

import typings.giphyApi.anon.Avatarurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GIFObject extends js.Object {
  
  var bitly_url: String = js.native
  
  var content_url: String = js.native
  
  var create_datetime: String = js.native
  
  var embed_url: String = js.native
  
  var id: String = js.native
  
  var images: Images = js.native
  
  var import_datetime: String = js.native
  
  var rating: Rating = js.native
  
  var slug: String = js.native
  
  var source: String = js.native
  
  var source_post_url: String = js.native
  
  var source_tld: String = js.native
  
  var title: String = js.native
  
  var trending_datetime: String = js.native
  
  var `type`: String = js.native
  
  var update_datetime: String = js.native
  
  var url: String = js.native
  
  var user: js.UndefOr[Avatarurl] = js.native
  
  var username: String = js.native
}
object GIFObject {
  
  @scala.inline
  def apply(
    bitly_url: String,
    content_url: String,
    create_datetime: String,
    embed_url: String,
    id: String,
    images: Images,
    import_datetime: String,
    rating: Rating,
    slug: String,
    source: String,
    source_post_url: String,
    source_tld: String,
    title: String,
    trending_datetime: String,
    `type`: String,
    update_datetime: String,
    url: String,
    username: String
  ): GIFObject = {
    val __obj = js.Dynamic.literal(bitly_url = bitly_url.asInstanceOf[js.Any], content_url = content_url.asInstanceOf[js.Any], create_datetime = create_datetime.asInstanceOf[js.Any], embed_url = embed_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], import_datetime = import_datetime.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], source_post_url = source_post_url.asInstanceOf[js.Any], source_tld = source_tld.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trending_datetime = trending_datetime.asInstanceOf[js.Any], update_datetime = update_datetime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GIFObject]
  }
  
  @scala.inline
  implicit class GIFObjectOps[Self <: GIFObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBitly_url(value: String): Self = this.set("bitly_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_url(value: String): Self = this.set("content_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate_datetime(value: String): Self = this.set("create_datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbed_url(value: String): Self = this.set("embed_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: Images): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImport_datetime(value: String): Self = this.set("import_datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRating(value: Rating): Self = this.set("rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_post_url(value: String): Self = this.set("source_post_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_tld(value: String): Self = this.set("source_tld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrending_datetime(value: String): Self = this.set("trending_datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_datetime(value: String): Self = this.set("update_datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Avatarurl): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
