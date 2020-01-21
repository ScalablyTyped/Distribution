package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleapis.AnonCountry
import typings.googleapis.AnonSelfLinkString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUser extends js.Object {
  /**
    * Profile summary information.
    */
  var about: js.UndefOr[String] = js.native
  /**
    * The container of blogs for this user.
    */
  var blogs: js.UndefOr[AnonSelfLinkString] = js.native
  /**
    * The timestamp of when this profile was created, in seconds since epoch.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * The display name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The identifier for this User.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of this entity. Always blogger#user
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * This user&#39;s locale
    */
  var locale: js.UndefOr[AnonCountry] = js.native
  /**
    * The API REST URL to fetch this resource from.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The user&#39;s profile page.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaUser {
  @scala.inline
  def apply(
    about: String = null,
    blogs: AnonSelfLinkString = null,
    created: String = null,
    displayName: String = null,
    id: String = null,
    kind: String = null,
    locale: AnonCountry = null,
    selfLink: String = null,
    url: String = null
  ): SchemaUser = {
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
    __obj.asInstanceOf[SchemaUser]
  }
}

