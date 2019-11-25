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
    val __obj = js.Dynamic.literal(Attachable = Attachable.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], Driver = Driver.asInstanceOf[js.Any], EnableIPv6 = EnableIPv6.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Ingress = Ingress.asInstanceOf[js.Any], Internal = Internal.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    if (Containers != null) __obj.updateDynamic("Containers")(Containers.asInstanceOf[js.Any])
    if (IPAM != null) __obj.updateDynamic("IPAM")(IPAM.asInstanceOf[js.Any])
    if (Labels != null) __obj.updateDynamic("Labels")(Labels.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInspectInfo]
  }
}

