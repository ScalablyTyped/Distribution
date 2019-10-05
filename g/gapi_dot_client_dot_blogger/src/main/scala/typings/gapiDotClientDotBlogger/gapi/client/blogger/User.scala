package typings.gapiDotClientDotBlogger.gapi.client.blogger

import typings.gapiDotClientDotBlogger.Anon_Country
import typings.gapiDotClientDotBlogger.Anon_SelfLinkString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /** Profile summary information. */
  var about: js.UndefOr[String] = js.undefined
  /** The container of blogs for this user. */
  var blogs: js.UndefOr[Anon_SelfLinkString] = js.undefined
  /** The timestamp of when this profile was created, in seconds since epoch. */
  var created: js.UndefOr[String] = js.undefined
  /** The display name. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The identifier for this User. */
  var id: js.UndefOr[String] = js.undefined
  /** The kind of this entity. Always blogger#user */
  var kind: js.UndefOr[String] = js.undefined
  /** This user's locale */
  var locale: js.UndefOr[Anon_Country] = js.undefined
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The user's profile page. */
  var url: js.UndefOr[String] = js.undefined
}

object User {
  @scala.inline
  def apply(
    about: String = null,
    blogs: Anon_SelfLinkString = null,
    created: String = null,
    displayName: String = null,
    id: String = null,
    kind: String = null,
    locale: Anon_Country = null,
    selfLink: String = null,
    url: String = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about)
    if (blogs != null) __obj.updateDynamic("blogs")(blogs)
    if (created != null) __obj.updateDynamic("created")(created)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[User]
  }
}

