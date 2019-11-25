package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveFolder extends js.Object {
  var alternateLink: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
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

