package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldReference extends js.Object {
  var fieldPath: js.UndefOr[String] = js.native
}

object FieldReference {
  @scala.inline
  def apply(): FieldReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldReference]
  }
  @scala.inline
  implicit class FieldReferenceOps[Self <: FieldReference] (val x: Self) extends AnyVal {
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
  }
  
}

