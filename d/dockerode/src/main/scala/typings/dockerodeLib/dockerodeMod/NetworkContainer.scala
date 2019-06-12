package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkContainer extends js.Object {
  var EndpointID: java.lang.String
  var IPv6Address: java.lang.String
  var Ipv4Address: java.lang.String
  var MacAddress: java.lang.String
  var Name: java.lang.String
}

object NetworkContainer {
  @scala.inline
  def apply(
    EndpointID: java.lang.String,
    IPv6Address: java.lang.String,
    Ipv4Address: java.lang.String,
    MacAddress: java.lang.String,
    Name: java.lang.String
  ): NetworkContainer = {
    val __obj = js.Dynamic.literal(EndpointID = EndpointID, IPv6Address = IPv6Address, Ipv4Address = Ipv4Address, MacAddress = MacAddress, Name = Name)
  
    __obj.asInstanceOf[NetworkContainer]
  }
}

