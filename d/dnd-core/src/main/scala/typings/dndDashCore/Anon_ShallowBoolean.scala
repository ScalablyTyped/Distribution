package typings.dndDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShallowBoolean extends js.Object {
  var shallow: js.UndefOr[Boolean] = js.undefined
}

object Anon_ShallowBoolean {
  @scala.inline
  def apply(shallow: js.UndefOr[Boolean] = js.undefined): Anon_ShallowBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ShallowBoolean]
  }
}

