package typings.expoFileSystem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Idempotent extends js.Object {
  var idempotent: js.UndefOr[Boolean] = js.undefined
}

object Idempotent {
  @scala.inline
  def apply(idempotent: js.UndefOr[Boolean] = js.undefined): Idempotent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(idempotent)) __obj.updateDynamic("idempotent")(idempotent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idempotent]
  }
}

