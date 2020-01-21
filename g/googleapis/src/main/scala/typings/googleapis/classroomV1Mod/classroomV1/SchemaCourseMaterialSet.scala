package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of materials that appears on the &quot;About&quot; page of the
  * course. These materials might include a syllabus, schedule, or other
  * background information relating to the course as a whole.
  */
@js.native
trait SchemaCourseMaterialSet extends js.Object {
  /**
    * Materials attached to this set.
    */
  var materials: js.UndefOr[js.Array[SchemaCourseMaterial]] = js.native
  /**
    * Title for this set.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaCourseMaterialSet {
  @scala.inline
  def apply(materials: js.Array[SchemaCourseMaterial] = null, title: String = null): SchemaCourseMaterialSet = {
    val __obj = js.Dynamic.literal()
    if (materials != null) __obj.updateDynamic("materials")(materials.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCourseMaterialSet]
  }
}

