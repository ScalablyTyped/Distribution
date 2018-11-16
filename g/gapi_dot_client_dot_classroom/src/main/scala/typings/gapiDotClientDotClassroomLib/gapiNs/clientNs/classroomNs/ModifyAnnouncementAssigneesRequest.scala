package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ModifyAnnouncementAssigneesRequest extends js.Object {
  /**
               * Mode of the announcement describing whether it will be accessible by all
               * students or specified individual students.
               */
  var assigneeMode: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Set which students can view or cannot view the announcement.
               * Must be specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`.
               */
  var modifyIndividualStudentsOptions: js.UndefOr[ModifyIndividualStudentsOptions] = js.undefined
}

