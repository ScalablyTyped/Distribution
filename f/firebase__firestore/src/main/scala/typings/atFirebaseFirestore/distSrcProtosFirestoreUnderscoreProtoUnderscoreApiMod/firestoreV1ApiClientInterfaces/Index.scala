package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.IndexState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var collectionId: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[js.Array[IndexField]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[IndexState] = js.undefined
}

object Index {
  @scala.inline
  def apply(
    collectionId: String = null,
    fields: js.Array[IndexField] = null,
    name: String = null,
    state: IndexState = null
  ): Index = {
    val __obj = js.Dynamic.literal()
    if (collectionId != null) __obj.updateDynamic("collectionId")(collectionId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

