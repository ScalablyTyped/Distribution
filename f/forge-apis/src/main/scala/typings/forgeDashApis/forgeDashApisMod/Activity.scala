package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  var allowedChildProcesses: js.Array[js.Object]
  var appPackages: js.Array[String]
  var description: js.UndefOr[String] = js.undefined
  var hostApplication: js.UndefOr[String] = js.undefined
  var id: String
  var instruction: js.Object
  var isPublic: Boolean
  var parameters: js.Object
  var requiredEngineVersion: String
  var version: Double
}

object Activity {
  @scala.inline
  def apply(
    allowedChildProcesses: js.Array[js.Object],
    appPackages: js.Array[String],
    id: String,
    instruction: js.Object,
    isPublic: Boolean,
    parameters: js.Object,
    requiredEngineVersion: String,
    version: Double,
    description: String = null,
    hostApplication: String = null
  ): Activity = {
    val __obj = js.Dynamic.literal(allowedChildProcesses = allowedChildProcesses.asInstanceOf[js.Any], appPackages = appPackages.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], requiredEngineVersion = requiredEngineVersion.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (hostApplication != null) __obj.updateDynamic("hostApplication")(hostApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
}

