package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResourcePoliciesScopedList extends js.Object {
  /**
    * A list of resourcePolicies contained in this scope.
    */
  var resourcePolicies: js.UndefOr[js.Array[SchemaResourcePolicy]] = js.native
  /**
    * Informational warning which replaces the list of resourcePolicies when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaResourcePoliciesScopedList {
  @scala.inline
  def apply(): SchemaResourcePoliciesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePoliciesScopedList]
  }
  @scala.inline
  implicit class SchemaResourcePoliciesScopedListOps[Self <: SchemaResourcePoliciesScopedList] (val x: Self) extends AnyVal {
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
    def setResourcePoliciesVarargs(value: SchemaResourcePolicy*): Self = this.set("resourcePolicies", js.Array(value :_*))
    @scala.inline
    def setResourcePolicies(value: js.Array[SchemaResourcePolicy]): Self = this.set("resourcePolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourcePolicies: Self = this.set("resourcePolicies", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

