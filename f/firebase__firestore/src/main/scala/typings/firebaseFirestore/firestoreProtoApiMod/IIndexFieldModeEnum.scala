package typings.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndexFieldModeEnum extends js.Object {
  var ASCENDING: IndexFieldMode
  var DESCENDING: IndexFieldMode
  var MODE_UNSPECIFIED: IndexFieldMode
  def values(): js.Array[IndexFieldMode]
}

object IIndexFieldModeEnum {
  @scala.inline
  def apply(
    ASCENDING: IndexFieldMode,
    DESCENDING: IndexFieldMode,
    MODE_UNSPECIFIED: IndexFieldMode,
    values: () => js.Array[IndexFieldMode]
  ): IIndexFieldModeEnum = {
    val __obj = js.Dynamic.literal(ASCENDING = ASCENDING.asInstanceOf[js.Any], DESCENDING = DESCENDING.asInstanceOf[js.Any], MODE_UNSPECIFIED = MODE_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IIndexFieldModeEnum]
  }
}

