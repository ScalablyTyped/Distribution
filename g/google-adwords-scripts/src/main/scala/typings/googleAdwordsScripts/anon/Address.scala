package typings.googleAdwordsScripts.anon

import typings.googleAdwordsScripts.AddressObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: AddressObject
  var bidModifier: Double
}

object Address {
  @scala.inline
  def apply(address: AddressObject, bidModifier: Double): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bidModifier = bidModifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

