package typings.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpectUserCallback extends js.Object {
  var expectUserCallback: js.UndefOr[Boolean] = js.undefined
  var keepInQueue: js.UndefOr[Boolean] = js.undefined
}

object ExpectUserCallback {
  @scala.inline
  def apply(
    expectUserCallback: js.UndefOr[Boolean] = js.undefined,
    keepInQueue: js.UndefOr[Boolean] = js.undefined
  ): ExpectUserCallback = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expectUserCallback)) __obj.updateDynamic("expectUserCallback")(expectUserCallback.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepInQueue)) __obj.updateDynamic("keepInQueue")(keepInQueue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectUserCallback]
  }
}

