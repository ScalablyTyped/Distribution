package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  var delivery_settings: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Member {
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
  ): Member = {
    val __obj = js.Dynamic.literal()
    if (delivery_settings != null) __obj.updateDynamic("delivery_settings")(delivery_settings)
    if (email != null) __obj.updateDynamic("email")(email)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (role != null) __obj.updateDynamic("role")(role)
    if (status != null) __obj.updateDynamic("status")(status)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Member]
  }
}

