package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunQueryRequest extends js.Object {
  var newTransaction: js.UndefOr[TransactionOptions] = js.undefined
  var parent: js.UndefOr[String] = js.undefined
  var readTime: js.UndefOr[String] = js.undefined
  var structuredQuery: js.UndefOr[StructuredQuery] = js.undefined
  var transaction: js.UndefOr[String] = js.undefined
}

object RunQueryRequest {
  @scala.inline
  def apply(
    newTransaction: TransactionOptions = null,
    parent: String = null,
    readTime: String = null,
    structuredQuery: StructuredQuery = null,
    transaction: String = null
  ): RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    if (newTransaction != null) __obj.updateDynamic("newTransaction")(newTransaction.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (structuredQuery != null) __obj.updateDynamic("structuredQuery")(structuredQuery.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunQueryRequest]
  }
}

