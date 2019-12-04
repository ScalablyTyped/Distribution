package typings.atFirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpectUserCallback extends js.Object {
  var expectUserCallback: js.UndefOr[Boolean] = js.undefined
  var keepInQueue: js.UndefOr[Boolean] = js.undefined
}

object Anon_ExpectUserCallback {
  @scala.inline
  def apply(
    expectUserCallback: js.UndefOr[Boolean] = js.undefined,
    keepInQueue: js.UndefOr[Boolean] = js.undefined
  ): Anon_ExpectUserCallback = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expectUserCallback)) __obj.updateDynamic("expectUserCallback")(expectUserCallback.asInstanceOf[js.Any])
    if (!js.isUndefined(keepInQueue)) __obj.updateDynamic("keepInQueue")(keepInQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExpectUserCallback]
  }
}

