package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOptions extends js.Object {
  var readOnly: js.UndefOr[ReadOnly] = js.undefined
  var readWrite: js.UndefOr[ReadWrite] = js.undefined
}

object TransactionOptions {
  @scala.inline
  def apply(readOnly: ReadOnly = null, readWrite: ReadWrite = null): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (readWrite != null) __obj.updateDynamic("readWrite")(readWrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionOptions]
  }
}

