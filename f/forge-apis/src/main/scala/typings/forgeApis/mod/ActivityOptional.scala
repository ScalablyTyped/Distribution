package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityOptional extends js.Object {
  var AllowedChildProcesses: js.UndefOr[js.Array[js.Object]] = js.undefined
  var AppPackages: js.UndefOr[js.Array[String]] = js.undefined
  var Description: js.UndefOr[String] = js.undefined
  var HostApplication: js.UndefOr[String] = js.undefined
  var Id: js.UndefOr[String] = js.undefined
  var Instruction: js.UndefOr[js.Object] = js.undefined
  var IsPublic: js.UndefOr[Boolean] = js.undefined
  var Parameters: js.UndefOr[js.Object] = js.undefined
  var RequiredEngineVersion: js.UndefOr[String] = js.undefined
  var Version: js.UndefOr[Double] = js.undefined
}

object ActivityOptional {
  @scala.inline
  def apply(
    AllowedChildProcesses: js.Array[js.Object] = null,
    AppPackages: js.Array[String] = null,
    Description: String = null,
    HostApplication: String = null,
    Id: String = null,
    Instruction: js.Object = null,
    IsPublic: js.UndefOr[Boolean] = js.undefined,
    Parameters: js.Object = null,
    RequiredEngineVersion: String = null,
    Version: js.UndefOr[Double] = js.undefined
  ): ActivityOptional = {
    val __obj = js.Dynamic.literal()
    if (AllowedChildProcesses != null) __obj.updateDynamic("AllowedChildProcesses")(AllowedChildProcesses.asInstanceOf[js.Any])
    if (AppPackages != null) __obj.updateDynamic("AppPackages")(AppPackages.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (HostApplication != null) __obj.updateDynamic("HostApplication")(HostApplication.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Instruction != null) __obj.updateDynamic("Instruction")(Instruction.asInstanceOf[js.Any])
    if (!js.isUndefined(IsPublic)) __obj.updateDynamic("IsPublic")(IsPublic.get.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (RequiredEngineVersion != null) __obj.updateDynamic("RequiredEngineVersion")(RequiredEngineVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityOptional]
  }
}

