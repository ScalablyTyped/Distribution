package typings.giphyDashApi.giphyDashApiMod

import typings.giphyDashApi.Anon_Avatarurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GIFObject extends js.Object {
  var bitly_url: String
  var content_url: String
  var create_datetime: String
  var embed_url: String
  var id: String
  var images: Images
  var import_datetime: String
  var rating: Rating
  var slug: String
  var source: String
  var source_post_url: String
  var source_tld: String
  var title: String
  var trending_datetime: String
  var `type`: String
  var update_datetime: String
  var url: String
  var user: js.UndefOr[Anon_Avatarurl] = js.undefined
  var username: String
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
    username: String,
    user: Anon_Avatarurl = null
  ): GIFObject = {
    val __obj = js.Dynamic.literal(bitly_url = bitly_url, content_url = content_url, create_datetime = create_datetime, embed_url = embed_url, id = id, images = images, import_datetime = import_datetime, rating = rating, slug = slug, source = source, source_post_url = source_post_url, source_tld = source_tld, title = title, trending_datetime = trending_datetime, update_datetime = update_datetime, url = url, username = username)
    __obj.updateDynamic("type")(`type`)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[GIFObject]
  }
}

