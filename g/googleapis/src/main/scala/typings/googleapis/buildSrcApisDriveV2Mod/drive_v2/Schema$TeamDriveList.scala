package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Team Drives.
  */
@js.native
trait Schema$TeamDriveList extends js.Object {
  /**
    * The list of Team Drives.
    */
  var items: js.UndefOr[js.Array[Schema$TeamDrive]] = js.native
  /**
    * This is always drive#teamDriveList
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of Team Drives.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$TeamDriveList {
  @scala.inline
  def apply(items: js.Array[Schema$TeamDrive] = null, kind: String = null, nextPageToken: String = null): Schema$TeamDriveList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TeamDriveList]
  }
}

