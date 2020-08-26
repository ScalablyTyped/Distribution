package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dockerode.anon.RefCount
import typings.dockerode.dockerodeStrings.global
import typings.dockerode.dockerodeStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:enable:interface-name */
@js.native
trait VolumeInspectInfo extends js.Object {
  var Driver: String = js.native
  var Labels: StringDictionary[String] = js.native
  var Mountpoint: String = js.native
  var Name: String = js.native
  // Field is always present, but sometimes is null
  var Options: StringDictionary[String] | Null = js.native
  var Scope: local | global = js.native
  var Status: js.UndefOr[StringDictionary[String]] = js.native
  // Field is sometimes present, and sometimes null
  var UsageData: js.UndefOr[RefCount | Null] = js.native
}

object VolumeInspectInfo {
  @scala.inline
  def apply(
    Driver: String,
    Labels: StringDictionary[String],
    Mountpoint: String,
    Name: String,
    Scope: local | global
  ): VolumeInspectInfo = {
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], Mountpoint = Mountpoint.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeInspectInfo]
  }
  @scala.inline
  implicit class VolumeInspectInfoOps[Self <: VolumeInspectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDriver(value: String): Self = this.set("Driver", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("Labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setMountpoint(value: String): Self = this.set("Mountpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: local | global): Self = this.set("Scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = this.set("Options", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsNull: Self = this.set("Options", null)
    @scala.inline
    def setStatus(value: StringDictionary[String]): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUsageData(value: RefCount): Self = this.set("UsageData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageData: Self = this.set("UsageData", js.undefined)
    @scala.inline
    def setUsageDataNull: Self = this.set("UsageData", null)
  }
  
}

