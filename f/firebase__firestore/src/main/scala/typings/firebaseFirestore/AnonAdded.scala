package typings.firebaseFirestore

import typings.firebaseFirestore.documentMod.Document
import typings.firebaseFirestore.errorMod.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdded extends js.Object {
  var added: js.UndefOr[js.Array[Document]] = js.undefined
  var errorCode: js.UndefOr[Code] = js.undefined
  var fromCache: js.UndefOr[Boolean] = js.undefined
  var hasPendingWrites: js.UndefOr[Boolean] = js.undefined
  var metadata: js.UndefOr[js.Array[Document]] = js.undefined
  var modified: js.UndefOr[js.Array[Document]] = js.undefined
  var removed: js.UndefOr[js.Array[Document]] = js.undefined
}

object AnonAdded {
  @scala.inline
  def apply(
    added: js.Array[Document] = null,
    errorCode: Code = null,
    fromCache: js.UndefOr[Boolean] = js.undefined,
    hasPendingWrites: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Array[Document] = null,
    modified: js.Array[Document] = null,
    removed: js.Array[Document] = null
  ): AnonAdded = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(added.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (!js.isUndefined(fromCache)) __obj.updateDynamic("fromCache")(fromCache.asInstanceOf[js.Any])
    if (!js.isUndefined(hasPendingWrites)) __obj.updateDynamic("hasPendingWrites")(hasPendingWrites.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (modified != null) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdded]
  }
}

