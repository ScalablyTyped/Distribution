package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentTransform extends js.Object {
  /** The name of the document to transform. */
  var document: js.UndefOr[String] = js.native
  /**
    * The list of transformations to apply to the fields of the document, in
    * order.
    */
  var fieldTransforms: js.UndefOr[js.Array[FieldTransform]] = js.native
}

object DocumentTransform {
  @scala.inline
  def apply(): DocumentTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTransform]
  }
  @scala.inline
  implicit class DocumentTransformOps[Self <: DocumentTransform] (val x: Self) extends AnyVal {
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
    def setDocument(value: String): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setFieldTransformsVarargs(value: FieldTransform*): Self = this.set("fieldTransforms", js.Array(value :_*))
    @scala.inline
    def setFieldTransforms(value: js.Array[FieldTransform]): Self = this.set("fieldTransforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldTransforms: Self = this.set("fieldTransforms", js.undefined)
  }
  
}

