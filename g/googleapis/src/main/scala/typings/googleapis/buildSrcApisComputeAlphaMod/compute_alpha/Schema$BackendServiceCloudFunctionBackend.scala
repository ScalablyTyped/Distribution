package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of a Cloud Function backend.
  */
@js.native
trait Schema$BackendServiceCloudFunctionBackend extends js.Object {
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

object Schema$BackendServiceCloudFunctionBackend {
  @scala.inline
  def apply(functionName: String = null, targetProject: String = null): Schema$BackendServiceCloudFunctionBackend = {
    val __obj = js.Dynamic.literal()
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (targetProject != null) __obj.updateDynamic("targetProject")(targetProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BackendServiceCloudFunctionBackend]
  }
}

