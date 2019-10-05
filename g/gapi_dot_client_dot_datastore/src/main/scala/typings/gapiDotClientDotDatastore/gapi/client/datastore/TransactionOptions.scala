package typings.gapiDotClientDotDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOptions extends js.Object {
  /** The transaction should only allow reads. */
  var readOnly: js.UndefOr[js.Any] = js.undefined
  /** The transaction should allow both reads and writes. */
  var readWrite: js.UndefOr[ReadWrite] = js.undefined
}

object TransactionOptions {
  @scala.inline
  def apply(readOnly: js.Any = null, readWrite: ReadWrite = null): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly)
    if (readWrite != null) __obj.updateDynamic("readWrite")(readWrite)
    __obj.asInstanceOf[TransactionOptions]
  }
}

