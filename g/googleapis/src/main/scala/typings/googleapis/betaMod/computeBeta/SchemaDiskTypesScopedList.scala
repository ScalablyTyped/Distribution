package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDiskTypesScopedList extends js.Object {
  /**
    * [Output Only] A list of disk types contained in this scope.
    */
  var diskTypes: js.UndefOr[js.Array[SchemaDiskType]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of disk types
    * when the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaDiskTypesScopedList {
  @scala.inline
  def apply(): SchemaDiskTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskTypesScopedList]
  }
  @scala.inline
  implicit class SchemaDiskTypesScopedListOps[Self <: SchemaDiskTypesScopedList] (val x: Self) extends AnyVal {
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
    def setDiskTypesVarargs(value: SchemaDiskType*): Self = this.set("diskTypes", js.Array(value :_*))
    @scala.inline
    def setDiskTypes(value: js.Array[SchemaDiskType]): Self = this.set("diskTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskTypes: Self = this.set("diskTypes", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

