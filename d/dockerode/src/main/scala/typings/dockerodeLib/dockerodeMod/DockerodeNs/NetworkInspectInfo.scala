package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// not complete definition of network inspection
// info which is returned by list / inspect
trait NetworkInspectInfo extends js.Object {
  var Attachable: scala.Boolean
  var Created: java.lang.String
  var Driver: java.lang.String
  var EnableIPv6: scala.Boolean
  var Id: java.lang.String
  var Ingress: scala.Boolean
  var Internal: scala.Boolean
  var Name: java.lang.String
  var Scope: java.lang.String
}

object NetworkInspectInfo {
  @scala.inline
  def apply(
    Attachable: scala.Boolean,
    Created: java.lang.String,
    Driver: java.lang.String,
    EnableIPv6: scala.Boolean,
    Id: java.lang.String,
    Ingress: scala.Boolean,
    Internal: scala.Boolean,
    Name: java.lang.String,
    Scope: java.lang.String
  ): NetworkInspectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Attachable")(Attachable)
    __obj.updateDynamic("Created")(Created)
    __obj.updateDynamic("Driver")(Driver)
    __obj.updateDynamic("EnableIPv6")(EnableIPv6)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("Ingress")(Ingress)
    __obj.updateDynamic("Internal")(Internal)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Scope")(Scope)
    __obj.asInstanceOf[NetworkInspectInfo]
  }
}

