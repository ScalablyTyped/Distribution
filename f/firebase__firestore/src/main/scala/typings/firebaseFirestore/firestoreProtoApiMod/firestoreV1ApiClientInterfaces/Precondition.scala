package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.firestoreProtoApiMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Precondition extends js.Object {
  var exists: js.UndefOr[Boolean] = js.undefined
  var updateTime: js.UndefOr[Timestamp] = js.undefined
}

object Precondition {
  @scala.inline
  def apply(exists: js.UndefOr[Boolean] = js.undefined, updateTime: Timestamp = null): Precondition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exists)) __obj.updateDynamic("exists")(exists.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Precondition]
  }
}

