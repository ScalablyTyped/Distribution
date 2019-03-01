package typings
package ejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncNever extends js.Object {
  var async: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_AsyncNever {
  @scala.inline
  def apply(async: js.UndefOr[scala.Nothing] = js.undefined): Anon_AsyncNever = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    __obj.asInstanceOf[Anon_AsyncNever]
  }
}

