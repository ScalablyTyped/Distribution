package typings.googleapis.buildSrcApisYoutubeAnalyticsV2Mod.youtubeAnalytics_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for GroupsService.ListGroupItems.
  */
@js.native
trait Schema$ListGroupItemsResponse extends js.Object {
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[Schema$Errors] = js.native
  /**
    * The Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * A list of groups that match the API request parameters. Each item in the
    * list represents a `groupItem` resource.
    */
  var items: js.UndefOr[js.Array[Schema$GroupItem]] = js.native
  /**
    * Identifies the API resource&#39;s type. The value will be
    * `youtube#groupItemListResponse`.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$ListGroupItemsResponse {
  @scala.inline
  def apply(
    errors: Schema$Errors = null,
    etag: String = null,
    items: js.Array[Schema$GroupItem] = null,
    kind: String = null
  ): Schema$ListGroupItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListGroupItemsResponse]
  }
}

