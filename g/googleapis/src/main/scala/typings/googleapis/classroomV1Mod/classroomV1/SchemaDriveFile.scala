package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a Google Drive file.
  */
@js.native
trait SchemaDriveFile extends js.Object {
  /**
    * URL that can be used to access the Drive item.  Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.native
  /**
    * Drive API resource ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * URL of a thumbnail image of the Drive item.  Read-only.
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
  /**
    * Title of the Drive item.  Read-only.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaDriveFile {
  @scala.inline
  def apply(alternateLink: String = null, id: String = null, thumbnailUrl: String = null, title: String = null): SchemaDriveFile = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDriveFile]
  }
}

