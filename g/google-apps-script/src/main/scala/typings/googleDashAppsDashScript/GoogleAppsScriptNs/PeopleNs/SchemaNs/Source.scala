package typings.googleDashAppsDashScript.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var profileMetadata: js.UndefOr[ProfileMetadata] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var updateTime: js.UndefOr[String] = js.undefined
}

object Source {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    profileMetadata: ProfileMetadata = null,
    `type`: String = null,
    updateTime: String = null
  ): Source = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (profileMetadata != null) __obj.updateDynamic("profileMetadata")(profileMetadata)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    __obj.asInstanceOf[Source]
  }
}

