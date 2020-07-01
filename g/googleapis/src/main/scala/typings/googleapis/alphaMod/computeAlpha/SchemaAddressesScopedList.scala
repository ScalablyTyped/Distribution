package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAddressesScopedList extends js.Object {
  /**
    * [Output Only] A list of addresses contained in this scope.
    */
  var addresses: js.UndefOr[js.Array[SchemaAddress]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of addresses
    * when the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaAddressesScopedList {
  @scala.inline
  def apply(addresses: js.Array[SchemaAddress] = null, warning: Code = null): SchemaAddressesScopedList = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddressesScopedList]
  }
}

