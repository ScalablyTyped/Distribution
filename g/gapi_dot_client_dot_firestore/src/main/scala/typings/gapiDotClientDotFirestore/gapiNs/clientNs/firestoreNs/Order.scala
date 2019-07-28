package typings.gapiDotClientDotFirestore.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  /** The direction to order by. Defaults to `ASCENDING`. */
  var direction: js.UndefOr[String] = js.undefined
  /** The field to order by. */
  var field: js.UndefOr[FieldReference] = js.undefined
}

object Order {
  @scala.inline
  def apply(direction: String = null, field: FieldReference = null): Order = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[Order]
  }
}

