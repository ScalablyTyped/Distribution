package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details for the tool used to call the API.
  */
@js.native
trait Schema$GoogleDevtoolsRemoteexecutionV1testToolDetails extends js.Object {
  /**
    * Name of the tool, e.g. bazel.
    */
  var toolName: js.UndefOr[String] = js.native
  /**
    * Version of the tool used for the request, e.g. 5.0.3.
    */
  var toolVersion: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemoteexecutionV1testToolDetails {
  @scala.inline
  def apply(toolName: String = null, toolVersion: String = null): Schema$GoogleDevtoolsRemoteexecutionV1testToolDetails = {
    val __obj = js.Dynamic.literal()
    if (toolName != null) __obj.updateDynamic("toolName")(toolName.asInstanceOf[js.Any])
    if (toolVersion != null) __obj.updateDynamic("toolVersion")(toolVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemoteexecutionV1testToolDetails]
  }
}

