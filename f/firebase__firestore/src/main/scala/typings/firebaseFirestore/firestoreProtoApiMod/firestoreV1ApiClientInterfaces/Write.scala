package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Write extends js.Object {
  var currentDocument: js.UndefOr[Precondition] = js.undefined
  var delete: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[DocumentTransform] = js.undefined
  var update: js.UndefOr[Document] = js.undefined
  var updateMask: js.UndefOr[DocumentMask] = js.undefined
  var verify: js.UndefOr[String] = js.undefined
}

object Write {
  @scala.inline
  def apply(
    currentDocument: Precondition = null,
    delete: String = null,
    transform: DocumentTransform = null,
    update: Document = null,
    updateMask: DocumentMask = null,
    verify: String = null
  ): Write = {
    val __obj = js.Dynamic.literal()
    if (currentDocument != null) __obj.updateDynamic("currentDocument")(currentDocument.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(verify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Write]
  }
}

