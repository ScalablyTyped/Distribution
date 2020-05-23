package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentId extends js.Object {
  /** Id of the document/file containing the report data. */
  var documentId: js.UndefOr[String] = js.undefined
}

object DocumentId {
  @scala.inline
  def apply(documentId: String = null): DocumentId = {
    val __obj = js.Dynamic.literal()
    if (documentId != null) __obj.updateDynamic("documentId")(documentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentId]
  }
}

