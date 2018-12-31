package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInitializationAction extends js.Object {
  /** Required. Google Cloud Storage URI of executable file. */
  var executableFile: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. Amount of time executable has to complete. Default is 10 minutes. Cluster creation fails with an explanatory error message (the name of the
    * executable that caused the error and the exceeded timeout period) if the executable is not completed at end of the timeout period.
    */
  var executionTimeout: js.UndefOr[java.lang.String] = js.undefined
}

