package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var customIds: js.UndefOr[js.Array[String]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var statusReports: js.UndefOr[js.Array[StatusReport]] = js.undefined
  var timeCreated: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var uploaderName: js.UndefOr[String] = js.undefined
}

object Package {
  @scala.inline
  def apply(
    content: String = null,
    customIds: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    locale: String = null,
    name: String = null,
    status: String = null,
    statusReports: js.Array[StatusReport] = null,
    timeCreated: String = null,
    `type`: String = null,
    uploaderName: String = null
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

