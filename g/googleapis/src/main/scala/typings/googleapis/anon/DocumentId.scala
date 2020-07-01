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
  def apply(documentId: String = null): DocumentId = {
    val __obj = js.Dynamic.literal()
    if (documentId != null) __obj.updateDynamic("documentId")(documentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentId]
  }
}

