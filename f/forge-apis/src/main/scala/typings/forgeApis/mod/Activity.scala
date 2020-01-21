package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  var AllowedChildProcesses: js.Array[js.Object]
  var AppPackages: js.Array[String]
  var Description: js.UndefOr[String] = js.undefined
  var HostApplication: js.UndefOr[String] = js.undefined
  var Id: String
  var Instruction: js.Object
  var IsPublic: Boolean
  var Parameters: js.Object
  var RequiredEngineVersion: String
  var Version: Double
}

object Activity {
  @scala.inline
  def apply(
    AllowedChildProcesses: js.Array[js.Object],
    AppPackages: js.Array[String],
    Id: String,
    Instruction: js.Object,
    IsPublic: Boolean,
    Parameters: js.Object,
    RequiredEngineVersion: String,
    Version: Double,
    Description: String = null,
    HostApplication: String = null
  ): Activity = {
    val __obj = js.Dynamic.literal(AllowedChildProcesses = AllowedChildProcesses.asInstanceOf[js.Any], AppPackages = AppPackages.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Instruction = Instruction.asInstanceOf[js.Any], IsPublic = IsPublic.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], RequiredEngineVersion = RequiredEngineVersion.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (HostApplication != null) __obj.updateDynamic("HostApplication")(HostApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
}

