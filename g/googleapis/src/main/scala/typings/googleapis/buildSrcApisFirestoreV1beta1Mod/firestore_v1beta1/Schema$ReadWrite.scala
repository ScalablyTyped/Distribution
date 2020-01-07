package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for a transaction that can be used to read and write documents.
  */
@js.native
trait Schema$ReadWrite extends js.Object {
  /**
    * An optional transaction to retry.
    */
  var retryTransaction: js.UndefOr[String] = js.native
}

object Schema$ReadWrite {
  @scala.inline
  def apply(retryTransaction: String = null): Schema$ReadWrite = {
    val __obj = js.Dynamic.literal()
    if (retryTransaction != null) __obj.updateDynamic("retryTransaction")(retryTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReadWrite]
  }
}

