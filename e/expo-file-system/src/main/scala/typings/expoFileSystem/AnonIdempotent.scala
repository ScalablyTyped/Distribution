package typings.expoFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdempotent extends js.Object {
  var idempotent: js.UndefOr[Boolean] = js.undefined
}

object AnonIdempotent {
  @scala.inline
  def apply(idempotent: js.UndefOr[Boolean] = js.undefined): AnonIdempotent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(idempotent)) __obj.updateDynamic("idempotent")(idempotent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdempotent]
  }
}

