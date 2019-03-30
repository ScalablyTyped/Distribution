package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var customIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var statusReports: js.UndefOr[js.Array[StatusReport]] = js.undefined
  var timeCreated: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var uploaderName: js.UndefOr[java.lang.String] = js.undefined
}

object Package {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    customIds: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    locale: java.lang.String = null,
    name: java.lang.String = null,
    status: java.lang.String = null,
    statusReports: js.Array[StatusReport] = null,
    timeCreated: java.lang.String = null,
    `type`: java.lang.String = null,
    uploaderName: java.lang.String = null
  ): Package = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (customIds != null) __obj.updateDynamic("customIds")(customIds)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusReports != null) __obj.updateDynamic("statusReports")(statusReports)
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uploaderName != null) __obj.updateDynamic("uploaderName")(uploaderName)
    __obj.asInstanceOf[Package]
  }
}

