package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ModifyCourseWorkAssigneesRequest extends js.Object {
  /**
               * Mode of the coursework describing whether it will be assigned to all
               * students or specified individual students.
               */
  var assigneeMode: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Set which students are assigned or not assigned to the coursework.
               * Must be specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`.
               */
  var modifyIndividualStudentsOptions: js.UndefOr[ModifyIndividualStudentsOptions] = js.undefined
}

