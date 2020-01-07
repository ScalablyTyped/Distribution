package typings.googleapis.buildSrcApisYoutubeAnalyticsV2Mod.youtubeAnalytics_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group item.
  */
@js.native
trait Schema$GroupItem extends js.Object {
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[Schema$Errors] = js.native
  /**
    * The Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the group that contains the
    * item.
    */
  var groupId: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the `channel`, `video`,
    * `playlist`, or `asset` resource that is included in the group. Note that
    * this ID refers specifically to the inclusion of that resource in a
    * particular group and is different than the channel ID, video ID, playlist
    * ID, or asset ID that uniquely identifies the resource itself. The
    * `resource.id` property&#39;s value specifies the unique channel, video,
    * playlist, or asset ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the API resource&#39;s type. The value will be
    * `youtube#groupItem`.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The `resource` object contains information that identifies the item being
    * added to the group.
    */
  var resource: js.UndefOr[Schema$GroupItemResource] = js.native
}

object Schema$GroupItem {
  @scala.inline
  def apply(
    errors: Schema$Errors = null,
    etag: String = null,
    groupId: String = null,
    id: String = null,
    kind: String = null,
    resource: Schema$GroupItemResource = null
  ): Schema$GroupItem = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GroupItem]
  }
}

