package typings
package fluxxorLib.fluxxorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreSpec extends js.Object {
  var actions: js.UndefOr[js.Any] = js.undefined
  var initialize: js.UndefOr[
    js.Function2[/* instance */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Object], scala.Unit]
  ] = js.undefined
}

object StoreSpec {
  @scala.inline
  def apply(
    actions: js.Any = null,
    initialize: (/* instance */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Object]) => scala.Unit = null
  ): StoreSpec = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction2(initialize))
    __obj.asInstanceOf[StoreSpec]
  }
}

