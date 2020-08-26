package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstancesScopedList extends js.Object {
  /**
    * [Output Only] A list of instances contained in this scope.
    */
  var instances: js.UndefOr[js.Array[SchemaInstance]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of instances
    * when the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaInstancesScopedList {
  @scala.inline
  def apply(): SchemaInstancesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesScopedList]
  }
  @scala.inline
  implicit class SchemaInstancesScopedListOps[Self <: SchemaInstancesScopedList] (val x: Self) extends AnyVal {
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
    def setInstancesVarargs(value: SchemaInstance*): Self = this.set("instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: js.Array[SchemaInstance]): Self = this.set("instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

