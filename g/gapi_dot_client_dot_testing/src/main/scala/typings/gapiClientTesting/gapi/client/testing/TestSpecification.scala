package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSpecification extends js.Object {
  /** An Android instrumentation test. */
  var androidInstrumentationTest: js.UndefOr[AndroidInstrumentationTest] = js.native
  /** An Android robo test. */
  var androidRoboTest: js.UndefOr[AndroidRoboTest] = js.native
  /** An Android Application with a Test Loop */
  var androidTestLoop: js.UndefOr[AndroidTestLoop] = js.native
  /**
    * Enables automatic Google account login.
    * If set, the service will automatically generate a Google test account and
    * add it to the device, before executing the test. Note that test accounts
    * might be reused.
    * Many applications show their full set of functionalities when an account is
    * present on the device. Logging into the device with these generated
    * accounts allows testing more functionalities.
    * Default is false.
    * Optional
    */
  var autoGoogleLogin: js.UndefOr[Boolean] = js.native
  /** Disables performance metrics recording; may reduce test latency. */
  var disablePerformanceMetrics: js.UndefOr[Boolean] = js.native
  /** Disables video recording; may reduce test latency. */
  var disableVideoRecording: js.UndefOr[Boolean] = js.native
  /**
    * Test setup requirements e.g. files to install, bootstrap scripts
    * Optional
    */
  var testSetup: js.UndefOr[TestSetup] = js.native
  /**
    * Max time a test execution is allowed to run before it is
    * automatically cancelled.
    * Optional, default is 5 min.
    */
  var testTimeout: js.UndefOr[String] = js.native
}

object TestSpecification {
  @scala.inline
  def apply(): TestSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSpecification]
  }
  @scala.inline
  implicit class TestSpecificationOps[Self <: TestSpecification] (val x: Self) extends AnyVal {
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
    def setAndroidInstrumentationTest(value: AndroidInstrumentationTest): Self = this.set("androidInstrumentationTest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidInstrumentationTest: Self = this.set("androidInstrumentationTest", js.undefined)
    @scala.inline
    def setAndroidRoboTest(value: AndroidRoboTest): Self = this.set("androidRoboTest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidRoboTest: Self = this.set("androidRoboTest", js.undefined)
    @scala.inline
    def setAndroidTestLoop(value: AndroidTestLoop): Self = this.set("androidTestLoop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidTestLoop: Self = this.set("androidTestLoop", js.undefined)
    @scala.inline
    def setAutoGoogleLogin(value: Boolean): Self = this.set("autoGoogleLogin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoGoogleLogin: Self = this.set("autoGoogleLogin", js.undefined)
    @scala.inline
    def setDisablePerformanceMetrics(value: Boolean): Self = this.set("disablePerformanceMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisablePerformanceMetrics: Self = this.set("disablePerformanceMetrics", js.undefined)
    @scala.inline
    def setDisableVideoRecording(value: Boolean): Self = this.set("disableVideoRecording", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableVideoRecording: Self = this.set("disableVideoRecording", js.undefined)
    @scala.inline
    def setTestSetup(value: TestSetup): Self = this.set("testSetup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestSetup: Self = this.set("testSetup", js.undefined)
    @scala.inline
    def setTestTimeout(value: String): Self = this.set("testTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestTimeout: Self = this.set("testTimeout", js.undefined)
  }
  
}

