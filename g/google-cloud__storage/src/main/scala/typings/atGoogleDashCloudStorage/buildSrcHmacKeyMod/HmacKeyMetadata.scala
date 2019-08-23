package typings.atGoogleDashCloudStorage.buildSrcHmacKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HmacKeyMetadata extends js.Object {
  var accessId: String
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var timeCreated: js.UndefOr[String] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
}

object HmacKeyMetadata {
  @scala.inline
  def apply(
    accessId: String,
    etag: String = null,
    id: String = null,
    projectId: String = null,
    serviceAccountEmail: String = null,
    state: String = null,
    timeCreated: String = null,
    updated: String = null
  ): HmacKeyMetadata = {
    val __obj = js.Dynamic.literal(accessId = accessId)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (serviceAccountEmail != null) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail)
    if (state != null) __obj.updateDynamic("state")(state)
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[HmacKeyMetadata]
  }
}

