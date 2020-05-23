package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClientBlogger.anon.Country
import typings.gapiClientBlogger.anon.SelfLinkString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /** Profile summary information. */
  var about: js.UndefOr[String] = js.undefined
  /** The container of blogs for this user. */
  var blogs: js.UndefOr[SelfLinkString] = js.undefined
  /** The timestamp of when this profile was created, in seconds since epoch. */
  var created: js.UndefOr[String] = js.undefined
  /** The display name. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The identifier for this User. */
  var id: js.UndefOr[String] = js.undefined
  /** The kind of this entity. Always blogger#user */
  var kind: js.UndefOr[String] = js.undefined
  /** This user's locale */
  var locale: js.UndefOr[Country] = js.undefined
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The user's profile page. */
  var url: js.UndefOr[String] = js.undefined
}

object User {
  @scala.inline
  def apply(
    about: String = null,
    blogs: SelfLinkString = null,
    created: String = null,
    displayName: String = null,
    id: String = null,
    kind: String = null,
    locale: Country = null,
    selfLink: String = null,
    url: String = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (blogs != null) __obj.updateDynamic("blogs")(blogs.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

