package typings.gapiDotClientDotTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidInstrumentationTest extends js.Object {
  /**
    * The APK for the application under test.
    * Required
    */
  var appApk: js.UndefOr[FileReference] = js.undefined
  /**
    * The java package for the application under test.
    * Optional, default is determined by examining the application's manifest.
    */
  var appPackageId: js.UndefOr[String] = js.undefined
  /**
    * The option of whether running each test within its own invocation of
    * instrumentation with Android Test Orchestrator or not.
    * &#42;&#42; Orchestrator is only compatible with AndroidJUnitRunner version 1.0 or
    * higher! &#42;&#42;
    * Orchestrator offers the following benefits:
    * - No shared state
    * - Crashes are isolated
    * - Logs are scoped per test
    *
    * See
    * <https://developer.android.com/training/testing/junit-runner.html#using-android-test-orchestrator>
    * for more information about Android Test Orchestrator.
    *
    * Optional, if empty, test will be run without orchestrator.
    */
  var orchestratorOption: js.UndefOr[String] = js.undefined
  /**
    * The APK containing the test code to be executed.
    * Required
    */
  var testApk: js.UndefOr[FileReference] = js.undefined
  /**
    * The java package for the test to be executed.
    * Optional, default is determined by examining the application's manifest.
    */
  var testPackageId: js.UndefOr[String] = js.undefined
  /**
    * The InstrumentationTestRunner class.
    * Optional, default is determined by examining the application's manifest.
    */
  var testRunnerClass: js.UndefOr[String] = js.undefined
  /**
    * Each target must be fully qualified with the package name or class name,
    * in one of these formats:
    * - "package package_name"
    * - "class package_name.class_name"
    * - "class package_name.class_name#method_name"
    *
    * Optional, if empty, all targets in the module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.undefined
}

object AndroidInstrumentationTest {
  @scala.inline
  def apply(
    appApk: FileReference = null,
    appPackageId: String = null,
    orchestratorOption: String = null,
    testApk: FileReference = null,
    testPackageId: String = null,
    testRunnerClass: String = null,
    testTargets: js.Array[String] = null
  ): AndroidInstrumentationTest = {
    val __obj = js.Dynamic.literal()
    if (appApk != null) __obj.updateDynamic("appApk")(appApk.asInstanceOf[js.Any])
    if (appPackageId != null) __obj.updateDynamic("appPackageId")(appPackageId.asInstanceOf[js.Any])
    if (orchestratorOption != null) __obj.updateDynamic("orchestratorOption")(orchestratorOption.asInstanceOf[js.Any])
    if (testApk != null) __obj.updateDynamic("testApk")(testApk.asInstanceOf[js.Any])
    if (testPackageId != null) __obj.updateDynamic("testPackageId")(testPackageId.asInstanceOf[js.Any])
    if (testRunnerClass != null) __obj.updateDynamic("testRunnerClass")(testRunnerClass.asInstanceOf[js.Any])
    if (testTargets != null) __obj.updateDynamic("testTargets")(testTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidInstrumentationTest]
  }
}

