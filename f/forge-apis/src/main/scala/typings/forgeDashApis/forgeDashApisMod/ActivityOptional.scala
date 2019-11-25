package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityOptional extends js.Object {
  var allowedChildProcesses: js.UndefOr[js.Array[js.Object]] = js.undefined
  var appPackages: js.UndefOr[js.Array[String]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var hostApplication: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var instruction: js.UndefOr[js.Object] = js.undefined
  var isPublic: js.UndefOr[Boolean] = js.undefined
  var parameters: js.UndefOr[js.Object] = js.undefined
  var requiredEngineVersion: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object ActivityOptional {
  @scala.inline
  def apply(
    allowedChildProcesses: js.Array[js.Object] = null,
    appPackages: js.Array[String] = null,
    description: String = null,
    hostApplication: String = null,
    id: String = null,
    instruction: js.Object = null,
    isPublic: js.UndefOr[Boolean] = js.undefined,
    parameters: js.Object = null,
    requiredEngineVersion: String = null,
    version: Int | Double = null
  ): ActivityOptional = {
    val __obj = js.Dynamic.literal()
    if (allowedChildProcesses != null) __obj.updateDynamic("allowedChildProcesses")(allowedChildProcesses.asInstanceOf[js.Any])
    if (appPackages != null) __obj.updateDynamic("appPackages")(appPackages.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (hostApplication != null) __obj.updateDynamic("hostApplication")(hostApplication.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (instruction != null) __obj.updateDynamic("instruction")(instruction.asInstanceOf[js.Any])
    if (!js.isUndefined(isPublic)) __obj.updateDynamic("isPublic")(isPublic.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (requiredEngineVersion != null) __obj.updateDynamic("requiredEngineVersion")(requiredEngineVersion.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityOptional]
  }
}

