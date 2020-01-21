package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveFolder extends js.Object {
  /**
    * URL that can be used to access the Drive folder.
    *
    * Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.undefined
  /** Drive API resource ID. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Title of the Drive folder.
    *
    * Read-only.
    */
  var title: js.UndefOr[String] = js.undefined
}

object DriveFolder {
  @scala.inline
  def apply(alternateLink: String = null, id: String = null, title: String = null): DriveFolder = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveFolder]
  }
}

