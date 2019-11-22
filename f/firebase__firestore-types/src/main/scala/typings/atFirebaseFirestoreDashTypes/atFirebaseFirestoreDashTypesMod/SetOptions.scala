package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions extends js.Object {
  val merge: js.UndefOr[Boolean] = js.undefined
  val mergeFields: js.UndefOr[js.Array[String | FieldPath]] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply(merge: js.UndefOr[Boolean] = js.undefined, mergeFields: js.Array[String | FieldPath] = null): SetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    if (mergeFields != null) __obj.updateDynamic("mergeFields")(mergeFields)
    __obj.asInstanceOf[SetOptions]
  }
}

