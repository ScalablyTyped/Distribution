package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidInstrumentationTest extends js.Object {
  /** The java package for the test to be executed. Required */
  var testPackageId: js.UndefOr[String] = js.undefined
  /** The InstrumentationTestRunner class. Required */
  var testRunnerClass: js.UndefOr[String] = js.undefined
  /**
    * Each target must be fully qualified with the package name or class name, in one of these formats: - "package package_name" - "class
    * package_name.class_name" - "class package_name.class_name#method_name"
    *
    * If empty, all targets in the module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The flag indicates whether Android Test Orchestrator will be used to run test or not. Test orchestrator is used if either: - orchestrator_option field
    * is USE_ORCHESTRATOR, and test runner is compatible with orchestrator. Or - orchestrator_option field is unspecified or ORCHESTRATOR_OPTION_UNSPECIFIED,
    * and test runner is compatible with orchestrator.
    */
  var useOrchestrator: js.UndefOr[Boolean] = js.undefined
}

object AndroidInstrumentationTest {
  @scala.inline
  def apply(
    testPackageId: String = null,
    testRunnerClass: String = null,
    testTargets: js.Array[String] = null,
    useOrchestrator: js.UndefOr[Boolean] = js.undefined
  ): AndroidInstrumentationTest = {
    val __obj = js.Dynamic.literal()
    if (testPackageId != null) __obj.updateDynamic("testPackageId")(testPackageId)
    if (testRunnerClass != null) __obj.updateDynamic("testRunnerClass")(testRunnerClass)
    if (testTargets != null) __obj.updateDynamic("testTargets")(testTargets)
    if (!js.isUndefined(useOrchestrator)) __obj.updateDynamic("useOrchestrator")(useOrchestrator)
    __obj.asInstanceOf[AndroidInstrumentationTest]
  }
}

