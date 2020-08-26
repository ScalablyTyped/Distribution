package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidInstrumentationTest extends js.Object {
  /**
    * The APK for the application under test.
    * Required
    */
  var appApk: js.UndefOr[FileReference] = js.native
  /**
    * The java package for the application under test.
    * Optional, default is determined by examining the application's manifest.
    */
  var appPackageId: js.UndefOr[String] = js.native
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
  var orchestratorOption: js.UndefOr[String] = js.native
  /**
    * The APK containing the test code to be executed.
    * Required
    */
  var testApk: js.UndefOr[FileReference] = js.native
  /**
    * The java package for the test to be executed.
    * Optional, default is determined by examining the application's manifest.
    */
  var testPackageId: js.UndefOr[String] = js.native
  /**
    * The InstrumentationTestRunner class.
    * Optional, default is determined by examining the application's manifest.
    */
  var testRunnerClass: js.UndefOr[String] = js.native
  /**
    * Each target must be fully qualified with the package name or class name,
    * in one of these formats:
    * - "package package_name"
    * - "class package_name.class_name"
    * - "class package_name.class_name#method_name"
    *
    * Optional, if empty, all targets in the module will be run.
    */
  var testTargets: js.UndefOr[js.Array[String]] = js.native
}

object AndroidInstrumentationTest {
  @scala.inline
  def apply(): AndroidInstrumentationTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidInstrumentationTest]
  }
  @scala.inline
  implicit class AndroidInstrumentationTestOps[Self <: AndroidInstrumentationTest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppApk(value: FileReference): Self = this.set("appApk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppApk: Self = this.set("appApk", js.undefined)
    @scala.inline
    def setAppPackageId(value: String): Self = this.set("appPackageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppPackageId: Self = this.set("appPackageId", js.undefined)
    @scala.inline
    def setOrchestratorOption(value: String): Self = this.set("orchestratorOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrchestratorOption: Self = this.set("orchestratorOption", js.undefined)
    @scala.inline
    def setTestApk(value: FileReference): Self = this.set("testApk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestApk: Self = this.set("testApk", js.undefined)
    @scala.inline
    def setTestPackageId(value: String): Self = this.set("testPackageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestPackageId: Self = this.set("testPackageId", js.undefined)
    @scala.inline
    def setTestRunnerClass(value: String): Self = this.set("testRunnerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestRunnerClass: Self = this.set("testRunnerClass", js.undefined)
    @scala.inline
    def setTestTargetsVarargs(value: String*): Self = this.set("testTargets", js.Array(value :_*))
    @scala.inline
    def setTestTargets(value: js.Array[String]): Self = this.set("testTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestTargets: Self = this.set("testTargets", js.undefined)
  }
  
}

