package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TestExecution extends js.Object {
  /**
               * How the host machine(s) are configured.
               * @OutputOnly
               */
  var environment: js.UndefOr[Environment] = js.undefined
  /**
               * Unique id set by the backend.
               * @OutputOnly
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Id of the containing TestMatrix.
               * @OutputOnly
               */
  var matrixId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The cloud project that owns the test execution.
               * @OutputOnly
               */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Indicates the current progress of the test execution (e.g., FINISHED).
               * @OutputOnly
               */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Additional details about the running test.
               * @OutputOnly
               */
  var testDetails: js.UndefOr[TestDetails] = js.undefined
  /**
               * How to run the test.
               * @OutputOnly
               */
  var testSpecification: js.UndefOr[TestSpecification] = js.undefined
  /**
               * The time this test execution was initially created.
               * @OutputOnly
               */
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Where the results for this execution are written.
               * @OutputOnly
               */
  var toolResultsStep: js.UndefOr[ToolResultsStep] = js.undefined
}

