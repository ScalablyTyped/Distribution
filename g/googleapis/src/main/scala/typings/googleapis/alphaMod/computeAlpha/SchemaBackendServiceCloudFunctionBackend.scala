package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of a Cloud Function backend.
  */
@js.native
trait SchemaBackendServiceCloudFunctionBackend extends js.Object {
  /**
    * Required. A cloud function name. Special value ?*? represents all cloud
    * functions in the project.
    */
  var functionName: js.UndefOr[String] = js.native
  /**
    * Required. Project ID of the project hosting the cloud function.
    */
  var targetProject: js.UndefOr[String] = js.native
}

object SchemaBackendServiceCloudFunctionBackend {
  @scala.inline
  def apply(functionName: String = null, targetProject: String = null): SchemaBackendServiceCloudFunctionBackend = {
    val __obj = js.Dynamic.literal()
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (targetProject != null) __obj.updateDynamic("targetProject")(targetProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackendServiceCloudFunctionBackend]
  }
}

