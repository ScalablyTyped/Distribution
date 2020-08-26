package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetPoolsScopedList extends js.Object {
  /**
    * A list of target pools contained in this scope.
    */
  var targetPools: js.UndefOr[js.Array[SchemaTargetPool]] = js.native
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaTargetPoolsScopedList {
  @scala.inline
  def apply(): SchemaTargetPoolsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetPoolsScopedList]
  }
  @scala.inline
  implicit class SchemaTargetPoolsScopedListOps[Self <: SchemaTargetPoolsScopedList] (val x: Self) extends AnyVal {
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
    def setTargetPoolsVarargs(value: SchemaTargetPool*): Self = this.set("targetPools", js.Array(value :_*))
    @scala.inline
    def setTargetPools(value: js.Array[SchemaTargetPool]): Self = this.set("targetPools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetPools: Self = this.set("targetPools", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

