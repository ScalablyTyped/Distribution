package typings.firebaseFirestore

import typings.firebaseFirestore.coreQueryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAffectsRemoved extends js.Object {
  var affects: js.UndefOr[js.Array[Query]] = js.undefined
  var removed: js.UndefOr[js.Array[Query]] = js.undefined
}

object AnonAffectsRemoved {
  @scala.inline
  def apply(affects: js.Array[Query] = null, removed: js.Array[Query] = null): AnonAffectsRemoved = {
    val __obj = js.Dynamic.literal()
    if (affects != null) __obj.updateDynamic("affects")(affects.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAffectsRemoved]
  }
}

