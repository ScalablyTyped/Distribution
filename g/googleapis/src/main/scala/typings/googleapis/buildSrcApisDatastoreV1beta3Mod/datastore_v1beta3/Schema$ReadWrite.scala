package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options specific to read / write transactions.
  */
@js.native
trait Schema$ReadWrite extends js.Object {
  /**
    * The transaction identifier of the transaction being retried.
    */
  var previousTransaction: js.UndefOr[String] = js.native
}

object Schema$ReadWrite {
  @scala.inline
  def apply(previousTransaction: String = null): Schema$ReadWrite = {
    val __obj = js.Dynamic.literal()
    if (previousTransaction != null) __obj.updateDynamic("previousTransaction")(previousTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReadWrite]
  }
}

