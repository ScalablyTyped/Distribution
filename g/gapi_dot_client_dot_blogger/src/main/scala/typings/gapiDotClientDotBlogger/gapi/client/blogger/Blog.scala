package typings.gapiDotClientDotBlogger.gapi.client.blogger

import typings.gapiDotClientDotBlogger.Anon_Country
import typings.gapiDotClientDotBlogger.Anon_Items
import typings.gapiDotClientDotBlogger.Anon_SelfLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blog extends js.Object {
  /** The JSON custom meta-data for the Blog */
  var customMetaData: js.UndefOr[String] = js.undefined
  /** The description of this blog. This is displayed underneath the title. */
  var description: js.UndefOr[String] = js.undefined
  /** The identifier for this resource. */
  var id: js.UndefOr[String] = js.undefined
  /** The kind of this entry. Always blogger#blog */
  var kind: js.UndefOr[String] = js.undefined
  /** The locale this Blog is set to. */
  var locale: js.UndefOr[Anon_Country] = js.undefined
  /** The name of this blog. This is displayed as the title. */
  var name: js.UndefOr[String] = js.undefined
  /** The container of pages in this blog. */
  var pages: js.UndefOr[Anon_SelfLink] = js.undefined
  /** The container of posts in this blog. */
  var posts: js.UndefOr[Anon_Items] = js.undefined
  /** RFC 3339 date-time when this blog was published. */
  var published: js.UndefOr[String] = js.undefined
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The status of the blog. */
  var status: js.UndefOr[String] = js.undefined
  /** RFC 3339 date-time when this blog was last updated. */
  var updated: js.UndefOr[String] = js.undefined
  /** The URL where this blog is published. */
  var url: js.UndefOr[String] = js.undefined
}

object Blog {
  @scala.inline
  def apply(
    customMetaData: String = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    locale: Anon_Country = null,
    name: String = null,
    pages: Anon_SelfLink = null,
    posts: Anon_Items = null,
    published: String = null,
    selfLink: String = null,
    status: String = null,
    updated: String = null,
    url: String = null
  ): Blog = {
    val __obj = js.Dynamic.literal()
    if (customMetaData != null) __obj.updateDynamic("customMetaData")(customMetaData)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pages != null) __obj.updateDynamic("pages")(pages)
    if (posts != null) __obj.updateDynamic("posts")(posts)
    if (published != null) __obj.updateDynamic("published")(published)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (status != null) __obj.updateDynamic("status")(status)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Blog]
  }
}

