package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetDocumentsRequest extends js.Object {
  var documents: js.UndefOr[js.Array[String]] = js.undefined
  var mask: js.UndefOr[DocumentMask] = js.undefined
  var newTransaction: js.UndefOr[TransactionOptions] = js.undefined
  var readTime: js.UndefOr[String] = js.undefined
  var transaction: js.UndefOr[String] = js.undefined
}

object BatchGetDocumentsRequest {
  @scala.inline
  def apply(
    documents: js.Array[String] = null,
    mask: DocumentMask = null,
    newTransaction: TransactionOptions = null,
    readTime: String = null,
    transaction: String = null
  ): BatchGetDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    if (documents != null) __obj.updateDynamic("documents")(documents.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (newTransaction != null) __obj.updateDynamic("newTransaction")(newTransaction.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDocumentsRequest]
  }
}

