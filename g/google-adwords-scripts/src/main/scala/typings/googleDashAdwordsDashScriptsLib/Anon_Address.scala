package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: AddressObject
  var bidModifier: scala.Double
}

object Anon_Address {
  @scala.inline
  def apply(address: AddressObject, bidModifier: scala.Double): Anon_Address = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("bidModifier")(bidModifier)
    __obj.asInstanceOf[Anon_Address]
  }
}

