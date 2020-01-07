package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies an executable to run on a fully configured node and a timeout
  * period for executable completion.
  */
@js.native
trait Schema$NodeInitializationAction extends js.Object {
  /**
    * Required. Cloud Storage URI of executable file.
    */
  var executableFile: js.UndefOr[String] = js.native
  /**
    * Optional. Amount of time executable has to complete. Default is 10
    * minutes. Cluster creation fails with an explanatory error message (the
    * name of the executable that caused the error and the exceeded timeout
    * period) if the executable is not completed at end of the timeout period.
    */
  var executionTimeout: js.UndefOr[String] = js.native
}

object Schema$NodeInitializationAction {
  @scala.inline
  def apply(executableFile: String = null, executionTimeout: String = null): Schema$NodeInitializationAction = {
    val __obj = js.Dynamic.literal()
    if (executableFile != null) __obj.updateDynamic("executableFile")(executableFile.asInstanceOf[js.Any])
    if (executionTimeout != null) __obj.updateDynamic("executionTimeout")(executionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NodeInitializationAction]
  }
}

