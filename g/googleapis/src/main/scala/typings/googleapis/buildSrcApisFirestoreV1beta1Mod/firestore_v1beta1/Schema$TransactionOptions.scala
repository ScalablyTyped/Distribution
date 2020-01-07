package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a new transaction.
  */
@js.native
trait Schema$TransactionOptions extends js.Object {
  /**
    * The transaction can only be used for read operations.
    */
  var readOnly: js.UndefOr[Schema$ReadOnly] = js.native
  /**
    * The transaction can be used for both read and write operations.
    */
  var readWrite: js.UndefOr[Schema$ReadWrite] = js.native
}

object Schema$TransactionOptions {
  @scala.inline
  def apply(readOnly: Schema$ReadOnly = null, readWrite: Schema$ReadWrite = null): Schema$TransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (readWrite != null) __obj.updateDynamic("readWrite")(readWrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TransactionOptions]
  }
}

