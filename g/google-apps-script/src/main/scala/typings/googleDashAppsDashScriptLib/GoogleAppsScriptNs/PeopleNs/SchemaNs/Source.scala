package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var profileMetadata: js.UndefOr[ProfileMetadata] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

object Source {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    id: java.lang.String = null,
    profileMetadata: ProfileMetadata = null,
    `type`: java.lang.String = null,
    updateTime: java.lang.String = null
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

