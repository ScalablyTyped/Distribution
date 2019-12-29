package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  var fields: js.UndefOr[js.Array[FieldReference]] = js.undefined
}

object Projection {
  @scala.inline
  def apply(fields: js.Array[FieldReference] = null): Projection = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
}

