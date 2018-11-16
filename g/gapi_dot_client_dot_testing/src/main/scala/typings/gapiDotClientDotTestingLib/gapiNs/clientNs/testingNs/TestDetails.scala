package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TestDetails extends js.Object {
  /**
               * If the TestState is ERROR, then this string will contain human-readable
               * details about the error.
               * @OutputOnly
               */
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Human-readable, detailed descriptions of the test's progress.
               * For example: "Provisioning a device", "Starting Test".
               *
               * During the course of execution new data may be appended
               * to the end of progress_messages.
               * @OutputOnly
               */
  var progressMessages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

