package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkContainer extends js.Object {
  var EndpointID: String
  var IPv4Address: String
  var IPv6Address: String
  var MacAddress: String
  var Name: String
}

object NetworkContainer {
  @scala.inline
  def apply(EndpointID: String, IPv4Address: String, IPv6Address: String, MacAddress: String, Name: String): NetworkContainer = {
    val __obj = js.Dynamic.literal(EndpointID = EndpointID.asInstanceOf[js.Any], IPv4Address = IPv4Address.asInstanceOf[js.Any], IPv6Address = IPv6Address.asInstanceOf[js.Any], MacAddress = MacAddress.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkContainer]
  }
}

