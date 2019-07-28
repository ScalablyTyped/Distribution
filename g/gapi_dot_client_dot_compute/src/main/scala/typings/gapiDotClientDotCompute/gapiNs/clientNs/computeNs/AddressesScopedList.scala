package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClientDotCompute.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressesScopedList extends js.Object {
  /** [Output Only] List of addresses contained in this scope. */
  var addresses: js.UndefOr[js.Array[Address]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Anon_Code] = js.undefined
}

object AddressesScopedList {
  @scala.inline
  def apply(addresses: js.Array[Address] = null, warning: Anon_Code = null): AddressesScopedList = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[AddressesScopedList]
  }
}

