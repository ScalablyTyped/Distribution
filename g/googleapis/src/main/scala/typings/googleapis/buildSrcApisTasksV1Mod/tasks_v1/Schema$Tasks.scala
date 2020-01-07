package typings.googleapis.buildSrcApisTasksV1Mod.tasks_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Tasks extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Collection of tasks.
    */
  var items: js.UndefOr[js.Array[Schema$Task]] = js.native
  /**
    * Type of the resource. This is always &quot;tasks#tasks&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token used to access the next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$Tasks {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Schema$Task] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$Tasks = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Tasks]
  }
}

