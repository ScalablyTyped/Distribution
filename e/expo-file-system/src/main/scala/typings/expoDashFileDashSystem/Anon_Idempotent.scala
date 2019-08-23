package typings.expoDashFileDashSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Idempotent extends js.Object {
  var idempotent: js.UndefOr[Boolean] = js.undefined
}

object Anon_Idempotent {
  @scala.inline
  def apply(idempotent: js.UndefOr[Boolean] = js.undefined): Anon_Idempotent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(idempotent)) __obj.updateDynamic("idempotent")(idempotent)
    __obj.asInstanceOf[Anon_Idempotent]
  }
}

