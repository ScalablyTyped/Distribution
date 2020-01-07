package typings.googleapis.buildSrcApisYoutubeAnalyticsV1Mod.youtubeAnalytics_v1

import typings.googleapis.Anon_IdKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GroupItem extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var groupId: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var resource: js.UndefOr[Anon_IdKind] = js.native
}

object Schema$GroupItem {
  @scala.inline
  def apply(
    etag: String = null,
    groupId: String = null,
    id: String = null,
    kind: String = null,
    resource: Anon_IdKind = null
  ): Schema$GroupItem = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GroupItem]
  }
}

