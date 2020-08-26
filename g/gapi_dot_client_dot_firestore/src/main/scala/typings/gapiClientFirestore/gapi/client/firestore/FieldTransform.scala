package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldTransform extends js.Object {
  /**
    * The path of the field. See Document.fields for the field path syntax
    * reference.
    */
  var fieldPath: js.UndefOr[String] = js.native
  /** Sets the field to the given server value. */
  var setToServerValue: js.UndefOr[String] = js.native
}

object FieldTransform {
  @scala.inline
  def apply(): FieldTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldTransform]
  }
  @scala.inline
  implicit class FieldTransformOps[Self <: FieldTransform] (val x: Self) extends AnyVal {
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
    def setFieldPath(value: String): Self = this.set("fieldPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldPath: Self = this.set("fieldPath", js.undefined)
    @scala.inline
    def setSetToServerValue(value: String): Self = this.set("setToServerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetToServerValue: Self = this.set("setToServerValue", js.undefined)
  }
  
}

