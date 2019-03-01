package typings
package giphyDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bitlyurl extends js.Object {
  var bitly_url: java.lang.String
  var content_url: java.lang.String
  var create_datetime: java.lang.String
  var embed_url: java.lang.String
  var id: java.lang.String
  var images: Anon_Downsized
  var import_datetime: java.lang.String
  var rating: Rating
  var slug: java.lang.String
  var source: java.lang.String
  var source_post_url: java.lang.String
  var source_tld: java.lang.String
  var title: java.lang.String
  var trending_datetime: java.lang.String
  var `type`: java.lang.String
  var update_datetime: java.lang.String
  var url: java.lang.String
  var user: js.UndefOr[Anon_Avatarurl] = js.undefined
  var username: java.lang.String
}

object Anon_Bitlyurl {
  @scala.inline
  def apply(
    bitly_url: java.lang.String,
    content_url: java.lang.String,
    create_datetime: java.lang.String,
    embed_url: java.lang.String,
    id: java.lang.String,
    images: Anon_Downsized,
    import_datetime: java.lang.String,
    rating: Rating,
    slug: java.lang.String,
    source: java.lang.String,
    source_post_url: java.lang.String,
    source_tld: java.lang.String,
    title: java.lang.String,
    trending_datetime: java.lang.String,
    `type`: java.lang.String,
    update_datetime: java.lang.String,
    url: java.lang.String,
    username: java.lang.String,
    user: Anon_Avatarurl = null
  ): Anon_Bitlyurl = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bitly_url")(bitly_url)
    __obj.updateDynamic("content_url")(content_url)
    __obj.updateDynamic("create_datetime")(create_datetime)
    __obj.updateDynamic("embed_url")(embed_url)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("images")(images)
    __obj.updateDynamic("import_datetime")(import_datetime)
    __obj.updateDynamic("rating")(rating)
    __obj.updateDynamic("slug")(slug)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("source_post_url")(source_post_url)
    __obj.updateDynamic("source_tld")(source_tld)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("trending_datetime")(trending_datetime)
    __obj.updateDynamic("update_datetime")(update_datetime)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("username")(username)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Anon_Bitlyurl]
  }
}

