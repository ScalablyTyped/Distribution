package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  /** The collection ID to which this index applies. Required. */
  var collectionId: js.UndefOr[String] = js.undefined
  /** The fields to index. */
  var fields: js.UndefOr[js.Array[IndexField]] = js.undefined
  /** The resource name of the index. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The state of the index.
    * The state is read-only.
    * @OutputOnly
    */
  var state: js.UndefOr[String] = js.undefined
}

object Index {
  @scala.inline
  def apply(
    collectionId: String = null,
    fields: js.Array[IndexField] = null,
    name: String = null,
    state: String = null
  ): Index = {
    val __obj = js.Dynamic.literal()
    if (collectionId != null) __obj.updateDynamic("collectionId")(collectionId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

