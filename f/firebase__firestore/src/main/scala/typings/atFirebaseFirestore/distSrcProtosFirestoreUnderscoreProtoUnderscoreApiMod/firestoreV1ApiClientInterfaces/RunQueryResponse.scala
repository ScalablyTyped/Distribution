package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunQueryResponse extends js.Object {
  var document: js.UndefOr[Document] = js.undefined
  var readTime: js.UndefOr[String] = js.undefined
  var skippedResults: js.UndefOr[Double] = js.undefined
  var transaction: js.UndefOr[String] = js.undefined
}

object RunQueryResponse {
  @scala.inline
  def apply(
    document: Document = null,
    readTime: String = null,
    skippedResults: Int | Double = null,
    transaction: String = null
  ): RunQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (skippedResults != null) __obj.updateDynamic("skippedResults")(skippedResults.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunQueryResponse]
  }
}

