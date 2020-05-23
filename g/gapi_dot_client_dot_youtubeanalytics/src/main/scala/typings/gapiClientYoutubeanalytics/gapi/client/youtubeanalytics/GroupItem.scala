package typings.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiClientYoutubeanalytics.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupItem extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var groupId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[Id] = js.undefined
}

object GroupItem {
  @scala.inline
  def apply(
    etag: String = null,
    groupId: String = null,
    id: String = null,
    kind: String = null,
    resource: Id = null
  ): GroupItem = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupItem]
  }
}

