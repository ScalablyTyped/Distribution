package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.CompositeFilterOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositeFilter extends js.Object {
  var filters: js.UndefOr[js.Array[Filter]] = js.undefined
  var op: js.UndefOr[CompositeFilterOp] = js.undefined
}

object CompositeFilter {
  @scala.inline
  def apply(filters: js.Array[Filter] = null, op: CompositeFilterOp = null): CompositeFilter = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositeFilter]
  }
}

