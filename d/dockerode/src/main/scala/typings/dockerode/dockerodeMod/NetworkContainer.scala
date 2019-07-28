package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkContainer extends js.Object {
  var EndpointID: String
  var IPv6Address: String
  var Ipv4Address: String
  var MacAddress: String
  var Name: String
}

object NetworkContainer {
  @scala.inline
  def apply(EndpointID: String, IPv6Address: String, Ipv4Address: String, MacAddress: String, Name: String): NetworkContainer = {
    val __obj = js.Dynamic.literal(EndpointID = EndpointID, IPv6Address = IPv6Address, Ipv4Address = Ipv4Address, MacAddress = MacAddress, Name = Name)
  
    __obj.asInstanceOf[NetworkContainer]
  }
}

