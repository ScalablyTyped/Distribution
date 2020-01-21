package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDocumentId extends js.Object {
  var documentId: js.UndefOr[String] = js.native
}

object AnonDocumentId {
  @scala.inline
  def apply(documentId: String = null): AnonDocumentId = {
    val __obj = js.Dynamic.literal()
    if (documentId != null) __obj.updateDynamic("documentId")(documentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocumentId]
  }
}

