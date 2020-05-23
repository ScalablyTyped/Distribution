package typings.giphyApi.mod

import typings.giphyApi.anon.Avatarurl
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
  var user: js.UndefOr[Avatarurl] = js.undefined
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
    user: Avatarurl = null
  ): GIFObject = {
    val __obj = js.Dynamic.literal(bitly_url = bitly_url.asInstanceOf[js.Any], content_url = content_url.asInstanceOf[js.Any], create_datetime = create_datetime.asInstanceOf[js.Any], embed_url = embed_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], import_datetime = import_datetime.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], source_post_url = source_post_url.asInstanceOf[js.Any], source_tld = source_tld.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trending_datetime = trending_datetime.asInstanceOf[js.Any], update_datetime = update_datetime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[GIFObject]
  }
}

