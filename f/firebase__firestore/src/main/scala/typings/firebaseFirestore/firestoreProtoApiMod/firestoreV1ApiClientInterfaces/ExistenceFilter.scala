package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExistenceFilter extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var targetId: js.UndefOr[Double] = js.undefined
}

object ExistenceFilter {
  @scala.inline
  def apply(count: Int | Double = null, targetId: Int | Double = null): ExistenceFilter = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistenceFilter]
  }
}

