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
  def apply(count: js.UndefOr[Double] = js.undefined, targetId: js.UndefOr[Double] = js.undefined): ExistenceFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetId)) __obj.updateDynamic("targetId")(targetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistenceFilter]
  }
}

