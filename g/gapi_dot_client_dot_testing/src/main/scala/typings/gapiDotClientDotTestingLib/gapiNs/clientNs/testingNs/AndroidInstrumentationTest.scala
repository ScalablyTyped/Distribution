package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

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
  var appPackageId: js.UndefOr[java.lang.String] = js.undefined
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
  var orchestratorOption: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The APK containing the test code to be executed.
               * Required
               */
  var testApk: js.UndefOr[FileReference] = js.undefined
  /**
               * The java package for the test to be executed.
               * Optional, default is determined by examining the application's manifest.
               */
  var testPackageId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The InstrumentationTestRunner class.
               * Optional, default is determined by examining the application's manifest.
               */
  var testRunnerClass: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Each target must be fully qualified with the package name or class name,
               * in one of these formats:
               * - "package package_name"
               * - "class package_name.class_name"
               * - "class package_name.class_name#method_name"
               *
               * Optional, if empty, all targets in the module will be run.
               */
  var testTargets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

