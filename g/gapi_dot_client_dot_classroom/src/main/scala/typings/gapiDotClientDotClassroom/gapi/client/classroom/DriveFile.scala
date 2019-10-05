package typings.gapiDotClientDotClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveFile extends js.Object {
  /**
    * URL that can be used to access the Drive item.
    *
    * Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.undefined
  /** Drive API resource ID. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * URL of a thumbnail image of the Drive item.
    *
    * Read-only.
    */
  var thumbnailUrl: js.UndefOr[String] = js.undefined
  /**
    * Title of the Drive item.
    *
    * Read-only.
    */
  var title: js.UndefOr[String] = js.undefined
}

object DriveFile {
  @scala.inline
  def apply(alternateLink: String = null, id: String = null, thumbnailUrl: String = null, title: String = null): DriveFile = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink)
    if (id != null) __obj.updateDynamic("id")(id)
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DriveFile]
  }
}

