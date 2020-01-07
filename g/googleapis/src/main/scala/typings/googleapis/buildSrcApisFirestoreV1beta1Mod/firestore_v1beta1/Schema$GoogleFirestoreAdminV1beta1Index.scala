package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An index definition.
  */
@js.native
trait Schema$GoogleFirestoreAdminV1beta1Index extends js.Object {
  /**
    * The collection ID to which this index applies. Required.
    */
  var collectionId: js.UndefOr[String] = js.native
  /**
    * The fields to index.
    */
  var fields: js.UndefOr[js.Array[Schema$GoogleFirestoreAdminV1beta1IndexField]] = js.native
  /**
    * The resource name of the index. Output only.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The state of the index. Output only.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$GoogleFirestoreAdminV1beta1Index {
  @scala.inline
  def apply(
    collectionId: String = null,
    fields: js.Array[Schema$GoogleFirestoreAdminV1beta1IndexField] = null,
    name: String = null,
    state: String = null
  ): Schema$GoogleFirestoreAdminV1beta1Index = {
    val __obj = js.Dynamic.literal()
    if (collectionId != null) __obj.updateDynamic("collectionId")(collectionId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFirestoreAdminV1beta1Index]
  }
}

