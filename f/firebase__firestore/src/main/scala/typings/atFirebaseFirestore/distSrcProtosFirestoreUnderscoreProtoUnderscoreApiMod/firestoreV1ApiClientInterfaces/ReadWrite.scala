package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadWrite extends js.Object {
  var retryTransaction: js.UndefOr[String] = js.undefined
}

object ReadWrite {
  @scala.inline
  def apply(retryTransaction: String = null): ReadWrite = {
    val __obj = js.Dynamic.literal()
    if (retryTransaction != null) __obj.updateDynamic("retryTransaction")(retryTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadWrite]
  }
}

