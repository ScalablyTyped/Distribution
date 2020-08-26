package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentMask extends js.Object {
  /**
    * The list of field paths in the mask. See Document.fields for a field
    * path syntax reference.
    */
  var fieldPaths: js.UndefOr[js.Array[String]] = js.native
}

object DocumentMask {
  @scala.inline
  def apply(): DocumentMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentMask]
  }
  @scala.inline
  implicit class DocumentMaskOps[Self <: DocumentMask] (val x: Self) extends AnyVal {
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
    def setFieldPathsVarargs(value: String*): Self = this.set("fieldPaths", js.Array(value :_*))
    @scala.inline
    def setFieldPaths(value: js.Array[String]): Self = this.set("fieldPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldPaths: Self = this.set("fieldPaths", js.undefined)
  }
  
}

