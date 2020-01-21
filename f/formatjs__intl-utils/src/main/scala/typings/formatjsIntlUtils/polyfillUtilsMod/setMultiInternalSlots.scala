package typings.formatjsIntlUtils.polyfillUtilsMod

import typings.std.NonNullable
import typings.std.Pick
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/dist/polyfill-utils", "setMultiInternalSlots")
@js.native
object setMultiInternalSlots extends js.Object {
  def apply[Instance /* <: js.Object */, Internal /* <: js.Object */, K /* <: String */](map: WeakMap[Instance, Internal], pl: Instance, props: Pick[NonNullable[Internal], K]): Unit = js.native
}

