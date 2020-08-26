package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFieldViolation extends js.Object {
  /**
    * Description of the error.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Path of field with violation.
    */
  var field: js.UndefOr[String] = js.native
}

object SchemaFieldViolation {
  @scala.inline
  def apply(): SchemaFieldViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldViolation]
  }
  @scala.inline
  implicit class SchemaFieldViolationOps[Self <: SchemaFieldViolation] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
  }
  
}

