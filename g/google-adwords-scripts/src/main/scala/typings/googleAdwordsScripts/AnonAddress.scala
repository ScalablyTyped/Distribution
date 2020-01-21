package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: AddressObject
  var bidModifier: Double
}

object AnonAddress {
  @scala.inline
  def apply(address: AddressObject, bidModifier: Double): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bidModifier = bidModifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddress]
  }
}

