package typings.formatjsIntlUtils.mod

import typings.std.Pick
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils", "getMultiInternalSlots")
@js.native
object getMultiInternalSlots extends js.Object {
  def apply[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, fields: Field*): Pick[Internal, Field] = js.native
}

