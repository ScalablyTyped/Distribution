package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

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
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (customIds != null) __obj.updateDynamic("customIds")(customIds.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusReports != null) __obj.updateDynamic("statusReports")(statusReports.asInstanceOf[js.Any])
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uploaderName != null) __obj.updateDynamic("uploaderName")(uploaderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
}

