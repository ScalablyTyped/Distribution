package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cursor extends js.Object {
  var before: js.UndefOr[Boolean] = js.undefined
  var values: js.UndefOr[js.Array[Value]] = js.undefined
}

object Cursor {
  @scala.inline
  def apply(before: js.UndefOr[Boolean] = js.undefined, values: js.Array[Value] = null): Cursor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(before)) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursor]
  }
}

