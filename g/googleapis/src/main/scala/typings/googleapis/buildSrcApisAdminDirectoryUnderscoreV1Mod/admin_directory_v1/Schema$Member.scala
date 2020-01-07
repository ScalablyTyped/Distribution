package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Member resource in Directory API.
  */
@js.native
trait Schema$Member extends js.Object {
  /**
    * Delivery settings of member
    */
  var delivery_settings: js.UndefOr[String] = js.native
  /**
    * Email of member (Read-only)
    */
  var email: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Unique identifier of customer member (Read-only) Unique identifier of
    * group (Read-only) Unique identifier of member (Read-only)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Role of member
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Status of member (Immutable)
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Type of member (Immutable)
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Member {
  @scala.inline
  def apply(
    delivery_settings: String = null,
    email: String = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    role: String = null,
    status: String = null,
    `type`: String = null
  ): Schema$Member = {
    val __obj = js.Dynamic.literal()
    if (delivery_settings != null) __obj.updateDynamic("delivery_settings")(delivery_settings.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Member]
  }
}

