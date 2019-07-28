package typings.dockerode.dockerodeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Information returned from inspecting a network
trait NetworkInspectInfo extends js.Object {
  var Attachable: Boolean
  var Containers: js.UndefOr[StringDictionary[NetworkContainer]] = js.undefined
  var Created: String
  var Driver: String
  var EnableIPv6: Boolean
  var IPAM: js.UndefOr[typings.dockerode.dockerodeMod.IPAM] = js.undefined
  var Id: String
  var Ingress: Boolean
  var Internal: Boolean
  var Labels: js.UndefOr[StringDictionary[String]] = js.undefined
  var Name: String
  var Options: js.UndefOr[StringDictionary[String]] = js.undefined
  var Scope: String
}

object NetworkInspectInfo {
  @scala.inline
  def apply(
    Attachable: Boolean,
    Created: String,
    Driver: String,
    EnableIPv6: Boolean,
    Id: String,
    Ingress: Boolean,
    Internal: Boolean,
    Name: String,
    Scope: String,
    Containers: StringDictionary[NetworkContainer] = null,
    IPAM: IPAM = null,
    Labels: StringDictionary[String] = null,
    Options: StringDictionary[String] = null
  ): NetworkInspectInfo = {
    val __obj = js.Dynamic.literal(Attachable = Attachable, Created = Created, Driver = Driver, EnableIPv6 = EnableIPv6, Id = Id, Ingress = Ingress, Internal = Internal, Name = Name, Scope = Scope)
    if (Containers != null) __obj.updateDynamic("Containers")(Containers)
    if (IPAM != null) __obj.updateDynamic("IPAM")(IPAM)
    if (Labels != null) __obj.updateDynamic("Labels")(Labels)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    __obj.asInstanceOf[NetworkInspectInfo]
  }
}

