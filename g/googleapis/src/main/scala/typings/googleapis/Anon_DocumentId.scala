package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DocumentId extends js.Object {
  var documentId: js.UndefOr[String] = js.native
}

object Anon_DocumentId {
  @scala.inline
  def apply(documentId: String = null): Anon_DocumentId = {
    val __obj = js.Dynamic.literal()
    if (documentId != null) __obj.updateDynamic("documentId")(documentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DocumentId]
  }
}

