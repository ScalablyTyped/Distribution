package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blog extends js.Object {
  /** The JSON custom meta-data for the Blog */
  var customMetaData: js.UndefOr[java.lang.String] = js.undefined
  /** The description of this blog. This is displayed underneath the title. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The identifier for this resource. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of this entry. Always blogger#blog */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The locale this Blog is set to. */
  var locale: js.UndefOr[gapiDotClientDotBloggerLib.Anon_Country] = js.undefined
  /** The name of this blog. This is displayed as the title. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The container of pages in this blog. */
  var pages: js.UndefOr[gapiDotClientDotBloggerLib.Anon_SelfLink] = js.undefined
  /** The container of posts in this blog. */
  var posts: js.UndefOr[gapiDotClientDotBloggerLib.Anon_Items] = js.undefined
  /** RFC 3339 date-time when this blog was published. */
  var published: js.UndefOr[java.lang.String] = js.undefined
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The status of the blog. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** RFC 3339 date-time when this blog was last updated. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** The URL where this blog is published. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Blog {
  @scala.inline
  def apply(
    customMetaData: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    locale: gapiDotClientDotBloggerLib.Anon_Country = null,
    name: java.lang.String = null,
    pages: gapiDotClientDotBloggerLib.Anon_SelfLink = null,
    posts: gapiDotClientDotBloggerLib.Anon_Items = null,
    published: java.lang.String = null,
    selfLink: java.lang.String = null,
    status: java.lang.String = null,
    updated: java.lang.String = null,
    url: java.lang.String = null
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

