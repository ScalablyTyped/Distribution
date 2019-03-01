package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveFolder extends js.Object {
  /**
    * URL that can be used to access the Drive folder.
    *
    * Read-only.
    */
  var alternateLink: js.UndefOr[java.lang.String] = js.undefined
  /** Drive API resource ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Title of the Drive folder.
    *
    * Read-only.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object DriveFolder {
  @scala.inline
  def apply(
    alternateLink: java.lang.String = null,
    id: java.lang.String = null,
    title: java.lang.String = null
  ): DriveFolder = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink)
    if (id != null) __obj.updateDynamic("id")(id)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DriveFolder]
  }
}

