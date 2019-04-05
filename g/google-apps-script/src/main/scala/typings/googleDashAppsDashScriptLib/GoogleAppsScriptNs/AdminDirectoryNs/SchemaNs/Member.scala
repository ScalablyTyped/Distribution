package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  var delivery_settings: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Member {
  @scala.inline
  def apply(
    delivery_settings: java.lang.String = null,
    email: java.lang.String = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    role: java.lang.String = null,
    status: java.lang.String = null,
    `type`: java.lang.String = null
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

