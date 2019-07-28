package typings.gapiDotClientDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentId extends js.Object {
  /** Id of the document/file containing the report data. */
  var documentId: js.UndefOr[String] = js.undefined
}

object Anon_DocumentId {
  @scala.inline
  def apply(documentId: String = null): Anon_DocumentId = {
    val __obj = js.Dynamic.literal()
    if (documentId != null) __obj.updateDynamic("documentId")(documentId)
    __obj.asInstanceOf[Anon_DocumentId]
  }
}

