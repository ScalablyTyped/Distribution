package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClientBlogger.anon.Country
import typings.gapiClientBlogger.anon.Items
import typings.gapiClientBlogger.anon.SelfLink
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
  var locale: js.UndefOr[Country] = js.undefined
  /** The name of this blog. This is displayed as the title. */
  var name: js.UndefOr[String] = js.undefined
  /** The container of pages in this blog. */
  var pages: js.UndefOr[SelfLink] = js.undefined
  /** The container of posts in this blog. */
  var posts: js.UndefOr[Items] = js.undefined
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
    locale: Country = null,
    name: String = null,
    pages: SelfLink = null,
    posts: Items = null,
    published: String = null,
    selfLink: String = null,
    status: String = null,
    updated: String = null,
    url: String = null
  ): Blog = {
    val __obj = js.Dynamic.literal()
    if (customMetaData != null) __obj.updateDynamic("customMetaData")(customMetaData.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (posts != null) __obj.updateDynamic("posts")(posts.asInstanceOf[js.Any])
    if (published != null) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blog]
  }
}

