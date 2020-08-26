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
  def apply(): SchemaCourseMaterialSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCourseMaterialSet]
  }
  @scala.inline
  implicit class SchemaCourseMaterialSetOps[Self <: SchemaCourseMaterialSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaterialsVarargs(value: SchemaCourseMaterial*): Self = this.set("materials", js.Array(value :_*))
    @scala.inline
    def setMaterials(value: js.Array[SchemaCourseMaterial]): Self = this.set("materials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterials: Self = this.set("materials", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

