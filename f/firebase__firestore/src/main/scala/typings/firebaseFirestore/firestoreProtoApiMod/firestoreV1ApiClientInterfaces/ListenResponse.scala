package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenResponse extends js.Object {
  var documentChange: js.UndefOr[DocumentChange] = js.undefined
  var documentDelete: js.UndefOr[DocumentDelete] = js.undefined
  var documentRemove: js.UndefOr[DocumentRemove] = js.undefined
  var filter: js.UndefOr[ExistenceFilter] = js.undefined
  var targetChange: js.UndefOr[TargetChange] = js.undefined
}

object ListenResponse {
  @scala.inline
  def apply(
    documentChange: DocumentChange = null,
    documentDelete: DocumentDelete = null,
    documentRemove: DocumentRemove = null,
    filter: ExistenceFilter = null,
    targetChange: TargetChange = null
  ): ListenResponse = {
    val __obj = js.Dynamic.literal()
    if (documentChange != null) __obj.updateDynamic("documentChange")(documentChange.asInstanceOf[js.Any])
    if (documentDelete != null) __obj.updateDynamic("documentDelete")(documentDelete.asInstanceOf[js.Any])
    if (documentRemove != null) __obj.updateDynamic("documentRemove")(documentRemove.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (targetChange != null) __obj.updateDynamic("targetChange")(targetChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenResponse]
  }
}

