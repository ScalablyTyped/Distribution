package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AddressesScopedList extends js.Object {
  /**
    * [Output Only] A list of addresses contained in this scope.
    */
  var addresses: js.UndefOr[js.Array[Schema$Address]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of addresses
    * when the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$AddressesScopedList {
  @scala.inline
  def apply(addresses: js.Array[Schema$Address] = null, warning: Anon_Code = null): Schema$AddressesScopedList = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddressesScopedList]
  }
}

