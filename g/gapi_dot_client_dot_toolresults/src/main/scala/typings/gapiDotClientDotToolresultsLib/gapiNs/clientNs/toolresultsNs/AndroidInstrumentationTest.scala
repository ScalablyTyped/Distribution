package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidInstrumentationTest extends js.Object {
  /** The java package for the test to be executed. Required */
  var testPackageId: js.UndefOr[java.lang.String] = js.undefined
  /** The InstrumentationTestRunner class. Required */
  var testRunnerClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Each target must be fully qualified with the package name or class name, in one of these formats: - "package package_name" - "class
    * package_name.class_name" - "class package_name.class_name#method_name"
    *
    * If empty, all targets in the module will be run.
    */
  var testTargets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The flag indicates whether Android Test Orchestrator will be used to run test or not. Test orchestrator is used if either: - orchestrator_option field
    * is USE_ORCHESTRATOR, and test runner is compatible with orchestrator. Or - orchestrator_option field is unspecified or ORCHESTRATOR_OPTION_UNSPECIFIED,
    * and test runner is compatible with orchestrator.
    */
  var useOrchestrator: js.UndefOr[scala.Boolean] = js.undefined
}

