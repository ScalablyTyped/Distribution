package typings.firebaseFirestore

import typings.firebaseFirestore.queryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAffects extends js.Object {
  var affects: js.UndefOr[js.Array[Query]] = js.undefined
  var removed: js.UndefOr[js.Array[Query]] = js.undefined
}

object AnonAffects {
  @scala.inline
  def apply(affects: js.Array[Query] = null, removed: js.Array[Query] = null): AnonAffects = {
    val __obj = js.Dynamic.literal()
    if (affects != null) __obj.updateDynamic("affects")(affects.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAffects]
  }
}

