package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptions extends js.Object {
  val merge: js.UndefOr[Boolean] = js.native
  val mergeFields: js.UndefOr[js.Array[String | FieldPath]] = js.native
}

object SetOptions {
  @scala.inline
  def apply(): SetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions]
  }
  @scala.inline
  implicit class SetOptionsOps[Self <: SetOptions] (val x: Self) extends AnyVal {
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
    def setMerge(value: Boolean): Self = this.set("merge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerge: Self = this.set("merge", js.undefined)
    @scala.inline
    def setMergeFieldsVarargs(value: (String | FieldPath)*): Self = this.set("mergeFields", js.Array(value :_*))
    @scala.inline
    def setMergeFields(value: js.Array[String | FieldPath]): Self = this.set("mergeFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeFields: Self = this.set("mergeFields", js.undefined)
  }
  
}

