package typings.gapiDotClientDotYoutubeanalytics.gapiNs.clientNs.youtubeanalyticsNs

import typings.gapiDotClientDotYoutubeanalytics.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupItem extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var groupId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[Anon_Id] = js.undefined
}

object GroupItem {
  @scala.inline
  def apply(
    etag: String = null,
    groupId: String = null,
    id: String = null,
    kind: String = null,
    resource: Anon_Id = null
  ): GroupItem = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[GroupItem]
  }
}

