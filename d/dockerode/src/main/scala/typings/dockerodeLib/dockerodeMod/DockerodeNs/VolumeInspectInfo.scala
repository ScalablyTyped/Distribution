package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeInspectInfo extends js.Object {
  var Driver: java.lang.String
  var Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var Mountpoint: java.lang.String
  var Name: java.lang.String
  // Field is always present, but sometimes is null
  var Options: org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null
  var Scope: dockerodeLib.dockerodeLibStrings.local | dockerodeLib.dockerodeLibStrings.global
  var Status: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  // Field is sometimes present, and sometimes null
  var UsageData: js.UndefOr[dockerodeLib.Anon_RefCount | scala.Null] = js.undefined
}

object VolumeInspectInfo {
  @scala.inline
  def apply(
    Driver: java.lang.String,
    Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    Mountpoint: java.lang.String,
    Name: java.lang.String,
    Scope: dockerodeLib.dockerodeLibStrings.local | dockerodeLib.dockerodeLibStrings.global,
    Options: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    Status: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    UsageData: dockerodeLib.Anon_RefCount = null
  ): VolumeInspectInfo = {
    val __obj = js.Dynamic.literal(Driver = Driver, Labels = Labels, Mountpoint = Mountpoint, Name = Name, Scope = Scope.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (UsageData != null) __obj.updateDynamic("UsageData")(UsageData)
    __obj.asInstanceOf[VolumeInspectInfo]
  }
}

