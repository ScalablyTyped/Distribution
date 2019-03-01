package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadWrite extends js.Object {
  /** The transaction identifier of the transaction being retried. */
  var previousTransaction: js.UndefOr[java.lang.String] = js.undefined
}

object ReadWrite {
  @scala.inline
  def apply(previousTransaction: java.lang.String = null): ReadWrite = {
    val __obj = js.Dynamic.literal()
    if (previousTransaction != null) __obj.updateDynamic("previousTransaction")(previousTransaction)
    __obj.asInstanceOf[ReadWrite]
  }
}

