package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The permission setting of an object.
  */
@js.native
trait Schema$Permission extends js.Object {
  /**
    * If true, the item can be discovered (e.g. in the user&#39;s &quot;Shared
    * with me&quot; collection) without needing a link to the item.
    */
  var allowDiscovery: js.UndefOr[Boolean] = js.native
  /**
    * If set, this permission applies to anyone, even logged out users.
    */
  var anyone: js.UndefOr[Schema$Anyone] = js.native
  /**
    * The domain to whom this permission applies.
    */
  var domain: js.UndefOr[Schema$Domain] = js.native
  /**
    * The group to whom this permission applies.
    */
  var group: js.UndefOr[Schema$Group] = js.native
  /**
    * Indicates the &lt;a
    * href=&quot;/drive/web/manage-sharing#roles&quot;&gt;Google Drive
    * permissions role&lt;/a&gt;. The role determines a user&#39;s ability to
    * read, write, and comment on items.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * The user to whom this permission applies.
    */
  var user: js.UndefOr[Schema$User] = js.native
}

object Schema$Permission {
  @scala.inline
  def apply(
    allowDiscovery: js.UndefOr[Boolean] = js.undefined,
    anyone: Schema$Anyone = null,
    domain: Schema$Domain = null,
    group: Schema$Group = null,
    role: String = null,
    user: Schema$User = null
  ): Schema$Permission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDiscovery)) __obj.updateDynamic("allowDiscovery")(allowDiscovery.asInstanceOf[js.Any])
    if (anyone != null) __obj.updateDynamic("anyone")(anyone.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Permission]
  }
}

