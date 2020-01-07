package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of third-party applications which the user has installed or given
  * access to Google Drive.
  */
@js.native
trait Schema$AppList extends js.Object {
  /**
    * List of app IDs that the user has specified to use by default. The list
    * is in reverse-priority order (lowest to highest).
    */
  var defaultAppIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ETag of the list.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The list of apps.
    */
  var items: js.UndefOr[js.Array[Schema$App]] = js.native
  /**
    * This is always drive#appList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A link back to this list.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object Schema$AppList {
  @scala.inline
  def apply(
    defaultAppIds: js.Array[String] = null,
    etag: String = null,
    items: js.Array[Schema$App] = null,
    kind: String = null,
    selfLink: String = null
  ): Schema$AppList = {
    val __obj = js.Dynamic.literal()
    if (defaultAppIds != null) __obj.updateDynamic("defaultAppIds")(defaultAppIds.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AppList]
  }
}

