package typings.gapiDotClientDotDataproc.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInitializationAction extends js.Object {
  /** Required. Google Cloud Storage URI of executable file. */
  var executableFile: js.UndefOr[String] = js.undefined
  /**
    * Optional. Amount of time executable has to complete. Default is 10 minutes. Cluster creation fails with an explanatory error message (the name of the
    * executable that caused the error and the exceeded timeout period) if the executable is not completed at end of the timeout period.
    */
  var executionTimeout: js.UndefOr[String] = js.undefined
}

object NodeInitializationAction {
  @scala.inline
  def apply(executableFile: String = null, executionTimeout: String = null): NodeInitializationAction = {
    val __obj = js.Dynamic.literal()
    if (executableFile != null) __obj.updateDynamic("executableFile")(executableFile)
    if (executionTimeout != null) __obj.updateDynamic("executionTimeout")(executionTimeout)
    __obj.asInstanceOf[NodeInitializationAction]
  }
}

