package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetDocumentsResponse extends js.Object {
  var found: js.UndefOr[
    typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.Document
  ] = js.undefined
  var missing: js.UndefOr[String] = js.undefined
  var readTime: js.UndefOr[String] = js.undefined
  var transaction: js.UndefOr[String] = js.undefined
}

object BatchGetDocumentsResponse {
  @scala.inline
  def apply(
    found: typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces.Document = null,
    missing: String = null,
    readTime: String = null,
    transaction: String = null
  ): BatchGetDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (found != null) __obj.updateDynamic("found")(found.asInstanceOf[js.Any])
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDocumentsResponse]
  }
}

