package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadWrite extends js.Object {
  /** An optional transaction to retry. */
  var retryTransaction: js.UndefOr[java.lang.String] = js.undefined
}

object ReadWrite {
  @scala.inline
  def apply(retryTransaction: java.lang.String = null): ReadWrite = {
    val __obj = js.Dynamic.literal()
    if (retryTransaction != null) __obj.updateDynamic("retryTransaction")(retryTransaction)
    __obj.asInstanceOf[ReadWrite]
  }
}

