package typings.dockerode.dockerodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.dockerode.Anon_RefCount
import typings.dockerode.dockerodeStrings.global
import typings.dockerode.dockerodeStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:enable:interface-name */
trait VolumeInspectInfo extends js.Object {
  var Driver: String
  var Labels: StringDictionary[String]
  var Mountpoint: String
  var Name: String
  // Field is always present, but sometimes is null
  var Options: StringDictionary[String] | Null
  var Scope: local | global
  var Status: js.UndefOr[StringDictionary[String]] = js.undefined
  // Field is sometimes present, and sometimes null
  var UsageData: js.UndefOr[Anon_RefCount | Null] = js.undefined
}

object VolumeInspectInfo {
  @scala.inline
  def apply(
    Driver: String,
    Labels: StringDictionary[String],
    Mountpoint: String,
    Name: String,
    Scope: local | global,
    Options: StringDictionary[String] = null,
    Status: StringDictionary[String] = null,
    UsageData: Anon_RefCount = null
  ): VolumeInspectInfo = {
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], Mountpoint = Mountpoint.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UsageData != null) __obj.updateDynamic("UsageData")(UsageData.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeInspectInfo]
  }
}

