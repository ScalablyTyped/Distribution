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
    val __obj = js.Dynamic.literal(allowedChildProcesses = allowedChildProcesses, appPackages = appPackages, id = id, instruction = instruction, isPublic = isPublic, parameters = parameters, requiredEngineVersion = requiredEngineVersion, version = version)
    if (description != null) __obj.updateDynamic("description")(description)
    if (hostApplication != null) __obj.updateDynamic("hostApplication")(hostApplication)
    __obj.asInstanceOf[Activity]
  }
}

