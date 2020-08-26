package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldFilter extends js.Object {
  /** The field to filter by. */
  var field: js.UndefOr[FieldReference] = js.native
  /** The operator to filter by. */
  var op: js.UndefOr[String] = js.native
  /** The value to compare to. */
  var value: js.UndefOr[Value] = js.native
}

object FieldFilter {
  @scala.inline
  def apply(): FieldFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldFilter]
  }
  @scala.inline
  implicit class FieldFilterOps[Self <: FieldFilter] (val x: Self) extends AnyVal {
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
    def setField(value: FieldReference): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setOp(value: String): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOp: Self = this.set("op", js.undefined)
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

