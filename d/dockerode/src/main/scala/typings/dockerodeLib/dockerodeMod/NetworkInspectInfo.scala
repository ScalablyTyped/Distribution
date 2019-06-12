package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Information returned from inspecting a network
trait NetworkInspectInfo extends js.Object {
  var Attachable: scala.Boolean
  var Containers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[NetworkContainer]] = js.undefined
  var Created: java.lang.String
  var Driver: java.lang.String
  var EnableIPv6: scala.Boolean
  var IPAM: js.UndefOr[IPAM] = js.undefined
  var Id: java.lang.String
  var Ingress: scala.Boolean
  var Internal: scala.Boolean
  var Labels: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var Name: java.lang.String
  var Options: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
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
    Scope: java.lang.String,
    Containers: org.scalablytyped.runtime.StringDictionary[NetworkContainer] = null,
    IPAM: IPAM = null,
    Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    Options: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): NetworkInspectInfo = {
    val __obj = js.Dynamic.literal(Attachable = Attachable, Created = Created, Driver = Driver, EnableIPv6 = EnableIPv6, Id = Id, Ingress = Ingress, Internal = Internal, Name = Name, Scope = Scope)
    if (Containers != null) __obj.updateDynamic("Containers")(Containers)
    if (IPAM != null) __obj.updateDynamic("IPAM")(IPAM)
    if (Labels != null) __obj.updateDynamic("Labels")(Labels)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    __obj.asInstanceOf[NetworkInspectInfo]
  }
}

