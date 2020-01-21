package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentsTarget extends js.Object {
  var documents: js.UndefOr[js.Array[String]] = js.undefined
}

object DocumentsTarget {
  @scala.inline
  def apply(documents: js.Array[String] = null): DocumentsTarget = {
    val __obj = js.Dynamic.literal()
    if (documents != null) __obj.updateDynamic("documents")(documents.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentsTarget]
  }
}

