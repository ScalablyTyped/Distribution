package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAcceleratorTypesScopedList extends js.Object {
  /**
    * [Output Only] A list of accelerator types contained in this scope.
    */
  var acceleratorTypes: js.UndefOr[js.Array[SchemaAcceleratorType]] = js.native
  /**
    * [Output Only] An informational warning that appears when the accelerator
    * types list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaAcceleratorTypesScopedList {
  @scala.inline
  def apply(): SchemaAcceleratorTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorTypesScopedList]
  }
  @scala.inline
  implicit class SchemaAcceleratorTypesScopedListOps[Self <: SchemaAcceleratorTypesScopedList] (val x: Self) extends AnyVal {
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
    def setAcceleratorTypesVarargs(value: SchemaAcceleratorType*): Self = this.set("acceleratorTypes", js.Array(value :_*))
    @scala.inline
    def setAcceleratorTypes(value: js.Array[SchemaAcceleratorType]): Self = this.set("acceleratorTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleratorTypes: Self = this.set("acceleratorTypes", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

