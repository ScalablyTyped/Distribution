package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Array of guest attribute namespace/key/value tuples.
  */
@js.native
trait SchemaGuestAttributesValue extends js.Object {
  var items: js.UndefOr[js.Array[SchemaGuestAttributesEntry]] = js.native
}

object SchemaGuestAttributesValue {
  @scala.inline
  def apply(): SchemaGuestAttributesValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestAttributesValue]
  }
  @scala.inline
  implicit class SchemaGuestAttributesValueOps[Self <: SchemaGuestAttributesValue] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaGuestAttributesEntry*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaGuestAttributesEntry]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

