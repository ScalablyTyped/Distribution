package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentId extends js.Object {
  var documentId: js.UndefOr[String] = js.native
}

object DocumentId {
  @scala.inline
  def apply(): DocumentId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentId]
  }
  @scala.inline
  implicit class DocumentIdOps[Self <: DocumentId] (val x: Self) extends AnyVal {
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
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
  }
  
}

